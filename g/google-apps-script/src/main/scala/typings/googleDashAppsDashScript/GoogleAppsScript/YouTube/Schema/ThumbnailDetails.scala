package typings.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThumbnailDetails extends js.Object {
  var default: js.UndefOr[Thumbnail] = js.undefined
  var high: js.UndefOr[Thumbnail] = js.undefined
  var maxres: js.UndefOr[Thumbnail] = js.undefined
  var medium: js.UndefOr[Thumbnail] = js.undefined
  var standard: js.UndefOr[Thumbnail] = js.undefined
}

object ThumbnailDetails {
  @scala.inline
  def apply(
    default: Thumbnail = null,
    high: Thumbnail = null,
    maxres: Thumbnail = null,
    medium: Thumbnail = null,
    standard: Thumbnail = null
  ): ThumbnailDetails = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (high != null) __obj.updateDynamic("high")(high.asInstanceOf[js.Any])
    if (maxres != null) __obj.updateDynamic("maxres")(maxres.asInstanceOf[js.Any])
    if (medium != null) __obj.updateDynamic("medium")(medium.asInstanceOf[js.Any])
    if (standard != null) __obj.updateDynamic("standard")(standard.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThumbnailDetails]
  }
}

