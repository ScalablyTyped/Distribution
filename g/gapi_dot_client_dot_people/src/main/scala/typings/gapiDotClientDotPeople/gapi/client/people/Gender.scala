package typings.gapiDotClientDotPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gender extends js.Object {
  /**
    * The read-only value of the gender translated and formatted in the viewer's
    * account locale or the `Accept-Language` HTTP header locale.
    */
  var formattedValue: js.UndefOr[String] = js.undefined
  /** Metadata about the gender. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  /**
    * The gender for the person. The gender can be custom or predefined.
    * Possible values include, but are not limited to, the
    * following:
    *
    * &#42; `male`
    * &#42; `female`
    * &#42; `other`
    * &#42; `unknown`
    */
  var value: js.UndefOr[String] = js.undefined
}

object Gender {
  @scala.inline
  def apply(formattedValue: String = null, metadata: FieldMetadata = null, value: String = null): Gender = {
    val __obj = js.Dynamic.literal()
    if (formattedValue != null) __obj.updateDynamic("formattedValue")(formattedValue)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Gender]
  }
}

