package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommitmentInterval extends StObject {
  
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
  implicit class CommitmentIntervalMutableBuilder[Self <: CommitmentInterval] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommitmentInterval(value: EndTime): Self = StObject.set(x, "commitmentInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitmentIntervalUndefined: Self = StObject.set(x, "commitmentInterval", js.undefined)
    
    @scala.inline
    def setIsCommitmentPlan(value: Boolean): Self = StObject.set(x, "isCommitmentPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCommitmentPlanUndefined: Self = StObject.set(x, "isCommitmentPlan", js.undefined)
    
    @scala.inline
    def setPlanName(value: String): Self = StObject.set(x, "planName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanNameUndefined: Self = StObject.set(x, "planName", js.undefined)
  }
}
