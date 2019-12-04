package typings.atFirebaseFirestore.distSrcApiCredentialsMod

import typings.atFirebaseFirestore.Anon_GetAuthHeaderValueForFirstParty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gapi extends js.Object {
  var auth: Anon_GetAuthHeaderValueForFirstParty
}

object Gapi {
  @scala.inline
  def apply(auth: Anon_GetAuthHeaderValueForFirstParty): Gapi = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Gapi]
  }
}

