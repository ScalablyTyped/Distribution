package typings
package atElasticElasticsearchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Deprecations extends js.Object {
  @JSName("deprecations")
  var deprecations_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.MigrationDeprecations, _] = js.native
  // Promise API
  def deprecations(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def deprecations(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def deprecations(params: atElasticElasticsearchLib.apiRequestParamsMod.MigrationDeprecations): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def deprecations(
    params: atElasticElasticsearchLib.apiRequestParamsMod.MigrationDeprecations,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def deprecations(
    params: atElasticElasticsearchLib.apiRequestParamsMod.MigrationDeprecations,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def deprecations(
    params: atElasticElasticsearchLib.apiRequestParamsMod.MigrationDeprecations,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
}

