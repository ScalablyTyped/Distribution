package typings.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OffsetMs extends StObject {
  
  /**
    * The time offset, specified in milliseconds, that determines when the promoted item appears during video playbacks. The type propertys value determines whether the offset is measured from the start or end of the video.
    */
  var offsetMs: Double
  
  /**
    * The timing method that determines when the promoted item is inserted during the video playback. If the value is offsetFromStart, then the offsetMs field represents an offset from the start of the video. If the value is offsetFromEnd, then the offsetMs field represents an offset from the end of the video.
    */
  var `type`: String
}
object OffsetMs {
  
  @scala.inline
  def apply(offsetMs: Double, `type`: String): OffsetMs = {
    val __obj = js.Dynamic.literal(offsetMs = offsetMs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetMs]
  }
  
  @scala.inline
  implicit class OffsetMsMutableBuilder[Self <: OffsetMs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOffsetMs(value: Double): Self = StObject.set(x, "offsetMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
