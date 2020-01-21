package typings.firebaseFirestore.apiCredentialsMod

import typings.firebaseFirestore.AnonGetAuthHeaderValueForFirstParty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gapi extends js.Object {
  var auth: AnonGetAuthHeaderValueForFirstParty
}

object Gapi {
  @scala.inline
  def apply(auth: AnonGetAuthHeaderValueForFirstParty): Gapi = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Gapi]
  }
}

