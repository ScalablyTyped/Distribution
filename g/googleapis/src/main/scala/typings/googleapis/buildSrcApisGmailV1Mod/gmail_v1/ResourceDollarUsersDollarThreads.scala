package typings.googleapis.buildSrcApisGmailV1Mod.gmail_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/gmail/v1", "gmail_v1.Resource$Users$Threads")
@js.native
class ResourceDollarUsersDollarThreads protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * gmail.users.threads.delete
    * @desc Immediately and permanently deletes the specified thread. This
    * operation cannot be undone. Prefer threads.trash instead.
    * @alias gmail.users.threads.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id ID of the Thread to delete.
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarUsersDollarThreadsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarUsersDollarThreadsDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarUsersDollarThreadsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarUsersDollarThreadsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarUsersDollarThreadsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * gmail.users.threads.get
    * @desc Gets the specified thread.
    * @alias gmail.users.threads.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.format The format to return the messages in.
    * @param {string} params.id The ID of the thread to retrieve.
    * @param {string=} params.metadataHeaders When given and format is METADATA, only include headers specified.
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Thread] = js.native
  def get(callback: BodyResponseCallback[Schema$Thread]): Unit = js.native
  def get(params: ParamsDollarResourceDollarUsersDollarThreadsDollarGet): GaxiosPromise[Schema$Thread] = js.native
  def get(
    params: ParamsDollarResourceDollarUsersDollarThreadsDollarGet,
    callback: BodyResponseCallback[Schema$Thread]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarUsersDollarThreadsDollarGet,
    options: BodyResponseCallback[Schema$Thread],
    callback: BodyResponseCallback[Schema$Thread]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarUsersDollarThreadsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Thread] = js.native
  def get(
    params: ParamsDollarResourceDollarUsersDollarThreadsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Thread]
  ): Unit = js.native
  /**
    * gmail.users.threads.list
    * @desc Lists the threads in the user's mailbox.
    * @alias gmail.users.threads.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.includeSpamTrash Include threads from SPAM and TRASH in the results.
    * @param {string=} params.labelIds Only return threads with labels that match all of the specified label IDs.
    * @param {integer=} params.maxResults Maximum number of threads to return.
    * @param {string=} params.pageToken Page token to retrieve a specific page of results in the list.
    * @param {string=} params.q Only return threads matching the specified query. Supports the same query format as the Gmail search box. For example, "from:someuser@example.com rfc822msgid: is:unread". Parameter cannot be used when accessing the api using the gmail.metadata scope.
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListThreadsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListThreadsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarUsersDollarThreadsDollarList): GaxiosPromise[Schema$ListThreadsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarUsersDollarThreadsDollarList,
    callback: BodyResponseCallback[Schema$ListThreadsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarUsersDollarThreadsDollarList,
    options: BodyResponseCallback[Schema$ListThreadsResponse],
    callback: BodyResponseCallback[Schema$ListThreadsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarUsersDollarThreadsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListThreadsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarUsersDollarThreadsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListThreadsResponse]
  ): Unit = js.native
  /**
    * gmail.users.threads.modify
    * @desc Modifies the labels applied to the thread. This applies to all
    * messages in the thread.
    * @alias gmail.users.threads.modify
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the thread to modify.
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {().ModifyThreadRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def modify(): GaxiosPromise[Schema$Thread] = js.native
  def modify(callback: BodyResponseCallback[Schema$Thread]): Unit = js.native
  def modify(params: ParamsDollarResourceDollarUsersDollarThreadsDollarModify): GaxiosPromise[Schema$Thread] = js.native
  def modify(
    params: ParamsDollarResourceDollarUsersDollarThreadsDollarModify,
    callback: BodyResponseCallback[Schema$Thread]
  ): Unit = js.native
  def modify(
    params: ParamsDollarResourceDollarUsersDollarThreadsDollarModify,
    options: BodyResponseCallback[Schema$Thread],
    callback: BodyResponseCallback[Schema$Thread]
  ): Unit = js.native
  def modify(params: ParamsDollarResourceDollarUsersDollarThreadsDollarModify, options: MethodOptions): GaxiosPromise[Schema$Thread] = js.native
  def modify(
    params: ParamsDollarResourceDollarUsersDollarThreadsDollarModify,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Thread]
  ): Unit = js.native
  /**
    * gmail.users.threads.trash
    * @desc Moves the specified thread to the trash.
    * @alias gmail.users.threads.trash
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the thread to Trash.
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def trash(): GaxiosPromise[Schema$Thread] = js.native
  def trash(callback: BodyResponseCallback[Schema$Thread]): Unit = js.native
  def trash(params: ParamsDollarResourceDollarUsersDollarThreadsDollarTrash): GaxiosPromise[Schema$Thread] = js.native
  def trash(
    params: ParamsDollarResourceDollarUsersDollarThreadsDollarTrash,
    callback: BodyResponseCallback[Schema$Thread]
  ): Unit = js.native
  def trash(
    params: ParamsDollarResourceDollarUsersDollarThreadsDollarTrash,
    options: BodyResponseCallback[Schema$Thread],
    callback: BodyResponseCallback[Schema$Thread]
  ): Unit = js.native
  def trash(params: ParamsDollarResourceDollarUsersDollarThreadsDollarTrash, options: MethodOptions): GaxiosPromise[Schema$Thread] = js.native
  def trash(
    params: ParamsDollarResourceDollarUsersDollarThreadsDollarTrash,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Thread]
  ): Unit = js.native
  /**
    * gmail.users.threads.untrash
    * @desc Removes the specified thread from the trash.
    * @alias gmail.users.threads.untrash
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the thread to remove from Trash.
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def untrash(): GaxiosPromise[Schema$Thread] = js.native
  def untrash(callback: BodyResponseCallback[Schema$Thread]): Unit = js.native
  def untrash(params: ParamsDollarResourceDollarUsersDollarThreadsDollarUntrash): GaxiosPromise[Schema$Thread] = js.native
  def untrash(
    params: ParamsDollarResourceDollarUsersDollarThreadsDollarUntrash,
    callback: BodyResponseCallback[Schema$Thread]
  ): Unit = js.native
  def untrash(
    params: ParamsDollarResourceDollarUsersDollarThreadsDollarUntrash,
    options: BodyResponseCallback[Schema$Thread],
    callback: BodyResponseCallback[Schema$Thread]
  ): Unit = js.native
  def untrash(params: ParamsDollarResourceDollarUsersDollarThreadsDollarUntrash, options: MethodOptions): GaxiosPromise[Schema$Thread] = js.native
  def untrash(
    params: ParamsDollarResourceDollarUsersDollarThreadsDollarUntrash,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Thread]
  ): Unit = js.native
}

