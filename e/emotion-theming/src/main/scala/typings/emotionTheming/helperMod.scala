package typings.emotionTheming

import typings.react.mod.ComponentPropsWithRef
import typings.react.mod.global.JSX.LibraryManagedAttributes
import typings.std.Exclude
import typings.std.Extract
import typings.std.Partial
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("emotion-theming/types/helper", JSImport.Namespace)
@js.native
object helperMod extends js.Object {
  type AddOptionalTo[T, U] = (Omit[T, U]) with (Partial[Pick[T, Extract[/* keyof T */ String, U]]])
  type Omit[T, U] = Pick[T, Exclude[/* keyof T */ String, U]]
  type PropsOf[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any */] = LibraryManagedAttributes[C, ComponentPropsWithRef[C]]
}

