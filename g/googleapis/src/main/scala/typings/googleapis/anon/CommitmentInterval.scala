package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommitmentInterval extends js.Object {
  
  var commitmentInterval: js.UndefOr[EndTime] = js.native
  
  var isCommitmentPlan: js.UndefOr[Boolean] = js.native
  
  var planName: js.UndefOr[String] = js.native
}
object CommitmentInterval {
  
  @scala.inline
  def apply(): CommitmentInterval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommitmentInterval]
  }
  
  @scala.inline
  implicit class CommitmentIntervalOps[Self <: CommitmentInterval] (val x: Self) extends AnyVal {
    
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
    def setCommitmentInterval(value: EndTime): Self = this.set("commitmentInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommitmentInterval: Self = this.set("commitmentInterval", js.undefined)
    
    @scala.inline
    def setIsCommitmentPlan(value: Boolean): Self = this.set("isCommitmentPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCommitmentPlan: Self = this.set("isCommitmentPlan", js.undefined)
    
    @scala.inline
    def setPlanName(value: String): Self = this.set("planName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlanName: Self = this.set("planName", js.undefined)
  }
}
