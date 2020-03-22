package typings.evernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNoSetFullAccess extends js.Object {
  var noSetFullAccess: js.UndefOr[Boolean] = js.undefined
  var noSetModifyNote: js.UndefOr[Boolean] = js.undefined
  var noSetReadNote: js.UndefOr[Boolean] = js.undefined
}

object AnonNoSetFullAccess {
  @scala.inline
  def apply(
    noSetFullAccess: js.UndefOr[Boolean] = js.undefined,
    noSetModifyNote: js.UndefOr[Boolean] = js.undefined,
    noSetReadNote: js.UndefOr[Boolean] = js.undefined
  ): AnonNoSetFullAccess = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(noSetFullAccess)) __obj.updateDynamic("noSetFullAccess")(noSetFullAccess.asInstanceOf[js.Any])
    if (!js.isUndefined(noSetModifyNote)) __obj.updateDynamic("noSetModifyNote")(noSetModifyNote.asInstanceOf[js.Any])
    if (!js.isUndefined(noSetReadNote)) __obj.updateDynamic("noSetReadNote")(noSetReadNote.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNoSetFullAccess]
  }
}

