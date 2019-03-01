package typings
package fhirDashJsDashClientLib.FHIRNs.SMARTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reference within a resource
  */
trait Reference extends js.Object {
  var reference: java.lang.String
}

object Reference {
  @scala.inline
  def apply(reference: java.lang.String): Reference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("reference")(reference)
    __obj.asInstanceOf[Reference]
  }
}

