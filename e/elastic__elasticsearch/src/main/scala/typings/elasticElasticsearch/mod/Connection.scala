package typings.elasticElasticsearch.mod

import typings.elasticElasticsearch.anon.ALIVE
import typings.elasticElasticsearch.anon.DATA_
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
  var roles: DATA_ = js.native
  var statuses: ALIVE = js.native
}

