package typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileLabels extends js.Object {
  var hidden: js.UndefOr[Boolean] = js.undefined
  var modified: js.UndefOr[Boolean] = js.undefined
  var restricted: js.UndefOr[Boolean] = js.undefined
  var starred: js.UndefOr[Boolean] = js.undefined
  var trashed: js.UndefOr[Boolean] = js.undefined
  var viewed: js.UndefOr[Boolean] = js.undefined
}

object FileLabels {
  @scala.inline
  def apply(
    hidden: js.UndefOr[Boolean] = js.undefined,
    modified: js.UndefOr[Boolean] = js.undefined,
    restricted: js.UndefOr[Boolean] = js.undefined,
    starred: js.UndefOr[Boolean] = js.undefined,
    trashed: js.UndefOr[Boolean] = js.undefined,
    viewed: js.UndefOr[Boolean] = js.undefined
  ): FileLabels = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (!js.isUndefined(modified)) __obj.updateDynamic("modified")(modified.asInstanceOf[js.Any])
    if (!js.isUndefined(restricted)) __obj.updateDynamic("restricted")(restricted.asInstanceOf[js.Any])
    if (!js.isUndefined(starred)) __obj.updateDynamic("starred")(starred.asInstanceOf[js.Any])
    if (!js.isUndefined(trashed)) __obj.updateDynamic("trashed")(trashed.asInstanceOf[js.Any])
    if (!js.isUndefined(viewed)) __obj.updateDynamic("viewed")(viewed.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileLabels]
  }
}

