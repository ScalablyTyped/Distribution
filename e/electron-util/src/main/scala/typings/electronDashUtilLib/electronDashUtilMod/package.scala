package typings
package electronDashUtilLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object electronDashUtilMod {
  type AboutMenuItemOptions = ShowAboutWindowOptions
  type Choices[Macos, Windows, Linux, Default] = electronDashUtilLib.RequireAtLeastOne[
    _Choices[Macos, Windows, Linux, Default], 
    electronDashUtilLib.electronDashUtilLibStrings.macos | electronDashUtilLib.electronDashUtilLibStrings.windows | electronDashUtilLib.electronDashUtilLibStrings.linux
  ]
}
