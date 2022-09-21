package typings.googleapis.civicinfoV2Mod.civicinfoV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/civicinfo/v2", "civicinfo_v2.Resource$Representatives")
@js.native
open class ResourceRepresentatives protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def representativeInfoByAddress(): GaxiosPromise[SchemaRepresentativeInfoResponse] = js.native
  def representativeInfoByAddress(callback: BodyResponseCallback[SchemaRepresentativeInfoResponse]): Unit = js.native
  def representativeInfoByAddress(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRepresentativeInfoResponse] = js.native
  def representativeInfoByAddress(params: ParamsResourceRepresentativesRepresentativeinfobyaddress): GaxiosPromise[SchemaRepresentativeInfoResponse] = js.native
  def representativeInfoByAddress(
    params: ParamsResourceRepresentativesRepresentativeinfobyaddress,
    callback: BodyResponseCallback[SchemaRepresentativeInfoResponse]
  ): Unit = js.native
  def representativeInfoByAddress(
    params: ParamsResourceRepresentativesRepresentativeinfobyaddress,
    options: BodyResponseCallback[Readable | SchemaRepresentativeInfoResponse],
    callback: BodyResponseCallback[Readable | SchemaRepresentativeInfoResponse]
  ): Unit = js.native
  def representativeInfoByAddress(params: ParamsResourceRepresentativesRepresentativeinfobyaddress, options: MethodOptions): GaxiosPromise[SchemaRepresentativeInfoResponse] = js.native
  def representativeInfoByAddress(
    params: ParamsResourceRepresentativesRepresentativeinfobyaddress,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRepresentativeInfoResponse]
  ): Unit = js.native
  /**
    * Looks up political geography and representative information for a single address.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/civicinfo.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const civicinfo = google.civicinfo('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await civicinfo.representatives.representativeInfoByAddress({
    *     // The address to look up. May only be specified if the field ocdId is not given in the URL
    *     address: 'placeholder-value',
    *     // Whether to return information about offices and officials. If false, only the top-level district information will be returned.
    *     includeOffices: 'placeholder-value',
    *     // A list of office levels to filter by. Only offices that serve at least one of these levels will be returned. Divisions that don't contain a matching office will not be returned.
    *     levels: 'placeholder-value',
    *     // A list of office roles to filter by. Only offices fulfilling one of these roles will be returned. Divisions that don't contain a matching office will not be returned.
    *     roles: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "divisions": {},
    *   //   "kind": "my_kind",
    *   //   "normalizedInput": {},
    *   //   "offices": [],
    *   //   "officials": []
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
  def representativeInfoByAddress(params: ParamsResourceRepresentativesRepresentativeinfobyaddress, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def representativeInfoByAddress(
    params: ParamsResourceRepresentativesRepresentativeinfobyaddress,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def representativeInfoByDivision(): GaxiosPromise[SchemaRepresentativeInfoData] = js.native
  def representativeInfoByDivision(callback: BodyResponseCallback[SchemaRepresentativeInfoData]): Unit = js.native
  def representativeInfoByDivision(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRepresentativeInfoData] = js.native
  def representativeInfoByDivision(params: ParamsResourceRepresentativesRepresentativeinfobydivision): GaxiosPromise[SchemaRepresentativeInfoData] = js.native
  def representativeInfoByDivision(
    params: ParamsResourceRepresentativesRepresentativeinfobydivision,
    callback: BodyResponseCallback[SchemaRepresentativeInfoData]
  ): Unit = js.native
  def representativeInfoByDivision(
    params: ParamsResourceRepresentativesRepresentativeinfobydivision,
    options: BodyResponseCallback[Readable | SchemaRepresentativeInfoData],
    callback: BodyResponseCallback[Readable | SchemaRepresentativeInfoData]
  ): Unit = js.native
  def representativeInfoByDivision(params: ParamsResourceRepresentativesRepresentativeinfobydivision, options: MethodOptions): GaxiosPromise[SchemaRepresentativeInfoData] = js.native
  def representativeInfoByDivision(
    params: ParamsResourceRepresentativesRepresentativeinfobydivision,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRepresentativeInfoData]
  ): Unit = js.native
  /**
    * Looks up representative information for a single geographic division.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/civicinfo.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const civicinfo = google.civicinfo('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await civicinfo.representatives.representativeInfoByDivision({
    *     // A list of office levels to filter by. Only offices that serve at least one of these levels will be returned. Divisions that don't contain a matching office will not be returned.
    *     levels: 'placeholder-value',
    *     // The Open Civic Data division identifier of the division to look up.
    *     ocdId: 'placeholder-value',
    *     // If true, information about all divisions contained in the division requested will be included as well. For example, if querying ocd-division/country:us/district:dc, this would also return all DC's wards and ANCs.
    *     recursive: 'placeholder-value',
    *     // A list of office roles to filter by. Only offices fulfilling one of these roles will be returned. Divisions that don't contain a matching office will not be returned.
    *     roles: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "divisions": {},
    *   //   "offices": [],
    *   //   "officials": []
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
  def representativeInfoByDivision(params: ParamsResourceRepresentativesRepresentativeinfobydivision, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def representativeInfoByDivision(
    params: ParamsResourceRepresentativesRepresentativeinfobydivision,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
