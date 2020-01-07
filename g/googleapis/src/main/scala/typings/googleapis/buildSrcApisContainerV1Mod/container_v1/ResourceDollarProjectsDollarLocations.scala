package typings.googleapis.buildSrcApisContainerV1Mod.container_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/container/v1", "container_v1.Resource$Projects$Locations")
@js.native
class ResourceDollarProjectsDollarLocations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var clusters: ResourceDollarProjectsDollarLocationsDollarClusters = js.native
  var context: APIRequestContext = js.native
  var operations: ResourceDollarProjectsDollarLocationsDollarOperations = js.native
  /**
    * container.projects.locations.getServerConfig
    * @desc Returns configuration info about the Kubernetes Engine service.
    * @alias container.projects.locations.getServerConfig
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name (project and location) of the server config to get, specified in the format 'projects/x/locations/x'.
    * @param {string=} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field.
    * @param {string=} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) to return operations for. This field has been deprecated and replaced by the name field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getServerConfig(): GaxiosPromise[Schema$ServerConfig] = js.native
  def getServerConfig(callback: BodyResponseCallback[Schema$ServerConfig]): Unit = js.native
  def getServerConfig(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarGetserverconfig): GaxiosPromise[Schema$ServerConfig] = js.native
  def getServerConfig(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarGetserverconfig,
    callback: BodyResponseCallback[Schema$ServerConfig]
  ): Unit = js.native
  def getServerConfig(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarGetserverconfig,
    options: BodyResponseCallback[Schema$ServerConfig],
    callback: BodyResponseCallback[Schema$ServerConfig]
  ): Unit = js.native
  def getServerConfig(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarGetserverconfig,
    options: MethodOptions
  ): GaxiosPromise[Schema$ServerConfig] = js.native
  def getServerConfig(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarGetserverconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ServerConfig]
  ): Unit = js.native
}

