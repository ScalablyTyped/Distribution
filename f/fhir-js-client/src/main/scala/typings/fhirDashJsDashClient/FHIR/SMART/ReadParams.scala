package typings.fhirDashJsDashClient.FHIR.SMART

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parameter to be passed to the read API method
  */
trait ReadParams extends js.Object {
  /**
    * ID of the FHIR resource
    */
  var id: String
  /**
    * Type of the FHIR resource
    */
  var `type`: String
}

object ReadParams {
  @scala.inline
  def apply(id: String, `type`: String): ReadParams = {
    val __obj = js.Dynamic.literal(id = id)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ReadParams]
  }
}

