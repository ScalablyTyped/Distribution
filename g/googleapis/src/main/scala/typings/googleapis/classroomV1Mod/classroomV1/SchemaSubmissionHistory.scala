package typings.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The history of the submission. This currently includes state and grade
  * histories.
  */
@js.native
trait SchemaSubmissionHistory extends js.Object {
  
  /**
    * The grade history information of the submission, if present.
    */
  var gradeHistory: js.UndefOr[SchemaGradeHistory] = js.native
  
  /**
    * The state history information of the submission, if present.
    */
  var stateHistory: js.UndefOr[SchemaStateHistory] = js.native
}
object SchemaSubmissionHistory {
  
  @scala.inline
  def apply(): SchemaSubmissionHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubmissionHistory]
  }
  
  @scala.inline
  implicit class SchemaSubmissionHistoryOps[Self <: SchemaSubmissionHistory] (val x: Self) extends AnyVal {
    
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
    def setGradeHistory(value: SchemaGradeHistory): Self = this.set("gradeHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGradeHistory: Self = this.set("gradeHistory", js.undefined)
    
    @scala.inline
    def setStateHistory(value: SchemaStateHistory): Self = this.set("stateHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateHistory: Self = this.set("stateHistory", js.undefined)
  }
}
