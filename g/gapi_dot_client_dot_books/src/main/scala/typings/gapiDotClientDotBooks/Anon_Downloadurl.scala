package typings.gapiDotClientDotBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Downloadurl extends js.Object {
  var download_url: js.UndefOr[String] = js.undefined
  var encrypted_key: js.UndefOr[String] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object Anon_Downloadurl {
  @scala.inline
  def apply(
    download_url: String = null,
    encrypted_key: String = null,
    language: String = null,
    size: String = null,
    version: String = null
  ): Anon_Downloadurl = {
    val __obj = js.Dynamic.literal()
    if (download_url != null) __obj.updateDynamic("download_url")(download_url)
    if (encrypted_key != null) __obj.updateDynamic("encrypted_key")(encrypted_key)
    if (language != null) __obj.updateDynamic("language")(language)
    if (size != null) __obj.updateDynamic("size")(size)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Anon_Downloadurl]
  }
}

