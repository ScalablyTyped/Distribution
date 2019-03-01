package typings
package fhirDashJsDashClientLib.FHIRNs.SMARTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a FHIR resource
  */
trait Resource
  extends /**
  * Making this interface extendable since this is not a complete type definition of FHIR Resource
  */
/* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * The type of resource. All FHIR resources must have a resource type.
    */
  var resourceType: java.lang.String
}

object Resource {
  @scala.inline
  def apply(
    resourceType: java.lang.String,
    StringDictionary: /**
    * Making this interface extendable since this is not a complete type definition of FHIR Resource
    */
  /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("resourceType")(resourceType)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Resource]
  }
}

