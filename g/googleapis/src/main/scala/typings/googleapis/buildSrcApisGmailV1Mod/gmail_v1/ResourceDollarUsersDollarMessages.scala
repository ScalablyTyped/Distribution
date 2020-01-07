package typings.googleapis.buildSrcApisGmailV1Mod.gmail_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/gmail/v1", "gmail_v1.Resource$Users$Messages")
@js.native
class ResourceDollarUsersDollarMessages protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var attachments: ResourceDollarUsersDollarMessagesDollarAttachments = js.native
  var context: APIRequestContext = js.native
  /**
    * gmail.users.messages.batchDelete
    * @desc Deletes many messages by message ID. Provides no guarantees that
    * messages were not already deleted or even existed at all.
    * @alias gmail.users.messages.batchDelete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {().BatchDeleteMessagesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchDelete(): GaxiosPromise[Unit] = js.native
  def batchDelete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def batchDelete(params: ParamsDollarResourceDollarUsersDollarMessagesDollarBatchdelete): GaxiosPromise[Unit] = js.native
  def batchDelete(
    params: ParamsDollarResourceDollarUsersDollarMessagesDollarBatchdelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def batchDelete(
    params: ParamsDollarResourceDollarUsersDollarMessagesDollarBatchdelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def batchDelete(params: ParamsDollarResourceDollarUsersDollarMessagesDollarBatchdelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def batchDelete(
    params: ParamsDollarResourceDollarUsersDollarMessagesDollarBatchdelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * gmail.users.messages.batchModify
    * @desc Modifies the labels on the specified messages.
    * @alias gmail.users.messages.batchModify
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {().BatchModifyMessagesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchModify(): GaxiosPromise[Unit] = js.native
  def batchModify(callback: BodyResponseCallback[Unit]): Unit = js.native
  def batchModify(params: ParamsDollarResourceDollarUsersDollarMessagesDollarBatchmodify): GaxiosPromise[Unit] = js.native
  def batchModify(
    params: ParamsDollarResourceDollarUsersDollarMessagesDollarBatchmodify,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def batchModify(
    params: ParamsDollarResourceDollarUsersDollarMessagesDollarBatchmodify,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def batchModify(params: ParamsDollarResourceDollarUsersDollarMessagesDollarBatchmodify, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def batchModify(
    params: ParamsDollarResourceDollarUsersDollarMessagesDollarBatchmodify,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * gmail.users.messages.delete
    * @desc Immediately and permanently deletes the specified message. This
    * operation cannot be undone. Prefer messages.trash instead.
    * @alias gmail.users.messages.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the message to delete.
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarUsersDollarMessagesDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarUsersDollarMessagesDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarUsersDollarMessagesDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarUsersDollarMessagesDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarUsersDollarMessagesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * gmail.users.messages.get
    * @desc Gets the specified message.
    * @alias gmail.users.messages.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.format The format to return the message in.
    * @param {string} params.id The ID of the message to retrieve.
    * @param {string=} params.metadataHeaders When given and format is METADATA, only include headers specified.
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Message] = js.native
  def get(callback: BodyResponseCallback[Schema$Message]): Unit = js.native
  def get(params: ParamsDollarResourceDollarUsersDollarMessagesDollarGet): GaxiosPromise[Schema$Message] = js.native
  def get(
    params: ParamsDollarResourceDollarUsersDollarMessagesDollarGet,
    callback: BodyResponseCallback[Schema$Message]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarUsersDollarMessagesDollarGet,
    options: BodyResponseCallback[Schema$Message],
    callback: BodyResponseCallback[Schema$Message]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarUsersDollarMessagesDollarGet, options: MethodOptions): GaxiosPromise[Schema$Message] = js.native
  def get(
    params: ParamsDollarResourceDollarUsersDollarMessagesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Message]
  ): Unit = js.native
  /**
    * gmail.users.messages.import
    * @desc Imports a message into only this user's mailbox, with standard email
    * delivery scanning and classification similar to receiving via SMTP. Does not
    * send a message.
    * @alias gmail.users.messages.import
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.deleted Mark the email as permanently deleted (not TRASH) and only visible in Google Vault to a Vault administrator. Only used for G Suite accounts.
    * @param {string=} params.internalDateSource Source for Gmail's internal date of the message.
    * @param {boolean=} params.neverMarkSpam Ignore the Gmail spam classifier decision and never mark this email as SPAM in the mailbox.
    * @param {boolean=} params.processForCalendar Process calendar invites in the email and add any extracted meetings to the Google Calendar for this user.
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param  {object} params.resource Media resource metadata
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def `import`(): GaxiosPromise[Schema$Message] = js.native
  def `import`(callback: BodyResponseCallback[Schema$Message]): Unit = js.native
  def `import`(params: ParamsDollarResourceDollarUsersDollarMessagesDollarImport): GaxiosPromise[Schema$Message] = js.native
  def `import`(
    params: ParamsDollarResourceDollarUsersDollarMessagesDollarImport,
    callback: BodyResponseCallback[Schema$Message]
  ): Unit = js.native
  def `import`(
    params: ParamsDollarResourceDollarUsersDollarMessagesDollarImport,
    options: BodyResponseCallback[Schema$Message],
    callback: BodyResponseCallback[Schema$Message]
  ): Unit = js.native
  def `import`(params: ParamsDollarResourceDollarUsersDollarMessagesDollarImport, options: MethodOptions): GaxiosPromise[Schema$Message] = js.native
  def `import`(
    params: ParamsDollarResourceDollarUsersDollarMessagesDollarImport,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Message]
  ): Unit = js.native
  /**
    * gmail.users.messages.insert
    * @desc Directly inserts a message into only this user's mailbox similar to IMAP APPEND, bypassing most scanning and classification. Does not send a message.
    * @alias gmail.users.messages.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.deleted Mark the email as permanently deleted (not TRASH) and only visible in Google Vault to a Vault administrator. Only used for G Suite accounts.
    * @param {string=} params.internalDateSource Source for Gmail's internal date of the message.
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param  {object} params.resource Media resource metadata
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Message] = js.native
  def insert(callback: BodyResponseCallback[Schema$Message]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarUsersDollarMessagesDollarInsert): GaxiosPromise[Schema$Message] = js.native
  def insert(
    params: ParamsDollarResourceDollarUsersDollarMessagesDollarInsert,
    callback: BodyResponseCallback[Schema$Message]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarUsersDollarMessagesDollarInsert,
    options: BodyResponseCallback[Schema$Message],
    callback: BodyResponseCallback[Schema$Message]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarUsersDollarMessagesDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Message] = js.native
  def insert(
    params: ParamsDollarResourceDollarUsersDollarMessagesDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Message]
  ): Unit = js.native
  /**
    * gmail.users.messages.list
    * @desc Lists the messages in the user's mailbox.
    * @alias gmail.users.messages.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.includeSpamTrash Include messages from SPAM and TRASH in the results.
    * @param {string=} params.labelIds Only return messages with labels that match all of the specified label IDs.
    * @param {integer=} params.maxResults Maximum number of messages to return.
    * @param {string=} params.pageToken Page token to retrieve a specific page of results in the list.
    * @param {string=} params.q Only return messages matching the specified query. Supports the same query format as the Gmail search box. For example, "from:someuser@example.com rfc822msgid:<somemsgid@example.com> is:unread". Parameter cannot be used when accessing the api using the gmail.metadata scope.
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListMessagesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListMessagesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarUsersDollarMessagesDollarList): GaxiosPromise[Schema$ListMessagesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarUsersDollarMessagesDollarList,
    callback: BodyResponseCallback[Schema$ListMessagesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarUsersDollarMessagesDollarList,
    options: BodyResponseCallback[Schema$ListMessagesResponse],
    callback: BodyResponseCallback[Schema$ListMessagesResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarUsersDollarMessagesDollarList, options: MethodOptions): GaxiosPromise[Schema$ListMessagesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarUsersDollarMessagesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListMessagesResponse]
  ): Unit = js.native
  /**
    * gmail.users.messages.modify
    * @desc Modifies the labels on the specified message.
    * @alias gmail.users.messages.modify
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the message to modify.
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {().ModifyMessageRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def modify(): GaxiosPromise[Schema$Message] = js.native
  def modify(callback: BodyResponseCallback[Schema$Message]): Unit = js.native
  def modify(params: ParamsDollarResourceDollarUsersDollarMessagesDollarModify): GaxiosPromise[Schema$Message] = js.native
  def modify(
    params: ParamsDollarResourceDollarUsersDollarMessagesDollarModify,
    callback: BodyResponseCallback[Schema$Message]
  ): Unit = js.native
  def modify(
    params: ParamsDollarResourceDollarUsersDollarMessagesDollarModify,
    options: BodyResponseCallback[Schema$Message],
    callback: BodyResponseCallback[Schema$Message]
  ): Unit = js.native
  def modify(params: ParamsDollarResourceDollarUsersDollarMessagesDollarModify, options: MethodOptions): GaxiosPromise[Schema$Message] = js.native
  def modify(
    params: ParamsDollarResourceDollarUsersDollarMessagesDollarModify,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Message]
  ): Unit = js.native
  /**
    * gmail.users.messages.send
    * @desc Sends the specified message to the recipients in the To, Cc, and
    * Bcc headers.
    * @alias gmail.users.messages.send
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
  def send(params: ParamsDollarResourceDollarUsersDollarMessagesDollarSend): GaxiosPromise[Schema$Message] = js.native
  def send(
    params: ParamsDollarResourceDollarUsersDollarMessagesDollarSend,
    callback: BodyResponseCallback[Schema$Message]
  ): Unit = js.native
  def send(
    params: ParamsDollarResourceDollarUsersDollarMessagesDollarSend,
    options: BodyResponseCallback[Schema$Message],
    callback: BodyResponseCallback[Schema$Message]
  ): Unit = js.native
  def send(params: ParamsDollarResourceDollarUsersDollarMessagesDollarSend, options: MethodOptions): GaxiosPromise[Schema$Message] = js.native
  def send(
    params: ParamsDollarResourceDollarUsersDollarMessagesDollarSend,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Message]
  ): Unit = js.native
  /**
    * gmail.users.messages.trash
    * @desc Moves the specified message to the trash.
    * @alias gmail.users.messages.trash
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the message to Trash.
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def trash(): GaxiosPromise[Schema$Message] = js.native
  def trash(callback: BodyResponseCallback[Schema$Message]): Unit = js.native
  def trash(params: ParamsDollarResourceDollarUsersDollarMessagesDollarTrash): GaxiosPromise[Schema$Message] = js.native
  def trash(
    params: ParamsDollarResourceDollarUsersDollarMessagesDollarTrash,
    callback: BodyResponseCallback[Schema$Message]
  ): Unit = js.native
  def trash(
    params: ParamsDollarResourceDollarUsersDollarMessagesDollarTrash,
    options: BodyResponseCallback[Schema$Message],
    callback: BodyResponseCallback[Schema$Message]
  ): Unit = js.native
  def trash(params: ParamsDollarResourceDollarUsersDollarMessagesDollarTrash, options: MethodOptions): GaxiosPromise[Schema$Message] = js.native
  def trash(
    params: ParamsDollarResourceDollarUsersDollarMessagesDollarTrash,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Message]
  ): Unit = js.native
  /**
    * gmail.users.messages.untrash
    * @desc Removes the specified message from the trash.
    * @alias gmail.users.messages.untrash
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the message to remove from Trash.
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def untrash(): GaxiosPromise[Schema$Message] = js.native
  def untrash(callback: BodyResponseCallback[Schema$Message]): Unit = js.native
  def untrash(params: ParamsDollarResourceDollarUsersDollarMessagesDollarUntrash): GaxiosPromise[Schema$Message] = js.native
  def untrash(
    params: ParamsDollarResourceDollarUsersDollarMessagesDollarUntrash,
    callback: BodyResponseCallback[Schema$Message]
  ): Unit = js.native
  def untrash(
    params: ParamsDollarResourceDollarUsersDollarMessagesDollarUntrash,
    options: BodyResponseCallback[Schema$Message],
    callback: BodyResponseCallback[Schema$Message]
  ): Unit = js.native
  def untrash(params: ParamsDollarResourceDollarUsersDollarMessagesDollarUntrash, options: MethodOptions): GaxiosPromise[Schema$Message] = js.native
  def untrash(
    params: ParamsDollarResourceDollarUsersDollarMessagesDollarUntrash,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Message]
  ): Unit = js.native
}

