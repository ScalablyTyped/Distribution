package typings
package ffiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_PtrRetType
  extends org.scalablytyped.runtime.Instantiable3[
      /* ptr */ Buffer, 
      (/* retType */ refLib.refMod.Type) | (/* retType */ java.lang.String), 
      /* argTypes */ js.Array[js.Any], 
      ffiLib.ffiMod.ForeignFunction
    ]
     with org.scalablytyped.runtime.Instantiable4[
      /* ptr */ Buffer, 
      (/* retType */ refLib.refMod.Type) | (/* retType */ java.lang.String), 
      /* argTypes */ js.Array[js.Any], 
      /* abi */ scala.Double, 
      ffiLib.ffiMod.ForeignFunction
    ] {
  def apply(ptr: Buffer, retType: java.lang.String, argTypes: js.Array[_]): ffiLib.ffiMod.ForeignFunction = js.native
  def apply(ptr: Buffer, retType: java.lang.String, argTypes: js.Array[_], abi: scala.Double): ffiLib.ffiMod.ForeignFunction = js.native
  def apply(ptr: Buffer, retType: refLib.refMod.Type, argTypes: js.Array[_]): ffiLib.ffiMod.ForeignFunction = js.native
  def apply(ptr: Buffer, retType: refLib.refMod.Type, argTypes: js.Array[_], abi: scala.Double): ffiLib.ffiMod.ForeignFunction = js.native
}

