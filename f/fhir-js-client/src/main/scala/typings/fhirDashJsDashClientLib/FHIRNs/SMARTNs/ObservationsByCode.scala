package typings
package fhirDashJsDashClientLib.FHIRNs.SMARTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Indexable type used to represent Observation FHIR resources indexed based on codes.
  */
trait ObservationsByCode
  extends /* index */ org.scalablytyped.runtime.StringDictionary[js.Array[Resource]]

object ObservationsByCode {
  @scala.inline
  def apply(
    StringDictionary: /* index */ org.scalablytyped.runtime.StringDictionary[js.Array[Resource]] = null
  ): ObservationsByCode = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ObservationsByCode]
  }
}

