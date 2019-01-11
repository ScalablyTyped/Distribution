package typings
package eventDashStreamLib.eventDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("event-stream", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def child(child_process: js.Any): eventDashStreamLib.eventDashStreamMod.MapStream = js.native
  def concat(streamArray: js.Array[eventDashStreamLib.eventDashStreamMod.MapStream]): eventDashStreamLib.eventDashStreamMod.MapStream = js.native
  def concat(stream: eventDashStreamLib.eventDashStreamMod.MapStream*): eventDashStreamLib.eventDashStreamMod.MapStream = js.native
  def duplex(writeStream: nodeLib.streamMod.Writable, readStream: nodeLib.streamMod.Readable): eventDashStreamLib.eventDashStreamMod.MapStream = js.native
  def join(separator: java.lang.String): eventDashStreamLib.eventDashStreamMod.MapStream = js.native
  def map(asyncFunction: js.Function): eventDashStreamLib.eventDashStreamMod.MapStream = js.native
  def mapSync(syncFunction: js.Function): eventDashStreamLib.eventDashStreamMod.MapStream = js.native
  def merge(streamArray: js.Array[eventDashStreamLib.eventDashStreamMod.MapStream]): eventDashStreamLib.eventDashStreamMod.MapStream = js.native
  def merge(stream: eventDashStreamLib.eventDashStreamMod.MapStream*): eventDashStreamLib.eventDashStreamMod.MapStream = js.native
  def parse(): js.Any = js.native
  def pause(): eventDashStreamLib.eventDashStreamMod.MapStream | scala.Unit = js.native
  def readArray(array: js.Array[_]): eventDashStreamLib.eventDashStreamMod.MapStream = js.native
  def readable(asyncFunction: js.Function): eventDashStreamLib.eventDashStreamMod.MapStream = js.native
  def replace(from: java.lang.String, to: java.lang.String): eventDashStreamLib.eventDashStreamMod.MapStream = js.native
  def replace(from: java.lang.String, to: stdLib.RegExp): eventDashStreamLib.eventDashStreamMod.MapStream = js.native
  def replace(from: stdLib.RegExp, to: java.lang.String): eventDashStreamLib.eventDashStreamMod.MapStream = js.native
  def replace(from: stdLib.RegExp, to: stdLib.RegExp): eventDashStreamLib.eventDashStreamMod.MapStream = js.native
  def split(): eventDashStreamLib.eventDashStreamMod.MapStream = js.native
  def split(matcher: java.lang.String): eventDashStreamLib.eventDashStreamMod.MapStream = js.native
  def split(matcher: stdLib.RegExp): eventDashStreamLib.eventDashStreamMod.MapStream = js.native
  def stringify(): eventDashStreamLib.eventDashStreamMod.MapStream = js.native
  def wait(callback: js.Function): eventDashStreamLib.eventDashStreamMod.MapStream = js.native
  def writeArray(callback: js.Function): eventDashStreamLib.eventDashStreamMod.MapStream = js.native
}

