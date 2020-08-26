package typings.gapiClientDataflow.gapi.client.dataflow

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Step extends js.Object {
  /** The kind of step in the Cloud Dataflow job. */
  var kind: js.UndefOr[String] = js.native
  /**
    * The name that identifies the step. This must be unique for each
    * step with respect to all other steps in the Cloud Dataflow job.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Named properties associated with the step. Each kind of
    * predefined step has its own required set of properties.
    * Must be provided on Create.  Only retrieved with JOB_VIEW_ALL.
    */
  var properties: js.UndefOr[Record[String, _]] = js.native
}

object Step {
  @scala.inline
  def apply(): Step = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Step]
  }
  @scala.inline
  implicit class StepOps[Self <: Step] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setProperties(value: Record[String, _]): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
  
}

