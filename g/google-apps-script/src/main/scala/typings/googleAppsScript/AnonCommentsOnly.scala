package typings.googleAppsScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCommentsOnly extends js.Object {
  var commentsOnly: js.UndefOr[Boolean] = js.undefined
  var contentsOnly: js.UndefOr[Boolean] = js.undefined
  var formatOnly: js.UndefOr[Boolean] = js.undefined
  var skipFilteredRows: js.UndefOr[Boolean] = js.undefined
  var validationsOnly: js.UndefOr[Boolean] = js.undefined
}

object AnonCommentsOnly {
  @scala.inline
  def apply(
    commentsOnly: js.UndefOr[Boolean] = js.undefined,
    contentsOnly: js.UndefOr[Boolean] = js.undefined,
    formatOnly: js.UndefOr[Boolean] = js.undefined,
    skipFilteredRows: js.UndefOr[Boolean] = js.undefined,
    validationsOnly: js.UndefOr[Boolean] = js.undefined
  ): AnonCommentsOnly = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(commentsOnly)) __obj.updateDynamic("commentsOnly")(commentsOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(contentsOnly)) __obj.updateDynamic("contentsOnly")(contentsOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(formatOnly)) __obj.updateDynamic("formatOnly")(formatOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(skipFilteredRows)) __obj.updateDynamic("skipFilteredRows")(skipFilteredRows.asInstanceOf[js.Any])
    if (!js.isUndefined(validationsOnly)) __obj.updateDynamic("validationsOnly")(validationsOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCommentsOnly]
  }
}

