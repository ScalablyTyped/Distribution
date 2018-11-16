package typings
package ffiDashNapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Ptr
  extends ScalablyTyped.runtime.Instantiable4[
      /* ptr */ Buffer, 
      (/* ret */ refDashNapiLib.refDashNapiMod.Type) | (/* ret */ java.lang.String), 
      /* fixedArgs */ js.Array[js.Any], 
      /* abi */ scala.Double, 
      ffiDashNapiLib.ffiDashNapiMod.VariadicForeignFunction
    ]
     with ScalablyTyped.runtime.Instantiable3[
      /* ptr */ Buffer, 
      (/* ret */ refDashNapiLib.refDashNapiMod.Type) | (/* ret */ java.lang.String), 
      /* fixedArgs */ js.Array[js.Any], 
      ffiDashNapiLib.ffiDashNapiMod.VariadicForeignFunction
    ] {
  def apply(ptr: Buffer, ret: java.lang.String, fixedArgs: js.Array[_]): ffiDashNapiLib.ffiDashNapiMod.VariadicForeignFunction = js.native
  def apply(ptr: Buffer, ret: java.lang.String, fixedArgs: js.Array[_], abi: scala.Double): ffiDashNapiLib.ffiDashNapiMod.VariadicForeignFunction = js.native
  def apply(ptr: Buffer, ret: refDashNapiLib.refDashNapiMod.Type, fixedArgs: js.Array[_]): ffiDashNapiLib.ffiDashNapiMod.VariadicForeignFunction = js.native
  def apply(ptr: Buffer, ret: refDashNapiLib.refDashNapiMod.Type, fixedArgs: js.Array[_], abi: scala.Double): ffiDashNapiLib.ffiDashNapiMod.VariadicForeignFunction = js.native
}

