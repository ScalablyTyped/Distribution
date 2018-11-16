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
/* propName */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  /**
               * The type of resource. All FHIR resources must have a resource type.
               */
  var resourceType: java.lang.String
}

