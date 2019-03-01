package typings
package gapiDotClientDotPeopleLib.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserDefined extends js.Object {
  /** The end user specified key of the user defined data. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** Metadata about the user defined data. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  /** The end user specified value of the user defined data. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object UserDefined {
  @scala.inline
  def apply(key: java.lang.String = null, metadata: FieldMetadata = null, value: java.lang.String = null): UserDefined = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[UserDefined]
  }
}

