package typings.atElasticElasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hosts extends js.Object {
  var hosts: js.Array[_]
  var reason: String
}

object Anon_Hosts {
  @scala.inline
  def apply(hosts: js.Array[_], reason: String): Anon_Hosts = {
    val __obj = js.Dynamic.literal(hosts = hosts.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Hosts]
  }
}

