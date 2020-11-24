package typings.googleAppsScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GradeHistory extends js.Object {
  
  var actorUserId: js.UndefOr[String] = js.native
  
  var gradeChangeType: js.UndefOr[String] = js.native
  
  var gradeTimestamp: js.UndefOr[String] = js.native
  
  var maxPoints: js.UndefOr[Double] = js.native
  
  var pointsEarned: js.UndefOr[Double] = js.native
}
object GradeHistory {
  
  @scala.inline
  def apply(): GradeHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GradeHistory]
  }
  
  @scala.inline
  implicit class GradeHistoryOps[Self <: GradeHistory] (val x: Self) extends AnyVal {
    
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
    def setActorUserId(value: String): Self = this.set("actorUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActorUserId: Self = this.set("actorUserId", js.undefined)
    
    @scala.inline
    def setGradeChangeType(value: String): Self = this.set("gradeChangeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGradeChangeType: Self = this.set("gradeChangeType", js.undefined)
    
    @scala.inline
    def setGradeTimestamp(value: String): Self = this.set("gradeTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGradeTimestamp: Self = this.set("gradeTimestamp", js.undefined)
    
    @scala.inline
    def setMaxPoints(value: Double): Self = this.set("maxPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxPoints: Self = this.set("maxPoints", js.undefined)
    
    @scala.inline
    def setPointsEarned(value: Double): Self = this.set("pointsEarned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointsEarned: Self = this.set("pointsEarned", js.undefined)
  }
}
