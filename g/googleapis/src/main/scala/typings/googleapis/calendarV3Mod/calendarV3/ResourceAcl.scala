package typings.googleapis.calendarV3Mod.calendarV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/calendar/v3", "calendar_v3.Resource$Acl")
@js.native
class ResourceAcl protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * calendar.acl.delete
    * @desc Deletes an access control rule.
    * @alias calendar.acl.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.calendarId Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the "primary" keyword.
    * @param {string} params.ruleId ACL rule identifier.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAclDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAclDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceAclDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceAclDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAclDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  
  /**
    * calendar.acl.get
    * @desc Returns an access control rule.
    * @alias calendar.acl.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.calendarId Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the "primary" keyword.
    * @param {string} params.ruleId ACL rule identifier.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaAclRule] = js.native
  def get(callback: BodyResponseCallback[SchemaAclRule]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAclRule] = js.native
  def get(params: ParamsResourceAclGet): GaxiosPromise[SchemaAclRule] = js.native
  def get(params: ParamsResourceAclGet, callback: BodyResponseCallback[SchemaAclRule]): Unit = js.native
  def get(
    params: ParamsResourceAclGet,
    options: BodyResponseCallback[SchemaAclRule],
    callback: BodyResponseCallback[SchemaAclRule]
  ): Unit = js.native
  def get(params: ParamsResourceAclGet, options: MethodOptions): GaxiosPromise[SchemaAclRule] = js.native
  def get(
    params: ParamsResourceAclGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAclRule]
  ): Unit = js.native
  
  /**
    * calendar.acl.insert
    * @desc Creates an access control rule.
    * @alias calendar.acl.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.calendarId Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the "primary" keyword.
    * @param {boolean=} params.sendNotifications Whether to send notifications about the calendar sharing change. Optional. The default is True.
    * @param {().AclRule} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaAclRule] = js.native
  def insert(callback: BodyResponseCallback[SchemaAclRule]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAclRule] = js.native
  def insert(params: ParamsResourceAclInsert): GaxiosPromise[SchemaAclRule] = js.native
  def insert(params: ParamsResourceAclInsert, callback: BodyResponseCallback[SchemaAclRule]): Unit = js.native
  def insert(
    params: ParamsResourceAclInsert,
    options: BodyResponseCallback[SchemaAclRule],
    callback: BodyResponseCallback[SchemaAclRule]
  ): Unit = js.native
  def insert(params: ParamsResourceAclInsert, options: MethodOptions): GaxiosPromise[SchemaAclRule] = js.native
  def insert(
    params: ParamsResourceAclInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAclRule]
  ): Unit = js.native
  
  /**
    * calendar.acl.list
    * @desc Returns the rules in the access control list for the calendar.
    * @alias calendar.acl.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.calendarId Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the "primary" keyword.
    * @param {integer=} params.maxResults Maximum number of entries returned on one result page. By default the value is 100 entries. The page size can never be larger than 250 entries. Optional.
    * @param {string=} params.pageToken Token specifying which result page to return. Optional.
    * @param {boolean=} params.showDeleted Whether to include deleted ACLs in the result. Deleted ACLs are represented by role equal to "none". Deleted ACLs will always be included if syncToken is provided. Optional. The default is False.
    * @param {string=} params.syncToken Token obtained from the nextSyncToken field returned on the last page of results from the previous list request. It makes the result of this list request contain only entries that have changed since then. All entries deleted since the previous list request will always be in the result set and it is not allowed to set showDeleted to False. If the syncToken expires, the server will respond with a 410 GONE response code and the client should clear its storage and perform a full synchronization without any syncToken. Learn more about incremental synchronization. Optional. The default is to return all entries.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaAcl] = js.native
  def list(callback: BodyResponseCallback[SchemaAcl]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAcl] = js.native
  def list(params: ParamsResourceAclList): GaxiosPromise[SchemaAcl] = js.native
  def list(params: ParamsResourceAclList, callback: BodyResponseCallback[SchemaAcl]): Unit = js.native
  def list(
    params: ParamsResourceAclList,
    options: BodyResponseCallback[SchemaAcl],
    callback: BodyResponseCallback[SchemaAcl]
  ): Unit = js.native
  def list(params: ParamsResourceAclList, options: MethodOptions): GaxiosPromise[SchemaAcl] = js.native
  def list(params: ParamsResourceAclList, options: MethodOptions, callback: BodyResponseCallback[SchemaAcl]): Unit = js.native
  
  /**
    * calendar.acl.patch
    * @desc Updates an access control rule. This method supports patch
    * semantics.
    * @alias calendar.acl.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.calendarId Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the "primary" keyword.
    * @param {string} params.ruleId ACL rule identifier.
    * @param {boolean=} params.sendNotifications Whether to send notifications about the calendar sharing change. Note that there are no notifications on access removal. Optional. The default is True.
    * @param {().AclRule} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaAclRule] = js.native
  def patch(callback: BodyResponseCallback[SchemaAclRule]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAclRule] = js.native
  def patch(params: ParamsResourceAclPatch): GaxiosPromise[SchemaAclRule] = js.native
  def patch(params: ParamsResourceAclPatch, callback: BodyResponseCallback[SchemaAclRule]): Unit = js.native
  def patch(
    params: ParamsResourceAclPatch,
    options: BodyResponseCallback[SchemaAclRule],
    callback: BodyResponseCallback[SchemaAclRule]
  ): Unit = js.native
  def patch(params: ParamsResourceAclPatch, options: MethodOptions): GaxiosPromise[SchemaAclRule] = js.native
  def patch(
    params: ParamsResourceAclPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAclRule]
  ): Unit = js.native
  
  /**
    * calendar.acl.update
    * @desc Updates an access control rule.
    * @alias calendar.acl.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.calendarId Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the "primary" keyword.
    * @param {string} params.ruleId ACL rule identifier.
    * @param {boolean=} params.sendNotifications Whether to send notifications about the calendar sharing change. Note that there are no notifications on access removal. Optional. The default is True.
    * @param {().AclRule} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaAclRule] = js.native
  def update(callback: BodyResponseCallback[SchemaAclRule]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAclRule] = js.native
  def update(params: ParamsResourceAclUpdate): GaxiosPromise[SchemaAclRule] = js.native
  def update(params: ParamsResourceAclUpdate, callback: BodyResponseCallback[SchemaAclRule]): Unit = js.native
  def update(
    params: ParamsResourceAclUpdate,
    options: BodyResponseCallback[SchemaAclRule],
    callback: BodyResponseCallback[SchemaAclRule]
  ): Unit = js.native
  def update(params: ParamsResourceAclUpdate, options: MethodOptions): GaxiosPromise[SchemaAclRule] = js.native
  def update(
    params: ParamsResourceAclUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAclRule]
  ): Unit = js.native
  
  /**
    * calendar.acl.watch
    * @desc Watch for changes to ACL resources.
    * @alias calendar.acl.watch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.calendarId Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the "primary" keyword.
    * @param {integer=} params.maxResults Maximum number of entries returned on one result page. By default the value is 100 entries. The page size can never be larger than 250 entries. Optional.
    * @param {string=} params.pageToken Token specifying which result page to return. Optional.
    * @param {boolean=} params.showDeleted Whether to include deleted ACLs in the result. Deleted ACLs are represented by role equal to "none". Deleted ACLs will always be included if syncToken is provided. Optional. The default is False.
    * @param {string=} params.syncToken Token obtained from the nextSyncToken field returned on the last page of results from the previous list request. It makes the result of this list request contain only entries that have changed since then. All entries deleted since the previous list request will always be in the result set and it is not allowed to set showDeleted to False. If the syncToken expires, the server will respond with a 410 GONE response code and the client should clear its storage and perform a full synchronization without any syncToken. Learn more about incremental synchronization. Optional. The default is to return all entries.
    * @param {().Channel} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def watch(): GaxiosPromise[SchemaChannel] = js.native
  def watch(callback: BodyResponseCallback[SchemaChannel]): Unit = js.native
  def watch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaChannel] = js.native
  def watch(params: ParamsResourceAclWatch): GaxiosPromise[SchemaChannel] = js.native
  def watch(params: ParamsResourceAclWatch, callback: BodyResponseCallback[SchemaChannel]): Unit = js.native
  def watch(
    params: ParamsResourceAclWatch,
    options: BodyResponseCallback[SchemaChannel],
    callback: BodyResponseCallback[SchemaChannel]
  ): Unit = js.native
  def watch(params: ParamsResourceAclWatch, options: MethodOptions): GaxiosPromise[SchemaChannel] = js.native
  def watch(
    params: ParamsResourceAclWatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChannel]
  ): Unit = js.native
}
