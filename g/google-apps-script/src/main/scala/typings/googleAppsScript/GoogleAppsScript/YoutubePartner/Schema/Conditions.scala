package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Conditions extends js.Object {
  
  var contentMatchType: js.UndefOr[js.Array[String]] = js.native
  
  var matchDuration: js.UndefOr[js.Array[IntervalCondition]] = js.native
  
  var matchPercent: js.UndefOr[js.Array[IntervalCondition]] = js.native
  
  var referenceDuration: js.UndefOr[js.Array[IntervalCondition]] = js.native
  
  var referencePercent: js.UndefOr[js.Array[IntervalCondition]] = js.native
  
  var requiredTerritories: js.UndefOr[TerritoryCondition] = js.native
}
object Conditions {
  
  @scala.inline
  def apply(): Conditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Conditions]
  }
  
  @scala.inline
  implicit class ConditionsOps[Self <: Conditions] (val x: Self) extends AnyVal {
    
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
    def setContentMatchTypeVarargs(value: String*): Self = this.set("contentMatchType", js.Array(value :_*))
    
    @scala.inline
    def setContentMatchType(value: js.Array[String]): Self = this.set("contentMatchType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentMatchType: Self = this.set("contentMatchType", js.undefined)
    
    @scala.inline
    def setMatchDurationVarargs(value: IntervalCondition*): Self = this.set("matchDuration", js.Array(value :_*))
    
    @scala.inline
    def setMatchDuration(value: js.Array[IntervalCondition]): Self = this.set("matchDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchDuration: Self = this.set("matchDuration", js.undefined)
    
    @scala.inline
    def setMatchPercentVarargs(value: IntervalCondition*): Self = this.set("matchPercent", js.Array(value :_*))
    
    @scala.inline
    def setMatchPercent(value: js.Array[IntervalCondition]): Self = this.set("matchPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchPercent: Self = this.set("matchPercent", js.undefined)
    
    @scala.inline
    def setReferenceDurationVarargs(value: IntervalCondition*): Self = this.set("referenceDuration", js.Array(value :_*))
    
    @scala.inline
    def setReferenceDuration(value: js.Array[IntervalCondition]): Self = this.set("referenceDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferenceDuration: Self = this.set("referenceDuration", js.undefined)
    
    @scala.inline
    def setReferencePercentVarargs(value: IntervalCondition*): Self = this.set("referencePercent", js.Array(value :_*))
    
    @scala.inline
    def setReferencePercent(value: js.Array[IntervalCondition]): Self = this.set("referencePercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferencePercent: Self = this.set("referencePercent", js.undefined)
    
    @scala.inline
    def setRequiredTerritories(value: TerritoryCondition): Self = this.set("requiredTerritories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiredTerritories: Self = this.set("requiredTerritories", js.undefined)
  }
}
