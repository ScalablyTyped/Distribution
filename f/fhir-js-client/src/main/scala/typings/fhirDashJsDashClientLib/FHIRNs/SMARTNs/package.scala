package typings
package fhirDashJsDashClientLib.FHIRNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SMARTNs {
  /**
    * Indexable type used to represent Observation FHIR resources indexed based on codes.
    */
  type ObservationsByCode = org.scalablytyped.runtime.StringDictionary[js.Array[Resource]]
  /**
    * Funtion type returned by the fetchAllWithReferences method
    */
  type ResolveFn = js.Function2[/* resource */ Resource, /* reference */ Reference, Resource]
}
