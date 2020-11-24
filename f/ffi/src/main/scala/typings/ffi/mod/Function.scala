package typings.ffi.mod

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.ffi.Buffer
import typings.ref.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Function extends Type {
  
  var abi: Double = js.native
  
  /** The type of arguments. */
  var argTypes: js.Array[Type] = js.native
  
  /** Is set for node-ffi functions. */
  var ffi_type: Buffer = js.native
  
  /** The type of return value. */
  var retType: Type = js.native
  
  /** Get a `ForeignFunction` of this function type. */
  def toFunction(buf: Buffer): ForeignFunction = js.native
  
  /** Get a `Callback` pointer of this function type. */
  def toPointer(fn: js.Function1[/* repeated */ js.Any, _]): Buffer = js.native
}
@JSImport("ffi", "Function")
@js.native
object Function
  extends Instantiable2[
      (/* retType */ String) | (/* retType */ Type), 
      /* argTypes */ js.Array[js.Any], 
      Function
    ]
     with Instantiable3[
      (/* retType */ String) | (/* retType */ Type), 
      /* argTypes */ js.Array[js.Any], 
      /* abi */ Double, 
      Function
    ] {
  
  def apply(retType: String, argTypes: js.Array[_]): Function = js.native
  def apply(retType: String, argTypes: js.Array[_], abi: Double): Function = js.native
  def apply(retType: Type, argTypes: js.Array[_]): Function = js.native
  def apply(retType: Type, argTypes: js.Array[_], abi: Double): Function = js.native
}
