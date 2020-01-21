package typings.googleGax.mod.fallback.protobuf.util

import typings.protobufjs.mod.Constructor
import typings.protobufjs.mod.Message
import typings.protobufjs.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax", "fallback.protobuf.util.decorateType")
@js.native
object decorateType extends js.Object {
  /**
    * Decorator helper for types (TypeScript).
    * @param ctor Constructor function
    * @param [typeName] Type name, defaults to the constructor's name
    * @returns Reflected type
    */
  def apply[T /* <: Message[T] */](ctor: Constructor[T]): Type = js.native
  def apply[T /* <: Message[T] */](ctor: Constructor[T], typeName: String): Type = js.native
}

