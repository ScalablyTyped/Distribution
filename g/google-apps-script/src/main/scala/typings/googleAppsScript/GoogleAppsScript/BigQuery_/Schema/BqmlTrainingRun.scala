package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BqmlTrainingRun extends js.Object {
  
  var iterationResults: js.UndefOr[js.Array[BqmlIterationResult]] = js.native
  
  var startTime: js.UndefOr[String] = js.native
  
  var state: js.UndefOr[String] = js.native
  
  var trainingOptions: js.UndefOr[BqmlTrainingRunTrainingOptions] = js.native
}
object BqmlTrainingRun {
  
  @scala.inline
  def apply(): BqmlTrainingRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BqmlTrainingRun]
  }
  
  @scala.inline
  implicit class BqmlTrainingRunOps[Self <: BqmlTrainingRun] (val x: Self) extends AnyVal {
    
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
    def setIterationResultsVarargs(value: BqmlIterationResult*): Self = this.set("iterationResults", js.Array(value :_*))
    
    @scala.inline
    def setIterationResults(value: js.Array[BqmlIterationResult]): Self = this.set("iterationResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIterationResults: Self = this.set("iterationResults", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setTrainingOptions(value: BqmlTrainingRunTrainingOptions): Self = this.set("trainingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrainingOptions: Self = this.set("trainingOptions", js.undefined)
  }
}
