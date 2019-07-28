package typings.atElasticElasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var id: String
  var password: String
  var username: String
}

object Anon_Id {
  @scala.inline
  def apply(id: String, password: String, username: String): Anon_Id = {
    val __obj = js.Dynamic.literal(id = id, password = password, username = username)
  
    __obj.asInstanceOf[Anon_Id]
  }
}

