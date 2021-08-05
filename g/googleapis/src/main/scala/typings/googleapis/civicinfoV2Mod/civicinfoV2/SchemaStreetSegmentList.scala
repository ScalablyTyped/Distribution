package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStreetSegmentList extends StObject {
  
  var segments: js.UndefOr[js.Array[SchemaStreetSegment]] = js.undefined
}
object SchemaStreetSegmentList {
  
  inline def apply(): SchemaStreetSegmentList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStreetSegmentList]
  }
  
  extension [Self <: SchemaStreetSegmentList](x: Self) {
    
    inline def setSegments(value: js.Array[SchemaStreetSegment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    inline def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    inline def setSegmentsVarargs(value: SchemaStreetSegment*): Self = StObject.set(x, "segments", js.Array(value :_*))
  }
}
