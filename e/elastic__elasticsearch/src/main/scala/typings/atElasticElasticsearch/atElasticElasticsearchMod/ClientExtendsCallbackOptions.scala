package typings.atElasticElasticsearch.atElasticElasticsearchMod

import typings.atElasticElasticsearch.Anon_Body
import typings.atElasticElasticsearch.libTransportMod.TransportRequestOptions
import typings.atElasticElasticsearch.libTransportMod.TransportRequestParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Extend API
@js.native
trait ClientExtendsCallbackOptions extends js.Object {
  var ConfigurationError: typings.atElasticElasticsearch.libErrorsMod.ConfigurationError = js.native
  var result: Anon_Body = js.native
  def makeRequest(params: TransportRequestParams): js.Promise[Unit] | Unit = js.native
  def makeRequest(params: TransportRequestParams, options: TransportRequestOptions): js.Promise[Unit] | Unit = js.native
}

