package typings.fhirJsClient.FHIR.SMART

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parameter to be passed to the vread API method
  */
@js.native
trait VersionReadParams extends ReadParams {
  /**
    * Version ID of the resource to be fetched
    */
  var versionId: String = js.native
}

object VersionReadParams {
  @scala.inline
  def apply(id: String, `type`: String, versionId: String): VersionReadParams = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], versionId = versionId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionReadParams]
  }
  @scala.inline
  implicit class VersionReadParamsOps[Self <: VersionReadParams] (val x: Self) extends AnyVal {
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
    def setVersionId(value: String): Self = this.set("versionId", value.asInstanceOf[js.Any])
  }
  
}

