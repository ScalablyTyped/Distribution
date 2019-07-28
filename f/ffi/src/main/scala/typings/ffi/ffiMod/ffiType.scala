package typings.ffi.ffiMod

import typings.ffi.Buffer
import typings.ref.refMod.Type
import typings.refDashStruct.refDashStructMod.StructType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ffi", "ffiType")
@js.native
object ffiType extends js.Object {
  @JSName("FFI_TYPE")
  var FFI_TYPE_Original: StructType = js.native
  def apply(`type`: String): Buffer = js.native
  /** Get a `ffi_type *` Buffer appropriate for the given type. */
  def apply(`type`: Type): Buffer = js.native
  def FFI_TYPE(): js.Any = js.native
  /** Pass it an existing Buffer instance to use that as the backing buffer. */
  def FFI_TYPE(arg: typings.node.Buffer): js.Any = js.native
  def FFI_TYPE(arg: typings.node.Buffer, data: js.Object): js.Any = js.native
  def FFI_TYPE(data: js.Object): js.Any = js.native
}

