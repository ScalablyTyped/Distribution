package typings.elasticElasticsearch.mod

import typings.elasticElasticsearch.anon.DEFAULT
import typings.elasticElasticsearch.transportMod.TransportOptions
import typings.elasticElasticsearch.transportMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@elastic/elasticsearch", "Transport")
@js.native
class Transport protected () extends default {
  def this(opts: TransportOptions) = this()
}

/* static members */
@JSImport("@elastic/elasticsearch", "Transport")
@js.native
object Transport extends js.Object {
  var sniffReasons: DEFAULT = js.native
}

