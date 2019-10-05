package typings.duplexer2.duplexer2Mod

import typings.node.NodeJS.ReadWriteStream
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("duplexer2", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(options: Duplexer2Options, writable: WritableStream, readable: ReadableStream): ReadWriteStream = js.native
  def apply(writable: WritableStream, readable: ReadableStream): ReadWriteStream = js.native
}

