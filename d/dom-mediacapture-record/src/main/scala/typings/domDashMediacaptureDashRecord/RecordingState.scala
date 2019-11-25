package typings.domDashMediacaptureDashRecord

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.domDashMediacaptureDashRecord.domDashMediacaptureDashRecordStrings.inactive
  - typings.domDashMediacaptureDashRecord.domDashMediacaptureDashRecordStrings.recording
  - typings.domDashMediacaptureDashRecord.domDashMediacaptureDashRecordStrings.paused
*/
trait RecordingState extends js.Object

object RecordingState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def inactive: typings.domDashMediacaptureDashRecord.domDashMediacaptureDashRecordStrings.inactive = this.cast("inactive")
  @scala.inline
  def paused: typings.domDashMediacaptureDashRecord.domDashMediacaptureDashRecordStrings.paused = this.cast("paused")
  @scala.inline
  def recording: typings.domDashMediacaptureDashRecord.domDashMediacaptureDashRecordStrings.recording = this.cast("recording")
}

