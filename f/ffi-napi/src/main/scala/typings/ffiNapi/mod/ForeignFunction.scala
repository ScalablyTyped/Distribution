package typings.ffiNapi.mod

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typings.ffiNapi.Buffer
import typings.refNapi.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForeignFunction extends js.Object {
  def apply(args: js.Any*): js.Any = js.native
  def async(args: js.Any*): Unit = js.native
}

@JSImport("ffi-napi", "ForeignFunction")
@js.native
object ForeignFunction
  extends Instantiable3[
      /* ptr */ Buffer, 
      (/* retType */ String) | (/* retType */ Type), 
      /* argTypes */ js.Array[js.Any], 
      ForeignFunction
    ]
     with Instantiable4[
      /* ptr */ Buffer, 
      (/* retType */ String) | (/* retType */ Type), 
      /* argTypes */ js.Array[js.Any], 
      /* abi */ Double, 
      ForeignFunction
    ] {
  def apply(ptr: Buffer, retType: String, argTypes: js.Array[_]): ForeignFunction = js.native
  def apply(ptr: Buffer, retType: String, argTypes: js.Array[_], abi: Double): ForeignFunction = js.native
  def apply(ptr: Buffer, retType: Type, argTypes: js.Array[_]): ForeignFunction = js.native
  def apply(ptr: Buffer, retType: Type, argTypes: js.Array[_], abi: Double): ForeignFunction = js.native
}

