package typings
package ffiDashNapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_PtrRetType
  extends ScalablyTyped.runtime.Instantiable4[
      /* ptr */ Buffer, 
      (/* retType */ refDashNapiLib.refDashNapiMod.Type) | (/* retType */ java.lang.String), 
      /* argTypes */ js.Array[js.Any], 
      /* abi */ scala.Double, 
      ffiDashNapiLib.ffiDashNapiMod.ForeignFunction
    ]
     with ScalablyTyped.runtime.Instantiable3[
      /* ptr */ Buffer, 
      (/* retType */ refDashNapiLib.refDashNapiMod.Type) | (/* retType */ java.lang.String), 
      /* argTypes */ js.Array[js.Any], 
      ffiDashNapiLib.ffiDashNapiMod.ForeignFunction
    ] {
  def apply(ptr: Buffer, retType: java.lang.String, argTypes: js.Array[_]): ffiDashNapiLib.ffiDashNapiMod.ForeignFunction = js.native
  def apply(ptr: Buffer, retType: java.lang.String, argTypes: js.Array[_], abi: scala.Double): ffiDashNapiLib.ffiDashNapiMod.ForeignFunction = js.native
  def apply(ptr: Buffer, retType: refDashNapiLib.refDashNapiMod.Type, argTypes: js.Array[_]): ffiDashNapiLib.ffiDashNapiMod.ForeignFunction = js.native
  def apply(ptr: Buffer, retType: refDashNapiLib.refDashNapiMod.Type, argTypes: js.Array[_], abi: scala.Double): ffiDashNapiLib.ffiDashNapiMod.ForeignFunction = js.native
}

