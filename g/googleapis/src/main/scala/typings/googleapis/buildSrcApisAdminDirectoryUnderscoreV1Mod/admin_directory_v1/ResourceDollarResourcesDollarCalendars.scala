package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Resources$Calendars")
@js.native
class ResourceDollarResourcesDollarCalendars protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * directory.resources.calendars.delete
    * @desc Deletes a calendar resource.
    * @alias directory.resources.calendars.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.calendarResourceId The unique ID of the calendar resource to delete.
    * @param {string} params.customer The unique ID for the customer's G Suite account. As an account administrator, you can also use the my_customer alias to represent your account's customer ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarResourcesDollarCalendarsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarResourcesDollarCalendarsDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarResourcesDollarCalendarsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarResourcesDollarCalendarsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarResourcesDollarCalendarsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * directory.resources.calendars.get
    * @desc Retrieves a calendar resource.
    * @alias directory.resources.calendars.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.calendarResourceId The unique ID of the calendar resource to retrieve.
    * @param {string} params.customer The unique ID for the customer's G Suite account. As an account administrator, you can also use the my_customer alias to represent your account's customer ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$CalendarResource] = js.native
  def get(callback: BodyResponseCallback[Schema$CalendarResource]): Unit = js.native
  def get(params: ParamsDollarResourceDollarResourcesDollarCalendarsDollarGet): GaxiosPromise[Schema$CalendarResource] = js.native
  def get(
    params: ParamsDollarResourceDollarResourcesDollarCalendarsDollarGet,
    callback: BodyResponseCallback[Schema$CalendarResource]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarResourcesDollarCalendarsDollarGet,
    options: BodyResponseCallback[Schema$CalendarResource],
    callback: BodyResponseCallback[Schema$CalendarResource]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarResourcesDollarCalendarsDollarGet, options: MethodOptions): GaxiosPromise[Schema$CalendarResource] = js.native
  def get(
    params: ParamsDollarResourceDollarResourcesDollarCalendarsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CalendarResource]
  ): Unit = js.native
  /**
    * directory.resources.calendars.insert
    * @desc Inserts a calendar resource.
    * @alias directory.resources.calendars.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer The unique ID for the customer's G Suite account. As an account administrator, you can also use the my_customer alias to represent your account's customer ID.
    * @param {().CalendarResource} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$CalendarResource] = js.native
  def insert(callback: BodyResponseCallback[Schema$CalendarResource]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarResourcesDollarCalendarsDollarInsert): GaxiosPromise[Schema$CalendarResource] = js.native
  def insert(
    params: ParamsDollarResourceDollarResourcesDollarCalendarsDollarInsert,
    callback: BodyResponseCallback[Schema$CalendarResource]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarResourcesDollarCalendarsDollarInsert,
    options: BodyResponseCallback[Schema$CalendarResource],
    callback: BodyResponseCallback[Schema$CalendarResource]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarResourcesDollarCalendarsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$CalendarResource] = js.native
  def insert(
    params: ParamsDollarResourceDollarResourcesDollarCalendarsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CalendarResource]
  ): Unit = js.native
  /**
    * directory.resources.calendars.list
    * @desc Retrieves a list of calendar resources for an account.
    * @alias directory.resources.calendars.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer The unique ID for the customer's G Suite account. As an account administrator, you can also use the my_customer alias to represent your account's customer ID.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.orderBy Field(s) to sort results by in either ascending or descending order. Supported fields include resourceId, resourceName, capacity, buildingId, and floorName. If no order is specified, defaults to ascending. Should be of the form "field [asc|desc], field [asc|desc], ...". For example buildingId, capacity desc would return results sorted first by buildingId in ascending order then by capacity in descending order.
    * @param {string=} params.pageToken Token to specify the next page in the list.
    * @param {string=} params.query String query used to filter results. Should be of the form "field operator value" where field can be any of supported fields and operators can be any of supported operations. Operators include '=' for exact match and ':' for prefix match or HAS match where applicable. For prefix match, the value should always be followed by a *. Supported fields include generatedResourceName, name, buildingId, featureInstances.feature.name. For example buildingId=US-NYC-9TH AND featureInstances.feature.name:Phone.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$CalendarResources] = js.native
  def list(callback: BodyResponseCallback[Schema$CalendarResources]): Unit = js.native
  def list(params: ParamsDollarResourceDollarResourcesDollarCalendarsDollarList): GaxiosPromise[Schema$CalendarResources] = js.native
  def list(
    params: ParamsDollarResourceDollarResourcesDollarCalendarsDollarList,
    callback: BodyResponseCallback[Schema$CalendarResources]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarResourcesDollarCalendarsDollarList,
    options: BodyResponseCallback[Schema$CalendarResources],
    callback: BodyResponseCallback[Schema$CalendarResources]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarResourcesDollarCalendarsDollarList, options: MethodOptions): GaxiosPromise[Schema$CalendarResources] = js.native
  def list(
    params: ParamsDollarResourceDollarResourcesDollarCalendarsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CalendarResources]
  ): Unit = js.native
  /**
    * directory.resources.calendars.patch
    * @desc Updates a calendar resource.  This method supports patch semantics,
    * meaning you only need to include the fields you wish to update. Fields
    * that are not present in the request will be preserved. This method
    * supports patch semantics.
    * @alias directory.resources.calendars.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.calendarResourceId The unique ID of the calendar resource to update.
    * @param {string} params.customer The unique ID for the customer's G Suite account. As an account administrator, you can also use the my_customer alias to represent your account's customer ID.
    * @param {().CalendarResource} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$CalendarResource] = js.native
  def patch(callback: BodyResponseCallback[Schema$CalendarResource]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarResourcesDollarCalendarsDollarPatch): GaxiosPromise[Schema$CalendarResource] = js.native
  def patch(
    params: ParamsDollarResourceDollarResourcesDollarCalendarsDollarPatch,
    callback: BodyResponseCallback[Schema$CalendarResource]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarResourcesDollarCalendarsDollarPatch,
    options: BodyResponseCallback[Schema$CalendarResource],
    callback: BodyResponseCallback[Schema$CalendarResource]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarResourcesDollarCalendarsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$CalendarResource] = js.native
  def patch(
    params: ParamsDollarResourceDollarResourcesDollarCalendarsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CalendarResource]
  ): Unit = js.native
  /**
    * directory.resources.calendars.update
    * @desc Updates a calendar resource.  This method supports patch semantics,
    * meaning you only need to include the fields you wish to update. Fields
    * that are not present in the request will be preserved.
    * @alias directory.resources.calendars.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.calendarResourceId The unique ID of the calendar resource to update.
    * @param {string} params.customer The unique ID for the customer's G Suite account. As an account administrator, you can also use the my_customer alias to represent your account's customer ID.
    * @param {().CalendarResource} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$CalendarResource] = js.native
  def update(callback: BodyResponseCallback[Schema$CalendarResource]): Unit = js.native
  def update(params: ParamsDollarResourceDollarResourcesDollarCalendarsDollarUpdate): GaxiosPromise[Schema$CalendarResource] = js.native
  def update(
    params: ParamsDollarResourceDollarResourcesDollarCalendarsDollarUpdate,
    callback: BodyResponseCallback[Schema$CalendarResource]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarResourcesDollarCalendarsDollarUpdate,
    options: BodyResponseCallback[Schema$CalendarResource],
    callback: BodyResponseCallback[Schema$CalendarResource]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarResourcesDollarCalendarsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$CalendarResource] = js.native
  def update(
    params: ParamsDollarResourceDollarResourcesDollarCalendarsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CalendarResource]
  ): Unit = js.native
}

