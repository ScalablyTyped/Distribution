package typings.electronNotarize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotarizePasswordCredentials extends NotarizeCredentials {
  var appleId: String
  var appleIdPassword: String
}

object NotarizePasswordCredentials {
  @scala.inline
  def apply(appleId: String, appleIdPassword: String): NotarizePasswordCredentials = {
    val __obj = js.Dynamic.literal(appleId = appleId.asInstanceOf[js.Any], appleIdPassword = appleIdPassword.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotarizePasswordCredentials]
  }
}

