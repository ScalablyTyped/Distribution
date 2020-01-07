package typings.googleapis.buildSrcApisCivicinfoV2Mod.civicinfo_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/civicinfo/v2", "civicinfo_v2.Resource$Representatives")
@js.native
class Resource$Representatives protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * civicinfo.representatives.representativeInfoByAddress
    * @desc Looks up political geography and representative information for a
    * single address.
    * @alias civicinfo.representatives.representativeInfoByAddress
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.address The address to look up. May only be specified if the field ocdId is not given in the URL.
    * @param {boolean=} params.includeOffices Whether to return information about offices and officials. If false, only the top-level district information will be returned.
    * @param {string=} params.levels A list of office levels to filter by. Only offices that serve at least one of these levels will be returned. Divisions that don't contain a matching office will not be returned.
    * @param {string=} params.roles A list of office roles to filter by. Only offices fulfilling one of these roles will be returned. Divisions that don't contain a matching office will not be returned.
    * @param {().RepresentativeInfoRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def representativeInfoByAddress(): GaxiosPromise[Schema$RepresentativeInfoResponse] = js.native
  def representativeInfoByAddress(callback: BodyResponseCallback[Schema$RepresentativeInfoResponse]): Unit = js.native
  def representativeInfoByAddress(params: ParamsDollarResourceDollarRepresentativesDollarRepresentativeinfobyaddress): GaxiosPromise[Schema$RepresentativeInfoResponse] = js.native
  def representativeInfoByAddress(
    params: ParamsDollarResourceDollarRepresentativesDollarRepresentativeinfobyaddress,
    callback: BodyResponseCallback[Schema$RepresentativeInfoResponse]
  ): Unit = js.native
  def representativeInfoByAddress(
    params: ParamsDollarResourceDollarRepresentativesDollarRepresentativeinfobyaddress,
    options: BodyResponseCallback[Schema$RepresentativeInfoResponse],
    callback: BodyResponseCallback[Schema$RepresentativeInfoResponse]
  ): Unit = js.native
  def representativeInfoByAddress(
    params: ParamsDollarResourceDollarRepresentativesDollarRepresentativeinfobyaddress,
    options: MethodOptions
  ): GaxiosPromise[Schema$RepresentativeInfoResponse] = js.native
  def representativeInfoByAddress(
    params: ParamsDollarResourceDollarRepresentativesDollarRepresentativeinfobyaddress,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$RepresentativeInfoResponse]
  ): Unit = js.native
  /**
    * civicinfo.representatives.representativeInfoByDivision
    * @desc Looks up representative information for a single geographic
    * division.
    * @alias civicinfo.representatives.representativeInfoByDivision
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.levels A list of office levels to filter by. Only offices that serve at least one of these levels will be returned. Divisions that don't contain a matching office will not be returned.
    * @param {string} params.ocdId The Open Civic Data division identifier of the division to look up.
    * @param {boolean=} params.recursive If true, information about all divisions contained in the division requested will be included as well. For example, if querying ocd-division/country:us/district:dc, this would also return all DC's wards and ANCs.
    * @param {string=} params.roles A list of office roles to filter by. Only offices fulfilling one of these roles will be returned. Divisions that don't contain a matching office will not be returned.
    * @param {().DivisionRepresentativeInfoRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def representativeInfoByDivision(): GaxiosPromise[Schema$RepresentativeInfoData] = js.native
  def representativeInfoByDivision(callback: BodyResponseCallback[Schema$RepresentativeInfoData]): Unit = js.native
  def representativeInfoByDivision(params: ParamsDollarResourceDollarRepresentativesDollarRepresentativeinfobydivision): GaxiosPromise[Schema$RepresentativeInfoData] = js.native
  def representativeInfoByDivision(
    params: ParamsDollarResourceDollarRepresentativesDollarRepresentativeinfobydivision,
    callback: BodyResponseCallback[Schema$RepresentativeInfoData]
  ): Unit = js.native
  def representativeInfoByDivision(
    params: ParamsDollarResourceDollarRepresentativesDollarRepresentativeinfobydivision,
    options: BodyResponseCallback[Schema$RepresentativeInfoData],
    callback: BodyResponseCallback[Schema$RepresentativeInfoData]
  ): Unit = js.native
  def representativeInfoByDivision(
    params: ParamsDollarResourceDollarRepresentativesDollarRepresentativeinfobydivision,
    options: MethodOptions
  ): GaxiosPromise[Schema$RepresentativeInfoData] = js.native
  def representativeInfoByDivision(
    params: ParamsDollarResourceDollarRepresentativesDollarRepresentativeinfobydivision,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$RepresentativeInfoData]
  ): Unit = js.native
}

