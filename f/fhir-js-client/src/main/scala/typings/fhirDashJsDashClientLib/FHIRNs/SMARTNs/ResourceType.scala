package typings
package fhirDashJsDashClientLib.FHIRNs.SMARTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used to specify the type of Resource which needs to be considered for the API call
  */
trait ResourceType extends js.Object {
  var `type`: java.lang.String
}

object ResourceType {
  @scala.inline
  def apply(`type`: java.lang.String): ResourceType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ResourceType]
  }
}

