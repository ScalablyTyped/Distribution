package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.1", "dfareporting_v3_1.Resource$Orderdocuments")
@js.native
class Resource$Orderdocuments protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.orderDocuments.get
    * @desc Gets one order document by ID.
    * @alias dfareporting.orderDocuments.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Order document ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string} params.projectId Project ID for order documents.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$OrderDocument] = js.native
  def get(callback: BodyResponseCallback[Schema$OrderDocument]): Unit = js.native
  def get(params: ParamsDollarResourceDollarOrderdocumentsDollarGet): GaxiosPromise[Schema$OrderDocument] = js.native
  def get(
    params: ParamsDollarResourceDollarOrderdocumentsDollarGet,
    callback: BodyResponseCallback[Schema$OrderDocument]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarOrderdocumentsDollarGet,
    options: BodyResponseCallback[Schema$OrderDocument],
    callback: BodyResponseCallback[Schema$OrderDocument]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarOrderdocumentsDollarGet, options: MethodOptions): GaxiosPromise[Schema$OrderDocument] = js.native
  def get(
    params: ParamsDollarResourceDollarOrderdocumentsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$OrderDocument]
  ): Unit = js.native
  /**
    * dfareporting.orderDocuments.list
    * @desc Retrieves a list of order documents, possibly filtered. This method
    * supports paging.
    * @alias dfareporting.orderDocuments.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.approved Select only order documents that have been approved by at least one user.
    * @param {string=} params.ids Select only order documents with these IDs.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.orderId Select only order documents for specified orders.
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string} params.projectId Project ID for order documents.
    * @param {string=} params.searchString Allows searching for order documents by name or ID. Wildcards (*) are allowed. For example, "orderdocument*2015" will return order documents with names like "orderdocument June 2015", "orderdocument April 2015", or simply "orderdocument 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "orderdocument" will match order documents with name "my orderdocument", "orderdocument 2015", or simply "orderdocument".
    * @param {string=} params.siteId Select only order documents that are associated with these sites.
    * @param {string=} params.sortField Field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$OrderDocumentsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$OrderDocumentsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarOrderdocumentsDollarList): GaxiosPromise[Schema$OrderDocumentsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarOrderdocumentsDollarList,
    callback: BodyResponseCallback[Schema$OrderDocumentsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarOrderdocumentsDollarList,
    options: BodyResponseCallback[Schema$OrderDocumentsListResponse],
    callback: BodyResponseCallback[Schema$OrderDocumentsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarOrderdocumentsDollarList, options: MethodOptions): GaxiosPromise[Schema$OrderDocumentsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarOrderdocumentsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$OrderDocumentsListResponse]
  ): Unit = js.native
}

