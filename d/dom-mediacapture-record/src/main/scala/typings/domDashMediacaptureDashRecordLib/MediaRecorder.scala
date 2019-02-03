package typings
package domDashMediacaptureDashRecordLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MediaRecorder")
@js.native
class MediaRecorder protected ()
  extends stdLib.EventTarget {
  def this(stream: stdLib.MediaStream) = this()
  def this(stream: stdLib.MediaStream, options: MediaRecorderOptions) = this()
  val audioBitsPerSecond: scala.Double = js.native
  val mimeType: java.lang.String = js.native
  @JSName("onpause")
  var onpause_Original: stdLib.EventListener = js.native
  @JSName("onresume")
  var onresume_Original: stdLib.EventListener = js.native
  @JSName("onstart")
  var onstart_Original: stdLib.EventListener = js.native
  @JSName("onstop")
  var onstop_Original: stdLib.EventListener = js.native
  val state: RecordingState = js.native
  val stream: stdLib.MediaStream = js.native
  val videoBitsPerSecond: scala.Double = js.native
  def ondataavailable(event: BlobEvent): scala.Unit = js.native
  def onerror(event: MediaRecorderErrorEvent): scala.Unit = js.native
  def onpause(evt: stdLib.Event): scala.Unit = js.native
  def onresume(evt: stdLib.Event): scala.Unit = js.native
  def onstart(evt: stdLib.Event): scala.Unit = js.native
  def onstop(evt: stdLib.Event): scala.Unit = js.native
  def pause(): scala.Unit = js.native
  def requestData(): scala.Unit = js.native
  def resume(): scala.Unit = js.native
  def start(): scala.Unit = js.native
  def start(timeslice: scala.Double): scala.Unit = js.native
  def stop(): scala.Unit = js.native
}

/* static members */
@JSGlobal("MediaRecorder")
@js.native
object MediaRecorder extends js.Object {
  def isTypeSupported(`type`: java.lang.String): scala.Boolean = js.native
}

