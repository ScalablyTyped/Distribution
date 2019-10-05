package typings.fhirDashJsDashClient.FHIR.SMART

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reference within a resource
  */
trait Reference extends js.Object {
  var reference: String
}

object Reference {
  @scala.inline
  def apply(reference: String): Reference = {
    val __obj = js.Dynamic.literal(reference = reference)
  
    __obj.asInstanceOf[Reference]
  }
}

