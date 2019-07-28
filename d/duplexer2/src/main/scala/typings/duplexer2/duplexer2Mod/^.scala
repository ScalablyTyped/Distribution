package typings.duplexer2.duplexer2Mod

import typings.node.NodeJSNs.ReadWriteStream
import typings.node.NodeJSNs.ReadableStream
import typings.node.NodeJSNs.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("duplexer2", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(options: Duplexer2Options, writable: WritableStream, readable: ReadableStream): ReadWriteStream = js.native
  def apply(writable: WritableStream, readable: ReadableStream): ReadWriteStream = js.native
}

