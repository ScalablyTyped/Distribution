package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CanComment extends js.Object {
  var canComment: js.UndefOr[Boolean] = js.native
  var canPlusone: js.UndefOr[Boolean] = js.native
  var canUpdate: js.UndefOr[Boolean] = js.native
  var isPlusOned: js.UndefOr[Boolean] = js.native
  var resharingDisabled: js.UndefOr[Boolean] = js.native
}

object Anon_CanComment {
  @scala.inline
  def apply(
    canComment: js.UndefOr[Boolean] = js.undefined,
    canPlusone: js.UndefOr[Boolean] = js.undefined,
    canUpdate: js.UndefOr[Boolean] = js.undefined,
    isPlusOned: js.UndefOr[Boolean] = js.undefined,
    resharingDisabled: js.UndefOr[Boolean] = js.undefined
  ): Anon_CanComment = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canComment)) __obj.updateDynamic("canComment")(canComment.asInstanceOf[js.Any])
    if (!js.isUndefined(canPlusone)) __obj.updateDynamic("canPlusone")(canPlusone.asInstanceOf[js.Any])
    if (!js.isUndefined(canUpdate)) __obj.updateDynamic("canUpdate")(canUpdate.asInstanceOf[js.Any])
    if (!js.isUndefined(isPlusOned)) __obj.updateDynamic("isPlusOned")(isPlusOned.asInstanceOf[js.Any])
    if (!js.isUndefined(resharingDisabled)) __obj.updateDynamic("resharingDisabled")(resharingDisabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CanComment]
  }
}

