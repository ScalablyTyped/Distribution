package typings.elasticElasticsearch.poolMod

import typings.elasticElasticsearch.anon.IdAny
import typings.elasticElasticsearch.connectionMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResurrectEvent extends js.Object {
  var connection: default = js.native
  var isAlive: Boolean = js.native
  var name: String = js.native
  var request: IdAny = js.native
  var strategy: String = js.native
}

object ResurrectEvent {
  @scala.inline
  def apply(connection: default, isAlive: Boolean, name: String, request: IdAny, strategy: String): ResurrectEvent = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], isAlive = isAlive.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResurrectEvent]
  }
  @scala.inline
  implicit class ResurrectEventOps[Self <: ResurrectEvent] (val x: Self) extends AnyVal {
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
    def setConnection(value: default): Self = this.set("connection", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsAlive(value: Boolean): Self = this.set("isAlive", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: IdAny): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrategy(value: String): Self = this.set("strategy", value.asInstanceOf[js.Any])
  }
  
}

