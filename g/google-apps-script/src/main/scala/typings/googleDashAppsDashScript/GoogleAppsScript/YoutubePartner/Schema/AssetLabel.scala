package typings.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssetLabel extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var labelName: js.UndefOr[String] = js.undefined
}

object AssetLabel {
  @scala.inline
  def apply(kind: String = null, labelName: String = null): AssetLabel = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (labelName != null) __obj.updateDynamic("labelName")(labelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetLabel]
  }
}

