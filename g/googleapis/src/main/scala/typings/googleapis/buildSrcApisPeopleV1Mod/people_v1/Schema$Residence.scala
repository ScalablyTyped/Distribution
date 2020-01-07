package typings.googleapis.buildSrcApisPeopleV1Mod.people_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A person&#39;s past or current residence.
  */
@js.native
trait Schema$Residence extends js.Object {
  /**
    * True if the residence is the person&#39;s current residence; false if the
    * residence is a past residence.
    */
  var current: js.UndefOr[Boolean] = js.native
  /**
    * Metadata about the residence.
    */
  var metadata: js.UndefOr[Schema$FieldMetadata] = js.native
  /**
    * The address of the residence.
    */
  var value: js.UndefOr[String] = js.native
}

object Schema$Residence {
  @scala.inline
  def apply(
    current: js.UndefOr[Boolean] = js.undefined,
    metadata: Schema$FieldMetadata = null,
    value: String = null
  ): Schema$Residence = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(current)) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Residence]
  }
}

