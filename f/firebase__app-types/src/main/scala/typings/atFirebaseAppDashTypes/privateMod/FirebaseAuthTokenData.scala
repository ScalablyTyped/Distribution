package typings.atFirebaseAppDashTypes.privateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseAuthTokenData extends js.Object {
  var accessToken: String
}

object FirebaseAuthTokenData {
  @scala.inline
  def apply(accessToken: String): FirebaseAuthTokenData = {
    val __obj = js.Dynamic.literal(accessToken = accessToken)
  
    __obj.asInstanceOf[FirebaseAuthTokenData]
  }
}

