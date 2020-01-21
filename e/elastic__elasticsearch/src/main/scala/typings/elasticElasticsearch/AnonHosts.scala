package typings.elasticElasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHosts extends js.Object {
  var hosts: js.Array[_]
  var reason: String
}

object AnonHosts {
  @scala.inline
  def apply(hosts: js.Array[_], reason: String): AnonHosts = {
    val __obj = js.Dynamic.literal(hosts = hosts.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHosts]
  }
}

