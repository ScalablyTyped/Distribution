package typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BigQueryModelTraining extends js.Object {
  var currentIteration: js.UndefOr[Double] = js.native
  var expectedTotalIterations: js.UndefOr[String] = js.native
}

object BigQueryModelTraining {
  @scala.inline
  def apply(): BigQueryModelTraining = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BigQueryModelTraining]
  }
  @scala.inline
  implicit class BigQueryModelTrainingOps[Self <: BigQueryModelTraining] (val x: Self) extends AnyVal {
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
    def setCurrentIteration(value: Double): Self = this.set("currentIteration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentIteration: Self = this.set("currentIteration", js.undefined)
    @scala.inline
    def setExpectedTotalIterations(value: String): Self = this.set("expectedTotalIterations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpectedTotalIterations: Self = this.set("expectedTotalIterations", js.undefined)
  }
  
}

