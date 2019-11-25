package typings.ghauth.ghauthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenData extends js.Object {
  var token: String
  var user: String
}

object TokenData {
  @scala.inline
  def apply(token: String, user: String): TokenData = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TokenData]
  }
}

