package typings.googleapis.buildSrcApisPeopleV1Mod.people_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The read-only metadata about a profile.
  */
@js.native
trait Schema$ProfileMetadata extends js.Object {
  /**
    * The profile object type.
    */
  var objectType: js.UndefOr[String] = js.native
  /**
    * The user types.
    */
  var userTypes: js.UndefOr[js.Array[String]] = js.native
}

object Schema$ProfileMetadata {
  @scala.inline
  def apply(objectType: String = null, userTypes: js.Array[String] = null): Schema$ProfileMetadata = {
    val __obj = js.Dynamic.literal()
    if (objectType != null) __obj.updateDynamic("objectType")(objectType.asInstanceOf[js.Any])
    if (userTypes != null) __obj.updateDynamic("userTypes")(userTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ProfileMetadata]
  }
}

