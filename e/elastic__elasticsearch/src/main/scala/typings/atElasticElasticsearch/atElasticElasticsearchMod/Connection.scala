package typings.atElasticElasticsearch.atElasticElasticsearchMod

import typings.atElasticElasticsearch.Anon_ALIVE
import typings.atElasticElasticsearch.Anon_DATA
import typings.atElasticElasticsearch.libConnectionMod.ConnectionOptions
import typings.atElasticElasticsearch.libConnectionMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@elastic/elasticsearch", "Connection")
@js.native
class Connection () extends default {
  def this(opts: ConnectionOptions) = this()
}

/* static members */
@JSImport("@elastic/elasticsearch", "Connection")
@js.native
object Connection extends js.Object {
  var roles: Anon_DATA = js.native
  var statuses: Anon_ALIVE = js.native
}

