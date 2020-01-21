package typings.elasticElasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId extends js.Object {
  var id: String
  var password: String
  // TODO: remove username and password here in 8
  var username: String
}

object AnonId {
  @scala.inline
  def apply(id: String, password: String, username: String): AnonId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonId]
  }
}

