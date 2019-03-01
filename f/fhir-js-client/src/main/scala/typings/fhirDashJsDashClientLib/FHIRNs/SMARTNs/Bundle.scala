package typings
package fhirDashJsDashClientLib.FHIRNs.SMARTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a FHIR bundle
  */
trait Bundle extends js.Object {
  /**
    * The actual FHIR bundle, which is a FHIR resource itself with resourceType: 'Bundle'
    */
  var bundle: Resource
}

object Bundle {
  @scala.inline
  def apply(bundle: Resource): Bundle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bundle")(bundle)
    __obj.asInstanceOf[Bundle]
  }
}

