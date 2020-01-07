package typings.googleapis.buildSrcApisGmailV1Mod.gmail_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/gmail/v1", "gmail_v1.Resource$Users$Messages$Attachments")
@js.native
class ResourceDollarUsersDollarMessagesDollarAttachments protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * gmail.users.messages.attachments.get
    * @desc Gets the specified message attachment.
    * @alias gmail.users.messages.attachments.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the attachment.
    * @param {string} params.messageId The ID of the message containing the attachment.
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$MessagePartBody] = js.native
  def get(callback: BodyResponseCallback[Schema$MessagePartBody]): Unit = js.native
  def get(params: ParamsDollarResourceDollarUsersDollarMessagesDollarAttachmentsDollarGet): GaxiosPromise[Schema$MessagePartBody] = js.native
  def get(
    params: ParamsDollarResourceDollarUsersDollarMessagesDollarAttachmentsDollarGet,
    callback: BodyResponseCallback[Schema$MessagePartBody]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarUsersDollarMessagesDollarAttachmentsDollarGet,
    options: BodyResponseCallback[Schema$MessagePartBody],
    callback: BodyResponseCallback[Schema$MessagePartBody]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarUsersDollarMessagesDollarAttachmentsDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$MessagePartBody] = js.native
  def get(
    params: ParamsDollarResourceDollarUsersDollarMessagesDollarAttachmentsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$MessagePartBody]
  ): Unit = js.native
}

