package typings.domDashMediacaptureDashRecord

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
  var ondataavailable: (js.Function1[/* event */ BlobEvent, Unit]) | Null = js.native
  var onerror: (js.Function1[/* event */ MediaRecorderErrorEvent, Unit]) | Null = js.native
  var onpause: EventListener | Null = js.native
  var onresume: EventListener | Null = js.native
  var onstart: EventListener | Null = js.native
  var onstop: EventListener | Null = js.native
  val state: RecordingState = js.native
  val stream: MediaStream = js.native
  val videoBitsPerSecond: Double = js.native
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

