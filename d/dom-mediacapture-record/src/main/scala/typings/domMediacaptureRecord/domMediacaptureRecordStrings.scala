package typings.domMediacaptureRecord

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domMediacaptureRecordStrings {
  
  @js.native
  sealed trait cbr
    extends StObject
       with BitrateMode
  inline def cbr: cbr = "cbr".asInstanceOf[cbr]
  
  @js.native
  sealed trait dataavailable extends StObject
  inline def dataavailable: dataavailable = "dataavailable".asInstanceOf[dataavailable]
  
  @js.native
  sealed trait error extends StObject
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait inactive
    extends StObject
       with RecordingState
  inline def inactive: inactive = "inactive".asInstanceOf[inactive]
  
  @js.native
  sealed trait pause extends StObject
  inline def pause: pause = "pause".asInstanceOf[pause]
  
  @js.native
  sealed trait paused
    extends StObject
       with RecordingState
  inline def paused: paused = "paused".asInstanceOf[paused]
  
  @js.native
  sealed trait recording
    extends StObject
       with RecordingState
  inline def recording: recording = "recording".asInstanceOf[recording]
  
  @js.native
  sealed trait resume extends StObject
  inline def resume: resume = "resume".asInstanceOf[resume]
  
  @js.native
  sealed trait start extends StObject
  inline def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait stop extends StObject
  inline def stop: stop = "stop".asInstanceOf[stop]
  
  @js.native
  sealed trait vbr
    extends StObject
       with BitrateMode
  inline def vbr: vbr = "vbr".asInstanceOf[vbr]
}
