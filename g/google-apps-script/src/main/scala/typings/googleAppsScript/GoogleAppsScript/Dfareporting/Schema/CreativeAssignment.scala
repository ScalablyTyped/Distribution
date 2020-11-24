package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreativeAssignment extends js.Object {
  
  var active: js.UndefOr[Boolean] = js.native
  
  var applyEventTags: js.UndefOr[Boolean] = js.native
  
  var clickThroughUrl: js.UndefOr[ClickThroughUrl] = js.native
  
  var companionCreativeOverrides: js.UndefOr[js.Array[CompanionClickThroughOverride]] = js.native
  
  var creativeGroupAssignments: js.UndefOr[js.Array[CreativeGroupAssignment]] = js.native
  
  var creativeId: js.UndefOr[String] = js.native
  
  var creativeIdDimensionValue: js.UndefOr[DimensionValue] = js.native
  
  var endTime: js.UndefOr[String] = js.native
  
  var richMediaExitOverrides: js.UndefOr[js.Array[RichMediaExitOverride]] = js.native
  
  var sequence: js.UndefOr[Double] = js.native
  
  var sslCompliant: js.UndefOr[Boolean] = js.native
  
  var startTime: js.UndefOr[String] = js.native
  
  var weight: js.UndefOr[Double] = js.native
}
object CreativeAssignment {
  
  @scala.inline
  def apply(): CreativeAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeAssignment]
  }
  
  @scala.inline
  implicit class CreativeAssignmentOps[Self <: CreativeAssignment] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setApplyEventTags(value: Boolean): Self = this.set("applyEventTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplyEventTags: Self = this.set("applyEventTags", js.undefined)
    
    @scala.inline
    def setClickThroughUrl(value: ClickThroughUrl): Self = this.set("clickThroughUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickThroughUrl: Self = this.set("clickThroughUrl", js.undefined)
    
    @scala.inline
    def setCompanionCreativeOverridesVarargs(value: CompanionClickThroughOverride*): Self = this.set("companionCreativeOverrides", js.Array(value :_*))
    
    @scala.inline
    def setCompanionCreativeOverrides(value: js.Array[CompanionClickThroughOverride]): Self = this.set("companionCreativeOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompanionCreativeOverrides: Self = this.set("companionCreativeOverrides", js.undefined)
    
    @scala.inline
    def setCreativeGroupAssignmentsVarargs(value: CreativeGroupAssignment*): Self = this.set("creativeGroupAssignments", js.Array(value :_*))
    
    @scala.inline
    def setCreativeGroupAssignments(value: js.Array[CreativeGroupAssignment]): Self = this.set("creativeGroupAssignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeGroupAssignments: Self = this.set("creativeGroupAssignments", js.undefined)
    
    @scala.inline
    def setCreativeId(value: String): Self = this.set("creativeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeId: Self = this.set("creativeId", js.undefined)
    
    @scala.inline
    def setCreativeIdDimensionValue(value: DimensionValue): Self = this.set("creativeIdDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeIdDimensionValue: Self = this.set("creativeIdDimensionValue", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setRichMediaExitOverridesVarargs(value: RichMediaExitOverride*): Self = this.set("richMediaExitOverrides", js.Array(value :_*))
    
    @scala.inline
    def setRichMediaExitOverrides(value: js.Array[RichMediaExitOverride]): Self = this.set("richMediaExitOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRichMediaExitOverrides: Self = this.set("richMediaExitOverrides", js.undefined)
    
    @scala.inline
    def setSequence(value: Double): Self = this.set("sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSequence: Self = this.set("sequence", js.undefined)
    
    @scala.inline
    def setSslCompliant(value: Boolean): Self = this.set("sslCompliant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslCompliant: Self = this.set("sslCompliant", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
}
