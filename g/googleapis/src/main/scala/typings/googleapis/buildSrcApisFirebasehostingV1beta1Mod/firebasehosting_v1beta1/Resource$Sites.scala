package typings.googleapis.buildSrcApisFirebasehostingV1beta1Mod.firebasehosting_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/firebasehosting/v1beta1", "firebasehosting_v1beta1.Resource$Sites")
@js.native
class Resource$Sites protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var domains: ResourceDollarSitesDollarDomains = js.native
  var releases: ResourceDollarSitesDollarReleases = js.native
  var versions: ResourceDollarSitesDollarVersions = js.native
  /**
    * firebasehosting.sites.getConfig
    * @desc Gets the Hosting metadata for a specific site.
    * @alias firebasehosting.sites.getConfig
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The site for which to get the SiteConfig, in the format: <code>sites/<var>site-name</var>/config</code>
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getConfig(): GaxiosPromise[Schema$SiteConfig] = js.native
  def getConfig(callback: BodyResponseCallback[Schema$SiteConfig]): Unit = js.native
  def getConfig(params: ParamsDollarResourceDollarSitesDollarGetconfig): GaxiosPromise[Schema$SiteConfig] = js.native
  def getConfig(
    params: ParamsDollarResourceDollarSitesDollarGetconfig,
    callback: BodyResponseCallback[Schema$SiteConfig]
  ): Unit = js.native
  def getConfig(
    params: ParamsDollarResourceDollarSitesDollarGetconfig,
    options: BodyResponseCallback[Schema$SiteConfig],
    callback: BodyResponseCallback[Schema$SiteConfig]
  ): Unit = js.native
  def getConfig(params: ParamsDollarResourceDollarSitesDollarGetconfig, options: MethodOptions): GaxiosPromise[Schema$SiteConfig] = js.native
  def getConfig(
    params: ParamsDollarResourceDollarSitesDollarGetconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SiteConfig]
  ): Unit = js.native
  /**
    * firebasehosting.sites.updateConfig
    * @desc Sets the Hosting metadata for a specific site.
    * @alias firebasehosting.sites.updateConfig
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The site for which to update the SiteConfig, in the format: <code>sites/<var>site-name</var>/config</code>
    * @param {string=} params.updateMask A set of field names from your [site configuration](../sites.SiteConfig) that you want to update. <br>A field will be overwritten if, and only if, it's in the mask. <br>If a mask is not provided then a default mask of only [`max_versions`](../sites.SiteConfig.max_versions) will be used.
    * @param {().SiteConfig} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updateConfig(): GaxiosPromise[Schema$SiteConfig] = js.native
  def updateConfig(callback: BodyResponseCallback[Schema$SiteConfig]): Unit = js.native
  def updateConfig(params: ParamsDollarResourceDollarSitesDollarUpdateconfig): GaxiosPromise[Schema$SiteConfig] = js.native
  def updateConfig(
    params: ParamsDollarResourceDollarSitesDollarUpdateconfig,
    callback: BodyResponseCallback[Schema$SiteConfig]
  ): Unit = js.native
  def updateConfig(
    params: ParamsDollarResourceDollarSitesDollarUpdateconfig,
    options: BodyResponseCallback[Schema$SiteConfig],
    callback: BodyResponseCallback[Schema$SiteConfig]
  ): Unit = js.native
  def updateConfig(params: ParamsDollarResourceDollarSitesDollarUpdateconfig, options: MethodOptions): GaxiosPromise[Schema$SiteConfig] = js.native
  def updateConfig(
    params: ParamsDollarResourceDollarSitesDollarUpdateconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SiteConfig]
  ): Unit = js.native
}

