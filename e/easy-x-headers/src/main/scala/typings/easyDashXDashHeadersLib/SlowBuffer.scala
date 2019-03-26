package typings
package easyDashXDashHeadersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SlowBuffer")
@js.native
class SlowBuffer protected () extends Buffer {
  def this(array: js.Array[_]) = this()
  def this(size: scala.Double) = this()
  def this(size: stdLib.Uint8Array) = this()
  def this(str: java.lang.String) = this()
  def this(str: java.lang.String, encoding: java.lang.String) = this()
}

@JSGlobal("SlowBuffer")
@js.native
object SlowBuffer
  extends org.scalablytyped.runtime.Instantiable2[/* str */ java.lang.String, /* encoding */ java.lang.String, Buffer]
     with org.scalablytyped.runtime.Instantiable1[
      (/* array */ js.Array[js.Any]) | (/* size */ scala.Double) | (/* str */ java.lang.String) | (/* size */ stdLib.Uint8Array), 
      Buffer
    ] {
  def byteLength(string: java.lang.String): scala.Double = js.native
  def byteLength(string: java.lang.String, encoding: java.lang.String): scala.Double = js.native
  def concat(list: js.Array[easyDashXDashHeadersLib.Buffer]): easyDashXDashHeadersLib.Buffer = js.native
  def concat(list: js.Array[easyDashXDashHeadersLib.Buffer], totalLength: scala.Double): easyDashXDashHeadersLib.Buffer = js.native
  def isBuffer(obj: js.Any): scala.Boolean = js.native
}

