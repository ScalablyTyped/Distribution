package typings.elasticElasticsearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hosts extends js.Object {
  var hosts: js.Array[_] = js.native
  var reason: String = js.native
}

object Hosts {
  @scala.inline
  def apply(hosts: js.Array[_], reason: String): Hosts = {
    val __obj = js.Dynamic.literal(hosts = hosts.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hosts]
  }
  @scala.inline
  implicit class HostsOps[Self <: Hosts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHostsVarargs(value: js.Any*): Self = this.set("hosts", js.Array(value :_*))
    @scala.inline
    def setHosts(value: js.Array[_]): Self = this.set("hosts", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
  }
  
}

