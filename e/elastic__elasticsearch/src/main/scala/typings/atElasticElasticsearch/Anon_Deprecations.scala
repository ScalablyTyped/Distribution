package typings.atElasticElasticsearch

import typings.atElasticElasticsearch.apiRequestParamsMod.MigrationDeprecations
import typings.atElasticElasticsearch.atElasticElasticsearchMod.ApiMethod
import typings.atElasticElasticsearch.atElasticElasticsearchMod.callbackFn
import typings.atElasticElasticsearch.libTransportMod.ApiResponse
import typings.atElasticElasticsearch.libTransportMod.TransportRequestCallback
import typings.atElasticElasticsearch.libTransportMod.TransportRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Deprecations extends js.Object {
  @JSName("deprecations")
  var deprecations_Original: ApiMethod[MigrationDeprecations, _] = js.native
  // Promise API
  def deprecations(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def deprecations(callback: callbackFn[_]): TransportRequestCallback = js.native
  def deprecations(params: MigrationDeprecations): js.Promise[ApiResponse[_, _]] = js.native
  def deprecations(params: MigrationDeprecations, callback: callbackFn[_]): TransportRequestCallback = js.native
  def deprecations(params: MigrationDeprecations, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def deprecations(params: MigrationDeprecations, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
}

