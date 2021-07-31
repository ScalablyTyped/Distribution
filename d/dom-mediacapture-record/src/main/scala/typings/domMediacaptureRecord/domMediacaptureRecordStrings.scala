package typings.domMediacaptureRecord

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domMediacaptureRecordStrings {
  
  @js.native
  sealed trait cbr
    extends StObject
       with BitrateMode
  @scala.inline
  def cbr: cbr = "cbr".asInstanceOf[cbr]
  
  @js.native
  sealed trait dataavailable extends StObject
  @scala.inline
  def dataavailable: dataavailable = "dataavailable".asInstanceOf[dataavailable]
  
  @js.native
  sealed trait error extends StObject
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait inactive
    extends StObject
       with RecordingState
  @scala.inline
  def inactive: inactive = "inactive".asInstanceOf[inactive]
  
  @js.native
  sealed trait pause extends StObject
  @scala.inline
  def pause: pause = "pause".asInstanceOf[pause]
  
  @js.native
  sealed trait paused
    extends StObject
       with RecordingState
  @scala.inline
  def paused: paused = "paused".asInstanceOf[paused]
  
  @js.native
  sealed trait recording
    extends StObject
       with RecordingState
  @scala.inline
  def recording: recording = "recording".asInstanceOf[recording]
  
  @js.native
  sealed trait resume extends StObject
  @scala.inline
  def resume: resume = "resume".asInstanceOf[resume]
  
  @js.native
  sealed trait start extends StObject
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait stop extends StObject
  @scala.inline
  def stop: stop = "stop".asInstanceOf[stop]
  
  @js.native
  sealed trait vbr
    extends StObject
       with BitrateMode
  @scala.inline
  def vbr: vbr = "vbr".asInstanceOf[vbr]
}
