package typings.gapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Biography extends js.Object {
  /** The content type of the biography. */
  var contentType: js.UndefOr[String] = js.undefined
  /** Metadata about the biography. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  /** The short biography. */
  var value: js.UndefOr[String] = js.undefined
}

object Biography {
  @scala.inline
  def apply(contentType: String = null, metadata: FieldMetadata = null, value: String = null): Biography = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Biography]
  }
}

