package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.1", "dfareporting_v3_1.Resource$Inventoryitems")
@js.native
class Resource$Inventoryitems protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.inventoryItems.get
    * @desc Gets one inventory item by ID.
    * @alias dfareporting.inventoryItems.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Inventory item ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string} params.projectId Project ID for order documents.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$InventoryItem] = js.native
  def get(callback: BodyResponseCallback[Schema$InventoryItem]): Unit = js.native
  def get(params: ParamsDollarResourceDollarInventoryitemsDollarGet): GaxiosPromise[Schema$InventoryItem] = js.native
  def get(
    params: ParamsDollarResourceDollarInventoryitemsDollarGet,
    callback: BodyResponseCallback[Schema$InventoryItem]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarInventoryitemsDollarGet,
    options: BodyResponseCallback[Schema$InventoryItem],
    callback: BodyResponseCallback[Schema$InventoryItem]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarInventoryitemsDollarGet, options: MethodOptions): GaxiosPromise[Schema$InventoryItem] = js.native
  def get(
    params: ParamsDollarResourceDollarInventoryitemsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$InventoryItem]
  ): Unit = js.native
  /**
    * dfareporting.inventoryItems.list
    * @desc Retrieves a list of inventory items, possibly filtered. This method
    * supports paging.
    * @alias dfareporting.inventoryItems.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.ids Select only inventory items with these IDs.
    * @param {boolean=} params.inPlan Select only inventory items that are in plan.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.orderId Select only inventory items that belong to specified orders.
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string} params.projectId Project ID for order documents.
    * @param {string=} params.siteId Select only inventory items that are associated with these sites.
    * @param {string=} params.sortField Field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {string=} params.type Select only inventory items with this type.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$InventoryItemsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$InventoryItemsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarInventoryitemsDollarList): GaxiosPromise[Schema$InventoryItemsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarInventoryitemsDollarList,
    callback: BodyResponseCallback[Schema$InventoryItemsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarInventoryitemsDollarList,
    options: BodyResponseCallback[Schema$InventoryItemsListResponse],
    callback: BodyResponseCallback[Schema$InventoryItemsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarInventoryitemsDollarList, options: MethodOptions): GaxiosPromise[Schema$InventoryItemsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarInventoryitemsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$InventoryItemsListResponse]
  ): Unit = js.native
}

