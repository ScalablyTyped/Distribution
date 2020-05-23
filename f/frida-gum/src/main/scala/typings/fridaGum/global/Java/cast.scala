package typings.fridaGum.global.Java

import typings.fridaGum.Java.Members
import typings.fridaGum.Java.Wrapper
import typings.fridaGum.NativePointerValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Java.cast")
@js.native
object cast extends js.Object {
  /**
    * Creates a JavaScript wrapper given the existing instance at `handle` of
    * given class `klass` as returned from `Java.use()`.
    *
    * @param handle An existing wrapper or a JNI handle.
    * @param klass Class wrapper for type to cast to.
    */
  def apply[From /* <: Members[From] */, To /* <: Members[To] */](handle: Wrapper[From], klass: Wrapper[To]): Wrapper[To] = js.native
  def apply[From /* <: Members[From] */, To /* <: Members[To] */](handle: NativePointerValue, klass: Wrapper[To]): Wrapper[To] = js.native
}

