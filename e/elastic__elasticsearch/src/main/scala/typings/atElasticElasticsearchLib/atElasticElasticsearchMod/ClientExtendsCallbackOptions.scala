package typings
package atElasticElasticsearchLib.atElasticElasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Extend API
@js.native
trait ClientExtendsCallbackOptions extends js.Object {
  var ConfigurationError: atElasticElasticsearchLib.libErrorsMod.ConfigurationError = js.native
  var result: atElasticElasticsearchLib.Anon_Body = js.native
  def makeRequest(params: atElasticElasticsearchLib.libTransportMod.TransportRequestParams): js.Promise[scala.Unit] | scala.Unit = js.native
  def makeRequest(
    params: atElasticElasticsearchLib.libTransportMod.TransportRequestParams,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[scala.Unit] | scala.Unit = js.native
}

