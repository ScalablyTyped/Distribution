package typings.duplexer3.duplexer3Mod

import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.streamMod.Duplex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("duplexer3", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(options: Options, writableStream: WritableStream, readableStream: ReadableStream): Duplex = js.native
  def apply(writableStream: WritableStream, readableStream: ReadableStream): Duplex = js.native
}

