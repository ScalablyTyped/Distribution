package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExclusionDuration extends StObject {
  
  var exclusionDuration: js.UndefOr[String] = js.native
  
  var segment: js.UndefOr[String] = js.native
}
object ExclusionDuration {
  
  @scala.inline
  def apply(): ExclusionDuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExclusionDuration]
  }
  
  @scala.inline
  implicit class ExclusionDurationMutableBuilder[Self <: ExclusionDuration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExclusionDuration(value: String): Self = StObject.set(x, "exclusionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusionDurationUndefined: Self = StObject.set(x, "exclusionDuration", js.undefined)
    
    @scala.inline
    def setSegment(value: String): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
  }
}
