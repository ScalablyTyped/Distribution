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
  
  @scala.inline
  def apply(): SchemaProvenance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProvenance]
  }
  
  @scala.inline
  implicit class SchemaProvenanceMutableBuilder[Self <: SchemaProvenance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollidedSegmentSource(value: SchemaStreetSegmentList): Self = StObject.set(x, "collidedSegmentSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollidedSegmentSourceUndefined: Self = StObject.set(x, "collidedSegmentSource", js.undefined)
    
    @scala.inline
    def setCtclContestUuid(value: String): Self = StObject.set(x, "ctclContestUuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtclContestUuidUndefined: Self = StObject.set(x, "ctclContestUuid", js.undefined)
    
    @scala.inline
    def setCtclOfficeUuid(value: String): Self = StObject.set(x, "ctclOfficeUuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtclOfficeUuidUndefined: Self = StObject.set(x, "ctclOfficeUuid", js.undefined)
    
    @scala.inline
    def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
    
    @scala.inline
    def setPrecinctId(value: String): Self = StObject.set(x, "precinctId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecinctIdUndefined: Self = StObject.set(x, "precinctId", js.undefined)
    
    @scala.inline
    def setPrecinctSplitId(value: String): Self = StObject.set(x, "precinctSplitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecinctSplitIdUndefined: Self = StObject.set(x, "precinctSplitId", js.undefined)
    
    @scala.inline
    def setTsStreetSegmentId(value: String): Self = StObject.set(x, "tsStreetSegmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsStreetSegmentIdUndefined: Self = StObject.set(x, "tsStreetSegmentId", js.undefined)
    
    @scala.inline
    def setVip5PrecinctId(value: String): Self = StObject.set(x, "vip5PrecinctId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVip5PrecinctIdUndefined: Self = StObject.set(x, "vip5PrecinctId", js.undefined)
    
    @scala.inline
    def setVip5StreetSegmentId(value: String): Self = StObject.set(x, "vip5StreetSegmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVip5StreetSegmentIdUndefined: Self = StObject.set(x, "vip5StreetSegmentId", js.undefined)
    
    @scala.inline
    def setVipStreetSegmentId(value: String): Self = StObject.set(x, "vipStreetSegmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVipStreetSegmentIdUndefined: Self = StObject.set(x, "vipStreetSegmentId", js.undefined)
  }
}
