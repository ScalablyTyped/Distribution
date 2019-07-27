package typings
package atElasticElasticsearchLib.libConnectionPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResurrectEvent extends js.Object {
  var connection: atElasticElasticsearchLib.libConnectionMod.default
  var isAlive: scala.Boolean
  var name: java.lang.String
  var request: atElasticElasticsearchLib.Anon_IdAny
  var strategy: java.lang.String
}

object ResurrectEvent {
  @scala.inline
  def apply(
    connection: atElasticElasticsearchLib.libConnectionMod.default,
    isAlive: scala.Boolean,
    name: java.lang.String,
    request: atElasticElasticsearchLib.Anon_IdAny,
    strategy: java.lang.String
  ): ResurrectEvent = {
    val __obj = js.Dynamic.literal(connection = connection, isAlive = isAlive, name = name, request = request, strategy = strategy)
  
    __obj.asInstanceOf[ResurrectEvent]
  }
}

