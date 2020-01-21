package typings.domMediacaptureRecord

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.domMediacaptureRecord.domMediacaptureRecordStrings.inactive
  - typings.domMediacaptureRecord.domMediacaptureRecordStrings.recording
  - typings.domMediacaptureRecord.domMediacaptureRecordStrings.paused
*/
trait RecordingState extends js.Object

object RecordingState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def inactive: typings.domMediacaptureRecord.domMediacaptureRecordStrings.inactive = this.cast("inactive")
  @scala.inline
  def paused: typings.domMediacaptureRecord.domMediacaptureRecordStrings.paused = this.cast("paused")
  @scala.inline
  def recording: typings.domMediacaptureRecord.domMediacaptureRecordStrings.recording = this.cast("recording")
}

