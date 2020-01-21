package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateRequest extends js.Object {
  var content: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var uploaderName: js.UndefOr[String] = js.undefined
}

object ValidateRequest {
  @scala.inline
  def apply(content: String = null, kind: String = null, locale: String = null, uploaderName: String = null): ValidateRequest = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (uploaderName != null) __obj.updateDynamic("uploaderName")(uploaderName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateRequest]
  }
}

