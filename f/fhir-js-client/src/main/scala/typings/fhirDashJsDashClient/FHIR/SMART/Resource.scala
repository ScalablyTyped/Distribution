package typings.fhirDashJsDashClient.FHIR.SMART

import org.scalablytyped.runtime.StringDictionary
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
/* propName */ StringDictionary[js.Any] {
  /**
    * The type of resource. All FHIR resources must have a resource type.
    */
  var resourceType: String
}

object Resource {
  @scala.inline
  def apply(
    resourceType: String,
    StringDictionary: /**
    * Making this interface extendable since this is not a complete type definition of FHIR Resource
    */
  /* propName */ StringDictionary[js.Any] = null
  ): Resource = {
    val __obj = js.Dynamic.literal(resourceType = resourceType)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Resource]
  }
}

