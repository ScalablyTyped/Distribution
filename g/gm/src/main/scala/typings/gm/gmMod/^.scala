package typings.gm.gmMod

import typings.node.Buffer
import typings.node.NodeJSNs.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gm", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(stream: ReadableStream | Buffer | String): State = js.native
  def apply(stream: ReadableStream | Buffer | String, image: String): State = js.native
  def apply(width: Double, height: Double): State = js.native
  def apply(width: Double, height: Double, color: String): State = js.native
  def compare(filename1: String, filename2: String, callback: CompareCallback): Unit = js.native
  def compare(filename1: String, filename2: String, options: Double, callback: CompareCallback): Unit = js.native
  def compare(filename1: String, filename2: String, options: CompareOptions, callback: CompareCallback): Unit = js.native
  def subClass(options: ClassOptions): SubClass = js.native
}

