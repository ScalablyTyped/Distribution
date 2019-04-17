package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object electronDashUtilLib {
  type Omit[T, K] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]]
  type RequireAtLeastOne[T, Keys /* <: java.lang.String */] = (Omit[T, Keys]) with (/* import warning: ImportType.apply Failed type conversion: {[ K in Keys ]: -? std.Required<std.Pick<T, K>>}[Keys] */ js.Any)
}
