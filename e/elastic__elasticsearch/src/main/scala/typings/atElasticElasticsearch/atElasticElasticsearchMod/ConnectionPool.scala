package typings.atElasticElasticsearch.atElasticElasticsearchMod

import typings.atElasticElasticsearch.Anon_None
import typings.atElasticElasticsearch.libPoolMod.ConnectionPoolOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@elastic/elasticsearch", "ConnectionPool")
@js.native
class ConnectionPool ()
  extends typings.atElasticElasticsearch.libPoolMod.ConnectionPool {
  def this(opts: ConnectionPoolOptions) = this()
}

/* static members */
@JSImport("@elastic/elasticsearch", "ConnectionPool")
@js.native
object ConnectionPool extends js.Object {
  var resurrectStrategies: Anon_None = js.native
}

