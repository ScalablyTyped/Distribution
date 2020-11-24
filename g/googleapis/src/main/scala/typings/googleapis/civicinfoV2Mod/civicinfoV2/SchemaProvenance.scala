package typings.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaProvenance extends js.Object {
  
  var collidedSegmentSource: js.UndefOr[SchemaStreetSegmentList] = js.native
  
  var ctclContestUuid: js.UndefOr[String] = js.native
  
  var ctclOfficeUuid: js.UndefOr[String] = js.native
  
  var datasetId: js.UndefOr[String] = js.native
  
  var precinctId: js.UndefOr[String] = js.native
  
  var precinctSplitId: js.UndefOr[String] = js.native
  
  var tsStreetSegmentId: js.UndefOr[String] = js.native
  
  var vip5PrecinctId: js.UndefOr[String] = js.native
  
  var vip5StreetSegmentId: js.UndefOr[String] = js.native
  
  var vipStreetSegmentId: js.UndefOr[String] = js.native
}
object SchemaProvenance {
  
  @scala.inline
  def apply(): SchemaProvenance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProvenance]
  }
  
  @scala.inline
  implicit class SchemaProvenanceOps[Self <: SchemaProvenance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCollidedSegmentSource(value: SchemaStreetSegmentList): Self = this.set("collidedSegmentSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollidedSegmentSource: Self = this.set("collidedSegmentSource", js.undefined)
    
    @scala.inline
    def setCtclContestUuid(value: String): Self = this.set("ctclContestUuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCtclContestUuid: Self = this.set("ctclContestUuid", js.undefined)
    
    @scala.inline
    def setCtclOfficeUuid(value: String): Self = this.set("ctclOfficeUuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCtclOfficeUuid: Self = this.set("ctclOfficeUuid", js.undefined)
    
    @scala.inline
    def setDatasetId(value: String): Self = this.set("datasetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatasetId: Self = this.set("datasetId", js.undefined)
    
    @scala.inline
    def setPrecinctId(value: String): Self = this.set("precinctId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrecinctId: Self = this.set("precinctId", js.undefined)
    
    @scala.inline
    def setPrecinctSplitId(value: String): Self = this.set("precinctSplitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrecinctSplitId: Self = this.set("precinctSplitId", js.undefined)
    
    @scala.inline
    def setTsStreetSegmentId(value: String): Self = this.set("tsStreetSegmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTsStreetSegmentId: Self = this.set("tsStreetSegmentId", js.undefined)
    
    @scala.inline
    def setVip5PrecinctId(value: String): Self = this.set("vip5PrecinctId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVip5PrecinctId: Self = this.set("vip5PrecinctId", js.undefined)
    
    @scala.inline
    def setVip5StreetSegmentId(value: String): Self = this.set("vip5StreetSegmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVip5StreetSegmentId: Self = this.set("vip5StreetSegmentId", js.undefined)
    
    @scala.inline
    def setVipStreetSegmentId(value: String): Self = this.set("vipStreetSegmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVipStreetSegmentId: Self = this.set("vipStreetSegmentId", js.undefined)
  }
}
