package typings.atElasticElasticsearch.libConnectionPoolMod

import typings.atElasticElasticsearch.Anon_IdAny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResurrectEvent extends js.Object {
  var connection: typings.atElasticElasticsearch.libConnectionMod.default
  var isAlive: Boolean
  var name: String
  var request: Anon_IdAny
  var strategy: String
}

object ResurrectEvent {
  @scala.inline
  def apply(
    connection: typings.atElasticElasticsearch.libConnectionMod.default,
    isAlive: Boolean,
    name: String,
    request: Anon_IdAny,
    strategy: String
  ): ResurrectEvent = {
    val __obj = js.Dynamic.literal(connection = connection, isAlive = isAlive, name = name, request = request, strategy = strategy)
  
    __obj.asInstanceOf[ResurrectEvent]
  }
}

