package typings
package fhirDashJsDashClientLib.FHIRNs.SMARTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Represents a FHIR entry
         */

trait Entry
  extends /**
             * Making this interface extendable since this is not a complete type definition of FHIR Entry
             */
/* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
               * FHIR Resource
               */
  var resource: Resource
  /**
               * FHIR Resource type name
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Version Stamp of resource
               */
  var versionId: js.UndefOr[java.lang.String] = js.undefined
}

