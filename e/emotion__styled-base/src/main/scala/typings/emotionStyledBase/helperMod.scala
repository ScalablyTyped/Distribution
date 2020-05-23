package typings.emotionStyledBase

import typings.react.mod.ComponentPropsWithRef
import typings.react.mod.global.JSX.LibraryManagedAttributes
import typings.std.Exclude
import typings.std.Extract
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@emotion/styled-base/types/helper", JSImport.Namespace)
@js.native
object helperMod extends js.Object {
  type Omit[T, U] = Pick[T, Exclude[/* keyof T */ String, U]]
  type Overwrapped[T, U] = Pick[T, Extract[/* keyof T */ String, /* keyof U */ String]]
  type PropsOf[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any */] = LibraryManagedAttributes[C, ComponentPropsWithRef[C]]
}

