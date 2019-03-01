package typings
package gapiDotClientDotPeopleLib.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Occupation extends js.Object {
  /** Metadata about the occupation. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  /** The occupation; for example, `carpenter`. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Occupation {
  @scala.inline
  def apply(metadata: FieldMetadata = null, value: java.lang.String = null): Occupation = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Occupation]
  }
}

