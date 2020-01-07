package typings.googleapis.buildSrcApisContainerV1beta1Mod.container_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/container/v1beta1", "container_v1beta1.Resource$Projects$Locations$Clusters$WellKnown")
@js.native
class ResourceDollarProjectsDollarLocationsDollarClustersDollarWellKnown protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * container.projects.locations.clusters.well-known.getOpenid-configuration
    * @desc GetOpenIDConfig gets the OIDC discovery document for the cluster.
    * See the OpenID Connect Discovery 1.0 specification for details.
    * https://openid.net/specs/openid-connect-discovery-1_0.html This API is
    * not yet intended for general use, and is not available for all clusters.
    * @alias
    * container.projects.locations.clusters.well-known.getOpenid-configuration
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The cluster (project, location, cluster id) to get the discovery document for. Specified in the format 'projects/x/locations/x/clusters/x'.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getOpenidConfiguration(): GaxiosPromise[Schema$GetOpenIDConfigResponse] = js.native
  def getOpenidConfiguration(callback: BodyResponseCallback[Schema$GetOpenIDConfigResponse]): Unit = js.native
  def getOpenidConfiguration(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarWellKnownDollarGetopenidconfiguration
  ): GaxiosPromise[Schema$GetOpenIDConfigResponse] = js.native
  def getOpenidConfiguration(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarWellKnownDollarGetopenidconfiguration,
    callback: BodyResponseCallback[Schema$GetOpenIDConfigResponse]
  ): Unit = js.native
  def getOpenidConfiguration(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarWellKnownDollarGetopenidconfiguration,
    options: BodyResponseCallback[Schema$GetOpenIDConfigResponse],
    callback: BodyResponseCallback[Schema$GetOpenIDConfigResponse]
  ): Unit = js.native
  def getOpenidConfiguration(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarWellKnownDollarGetopenidconfiguration,
    options: MethodOptions
  ): GaxiosPromise[Schema$GetOpenIDConfigResponse] = js.native
  def getOpenidConfiguration(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarWellKnownDollarGetopenidconfiguration,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GetOpenIDConfigResponse]
  ): Unit = js.native
}

