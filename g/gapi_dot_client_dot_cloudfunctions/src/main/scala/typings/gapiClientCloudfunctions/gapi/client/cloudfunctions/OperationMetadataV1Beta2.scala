package typings.gapiClientCloudfunctions.gapi.client.cloudfunctions

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationMetadataV1Beta2 extends js.Object {
  /** The original request that started the operation. */
  var request: js.UndefOr[Record[String, _]] = js.native
  /**
    * Target of the operation - for example
    * projects/project-1/locations/region-1/functions/function-1
    */
  var target: js.UndefOr[String] = js.native
  /** Type of operation. */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Version id of the function created or updated by an API call.
    * This field is only pupulated for Create and Update operations.
    */
  var versionId: js.UndefOr[String] = js.native
}

object OperationMetadataV1Beta2 {
  @scala.inline
  def apply(): OperationMetadataV1Beta2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationMetadataV1Beta2]
  }
  @scala.inline
  implicit class OperationMetadataV1Beta2Ops[Self <: OperationMetadataV1Beta2] (val x: Self) extends AnyVal {
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
    def setRequest(value: Record[String, _]): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVersionId(value: String): Self = this.set("versionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionId: Self = this.set("versionId", js.undefined)
  }
  
}

