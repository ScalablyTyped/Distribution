package typings.gapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Interest extends js.Object {
  /** Metadata about the interest. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  /** The interest; for example, `stargazing`. */
  var value: js.UndefOr[String] = js.undefined
}

object Interest {
  @scala.inline
  def apply(metadata: FieldMetadata = null, value: String = null): Interest = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interest]
  }
}

