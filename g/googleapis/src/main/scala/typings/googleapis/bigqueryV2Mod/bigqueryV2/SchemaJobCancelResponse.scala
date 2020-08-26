package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaJobCancelResponse extends js.Object {
  /**
    * The final state of the job.
    */
  var job: js.UndefOr[SchemaJob] = js.native
  /**
    * The resource type of the response.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaJobCancelResponse {
  @scala.inline
  def apply(): SchemaJobCancelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobCancelResponse]
  }
  @scala.inline
  implicit class SchemaJobCancelResponseOps[Self <: SchemaJobCancelResponse] (val x: Self) extends AnyVal {
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
    def setJob(value: SchemaJob): Self = this.set("job", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJob: Self = this.set("job", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

