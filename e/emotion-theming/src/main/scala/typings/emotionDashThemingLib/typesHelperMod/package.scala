package typings
package emotionDashThemingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesHelperMod {
  type AddOptionalTo[T, U] = (Omit[T, U]) with (stdLib.Partial[stdLib.Pick[T, stdLib.Extract[java.lang.String, U]]])
  type Omit[T, U] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, U]]
  type PropsOf[C /* <: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 175 */ js.Any */] = reactLib.reactMod.Global.JSXNs.LibraryManagedAttributes[C, reactLib.reactMod.ComponentPropsWithRef[C]]
}
