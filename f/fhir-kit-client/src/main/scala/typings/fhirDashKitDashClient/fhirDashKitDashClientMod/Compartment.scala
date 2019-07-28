package typings.fhirDashKitDashClient.fhirDashKitDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Compartment extends js.Object {
  var id: String
  var resourceType: String
}

object Compartment {
  @scala.inline
  def apply(id: String, resourceType: String): Compartment = {
    val __obj = js.Dynamic.literal(id = id, resourceType = resourceType)
  
    __obj.asInstanceOf[Compartment]
  }
}

