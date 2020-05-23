package typings.evernote.anon

import typings.evernote.mod.Errors.EDAMNotFoundException
import typings.evernote.mod.Errors.EDAMUserException
import typings.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityID extends js.Object {
  var identityID: js.UndefOr[typings.evernote.mod.Types.IdentityID] = js.undefined
  var notFoundException: js.UndefOr[EDAMNotFoundException] = js.undefined
  var userException: js.UndefOr[EDAMUserException] = js.undefined
  var userID: js.UndefOr[UserID] = js.undefined
}

object IdentityID {
  @scala.inline
  def apply(
    identityID: js.UndefOr[typings.evernote.mod.Types.IdentityID] = js.undefined,
    notFoundException: EDAMNotFoundException = null,
    userException: EDAMUserException = null,
    userID: js.UndefOr[UserID] = js.undefined
  ): IdentityID = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(identityID)) __obj.updateDynamic("identityID")(identityID.get.asInstanceOf[js.Any])
    if (notFoundException != null) __obj.updateDynamic("notFoundException")(notFoundException.asInstanceOf[js.Any])
    if (userException != null) __obj.updateDynamic("userException")(userException.asInstanceOf[js.Any])
    if (!js.isUndefined(userID)) __obj.updateDynamic("userID")(userID.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityID]
  }
}

