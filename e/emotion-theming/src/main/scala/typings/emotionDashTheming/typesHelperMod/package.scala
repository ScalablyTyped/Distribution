package typings.emotionDashTheming

import typings.react.reactMod.ComponentPropsWithRef
import typings.react.reactMod.Global.JSXNs.LibraryManagedAttributes
import typings.std.Exclude
import typings.std.Extract
import typings.std.Partial
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesHelperMod {
  type AddOptionalTo[T, U] = (Omit[T, U]) with (Partial[Pick[T, Extract[String, U]]])
  type Omit[T, U] = Pick[T, Exclude[String, U]]
  type PropsOf[C /* <: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 175 */ js.Any */] = LibraryManagedAttributes[C, ComponentPropsWithRef[C]]
}
