package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for a website entry.
  */
@js.native
trait Schema$UserWebsite extends js.Object {
  /**
    * Custom Type.
    */
  var customType: js.UndefOr[String] = js.native
  /**
    * If this is user&#39;s primary website or not.
    */
  var primary: js.UndefOr[Boolean] = js.native
  /**
    * Each entry can have a type which indicates standard types of that entry.
    * For example website could be of home, work, blog etc. In addition to the
    * standard type, an entry can have a custom type and can give it any name.
    * Such types should have the CUSTOM value as type and also have a
    * customType value.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Website.
    */
  var value: js.UndefOr[String] = js.native
}

object Schema$UserWebsite {
  @scala.inline
  def apply(
    customType: String = null,
    primary: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null,
    value: String = null
  ): Schema$UserWebsite = {
    val __obj = js.Dynamic.literal()
    if (customType != null) __obj.updateDynamic("customType")(customType.asInstanceOf[js.Any])
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UserWebsite]
  }
}

