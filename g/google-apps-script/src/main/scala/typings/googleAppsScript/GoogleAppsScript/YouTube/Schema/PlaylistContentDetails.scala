package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistContentDetails extends js.Object {
  var itemCount: js.UndefOr[Double] = js.undefined
}

object PlaylistContentDetails {
  @scala.inline
  def apply(itemCount: js.UndefOr[Double] = js.undefined): PlaylistContentDetails = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(itemCount)) __obj.updateDynamic("itemCount")(itemCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistContentDetails]
  }
}

