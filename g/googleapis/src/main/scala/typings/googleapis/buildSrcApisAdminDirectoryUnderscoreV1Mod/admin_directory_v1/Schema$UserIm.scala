package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for instant messenger of an user.
  */
@js.native
trait Schema$UserIm extends js.Object {
  /**
    * Custom protocol.
    */
  var customProtocol: js.UndefOr[String] = js.native
  /**
    * Custom type.
    */
  var customType: js.UndefOr[String] = js.native
  /**
    * Instant messenger id.
    */
  var im: js.UndefOr[String] = js.native
  /**
    * If this is user&#39;s primary im. Only one entry could be marked as
    * primary.
    */
  var primary: js.UndefOr[Boolean] = js.native
  /**
    * Protocol used in the instant messenger. It should be one of the values
    * from ImProtocolTypes map. Similar to type, it can take a CUSTOM value and
    * specify the custom name in customProtocol field.
    */
  var protocol: js.UndefOr[String] = js.native
  /**
    * Each entry can have a type which indicates standard types of that entry.
    * For example instant messengers could be of home, work etc. In addition to
    * the standard type, an entry can have a custom type and can take any
    * value. Such types should have the CUSTOM value as type and also have a
    * customType value.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$UserIm {
  @scala.inline
  def apply(
    customProtocol: String = null,
    customType: String = null,
    im: String = null,
    primary: js.UndefOr[Boolean] = js.undefined,
    protocol: String = null,
    `type`: String = null
  ): Schema$UserIm = {
    val __obj = js.Dynamic.literal()
    if (customProtocol != null) __obj.updateDynamic("customProtocol")(customProtocol.asInstanceOf[js.Any])
    if (customType != null) __obj.updateDynamic("customType")(customType.asInstanceOf[js.Any])
    if (im != null) __obj.updateDynamic("im")(im.asInstanceOf[js.Any])
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UserIm]
  }
}

