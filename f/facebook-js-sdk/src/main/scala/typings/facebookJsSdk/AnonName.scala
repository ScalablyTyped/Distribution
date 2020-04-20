package typings.facebookJsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var name: String
  var user_ids: js.Array[String]
}

object AnonName {
  @scala.inline
  def apply(name: String, user_ids: js.Array[String]): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], user_ids = user_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonName]
  }
}

