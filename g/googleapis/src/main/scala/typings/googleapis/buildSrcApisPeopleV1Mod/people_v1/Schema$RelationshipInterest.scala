package typings.googleapis.buildSrcApisPeopleV1Mod.people_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A person&#39;s read-only relationship interest .
  */
@js.native
trait Schema$RelationshipInterest extends js.Object {
  /**
    * The value of the relationship interest translated and formatted in the
    * viewer&#39;s account locale or the locale specified in the
    * Accept-Language HTTP header.
    */
  var formattedValue: js.UndefOr[String] = js.native
  /**
    * Metadata about the relationship interest.
    */
  var metadata: js.UndefOr[Schema$FieldMetadata] = js.native
  /**
    * The kind of relationship the person is looking for. The value can be
    * custom or one of these predefined values:  * `friend` * `date` *
    * `relationship` * `networking`
    */
  var value: js.UndefOr[String] = js.native
}

object Schema$RelationshipInterest {
  @scala.inline
  def apply(formattedValue: String = null, metadata: Schema$FieldMetadata = null, value: String = null): Schema$RelationshipInterest = {
    val __obj = js.Dynamic.literal()
    if (formattedValue != null) __obj.updateDynamic("formattedValue")(formattedValue.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RelationshipInterest]
  }
}

