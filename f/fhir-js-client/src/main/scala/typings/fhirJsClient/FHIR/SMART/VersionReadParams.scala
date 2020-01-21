package typings.fhirJsClient.FHIR.SMART

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parameter to be passed to the vread API method
  */
trait VersionReadParams extends ReadParams {
  /**
    * Version ID of the resource to be fetched
    */
  var versionId: String
}

object VersionReadParams {
  @scala.inline
  def apply(id: String, `type`: String, versionId: String): VersionReadParams = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], versionId = versionId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionReadParams]
  }
}

