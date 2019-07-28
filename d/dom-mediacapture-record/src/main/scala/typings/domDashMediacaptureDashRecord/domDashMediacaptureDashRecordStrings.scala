package typings.domDashMediacaptureDashRecord

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object domDashMediacaptureDashRecordStrings {
  @js.native
  sealed trait inactive extends RecordingState
  
  @js.native
  sealed trait paused extends RecordingState
  
  @js.native
  sealed trait recording extends RecordingState
  
  @scala.inline
  def inactive: inactive = "inactive".asInstanceOf[inactive]
  @scala.inline
  def paused: paused = "paused".asInstanceOf[paused]
  @scala.inline
  def recording: recording = "recording".asInstanceOf[recording]
}

