package typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoalSetData extends js.Object {
  
  var goals: js.UndefOr[js.Array[GoalData]] = js.native
}
object GoalSetData {
  
  @scala.inline
  def apply(): GoalSetData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoalSetData]
  }
  
  @scala.inline
  implicit class GoalSetDataOps[Self <: GoalSetData] (val x: Self) extends AnyVal {
    
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
    def setGoalsVarargs(value: GoalData*): Self = this.set("goals", js.Array(value :_*))
    
    @scala.inline
    def setGoals(value: js.Array[GoalData]): Self = this.set("goals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoals: Self = this.set("goals", js.undefined)
  }
}
