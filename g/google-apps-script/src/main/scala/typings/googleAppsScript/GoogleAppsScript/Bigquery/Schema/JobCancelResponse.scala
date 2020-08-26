package typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobCancelResponse extends js.Object {
  var job: js.UndefOr[Job] = js.native
  var kind: js.UndefOr[String] = js.native
}

object JobCancelResponse {
  @scala.inline
  def apply(): JobCancelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobCancelResponse]
  }
  @scala.inline
  implicit class JobCancelResponseOps[Self <: JobCancelResponse] (val x: Self) extends AnyVal {
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
    def setJob(value: Job): Self = this.set("job", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJob: Self = this.set("job", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

