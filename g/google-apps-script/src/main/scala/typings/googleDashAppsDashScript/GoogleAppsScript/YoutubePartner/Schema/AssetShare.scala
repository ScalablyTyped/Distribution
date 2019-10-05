package typings.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssetShare extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var shareId: js.UndefOr[String] = js.undefined
  var viewId: js.UndefOr[String] = js.undefined
}

object AssetShare {
  @scala.inline
  def apply(kind: String = null, shareId: String = null, viewId: String = null): AssetShare = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (shareId != null) __obj.updateDynamic("shareId")(shareId)
    if (viewId != null) __obj.updateDynamic("viewId")(viewId)
    __obj.asInstanceOf[AssetShare]
  }
}

