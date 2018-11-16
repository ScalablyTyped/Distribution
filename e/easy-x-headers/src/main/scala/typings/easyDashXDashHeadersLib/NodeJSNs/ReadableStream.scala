package typings
package easyDashXDashHeadersLib.NodeJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadableStream extends EventEmitter {
  var readable: scala.Boolean = js.native
  def pause(): scala.Unit = js.native
  def pipe[T /* <: WritableStream */](destination: T): T = js.native
  def pipe[T /* <: WritableStream */](destination: T, options: easyDashXDashHeadersLib.Anon_End): T = js.native
  def read(): java.lang.String | easyDashXDashHeadersLib.Buffer = js.native
  def read(size: scala.Double): java.lang.String | easyDashXDashHeadersLib.Buffer = js.native
  def resume(): scala.Unit = js.native
  def setEncoding(encoding: java.lang.String): scala.Unit = js.native
  def unpipe[T /* <: WritableStream */](): scala.Unit = js.native
  def unpipe[T /* <: WritableStream */](destination: T): scala.Unit = js.native
  def unshift(chunk: easyDashXDashHeadersLib.Buffer): scala.Unit = js.native
  def unshift(chunk: java.lang.String): scala.Unit = js.native
  def wrap(oldStream: ReadableStream): ReadableStream = js.native
}

