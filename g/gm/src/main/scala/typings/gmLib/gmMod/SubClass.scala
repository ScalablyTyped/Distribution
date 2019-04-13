package typings
package gmLib.gmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubClass extends js.Object {
  def apply(image: java.lang.String): State = js.native
  def apply(stream: nodeLib.Buffer): State = js.native
  def apply(stream: nodeLib.Buffer, image: java.lang.String): State = js.native
  def apply(stream: nodeLib.NodeJSNs.ReadableStream): State = js.native
  def apply(stream: nodeLib.NodeJSNs.ReadableStream, image: java.lang.String): State = js.native
  def apply(width: scala.Double, height: scala.Double): State = js.native
  def apply(width: scala.Double, height: scala.Double, color: java.lang.String): State = js.native
}

