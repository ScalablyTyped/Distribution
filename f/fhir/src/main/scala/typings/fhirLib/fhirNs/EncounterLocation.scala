package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of locations where the patient has been
  */
trait EncounterLocation extends BackboneElement {
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Location the encounter takes place
    */
  var location: Reference
  /**
    * Time period during which the patient was present at the location
    */
  var period: js.UndefOr[Period] = js.undefined
  /**
    * planned | active | reserved | completed
    */
  var status: js.UndefOr[code] = js.undefined
}

