package typings.gapi.gapi.client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenObject extends js.Object {
  /**
    * The access token to use in requests.
    */
  var access_token: String
}

object TokenObject {
  @scala.inline
  def apply(access_token: String): TokenObject = {
    val __obj = js.Dynamic.literal(access_token = access_token)
  
    __obj.asInstanceOf[TokenObject]
  }
}

