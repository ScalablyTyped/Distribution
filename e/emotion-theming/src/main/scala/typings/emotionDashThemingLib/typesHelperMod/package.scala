package typings
package emotionDashThemingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesHelperMod {
  type AddOptionalTo[T, U] = (Omit[T, U]) with (stdLib.Partial[stdLib.Pick[T, stdLib.Extract[java.lang.String, U]]])
  type Omit[T, U] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, U]]
  type PropsOf[C /* <: reactLib.reactMod.ComponentType[_] */] = (js.Any with reactLib.reactMod.ClassAttributes[_]) | (js.Any with reactLib.reactMod.Attributes)
}
