package typings.evernote.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoSetFullAccess extends js.Object {
  var noSetFullAccess: js.UndefOr[Boolean] = js.undefined
  var noSetModifyNote: js.UndefOr[Boolean] = js.undefined
  var noSetReadNote: js.UndefOr[Boolean] = js.undefined
}

object NoSetFullAccess {
  @scala.inline
  def apply(
    noSetFullAccess: js.UndefOr[Boolean] = js.undefined,
    noSetModifyNote: js.UndefOr[Boolean] = js.undefined,
    noSetReadNote: js.UndefOr[Boolean] = js.undefined
  ): NoSetFullAccess = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(noSetFullAccess)) __obj.updateDynamic("noSetFullAccess")(noSetFullAccess.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noSetModifyNote)) __obj.updateDynamic("noSetModifyNote")(noSetModifyNote.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noSetReadNote)) __obj.updateDynamic("noSetReadNote")(noSetReadNote.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoSetFullAccess]
  }
}

