package typings.elasticElasticsearch.poolMod

import typings.elasticElasticsearch.AnonIdAny
import typings.elasticElasticsearch.connectionMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResurrectEvent extends js.Object {
  var connection: default
  var isAlive: Boolean
  var name: String
  var request: AnonIdAny
  var strategy: String
}

object ResurrectEvent {
  @scala.inline
  def apply(connection: default, isAlive: Boolean, name: String, request: AnonIdAny, strategy: String): ResurrectEvent = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], isAlive = isAlive.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResurrectEvent]
  }
}

