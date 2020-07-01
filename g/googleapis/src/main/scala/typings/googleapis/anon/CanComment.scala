package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanComment extends js.Object {
  var canComment: js.UndefOr[Boolean] = js.native
  var canPlusone: js.UndefOr[Boolean] = js.native
  var canUpdate: js.UndefOr[Boolean] = js.native
  var isPlusOned: js.UndefOr[Boolean] = js.native
  var resharingDisabled: js.UndefOr[Boolean] = js.native
}

object CanComment {
  @scala.inline
  def apply(
    canComment: js.UndefOr[Boolean] = js.undefined,
    canPlusone: js.UndefOr[Boolean] = js.undefined,
    canUpdate: js.UndefOr[Boolean] = js.undefined,
    isPlusOned: js.UndefOr[Boolean] = js.undefined,
    resharingDisabled: js.UndefOr[Boolean] = js.undefined
  ): CanComment = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canComment)) __obj.updateDynamic("canComment")(canComment.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canPlusone)) __obj.updateDynamic("canPlusone")(canPlusone.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canUpdate)) __obj.updateDynamic("canUpdate")(canUpdate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isPlusOned)) __obj.updateDynamic("isPlusOned")(isPlusOned.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resharingDisabled)) __obj.updateDynamic("resharingDisabled")(resharingDisabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanComment]
  }
}

