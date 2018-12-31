package typings
package ffiLib.ffiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Function
  extends refLib.refMod.Type {
  var abi: scala.Double = js.native
  /** The type of arguments. */
  var argTypes: js.Array[refLib.refMod.Type] = js.native
  /** Is set for node-ffi functions. */
  var ffi_type: ffiLib.Buffer = js.native
  /** The type of return value. */
  var retType: refLib.refMod.Type = js.native
  /** Get a `ForeignFunction` of this function type. */
  def toFunction(buf: ffiLib.Buffer): ForeignFunction = js.native
  /** Get a `Callback` pointer of this function type. */
  def toPointer(fn: js.Function1[/* repeated */ js.Any, _]): ffiLib.Buffer = js.native
}

