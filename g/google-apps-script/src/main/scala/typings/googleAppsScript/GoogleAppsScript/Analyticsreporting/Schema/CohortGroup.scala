package typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CohortGroup extends js.Object {
  
  var cohorts: js.UndefOr[js.Array[Cohort]] = js.native
  
  var lifetimeValue: js.UndefOr[Boolean] = js.native
}
object CohortGroup {
  
  @scala.inline
  def apply(): CohortGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CohortGroup]
  }
  
  @scala.inline
  implicit class CohortGroupOps[Self <: CohortGroup] (val x: Self) extends AnyVal {
    
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
    def setCohortsVarargs(value: Cohort*): Self = this.set("cohorts", js.Array(value :_*))
    
    @scala.inline
    def setCohorts(value: js.Array[Cohort]): Self = this.set("cohorts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCohorts: Self = this.set("cohorts", js.undefined)
    
    @scala.inline
    def setLifetimeValue(value: Boolean): Self = this.set("lifetimeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLifetimeValue: Self = this.set("lifetimeValue", js.undefined)
  }
}
