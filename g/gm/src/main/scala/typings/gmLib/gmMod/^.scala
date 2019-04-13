package typings
package gmLib.gmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gm", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(stream: nodeLib.NodeJSNs.ReadableStream | nodeLib.Buffer | java.lang.String): State = js.native
  def apply(
    stream: nodeLib.NodeJSNs.ReadableStream | nodeLib.Buffer | java.lang.String,
    image: java.lang.String
  ): State = js.native
  def apply(width: scala.Double, height: scala.Double): State = js.native
  def apply(width: scala.Double, height: scala.Double, color: java.lang.String): State = js.native
  def compare(filename1: java.lang.String, filename2: java.lang.String, callback: CompareCallback): scala.Unit = js.native
  def compare(
    filename1: java.lang.String,
    filename2: java.lang.String,
    options: CompareOptions,
    callback: CompareCallback
  ): scala.Unit = js.native
  def compare(
    filename1: java.lang.String,
    filename2: java.lang.String,
    options: scala.Double,
    callback: CompareCallback
  ): scala.Unit = js.native
  def subClass(options: ClassOptions): SubClass = js.native
}

