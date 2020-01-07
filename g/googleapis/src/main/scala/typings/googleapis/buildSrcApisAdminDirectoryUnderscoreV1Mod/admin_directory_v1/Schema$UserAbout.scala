package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for About (notes) of a user in Directory API.
  */
@js.native
trait Schema$UserAbout extends js.Object {
  /**
    * About entry can have a type which indicates the content type. It can
    * either be plain or html. By default, notes contents are assumed to
    * contain plain text.
    */
  var contentType: js.UndefOr[String] = js.native
  /**
    * Actual value of notes.
    */
  var value: js.UndefOr[String] = js.native
}

object Schema$UserAbout {
  @scala.inline
  def apply(contentType: String = null, value: String = null): Schema$UserAbout = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UserAbout]
  }
}

