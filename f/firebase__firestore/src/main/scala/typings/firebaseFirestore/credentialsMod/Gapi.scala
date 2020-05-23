package typings.firebaseFirestore.credentialsMod

import typings.firebaseFirestore.anon.GetAuthHeaderValueForFirstParty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gapi extends js.Object {
  var auth: GetAuthHeaderValueForFirstParty
}

object Gapi {
  @scala.inline
  def apply(auth: GetAuthHeaderValueForFirstParty): Gapi = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gapi]
  }
}

