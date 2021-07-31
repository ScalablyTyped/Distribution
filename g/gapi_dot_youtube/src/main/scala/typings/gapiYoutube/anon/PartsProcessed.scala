package typings.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartsProcessed extends StObject {
  
  /**
    * The number of parts of the video that YouTube has already processed.
    */
  var partsProcessed: Double
  
  /**
    * An estimate of the total number of parts that need to be processed for the video. The number may be updated with more precise estimates while YouTube processes the video.
    */
  var partsTotal: Double
  
  /**
    * An estimate of the amount of time, in millseconds, that YouTube needs to finish processing the video.
    */
  var timeLeftMs: Double
}
object PartsProcessed {
  
  @scala.inline
  def apply(partsProcessed: Double, partsTotal: Double, timeLeftMs: Double): PartsProcessed = {
    val __obj = js.Dynamic.literal(partsProcessed = partsProcessed.asInstanceOf[js.Any], partsTotal = partsTotal.asInstanceOf[js.Any], timeLeftMs = timeLeftMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartsProcessed]
  }
  
  @scala.inline
  implicit class PartsProcessedMutableBuilder[Self <: PartsProcessed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPartsProcessed(value: Double): Self = StObject.set(x, "partsProcessed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartsTotal(value: Double): Self = StObject.set(x, "partsTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeLeftMs(value: Double): Self = StObject.set(x, "timeLeftMs", value.asInstanceOf[js.Any])
  }
}
