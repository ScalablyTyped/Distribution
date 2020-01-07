package typings.googleapis.buildSrcApisPeopleV1Mod.people_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata about a field.
  */
@js.native
trait Schema$FieldMetadata extends js.Object {
  /**
    * True if the field is the primary field; false if the field is a secondary
    * field.
    */
  var primary: js.UndefOr[Boolean] = js.native
  /**
    * The source of the field.
    */
  var source: js.UndefOr[Schema$Source] = js.native
  /**
    * True if the field is verified; false if the field is unverified. A
    * verified field is typically a name, email address, phone number, or
    * website that has been confirmed to be owned by the person.
    */
  var verified: js.UndefOr[Boolean] = js.native
}

object Schema$FieldMetadata {
  @scala.inline
  def apply(
    primary: js.UndefOr[Boolean] = js.undefined,
    source: Schema$Source = null,
    verified: js.UndefOr[Boolean] = js.undefined
  ): Schema$FieldMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (!js.isUndefined(verified)) __obj.updateDynamic("verified")(verified.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FieldMetadata]
  }
}

