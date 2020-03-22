package typings.evernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNoSetModify extends js.Object {
  var noSetFullAccess: js.UndefOr[Boolean] = js.undefined
  var noSetModify: js.UndefOr[Boolean] = js.undefined
  var noSetReadOnly: js.UndefOr[Boolean] = js.undefined
  var noSetReadPlusActivity: js.UndefOr[Boolean] = js.undefined
}

object AnonNoSetModify {
  @scala.inline
  def apply(
    noSetFullAccess: js.UndefOr[Boolean] = js.undefined,
    noSetModify: js.UndefOr[Boolean] = js.undefined,
    noSetReadOnly: js.UndefOr[Boolean] = js.undefined,
    noSetReadPlusActivity: js.UndefOr[Boolean] = js.undefined
  ): AnonNoSetModify = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(noSetFullAccess)) __obj.updateDynamic("noSetFullAccess")(noSetFullAccess.asInstanceOf[js.Any])
    if (!js.isUndefined(noSetModify)) __obj.updateDynamic("noSetModify")(noSetModify.asInstanceOf[js.Any])
    if (!js.isUndefined(noSetReadOnly)) __obj.updateDynamic("noSetReadOnly")(noSetReadOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(noSetReadPlusActivity)) __obj.updateDynamic("noSetReadPlusActivity")(noSetReadPlusActivity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNoSetModify]
  }
}

