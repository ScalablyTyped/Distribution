package typings
package ffiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Abi
  extends org.scalablytyped.runtime.Instantiable2[
      (/* retType */ java.lang.String) | (/* retType */ refLib.refMod.Type), 
      /* argTypes */ js.Array[js.Any], 
      ffiLib.ffiMod.Function
    ]
     with org.scalablytyped.runtime.Instantiable3[
      (/* retType */ java.lang.String) | (/* retType */ refLib.refMod.Type), 
      /* argTypes */ js.Array[js.Any], 
      /* abi */ scala.Double, 
      ffiLib.ffiMod.Function
    ] {
  def apply(retType: java.lang.String, argTypes: js.Array[_]): ffiLib.ffiMod.Function = js.native
  def apply(retType: java.lang.String, argTypes: js.Array[_], abi: scala.Double): ffiLib.ffiMod.Function = js.native
  def apply(retType: refLib.refMod.Type, argTypes: js.Array[_]): ffiLib.ffiMod.Function = js.native
  def apply(retType: refLib.refMod.Type, argTypes: js.Array[_], abi: scala.Double): ffiLib.ffiMod.Function = js.native
}

