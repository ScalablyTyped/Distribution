package typings
package easyDashXapiDashSupertestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SlowBuffer")
@js.native
object SlowBuffer
  extends ScalablyTyped.runtime.Instantiable2[/* str */ java.lang.String, /* encoding */ java.lang.String, Buffer]
     with ScalablyTyped.runtime.Instantiable1[
      (/* str */ java.lang.String) | (/* size */ scala.Double) | (/* size */ stdLib.Uint8Array) | (/* array */ js.Array[js.Any]), 
      Buffer
    ] {
  def byteLength(string: java.lang.String): scala.Double = js.native
  def byteLength(string: java.lang.String, encoding: java.lang.String): scala.Double = js.native
  def concat(list: js.Array[easyDashXapiDashSupertestLib.Buffer]): easyDashXapiDashSupertestLib.Buffer = js.native
  def concat(list: js.Array[easyDashXapiDashSupertestLib.Buffer], totalLength: scala.Double): easyDashXapiDashSupertestLib.Buffer = js.native
  def isBuffer(obj: js.Any): scala.Boolean = js.native
}

