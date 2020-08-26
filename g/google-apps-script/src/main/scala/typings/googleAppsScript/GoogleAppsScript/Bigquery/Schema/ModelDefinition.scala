package typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelDefinition extends js.Object {
  var modelOptions: js.UndefOr[ModelDefinitionModelOptions] = js.native
  var trainingRuns: js.UndefOr[js.Array[BqmlTrainingRun]] = js.native
}

object ModelDefinition {
  @scala.inline
  def apply(): ModelDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelDefinition]
  }
  @scala.inline
  implicit class ModelDefinitionOps[Self <: ModelDefinition] (val x: Self) extends AnyVal {
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
    def setModelOptions(value: ModelDefinitionModelOptions): Self = this.set("modelOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModelOptions: Self = this.set("modelOptions", js.undefined)
    @scala.inline
    def setTrainingRunsVarargs(value: BqmlTrainingRun*): Self = this.set("trainingRuns", js.Array(value :_*))
    @scala.inline
    def setTrainingRuns(value: js.Array[BqmlTrainingRun]): Self = this.set("trainingRuns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrainingRuns: Self = this.set("trainingRuns", js.undefined)
  }
  
}

