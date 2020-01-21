package typings.eventStream

import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import typings.node.streamMod.internal
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("event-stream", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait MapStream extends internal {
    var end: js.Any = js.native
    var readable: Boolean = js.native
    var writable: Boolean = js.native
    var write: js.Any = js.native
    def destroy(): Unit = js.native
    def pause(): Unit = js.native
    def resume(): Unit = js.native
  }
  
  def child(child_process: js.Any): MapStream = js.native
  def concat(streamArray: js.Array[MapStream]): MapStream = js.native
  def concat(stream: MapStream*): MapStream = js.native
  def duplex(writeStream: Writable, readStream: Readable): MapStream = js.native
  def join(separator: String): MapStream = js.native
  def map(asyncFunction: js.Function): MapStream = js.native
  def mapSync(syncFunction: js.Function): MapStream = js.native
  def merge(streamArray: js.Array[MapStream]): MapStream = js.native
  def merge(stream: MapStream*): MapStream = js.native
  def parse(): js.Any = js.native
  def pause(): MapStream | Unit = js.native
  def readArray(array: js.Array[_]): MapStream = js.native
  def readable(asyncFunction: js.Function): MapStream = js.native
  def replace(from: String, to: String): MapStream = js.native
  def replace(from: String, to: RegExp): MapStream = js.native
  def replace(from: RegExp, to: String): MapStream = js.native
  def replace(from: RegExp, to: RegExp): MapStream = js.native
  def split(): MapStream = js.native
  def split(matcher: String): MapStream = js.native
  def split(matcher: RegExp): MapStream = js.native
  def stringify(): MapStream = js.native
  def wait(callback: js.Function): MapStream = js.native
  def writeArray(callback: js.Function): MapStream = js.native
}

