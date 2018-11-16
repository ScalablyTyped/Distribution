package typings
package ffiDashNapiLib.ffiDashNapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Function
  extends refDashNapiLib.refDashNapiMod.Type {
  var abi: scala.Double = js.native
  /** The type of arguments. */
  var argTypes: js.Array[refDashNapiLib.refDashNapiMod.Type] = js.native
  /** Is set for node-ffi functions. */
  var ffi_type: ffiDashNapiLib.Buffer = js.native
  /** The type of return value. */
  var retType: refDashNapiLib.refDashNapiMod.Type = js.native
  /** Get a `ForeignFunction` of this function type. */
  def toFunction(buf: ffiDashNapiLib.Buffer): ForeignFunction = js.native
  /** Get a `Callback` pointer of this function type. */
  def toPointer(fn: js.Function1[/* repeated */js.Any, _]): ffiDashNapiLib.Buffer = js.native
}

