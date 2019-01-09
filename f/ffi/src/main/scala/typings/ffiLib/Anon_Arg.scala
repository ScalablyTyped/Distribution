package typings
package ffiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Arg extends js.Object {
  @JSName("FFI_TYPE")
  var FFI_TYPE_Original: refDashStructLib.refDashStructMod.StructType = js.native
  def apply(`type`: java.lang.String): Buffer = js.native
  /** Get a `ffi_type *` Buffer appropriate for the given type. */
  def apply(`type`: refLib.refMod.Type): Buffer = js.native
  def FFI_TYPE(): js.Any = js.native
  /** Pass it an existing Buffer instance to use that as the backing buffer. */
  def FFI_TYPE(arg: nodeLib.Buffer): js.Any = js.native
  def FFI_TYPE(arg: nodeLib.Buffer, data: js.Object): js.Any = js.native
  def FFI_TYPE(data: js.Object): js.Any = js.native
}

