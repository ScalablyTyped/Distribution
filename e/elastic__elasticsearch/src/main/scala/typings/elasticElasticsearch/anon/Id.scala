package typings.elasticElasticsearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Id extends js.Object {
  var id: String
  var password: js.UndefOr[String] = js.undefined
  // TODO: remove username and password here in 8
  var username: js.UndefOr[String] = js.undefined
}

object Id {
  @scala.inline
  def apply(id: String, password: String = null, username: String = null): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
}

