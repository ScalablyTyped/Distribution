package typings.atEmotionStyledDashBase

import typings.react.reactMod.ComponentPropsWithRef
import typings.react.reactMod.Global.JSX.LibraryManagedAttributes
import typings.std.Exclude
import typings.std.Extract
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@emotion/styled-base/types/helper", JSImport.Namespace)
@js.native
object typesHelperMod extends js.Object {
  type Omit[T, U] = Pick[T, Exclude[String, U]]
  type Overwrapped[T, U] = Pick[T, Extract[String, String]]
  type PropsOf[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */] = LibraryManagedAttributes[C, ComponentPropsWithRef[C]]
}

