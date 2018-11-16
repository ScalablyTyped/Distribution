package typings
package eventDashStreamLib.eventDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("event-stream", JSImport.Namespace)
@js.native
object eventDashStreamModMembers extends js.Object {
  def child(child_process: js.Any): MapStream = js.native
  def concat(streamArray: js.Array[MapStream]): MapStream = js.native
  def concat(stream: MapStream*): MapStream = js.native
  def duplex(writeStream: nodeLib.streamMod.Writable, readStream: nodeLib.streamMod.Readable): MapStream = js.native
  def join(separator: java.lang.String): MapStream = js.native
  def map(asyncFunction: js.Function): MapStream = js.native
  def mapSync(syncFunction: js.Function): MapStream = js.native
  def merge(streamArray: js.Array[MapStream]): MapStream = js.native
  def merge(stream: MapStream*): MapStream = js.native
  def parse(): js.Any = js.native
  def pause(): MapStream | scala.Unit = js.native
  def readArray(array: js.Array[_]): MapStream = js.native
  def readable(asyncFunction: js.Function): MapStream = js.native
  def replace(from: java.lang.String, to: java.lang.String): MapStream = js.native
  def replace(from: java.lang.String, to: stdLib.RegExp): MapStream = js.native
  def replace(from: stdLib.RegExp, to: java.lang.String): MapStream = js.native
  def replace(from: stdLib.RegExp, to: stdLib.RegExp): MapStream = js.native
  def split(): MapStream = js.native
  def split(matcher: java.lang.String): MapStream = js.native
  def split(matcher: stdLib.RegExp): MapStream = js.native
  def stringify(): MapStream = js.native
  def wait(callback: js.Function): MapStream = js.native
  def writeArray(callback: js.Function): MapStream = js.native
}

