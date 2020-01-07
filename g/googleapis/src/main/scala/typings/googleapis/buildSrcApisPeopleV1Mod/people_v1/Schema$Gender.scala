package typings.googleapis.buildSrcApisPeopleV1Mod.people_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A person&#39;s gender.
  */
@js.native
trait Schema$Gender extends js.Object {
  /**
    * The read-only value of the gender translated and formatted in the
    * viewer&#39;s account locale or the `Accept-Language` HTTP header locale.
    */
  var formattedValue: js.UndefOr[String] = js.native
  /**
    * Metadata about the gender.
    */
  var metadata: js.UndefOr[Schema$FieldMetadata] = js.native
  /**
    * The gender for the person. The gender can be custom or one of these
    * predefined values:  * `male` * `female` * `other` * `unknown`
    */
  var value: js.UndefOr[String] = js.native
}

object Schema$Gender {
  @scala.inline
  def apply(formattedValue: String = null, metadata: Schema$FieldMetadata = null, value: String = null): Schema$Gender = {
    val __obj = js.Dynamic.literal()
    if (formattedValue != null) __obj.updateDynamic("formattedValue")(formattedValue.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Gender]
  }
}

