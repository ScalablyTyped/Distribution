package typings.gapiDotClientDotPeople.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Birthday extends js.Object {
  /** The date of the birthday. */
  var date: js.UndefOr[Date] = js.undefined
  /** Metadata about the birthday. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  /** A free-form string representing the user's birthday. */
  var text: js.UndefOr[String] = js.undefined
}

object Birthday {
  @scala.inline
  def apply(date: Date = null, metadata: FieldMetadata = null, text: String = null): Birthday = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Birthday]
  }
}

