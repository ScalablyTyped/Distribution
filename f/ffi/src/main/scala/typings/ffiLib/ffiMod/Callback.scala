package typings
package ffiLib.ffiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Callback
  extends org.scalablytyped.runtime.Instantiable4[
      /* retType */ js.Any, 
      /* argTypes */ js.Array[js.Any], 
      /* abi */ scala.Double, 
      /* fn */ js.Any, 
      ffiLib.Buffer
    ]
     with org.scalablytyped.runtime.Instantiable3[/* retType */ js.Any, /* argTypes */ js.Array[js.Any], /* fn */ js.Any, ffiLib.Buffer] {
  def apply(retType: js.Any, argTypes: js.Array[_], abi: scala.Double, fn: js.Any): ffiLib.Buffer = js.native
  def apply(retType: js.Any, argTypes: js.Array[_], fn: js.Any): ffiLib.Buffer = js.native
}

@JSImport("ffi", "Callback")
@js.native
class CallbackCls protected ()
  extends ffiLib.Buffer {
  def this(retType: js.Any, argTypes: js.Array[_], fn: js.Any) = this()
  def this(retType: js.Any, argTypes: js.Array[_], abi: scala.Double, fn: js.Any) = this()
}

