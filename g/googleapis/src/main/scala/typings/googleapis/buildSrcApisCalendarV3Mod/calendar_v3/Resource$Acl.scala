package typings.googleapis.buildSrcApisCalendarV3Mod.calendar_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/calendar/v3", "calendar_v3.Resource$Acl")
@js.native
class Resource$Acl protected () extends js.Object {
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
  def delete(params: ParamsDollarResourceDollarAclDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarAclDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAclDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarAclDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarAclDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
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
  def get(): GaxiosPromise[Schema$AclRule] = js.native
  def get(callback: BodyResponseCallback[Schema$AclRule]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAclDollarGet): GaxiosPromise[Schema$AclRule] = js.native
  def get(params: ParamsDollarResourceDollarAclDollarGet, callback: BodyResponseCallback[Schema$AclRule]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAclDollarGet,
    options: BodyResponseCallback[Schema$AclRule],
    callback: BodyResponseCallback[Schema$AclRule]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarAclDollarGet, options: MethodOptions): GaxiosPromise[Schema$AclRule] = js.native
  def get(
    params: ParamsDollarResourceDollarAclDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AclRule]
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
  def insert(): GaxiosPromise[Schema$AclRule] = js.native
  def insert(callback: BodyResponseCallback[Schema$AclRule]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarAclDollarInsert): GaxiosPromise[Schema$AclRule] = js.native
  def insert(params: ParamsDollarResourceDollarAclDollarInsert, callback: BodyResponseCallback[Schema$AclRule]): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarAclDollarInsert,
    options: BodyResponseCallback[Schema$AclRule],
    callback: BodyResponseCallback[Schema$AclRule]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarAclDollarInsert, options: MethodOptions): GaxiosPromise[Schema$AclRule] = js.native
  def insert(
    params: ParamsDollarResourceDollarAclDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AclRule]
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
  def list(): GaxiosPromise[Schema$Acl] = js.native
  def list(callback: BodyResponseCallback[Schema$Acl]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAclDollarList): GaxiosPromise[Schema$Acl] = js.native
  def list(params: ParamsDollarResourceDollarAclDollarList, callback: BodyResponseCallback[Schema$Acl]): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAclDollarList,
    options: BodyResponseCallback[Schema$Acl],
    callback: BodyResponseCallback[Schema$Acl]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarAclDollarList, options: MethodOptions): GaxiosPromise[Schema$Acl] = js.native
  def list(
    params: ParamsDollarResourceDollarAclDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Acl]
  ): Unit = js.native
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
  def patch(): GaxiosPromise[Schema$AclRule] = js.native
  def patch(callback: BodyResponseCallback[Schema$AclRule]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarAclDollarPatch): GaxiosPromise[Schema$AclRule] = js.native
  def patch(params: ParamsDollarResourceDollarAclDollarPatch, callback: BodyResponseCallback[Schema$AclRule]): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarAclDollarPatch,
    options: BodyResponseCallback[Schema$AclRule],
    callback: BodyResponseCallback[Schema$AclRule]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarAclDollarPatch, options: MethodOptions): GaxiosPromise[Schema$AclRule] = js.native
  def patch(
    params: ParamsDollarResourceDollarAclDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AclRule]
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
  def update(): GaxiosPromise[Schema$AclRule] = js.native
  def update(callback: BodyResponseCallback[Schema$AclRule]): Unit = js.native
  def update(params: ParamsDollarResourceDollarAclDollarUpdate): GaxiosPromise[Schema$AclRule] = js.native
  def update(params: ParamsDollarResourceDollarAclDollarUpdate, callback: BodyResponseCallback[Schema$AclRule]): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarAclDollarUpdate,
    options: BodyResponseCallback[Schema$AclRule],
    callback: BodyResponseCallback[Schema$AclRule]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarAclDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$AclRule] = js.native
  def update(
    params: ParamsDollarResourceDollarAclDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AclRule]
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
  def watch(): GaxiosPromise[Schema$Channel] = js.native
  def watch(callback: BodyResponseCallback[Schema$Channel]): Unit = js.native
  def watch(params: ParamsDollarResourceDollarAclDollarWatch): GaxiosPromise[Schema$Channel] = js.native
  def watch(params: ParamsDollarResourceDollarAclDollarWatch, callback: BodyResponseCallback[Schema$Channel]): Unit = js.native
  def watch(
    params: ParamsDollarResourceDollarAclDollarWatch,
    options: BodyResponseCallback[Schema$Channel],
    callback: BodyResponseCallback[Schema$Channel]
  ): Unit = js.native
  def watch(params: ParamsDollarResourceDollarAclDollarWatch, options: MethodOptions): GaxiosPromise[Schema$Channel] = js.native
  def watch(
    params: ParamsDollarResourceDollarAclDollarWatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Channel]
  ): Unit = js.native
}

