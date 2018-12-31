package typings
package ffiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Type extends js.Object {
  var FFI_TYPE: refDashStructLib.refDashStructMod.StructType = js.native
  def apply(`type`: java.lang.String): Buffer = js.native
  /** Get a `ffi_type *` Buffer appropriate for the given type. */
  def apply(`type`: refLib.refMod.Type): Buffer = js.native
}

