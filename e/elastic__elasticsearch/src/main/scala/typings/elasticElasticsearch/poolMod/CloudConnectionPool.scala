package typings.elasticElasticsearch.poolMod

import typings.elasticElasticsearch.connectionMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@elastic/elasticsearch/lib/pool", "CloudConnectionPool")
@js.native
class CloudConnectionPool () extends BaseConnectionPool {
  def this(opts: BaseConnectionPoolOptions) = this()
  var cloudConnection: default | Null = js.native
}

