package typings.gapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationshipInterest extends js.Object {
  /**
    * Output only. The value of the relationship interest translated and formatted
    * in the viewer's account locale or the locale specified in the
    * Accept-Language HTTP header.
    */
  var formattedValue: js.UndefOr[String] = js.undefined
  /** Metadata about the relationship interest. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  /**
    * The kind of relationship the person is looking for. The value can be custom
    * or one of these predefined values:
    *
    * &#42; `friend`
    * &#42; `date`
    * &#42; `relationship`
    * &#42; `networking`
    */
  var value: js.UndefOr[String] = js.undefined
}

object RelationshipInterest {
  @scala.inline
  def apply(formattedValue: String = null, metadata: FieldMetadata = null, value: String = null): RelationshipInterest = {
    val __obj = js.Dynamic.literal()
    if (formattedValue != null) __obj.updateDynamic("formattedValue")(formattedValue.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationshipInterest]
  }
}

