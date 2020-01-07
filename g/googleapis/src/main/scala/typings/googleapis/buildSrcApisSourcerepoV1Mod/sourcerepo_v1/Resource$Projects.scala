package typings.googleapis.buildSrcApisSourcerepoV1Mod.sourcerepo_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/sourcerepo/v1", "sourcerepo_v1.Resource$Projects")
@js.native
class Resource$Projects protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var repos: ResourceDollarProjectsDollarRepos = js.native
  /**
    * sourcerepo.projects.getConfig
    * @desc Returns the Cloud Source Repositories configuration of the project.
    * @alias sourcerepo.projects.getConfig
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the requested project. Values are of the form `projects/<project>`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getConfig(): GaxiosPromise[Schema$ProjectConfig] = js.native
  def getConfig(callback: BodyResponseCallback[Schema$ProjectConfig]): Unit = js.native
  def getConfig(params: ParamsDollarResourceDollarProjectsDollarGetconfig): GaxiosPromise[Schema$ProjectConfig] = js.native
  def getConfig(
    params: ParamsDollarResourceDollarProjectsDollarGetconfig,
    callback: BodyResponseCallback[Schema$ProjectConfig]
  ): Unit = js.native
  def getConfig(
    params: ParamsDollarResourceDollarProjectsDollarGetconfig,
    options: BodyResponseCallback[Schema$ProjectConfig],
    callback: BodyResponseCallback[Schema$ProjectConfig]
  ): Unit = js.native
  def getConfig(params: ParamsDollarResourceDollarProjectsDollarGetconfig, options: MethodOptions): GaxiosPromise[Schema$ProjectConfig] = js.native
  def getConfig(
    params: ParamsDollarResourceDollarProjectsDollarGetconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ProjectConfig]
  ): Unit = js.native
  /**
    * sourcerepo.projects.updateConfig
    * @desc Updates the Cloud Source Repositories configuration of the project.
    * @alias sourcerepo.projects.updateConfig
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the requested project. Values are of the form `projects/<project>`.
    * @param {().UpdateProjectConfigRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updateConfig(): GaxiosPromise[Schema$ProjectConfig] = js.native
  def updateConfig(callback: BodyResponseCallback[Schema$ProjectConfig]): Unit = js.native
  def updateConfig(params: ParamsDollarResourceDollarProjectsDollarUpdateconfig): GaxiosPromise[Schema$ProjectConfig] = js.native
  def updateConfig(
    params: ParamsDollarResourceDollarProjectsDollarUpdateconfig,
    callback: BodyResponseCallback[Schema$ProjectConfig]
  ): Unit = js.native
  def updateConfig(
    params: ParamsDollarResourceDollarProjectsDollarUpdateconfig,
    options: BodyResponseCallback[Schema$ProjectConfig],
    callback: BodyResponseCallback[Schema$ProjectConfig]
  ): Unit = js.native
  def updateConfig(params: ParamsDollarResourceDollarProjectsDollarUpdateconfig, options: MethodOptions): GaxiosPromise[Schema$ProjectConfig] = js.native
  def updateConfig(
    params: ParamsDollarResourceDollarProjectsDollarUpdateconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ProjectConfig]
  ): Unit = js.native
}

