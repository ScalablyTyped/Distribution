package typings.electronUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AboutMenuItemOptions = typings.electronUtil.mod.ShowAboutWindowOptions
  type Choices[Macos, Windows, Linux, Default] = typings.typeFest.requireAtLeastOneMod.RequireAtLeastOne[
    typings.electronUtil.mod._Choices[Macos, Windows, Linux, Default], 
    typings.electronUtil.electronUtilStrings.macos | typings.electronUtil.electronUtilStrings.windows | typings.electronUtil.electronUtilStrings.linux
  ]
}
