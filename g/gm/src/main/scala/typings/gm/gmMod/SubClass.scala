package typings.gm.gmMod

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubClass extends js.Object {
  def apply(image: String): State = js.native
  def apply(stream: Buffer): State = js.native
  def apply(stream: Buffer, image: String): State = js.native
  def apply(stream: ReadableStream): State = js.native
  def apply(stream: ReadableStream, image: String): State = js.native
  def apply(width: Double, height: Double): State = js.native
  def apply(width: Double, height: Double, color: String): State = js.native
}

@JSImport("gm", "subClass")
@js.native
object subClass extends js.Object {
  def apply(options: ClassOptions): SubClass = js.native
}

