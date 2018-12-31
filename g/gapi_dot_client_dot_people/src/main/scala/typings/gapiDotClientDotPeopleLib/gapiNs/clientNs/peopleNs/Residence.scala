package typings
package gapiDotClientDotPeopleLib.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Residence extends js.Object {
  /**
    * True if the residence is the person's current residence;
    * false if the residence is a past residence.
    */
  var current: js.UndefOr[scala.Boolean] = js.undefined
  /** Metadata about the residence. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  /** The address of the residence. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

