package typings.dogapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApikey extends js.Object {
  var api_key: String
  var app_key: String
}

object AnonApikey {
  @scala.inline
  def apply(api_key: String, app_key: String): AnonApikey = {
    val __obj = js.Dynamic.literal(api_key = api_key.asInstanceOf[js.Any], app_key = app_key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonApikey]
  }
}

