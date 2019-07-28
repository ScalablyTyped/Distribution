package typings.gapiDotClientDotPeople.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Residence extends js.Object {
  /**
    * True if the residence is the person's current residence;
    * false if the residence is a past residence.
    */
  var current: js.UndefOr[Boolean] = js.undefined
  /** Metadata about the residence. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  /** The address of the residence. */
  var value: js.UndefOr[String] = js.undefined
}

object Residence {
  @scala.inline
  def apply(current: js.UndefOr[Boolean] = js.undefined, metadata: FieldMetadata = null, value: String = null): Residence = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(current)) __obj.updateDynamic("current")(current)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Residence]
  }
}

