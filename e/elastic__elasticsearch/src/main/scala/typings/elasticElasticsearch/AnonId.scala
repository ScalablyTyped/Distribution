package typings.elasticElasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId extends js.Object {
  var id: String
  var password: js.UndefOr[String] = js.undefined
  // TODO: remove username and password here in 8
  var username: js.UndefOr[String] = js.undefined
}

object AnonId {
  @scala.inline
  def apply(id: String, password: String = null, username: String = null): AnonId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonId]
  }
}

