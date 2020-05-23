package typings.facebookJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var name: String
  var user_ids: js.Array[String]
}

object Name {
  @scala.inline
  def apply(name: String, user_ids: js.Array[String]): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], user_ids = user_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

