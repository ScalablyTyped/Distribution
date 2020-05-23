package typings.elasticElasticsearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hosts extends js.Object {
  var hosts: js.Array[_]
  var reason: String
}

object Hosts {
  @scala.inline
  def apply(hosts: js.Array[_], reason: String): Hosts = {
    val __obj = js.Dynamic.literal(hosts = hosts.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hosts]
  }
}

