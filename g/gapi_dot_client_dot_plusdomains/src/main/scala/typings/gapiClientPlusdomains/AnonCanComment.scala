package typings.gapiClientPlusdomains

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCanComment extends js.Object {
  /** Whether the viewer can comment on the activity. */
  var canComment: js.UndefOr[Boolean] = js.undefined
  /** Whether the viewer can +1 the activity. */
  var canPlusone: js.UndefOr[Boolean] = js.undefined
  /** Whether the viewer can edit or delete the activity. */
  var canUpdate: js.UndefOr[Boolean] = js.undefined
  /** Whether the viewer has +1'd the activity. */
  var isPlusOned: js.UndefOr[Boolean] = js.undefined
  /** Whether reshares are disabled for the activity. */
  var resharingDisabled: js.UndefOr[Boolean] = js.undefined
}

object AnonCanComment {
  @scala.inline
  def apply(
    canComment: js.UndefOr[Boolean] = js.undefined,
    canPlusone: js.UndefOr[Boolean] = js.undefined,
    canUpdate: js.UndefOr[Boolean] = js.undefined,
    isPlusOned: js.UndefOr[Boolean] = js.undefined,
    resharingDisabled: js.UndefOr[Boolean] = js.undefined
  ): AnonCanComment = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canComment)) __obj.updateDynamic("canComment")(canComment.asInstanceOf[js.Any])
    if (!js.isUndefined(canPlusone)) __obj.updateDynamic("canPlusone")(canPlusone.asInstanceOf[js.Any])
    if (!js.isUndefined(canUpdate)) __obj.updateDynamic("canUpdate")(canUpdate.asInstanceOf[js.Any])
    if (!js.isUndefined(isPlusOned)) __obj.updateDynamic("isPlusOned")(isPlusOned.asInstanceOf[js.Any])
    if (!js.isUndefined(resharingDisabled)) __obj.updateDynamic("resharingDisabled")(resharingDisabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCanComment]
  }
}

