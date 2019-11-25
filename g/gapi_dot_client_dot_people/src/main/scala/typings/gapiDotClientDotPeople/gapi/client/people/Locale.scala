package typings.gapiDotClientDotPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  /** Metadata about the locale. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  /**
    * The well-formed [IETF BCP 47](https://tools.ietf.org/html/bcp47)
    * language tag representing the locale.
    */
  var value: js.UndefOr[String] = js.undefined
}

object Locale {
  @scala.inline
  def apply(metadata: FieldMetadata = null, value: String = null): Locale = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
}

