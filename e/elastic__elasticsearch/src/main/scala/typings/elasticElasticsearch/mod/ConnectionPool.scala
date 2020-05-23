package typings.elasticElasticsearch.mod

import typings.elasticElasticsearch.anon.None
import typings.elasticElasticsearch.poolMod.ConnectionPoolOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@elastic/elasticsearch", "ConnectionPool")
@js.native
class ConnectionPool ()
  extends typings.elasticElasticsearch.poolMod.ConnectionPool {
  def this(opts: ConnectionPoolOptions) = this()
}

/* static members */
@JSImport("@elastic/elasticsearch", "ConnectionPool")
@js.native
object ConnectionPool extends js.Object {
  var resurrectStrategies: None = js.native
}

