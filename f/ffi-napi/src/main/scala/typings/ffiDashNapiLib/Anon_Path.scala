package typings
package ffiDashNapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Path
  extends ScalablyTyped.runtime.Instantiable0[ffiDashNapiLib.ffiDashNapiMod.DynamicLibrary]
     with ScalablyTyped.runtime.Instantiable1[/* path */ java.lang.String, ffiDashNapiLib.ffiDashNapiMod.DynamicLibrary]
     with ScalablyTyped.runtime.Instantiable2[
      /* path */ java.lang.String, 
      /* mode */ scala.Double, 
      ffiDashNapiLib.ffiDashNapiMod.DynamicLibrary
    ] {
  var FLAGS: Anon_RTLDNOLOAD = js.native
  def apply(): ffiDashNapiLib.ffiDashNapiMod.DynamicLibrary = js.native
  def apply(path: java.lang.String): ffiDashNapiLib.ffiDashNapiMod.DynamicLibrary = js.native
  def apply(path: java.lang.String, mode: scala.Double): ffiDashNapiLib.ffiDashNapiMod.DynamicLibrary = js.native
}

