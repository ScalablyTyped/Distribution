package typings.elasticElasticsearch.mod

import typings.elasticElasticsearch.AnonALIVE
import typings.elasticElasticsearch.Anon_DATA
import typings.elasticElasticsearch.connectionMod.ConnectionOptions
import typings.elasticElasticsearch.connectionMod.default
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
  var statuses: AnonALIVE = js.native
}

