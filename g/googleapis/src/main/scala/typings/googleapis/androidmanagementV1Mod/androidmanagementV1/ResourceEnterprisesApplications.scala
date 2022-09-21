package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androidmanagement/v1", "androidmanagement_v1.Resource$Enterprises$Applications")
@js.native
open class ResourceEnterprisesApplications protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaApplication] = js.native
  def get(callback: BodyResponseCallback[SchemaApplication]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaApplication] = js.native
  def get(params: ParamsResourceEnterprisesApplicationsGet): GaxiosPromise[SchemaApplication] = js.native
  def get(
    params: ParamsResourceEnterprisesApplicationsGet,
    callback: BodyResponseCallback[SchemaApplication]
  ): Unit = js.native
  def get(
    params: ParamsResourceEnterprisesApplicationsGet,
    options: BodyResponseCallback[Readable | SchemaApplication],
    callback: BodyResponseCallback[Readable | SchemaApplication]
  ): Unit = js.native
  def get(params: ParamsResourceEnterprisesApplicationsGet, options: MethodOptions): GaxiosPromise[SchemaApplication] = js.native
  def get(
    params: ParamsResourceEnterprisesApplicationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApplication]
  ): Unit = js.native
  /**
    * Gets info about an application.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidmanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidmanagement = google.androidmanagement('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidmanagement'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidmanagement.enterprises.applications.get({
    *     // The preferred language for localized application info, as a BCP47 tag (e.g. "en-US", "de"). If not specified the default language of the application will be used.
    *     languageCode: 'placeholder-value',
    *     // The name of the application in the form enterprises/{enterpriseId\}/applications/{package_name\}.
    *     name: 'enterprises/my-enterprise/applications/my-application',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "appPricing": "my_appPricing",
    *   //   "appTracks": [],
    *   //   "appVersions": [],
    *   //   "author": "my_author",
    *   //   "availableCountries": [],
    *   //   "category": "my_category",
    *   //   "contentRating": "my_contentRating",
    *   //   "description": "my_description",
    *   //   "distributionChannel": "my_distributionChannel",
    *   //   "features": [],
    *   //   "fullDescription": "my_fullDescription",
    *   //   "iconUrl": "my_iconUrl",
    *   //   "managedProperties": [],
    *   //   "minAndroidSdkVersion": 0,
    *   //   "name": "my_name",
    *   //   "permissions": [],
    *   //   "playStoreUrl": "my_playStoreUrl",
    *   //   "recentChanges": "my_recentChanges",
    *   //   "screenshotUrls": [],
    *   //   "smallIconUrl": "my_smallIconUrl",
    *   //   "title": "my_title",
    *   //   "updateTime": "my_updateTime"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def get(params: ParamsResourceEnterprisesApplicationsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceEnterprisesApplicationsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
