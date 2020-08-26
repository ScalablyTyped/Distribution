package typings.googleapis.civicinfoV2Mod.civicinfoV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/civicinfo/v2", "civicinfo_v2.Resource$Representatives")
@js.native
class ResourceRepresentatives protected () extends js.Object {
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
  def representativeInfoByAddress(): GaxiosPromise[SchemaRepresentativeInfoResponse] = js.native
  def representativeInfoByAddress(callback: BodyResponseCallback[SchemaRepresentativeInfoResponse]): Unit = js.native
  def representativeInfoByAddress(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRepresentativeInfoResponse] = js.native
  def representativeInfoByAddress(params: ParamsResourceRepresentativesRepresentativeinfobyaddress): GaxiosPromise[SchemaRepresentativeInfoResponse] = js.native
  def representativeInfoByAddress(
    params: ParamsResourceRepresentativesRepresentativeinfobyaddress,
    callback: BodyResponseCallback[SchemaRepresentativeInfoResponse]
  ): Unit = js.native
  def representativeInfoByAddress(
    params: ParamsResourceRepresentativesRepresentativeinfobyaddress,
    options: BodyResponseCallback[SchemaRepresentativeInfoResponse],
    callback: BodyResponseCallback[SchemaRepresentativeInfoResponse]
  ): Unit = js.native
  def representativeInfoByAddress(params: ParamsResourceRepresentativesRepresentativeinfobyaddress, options: MethodOptions): GaxiosPromise[SchemaRepresentativeInfoResponse] = js.native
  def representativeInfoByAddress(
    params: ParamsResourceRepresentativesRepresentativeinfobyaddress,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRepresentativeInfoResponse]
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
  def representativeInfoByDivision(): GaxiosPromise[SchemaRepresentativeInfoData] = js.native
  def representativeInfoByDivision(callback: BodyResponseCallback[SchemaRepresentativeInfoData]): Unit = js.native
  def representativeInfoByDivision(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRepresentativeInfoData] = js.native
  def representativeInfoByDivision(params: ParamsResourceRepresentativesRepresentativeinfobydivision): GaxiosPromise[SchemaRepresentativeInfoData] = js.native
  def representativeInfoByDivision(
    params: ParamsResourceRepresentativesRepresentativeinfobydivision,
    callback: BodyResponseCallback[SchemaRepresentativeInfoData]
  ): Unit = js.native
  def representativeInfoByDivision(
    params: ParamsResourceRepresentativesRepresentativeinfobydivision,
    options: BodyResponseCallback[SchemaRepresentativeInfoData],
    callback: BodyResponseCallback[SchemaRepresentativeInfoData]
  ): Unit = js.native
  def representativeInfoByDivision(params: ParamsResourceRepresentativesRepresentativeinfobydivision, options: MethodOptions): GaxiosPromise[SchemaRepresentativeInfoData] = js.native
  def representativeInfoByDivision(
    params: ParamsResourceRepresentativesRepresentativeinfobydivision,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRepresentativeInfoData]
  ): Unit = js.native
}

