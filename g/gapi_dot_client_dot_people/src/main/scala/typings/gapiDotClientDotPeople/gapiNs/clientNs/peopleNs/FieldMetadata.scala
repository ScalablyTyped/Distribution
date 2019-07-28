package typings.gapiDotClientDotPeople.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldMetadata extends js.Object {
  /**
    * True if the field is the primary field; false if the field is a secondary
    * field.
    */
  var primary: js.UndefOr[Boolean] = js.undefined
  /** The source of the field. */
  var source: js.UndefOr[Source] = js.undefined
  /**
    * True if the field is verified; false if the field is unverified. A
    * verified field is typically a name, email address, phone number, or
    * website that has been confirmed to be owned by the person.
    */
  var verified: js.UndefOr[Boolean] = js.undefined
}

object FieldMetadata {
  @scala.inline
  def apply(
    primary: js.UndefOr[Boolean] = js.undefined,
    source: Source = null,
    verified: js.UndefOr[Boolean] = js.undefined
  ): FieldMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary)
    if (source != null) __obj.updateDynamic("source")(source)
    if (!js.isUndefined(verified)) __obj.updateDynamic("verified")(verified)
    __obj.asInstanceOf[FieldMetadata]
  }
}

