package typings.electronDashUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object electronDashUtilMod {
  import typings.electronDashUtil.electronDashUtilStrings.linux
  import typings.electronDashUtil.electronDashUtilStrings.macos
  import typings.electronDashUtil.electronDashUtilStrings.windows
  import typings.typeDashFest.typeDashFestMod.RequireAtLeastOne

  type AboutMenuItemOptions = ShowAboutWindowOptions
  type Choices[Macos, Windows, Linux, Default] = RequireAtLeastOne[_Choices[Macos, Windows, Linux, Default], macos | windows | linux]
}
