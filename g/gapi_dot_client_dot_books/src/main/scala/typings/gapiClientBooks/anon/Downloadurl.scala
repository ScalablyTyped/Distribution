package typings.gapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Downloadurl extends js.Object {
  var download_url: js.UndefOr[String] = js.undefined
  var encrypted_key: js.UndefOr[String] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object Downloadurl {
  @scala.inline
  def apply(
    download_url: String = null,
    encrypted_key: String = null,
    language: String = null,
    size: String = null,
    version: String = null
  ): Downloadurl = {
    val __obj = js.Dynamic.literal()
    if (download_url != null) __obj.updateDynamic("download_url")(download_url.asInstanceOf[js.Any])
    if (encrypted_key != null) __obj.updateDynamic("encrypted_key")(encrypted_key.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Downloadurl]
  }
}

