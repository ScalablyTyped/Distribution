package typings.atElasticElasticsearch.libPoolMod

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
    val __obj = js.Dynamic.literal(password = password, username = username)
  
    __obj.asInstanceOf[BasicAuth]
  }
}

