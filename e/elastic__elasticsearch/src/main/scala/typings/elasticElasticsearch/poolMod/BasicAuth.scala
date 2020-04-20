package typings.elasticElasticsearch.poolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicAuth extends js.Object {
  var password: String
  var username: String
}

object BasicAuth {
  @scala.inline
  def apply(password: String, username: String): BasicAuth = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicAuth]
  }
}

