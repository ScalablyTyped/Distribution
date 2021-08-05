package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProvenance extends StObject {
  
  var collidedSegmentSource: js.UndefOr[SchemaStreetSegmentList] = js.undefined
  
  var ctclContestUuid: js.UndefOr[String] = js.undefined
  
  var ctclOfficeUuid: js.UndefOr[String] = js.undefined
  
  var datasetId: js.UndefOr[String] = js.undefined
  
  var precinctId: js.UndefOr[String] = js.undefined
  
  var precinctSplitId: js.UndefOr[String] = js.undefined
  
  var tsStreetSegmentId: js.UndefOr[String] = js.undefined
  
  var vip5PrecinctId: js.UndefOr[String] = js.undefined
  
  var vip5StreetSegmentId: js.UndefOr[String] = js.undefined
  
  var vipStreetSegmentId: js.UndefOr[String] = js.undefined
}
object SchemaProvenance {
  
  inline def apply(): SchemaProvenance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProvenance]
  }
  
  extension [Self <: SchemaProvenance](x: Self) {
    
    inline def setCollidedSegmentSource(value: SchemaStreetSegmentList): Self = StObject.set(x, "collidedSegmentSource", value.asInstanceOf[js.Any])
    
    inline def setCollidedSegmentSourceUndefined: Self = StObject.set(x, "collidedSegmentSource", js.undefined)
    
    inline def setCtclContestUuid(value: String): Self = StObject.set(x, "ctclContestUuid", value.asInstanceOf[js.Any])
    
    inline def setCtclContestUuidUndefined: Self = StObject.set(x, "ctclContestUuid", js.undefined)
    
    inline def setCtclOfficeUuid(value: String): Self = StObject.set(x, "ctclOfficeUuid", value.asInstanceOf[js.Any])
    
    inline def setCtclOfficeUuidUndefined: Self = StObject.set(x, "ctclOfficeUuid", js.undefined)
    
    inline def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    inline def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
    
    inline def setPrecinctId(value: String): Self = StObject.set(x, "precinctId", value.asInstanceOf[js.Any])
    
    inline def setPrecinctIdUndefined: Self = StObject.set(x, "precinctId", js.undefined)
    
    inline def setPrecinctSplitId(value: String): Self = StObject.set(x, "precinctSplitId", value.asInstanceOf[js.Any])
    
    inline def setPrecinctSplitIdUndefined: Self = StObject.set(x, "precinctSplitId", js.undefined)
    
    inline def setTsStreetSegmentId(value: String): Self = StObject.set(x, "tsStreetSegmentId", value.asInstanceOf[js.Any])
    
    inline def setTsStreetSegmentIdUndefined: Self = StObject.set(x, "tsStreetSegmentId", js.undefined)
    
    inline def setVip5PrecinctId(value: String): Self = StObject.set(x, "vip5PrecinctId", value.asInstanceOf[js.Any])
    
    inline def setVip5PrecinctIdUndefined: Self = StObject.set(x, "vip5PrecinctId", js.undefined)
    
    inline def setVip5StreetSegmentId(value: String): Self = StObject.set(x, "vip5StreetSegmentId", value.asInstanceOf[js.Any])
    
    inline def setVip5StreetSegmentIdUndefined: Self = StObject.set(x, "vip5StreetSegmentId", js.undefined)
    
    inline def setVipStreetSegmentId(value: String): Self = StObject.set(x, "vipStreetSegmentId", value.asInstanceOf[js.Any])
    
    inline def setVipStreetSegmentIdUndefined: Self = StObject.set(x, "vipStreetSegmentId", js.undefined)
  }
}
