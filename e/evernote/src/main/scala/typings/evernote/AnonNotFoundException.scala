package typings.evernote

import typings.evernote.mod.Errors.EDAMNotFoundException
import typings.evernote.mod.Errors.EDAMUserException
import typings.evernote.mod.Types.UserIdentity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNotFoundException extends js.Object {
  var notFoundException: js.UndefOr[EDAMNotFoundException] = js.undefined
  var userException: js.UndefOr[EDAMUserException] = js.undefined
  var userIdentity: js.UndefOr[UserIdentity] = js.undefined
}

object AnonNotFoundException {
  @scala.inline
  def apply(
    notFoundException: EDAMNotFoundException = null,
    userException: EDAMUserException = null,
    userIdentity: UserIdentity = null
  ): AnonNotFoundException = {
    val __obj = js.Dynamic.literal()
    if (notFoundException != null) __obj.updateDynamic("notFoundException")(notFoundException.asInstanceOf[js.Any])
    if (userException != null) __obj.updateDynamic("userException")(userException.asInstanceOf[js.Any])
    if (userIdentity != null) __obj.updateDynamic("userIdentity")(userIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNotFoundException]
  }
}

