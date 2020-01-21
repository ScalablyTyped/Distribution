package typings.gm.mod

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gm", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(stream: String): State = js.native
  def apply(stream: String, image: String): State = js.native
  def apply(stream: Buffer): State = js.native
  def apply(stream: Buffer, image: String): State = js.native
  def apply(stream: ReadableStream): State = js.native
  def apply(stream: ReadableStream, image: String): State = js.native
  def apply(width: Double, height: Double): State = js.native
  def apply(width: Double, height: Double, color: String): State = js.native
}

