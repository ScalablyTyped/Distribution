package typings
package electronDashUtilLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object electronDashUtilMod {
  type AboutMenuItemOptions = ShowAboutWindowOptions
  type Choices[Macos, Windows, Linux, Default] = RequireAtLeastOne[
    _Choices[Macos, Windows, Linux, Default], 
    electronDashUtilLib.electronDashUtilLibStrings.macos | electronDashUtilLib.electronDashUtilLibStrings.windows | electronDashUtilLib.electronDashUtilLibStrings.linux
  ]
  type RequireAtLeastOne[T, Keys /* <: java.lang.String */] = (electronDashUtilLib.Omit[T, Keys]) with (/* import warning: ImportType.apply Failed type conversion: {[ K in Keys ]: -? std.Required<std.Pick<T, K>>}[Keys] */ js.Any)
}
