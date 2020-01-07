package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for an externalId entry.
  */
@js.native
trait Schema$UserExternalId extends js.Object {
  /**
    * Custom type.
    */
  var customType: js.UndefOr[String] = js.native
  /**
    * The type of the Id.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The value of the id.
    */
  var value: js.UndefOr[String] = js.native
}

object Schema$UserExternalId {
  @scala.inline
  def apply(customType: String = null, `type`: String = null, value: String = null): Schema$UserExternalId = {
    val __obj = js.Dynamic.literal()
    if (customType != null) __obj.updateDynamic("customType")(customType.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UserExternalId]
  }
}

