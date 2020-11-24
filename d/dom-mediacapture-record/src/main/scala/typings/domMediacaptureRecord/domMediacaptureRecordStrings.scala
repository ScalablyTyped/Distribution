package typings.domMediacaptureRecord

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domMediacaptureRecordStrings {
  
  @scala.inline
  def cbr: cbr = "cbr".asInstanceOf[cbr]
  
  @scala.inline
  def dataavailable: dataavailable = "dataavailable".asInstanceOf[dataavailable]
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def inactive: inactive = "inactive".asInstanceOf[inactive]
  
  @scala.inline
  def pause: pause = "pause".asInstanceOf[pause]
  
  @scala.inline
  def paused: paused = "paused".asInstanceOf[paused]
  
  @scala.inline
  def recording: recording = "recording".asInstanceOf[recording]
  
  @scala.inline
  def resume: resume = "resume".asInstanceOf[resume]
  
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  
  @scala.inline
  def stop: stop = "stop".asInstanceOf[stop]
  
  @scala.inline
  def vbr: vbr = "vbr".asInstanceOf[vbr]
  
  @js.native
  sealed trait cbr extends BitrateMode
  
  @js.native
  sealed trait dataavailable extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait inactive extends RecordingState
  
  @js.native
  sealed trait pause extends js.Object
  
  @js.native
  sealed trait paused extends RecordingState
  
  @js.native
  sealed trait recording extends RecordingState
  
  @js.native
  sealed trait resume extends js.Object
  
  @js.native
  sealed trait start extends js.Object
  
  @js.native
  sealed trait stop extends js.Object
  
  @js.native
  sealed trait vbr extends BitrateMode
}
