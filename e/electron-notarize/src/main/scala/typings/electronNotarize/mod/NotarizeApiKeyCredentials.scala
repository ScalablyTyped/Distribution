package typings.electronNotarize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotarizeApiKeyCredentials extends NotarizeCredentials {
  var appleApiIssuer: String
  var appleApiKey: String
}

object NotarizeApiKeyCredentials {
  @scala.inline
  def apply(appleApiIssuer: String, appleApiKey: String): NotarizeApiKeyCredentials = {
    val __obj = js.Dynamic.literal(appleApiIssuer = appleApiIssuer.asInstanceOf[js.Any], appleApiKey = appleApiKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotarizeApiKeyCredentials]
  }
}

