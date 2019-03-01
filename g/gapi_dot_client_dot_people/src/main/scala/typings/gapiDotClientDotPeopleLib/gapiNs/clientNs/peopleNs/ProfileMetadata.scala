package typings
package gapiDotClientDotPeopleLib.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfileMetadata extends js.Object {
  /** The profile object type. */
  var objectType: js.UndefOr[java.lang.String] = js.undefined
  /** The user types. */
  var userTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ProfileMetadata {
  @scala.inline
  def apply(objectType: java.lang.String = null, userTypes: js.Array[java.lang.String] = null): ProfileMetadata = {
    val __obj = js.Dynamic.literal()
    if (objectType != null) __obj.updateDynamic("objectType")(objectType)
    if (userTypes != null) __obj.updateDynamic("userTypes")(userTypes)
    __obj.asInstanceOf[ProfileMetadata]
  }
}

