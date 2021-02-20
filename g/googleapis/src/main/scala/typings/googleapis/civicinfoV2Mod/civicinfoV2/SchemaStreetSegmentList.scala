package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaStreetSegmentList extends StObject {
  
  var segments: js.UndefOr[js.Array[SchemaStreetSegment]] = js.native
}
object SchemaStreetSegmentList {
  
  @scala.inline
  def apply(): SchemaStreetSegmentList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStreetSegmentList]
  }
  
  @scala.inline
  implicit class SchemaStreetSegmentListMutableBuilder[Self <: SchemaStreetSegmentList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSegments(value: js.Array[SchemaStreetSegment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    @scala.inline
    def setSegmentsVarargs(value: SchemaStreetSegment*): Self = StObject.set(x, "segments", js.Array(value :_*))
  }
}
