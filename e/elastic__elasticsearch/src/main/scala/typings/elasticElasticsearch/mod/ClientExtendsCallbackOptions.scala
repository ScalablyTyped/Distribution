package typings.elasticElasticsearch.mod

import typings.elasticElasticsearch.anon.Body
import typings.elasticElasticsearch.transportMod.TransportRequestOptions
import typings.elasticElasticsearch.transportMod.TransportRequestParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Extend API
@js.native
trait ClientExtendsCallbackOptions extends js.Object {
  var ConfigurationError: typings.elasticElasticsearch.errorsMod.ConfigurationError = js.native
  var result: Body = js.native
  def makeRequest(params: TransportRequestParams): js.Promise[Unit] | Unit = js.native
  def makeRequest(params: TransportRequestParams, options: TransportRequestOptions): js.Promise[Unit] | Unit = js.native
}

