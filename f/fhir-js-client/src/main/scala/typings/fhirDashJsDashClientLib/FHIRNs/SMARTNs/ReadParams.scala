package typings
package fhirDashJsDashClientLib.FHIRNs.SMARTNs

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
  var id: java.lang.String
  /**
    * Type of the FHIR resource
    */
  var `type`: java.lang.String
}

object ReadParams {
  @scala.inline
  def apply(id: java.lang.String, `type`: java.lang.String): ReadParams = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[ReadParams]
  }
}

