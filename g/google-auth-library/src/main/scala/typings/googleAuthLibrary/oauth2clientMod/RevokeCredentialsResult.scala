package typings.googleAuthLibrary.oauth2clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevokeCredentialsResult extends js.Object {
  var success: Boolean
}

object RevokeCredentialsResult {
  @scala.inline
  def apply(success: Boolean): RevokeCredentialsResult = {
    val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeCredentialsResult]
  }
}

