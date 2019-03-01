package typings
package ghauthLib.ghauthMod.ghauthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenData extends js.Object {
  var token: java.lang.String
  var user: java.lang.String
}

object TokenData {
  @scala.inline
  def apply(token: java.lang.String, user: java.lang.String): TokenData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("token")(token)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[TokenData]
  }
}

