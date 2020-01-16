package typings.easyDashXapiDashSupertest.NodeJS

import typings.easyDashXapiDashSupertest.Anon_End
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadableStream extends EventEmitter {
  var readable: Boolean = js.native
  def pause(): Unit = js.native
  def pipe[T /* <: WritableStream */](destination: T): T = js.native
  def pipe[T /* <: WritableStream */](destination: T, options: Anon_End): T = js.native
  def read(): String | Buffer = js.native
  def read(size: Double): String | Buffer = js.native
  def resume(): Unit = js.native
  def setEncoding(encoding: String): Unit = js.native
  def unpipe[T /* <: WritableStream */](): Unit = js.native
  def unpipe[T /* <: WritableStream */](destination: T): Unit = js.native
  def unshift(chunk: String): Unit = js.native
  def unshift(chunk: Buffer): Unit = js.native
  def wrap(oldStream: ReadableStream): ReadableStream = js.native
}

