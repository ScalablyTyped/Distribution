package typings
package fhirDashKitDashClientLib.fhirDashKitDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Compartment extends js.Object {
  var id: java.lang.String
  var resourceType: java.lang.String
}

object Compartment {
  @scala.inline
  def apply(id: java.lang.String, resourceType: java.lang.String): Compartment = {
    val __obj = js.Dynamic.literal(id = id, resourceType = resourceType)
  
    __obj.asInstanceOf[Compartment]
  }
}

