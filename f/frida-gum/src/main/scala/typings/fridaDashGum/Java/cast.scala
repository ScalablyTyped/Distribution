package typings.fridaDashGum.Java

import typings.fridaDashGum.NativePointerValue
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
  def apply(handle: Wrapper, klass: Wrapper): Wrapper = js.native
  def apply(handle: NativePointerValue, klass: Wrapper): Wrapper = js.native
}

