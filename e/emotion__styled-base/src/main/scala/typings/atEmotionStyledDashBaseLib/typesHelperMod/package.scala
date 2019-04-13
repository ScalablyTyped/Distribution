package typings
package atEmotionStyledDashBaseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesHelperMod {
  type Omit[T, U] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, U]]
  type Overwrapped[T, U] = stdLib.Pick[T, stdLib.Extract[java.lang.String, java.lang.String]]
  type PropsOf[Tag /* <: reactLib.reactMod.ComponentType[_] */] = (js.Any with reactLib.reactMod.ClassAttributes[_]) | (js.Any with reactLib.reactMod.Attributes)
}
