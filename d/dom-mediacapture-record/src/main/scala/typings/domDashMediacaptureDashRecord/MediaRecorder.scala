package typings.domDashMediacaptureDashRecord

import typings.std.Event
import typings.std.EventListener
import typings.std.EventTarget
import typings.std.MediaStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MediaRecorder")
@js.native
class MediaRecorder protected () extends EventTarget {
  def this(stream: MediaStream) = this()
  def this(stream: MediaStream, options: MediaRecorderOptions) = this()
  val audioBitsPerSecond: Double = js.native
  val mimeType: String = js.native
  @JSName("onpause")
  var onpause_Original: EventListener = js.native
  @JSName("onresume")
  var onresume_Original: EventListener = js.native
  @JSName("onstart")
  var onstart_Original: EventListener = js.native
  @JSName("onstop")
  var onstop_Original: EventListener = js.native
  val state: RecordingState = js.native
  val stream: MediaStream = js.native
  val videoBitsPerSecond: Double = js.native
  def ondataavailable(event: BlobEvent): Unit = js.native
  def onerror(event: MediaRecorderErrorEvent): Unit = js.native
  def onpause(evt: Event): Unit = js.native
  def onresume(evt: Event): Unit = js.native
  def onstart(evt: Event): Unit = js.native
  def onstop(evt: Event): Unit = js.native
  def pause(): Unit = js.native
  def requestData(): Unit = js.native
  def resume(): Unit = js.native
  def start(): Unit = js.native
  def start(timeslice: Double): Unit = js.native
  def stop(): Unit = js.native
}

/* static members */
@JSGlobal("MediaRecorder")
@js.native
object MediaRecorder extends js.Object {
  def isTypeSupported(`type`: String): Boolean = js.native
}

