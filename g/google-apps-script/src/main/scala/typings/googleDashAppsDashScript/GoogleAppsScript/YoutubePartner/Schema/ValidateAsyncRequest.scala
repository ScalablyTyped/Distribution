package typings.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateAsyncRequest extends js.Object {
  var content: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var uploaderName: js.UndefOr[String] = js.undefined
}

object ValidateAsyncRequest {
  @scala.inline
  def apply(content: String = null, kind: String = null, uploaderName: String = null): ValidateAsyncRequest = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (uploaderName != null) __obj.updateDynamic("uploaderName")(uploaderName)
    __obj.asInstanceOf[ValidateAsyncRequest]
  }
}

