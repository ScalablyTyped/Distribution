package typings
package gapiDotClientDotPeopleLib.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Interest extends js.Object {
  /** Metadata about the interest. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  /** The interest; for example, `stargazing`. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Interest {
  @scala.inline
  def apply(metadata: FieldMetadata = null, value: java.lang.String = null): Interest = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Interest]
  }
}

