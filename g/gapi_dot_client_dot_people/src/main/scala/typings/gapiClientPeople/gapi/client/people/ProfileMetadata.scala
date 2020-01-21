package typings.gapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfileMetadata extends js.Object {
  /** The profile object type. */
  var objectType: js.UndefOr[String] = js.undefined
  /** The user types. */
  var userTypes: js.UndefOr[js.Array[String]] = js.undefined
}

object ProfileMetadata {
  @scala.inline
  def apply(objectType: String = null, userTypes: js.Array[String] = null): ProfileMetadata = {
    val __obj = js.Dynamic.literal()
    if (objectType != null) __obj.updateDynamic("objectType")(objectType.asInstanceOf[js.Any])
    if (userTypes != null) __obj.updateDynamic("userTypes")(userTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfileMetadata]
  }
}

