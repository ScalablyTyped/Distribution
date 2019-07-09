package typings
package atEmotionStyledDashBaseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesHelperMod {
  type Omit[T, U] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, U]]
  type Overwrapped[T, U] = stdLib.Pick[T, stdLib.Extract[java.lang.String, java.lang.String]]
  type PropsOf[C /* <: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 175 */ js.Any */] = reactLib.reactMod.Global.JSXNs.LibraryManagedAttributes[C, reactLib.reactMod.ComponentPropsWithRef[C]]
}
