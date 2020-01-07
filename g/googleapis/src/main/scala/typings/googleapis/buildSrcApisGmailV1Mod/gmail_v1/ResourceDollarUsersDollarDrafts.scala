package typings.googleapis.buildSrcApisGmailV1Mod.gmail_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/gmail/v1", "gmail_v1.Resource$Users$Drafts")
@js.native
class ResourceDollarUsersDollarDrafts protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * gmail.users.drafts.create
    * @desc Creates a new draft with the DRAFT label.
    * @alias gmail.users.drafts.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param  {object} params.resource Media resource metadata
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Draft] = js.native
  def create(callback: BodyResponseCallback[Schema$Draft]): Unit = js.native
  def create(params: ParamsDollarResourceDollarUsersDollarDraftsDollarCreate): GaxiosPromise[Schema$Draft] = js.native
  def create(
    params: ParamsDollarResourceDollarUsersDollarDraftsDollarCreate,
    callback: BodyResponseCallback[Schema$Draft]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarUsersDollarDraftsDollarCreate,
    options: BodyResponseCallback[Schema$Draft],
    callback: BodyResponseCallback[Schema$Draft]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarUsersDollarDraftsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Draft] = js.native
  def create(
    params: ParamsDollarResourceDollarUsersDollarDraftsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Draft]
  ): Unit = js.native
  /**
    * gmail.users.drafts.delete
    * @desc Immediately and permanently deletes the specified draft. Does not
    * simply trash it.
    * @alias gmail.users.drafts.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the draft to delete.
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarUsersDollarDraftsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarUsersDollarDraftsDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarUsersDollarDraftsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarUsersDollarDraftsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarUsersDollarDraftsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * gmail.users.drafts.get
    * @desc Gets the specified draft.
    * @alias gmail.users.drafts.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.format The format to return the draft in.
    * @param {string} params.id The ID of the draft to retrieve.
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Draft] = js.native
  def get(callback: BodyResponseCallback[Schema$Draft]): Unit = js.native
  def get(params: ParamsDollarResourceDollarUsersDollarDraftsDollarGet): GaxiosPromise[Schema$Draft] = js.native
  def get(
    params: ParamsDollarResourceDollarUsersDollarDraftsDollarGet,
    callback: BodyResponseCallback[Schema$Draft]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarUsersDollarDraftsDollarGet,
    options: BodyResponseCallback[Schema$Draft],
    callback: BodyResponseCallback[Schema$Draft]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarUsersDollarDraftsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Draft] = js.native
  def get(
    params: ParamsDollarResourceDollarUsersDollarDraftsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Draft]
  ): Unit = js.native
  /**
    * gmail.users.drafts.list
    * @desc Lists the drafts in the user's mailbox.
    * @alias gmail.users.drafts.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.includeSpamTrash Include drafts from SPAM and TRASH in the results.
    * @param {integer=} params.maxResults Maximum number of drafts to return.
    * @param {string=} params.pageToken Page token to retrieve a specific page of results in the list.
    * @param {string=} params.q Only return draft messages matching the specified query. Supports the same query format as the Gmail search box. For example, "from:someuser@example.com rfc822msgid: is:unread".
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListDraftsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListDraftsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarUsersDollarDraftsDollarList): GaxiosPromise[Schema$ListDraftsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarUsersDollarDraftsDollarList,
    callback: BodyResponseCallback[Schema$ListDraftsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarUsersDollarDraftsDollarList,
    options: BodyResponseCallback[Schema$ListDraftsResponse],
    callback: BodyResponseCallback[Schema$ListDraftsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarUsersDollarDraftsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListDraftsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarUsersDollarDraftsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListDraftsResponse]
  ): Unit = js.native
  /**
    * gmail.users.drafts.send
    * @desc Sends the specified, existing draft to the recipients in the To,
    * Cc, and Bcc headers.
    * @alias gmail.users.drafts.send
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param  {object} params.resource Media resource metadata
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def send(): GaxiosPromise[Schema$Message] = js.native
  def send(callback: BodyResponseCallback[Schema$Message]): Unit = js.native
  def send(params: ParamsDollarResourceDollarUsersDollarDraftsDollarSend): GaxiosPromise[Schema$Message] = js.native
  def send(
    params: ParamsDollarResourceDollarUsersDollarDraftsDollarSend,
    callback: BodyResponseCallback[Schema$Message]
  ): Unit = js.native
  def send(
    params: ParamsDollarResourceDollarUsersDollarDraftsDollarSend,
    options: BodyResponseCallback[Schema$Message],
    callback: BodyResponseCallback[Schema$Message]
  ): Unit = js.native
  def send(params: ParamsDollarResourceDollarUsersDollarDraftsDollarSend, options: MethodOptions): GaxiosPromise[Schema$Message] = js.native
  def send(
    params: ParamsDollarResourceDollarUsersDollarDraftsDollarSend,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Message]
  ): Unit = js.native
  /**
    * gmail.users.drafts.update
    * @desc Replaces a draft's content.
    * @alias gmail.users.drafts.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the draft to update.
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param  {object} params.resource Media resource metadata
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Draft] = js.native
  def update(callback: BodyResponseCallback[Schema$Draft]): Unit = js.native
  def update(params: ParamsDollarResourceDollarUsersDollarDraftsDollarUpdate): GaxiosPromise[Schema$Draft] = js.native
  def update(
    params: ParamsDollarResourceDollarUsersDollarDraftsDollarUpdate,
    callback: BodyResponseCallback[Schema$Draft]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarUsersDollarDraftsDollarUpdate,
    options: BodyResponseCallback[Schema$Draft],
    callback: BodyResponseCallback[Schema$Draft]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarUsersDollarDraftsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Draft] = js.native
  def update(
    params: ParamsDollarResourceDollarUsersDollarDraftsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Draft]
  ): Unit = js.native
}

