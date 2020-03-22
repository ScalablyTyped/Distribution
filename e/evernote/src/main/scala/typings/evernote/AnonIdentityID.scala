package typings.evernote

import typings.evernote.mod.Errors.EDAMNotFoundException
import typings.evernote.mod.Errors.EDAMUserException
import typings.evernote.mod.Types.IdentityID
import typings.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIdentityID extends js.Object {
  var identityID: js.UndefOr[IdentityID] = js.undefined
  var notFoundException: js.UndefOr[EDAMNotFoundException] = js.undefined
  var userException: js.UndefOr[EDAMUserException] = js.undefined
  var userID: js.UndefOr[UserID] = js.undefined
}

object AnonIdentityID {
  @scala.inline
  def apply(
    identityID: Int | Double = null,
    notFoundException: EDAMNotFoundException = null,
    userException: EDAMUserException = null,
    userID: Int | Double = null
  ): AnonIdentityID = {
    val __obj = js.Dynamic.literal()
    if (identityID != null) __obj.updateDynamic("identityID")(identityID.asInstanceOf[js.Any])
    if (notFoundException != null) __obj.updateDynamic("notFoundException")(notFoundException.asInstanceOf[js.Any])
    if (userException != null) __obj.updateDynamic("userException")(userException.asInstanceOf[js.Any])
    if (userID != null) __obj.updateDynamic("userID")(userID.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIdentityID]
  }
}

