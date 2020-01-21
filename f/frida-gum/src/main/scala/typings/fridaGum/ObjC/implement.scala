package typings.fridaGum.ObjC

import typings.fridaGum.AnyFunction
import typings.fridaGum.NativeCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ObjC.implement")
@js.native
object implement extends js.Object {
  /**
    * Creates a JavaScript implementation compatible with the signature of `method`, where `fn` is used as the
    * implementation. Returns a `NativeCallback` that you may assign to an ObjC method’s `implementation` property.
    *
    * @param method Method to implement.
    * @param fn Implementation.
    */
  def apply(method: ObjectMethod, fn: AnyFunction): NativeCallback = js.native
}

