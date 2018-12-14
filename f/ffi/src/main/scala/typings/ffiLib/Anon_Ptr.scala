package typings
package ffiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Ptr
  extends org.scalablytyped.runtime.Instantiable3[
      /* ptr */ Buffer, 
      (/* ret */ refLib.refMod.Type) | (/* ret */ java.lang.String), 
      /* fixedArgs */ js.Array[js.Any], 
      ffiLib.ffiMod.VariadicForeignFunction
    ]
     with org.scalablytyped.runtime.Instantiable4[
      /* ptr */ Buffer, 
      (/* ret */ refLib.refMod.Type) | (/* ret */ java.lang.String), 
      /* fixedArgs */ js.Array[js.Any], 
      /* abi */ scala.Double, 
      ffiLib.ffiMod.VariadicForeignFunction
    ] {
  def apply(ptr: Buffer, ret: java.lang.String, fixedArgs: js.Array[_]): ffiLib.ffiMod.VariadicForeignFunction = js.native
  def apply(ptr: Buffer, ret: java.lang.String, fixedArgs: js.Array[_], abi: scala.Double): ffiLib.ffiMod.VariadicForeignFunction = js.native
  def apply(ptr: Buffer, ret: refLib.refMod.Type, fixedArgs: js.Array[_]): ffiLib.ffiMod.VariadicForeignFunction = js.native
  def apply(ptr: Buffer, ret: refLib.refMod.Type, fixedArgs: js.Array[_], abi: scala.Double): ffiLib.ffiMod.VariadicForeignFunction = js.native
}

