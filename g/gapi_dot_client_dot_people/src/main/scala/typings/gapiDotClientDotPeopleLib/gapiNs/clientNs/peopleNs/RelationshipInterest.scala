package typings
package gapiDotClientDotPeopleLib.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationshipInterest extends js.Object {
  /**
    * The value of the relationship interest translated and formatted in the
    * viewer's account locale or the locale specified in the Accept-Language
    * HTTP header.
    */
  var formattedValue: js.UndefOr[java.lang.String] = js.undefined
  /** Metadata about the relationship interest. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  /**
    * The kind of relationship the person is looking for. The value can be custom
    * or predefined. Possible values include, but are not limited to, the
    * following values:
    *
    * &#42; `friend`
    * &#42; `date`
    * &#42; `relationship`
    * &#42; `networking`
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object RelationshipInterest {
  @scala.inline
  def apply(
    formattedValue: java.lang.String = null,
    metadata: FieldMetadata = null,
    value: java.lang.String = null
  ): RelationshipInterest = {
    val __obj = js.Dynamic.literal()
    if (formattedValue != null) __obj.updateDynamic("formattedValue")(formattedValue)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[RelationshipInterest]
  }
}

