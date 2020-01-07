package typings.googleapis.buildSrcApisMirrorV1Mod.mirror_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/mirror/v1", "mirror_v1.Resource$Timeline$Attachments")
@js.native
class ResourceDollarTimelineDollarAttachments protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * mirror.timeline.attachments.delete
    * @desc Deletes an attachment from a timeline item.
    * @alias mirror.timeline.attachments.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.attachmentId The ID of the attachment.
    * @param {string} params.itemId The ID of the timeline item the attachment belongs to.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarTimelineDollarAttachmentsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarTimelineDollarAttachmentsDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarTimelineDollarAttachmentsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarTimelineDollarAttachmentsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarTimelineDollarAttachmentsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * mirror.timeline.attachments.get
    * @desc Retrieves an attachment on a timeline item by item ID and
    * attachment ID.
    * @alias mirror.timeline.attachments.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.attachmentId The ID of the attachment.
    * @param {string} params.itemId The ID of the timeline item the attachment belongs to.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Attachment] = js.native
  def get(callback: BodyResponseCallback[Schema$Attachment]): Unit = js.native
  def get(params: ParamsDollarResourceDollarTimelineDollarAttachmentsDollarGet): GaxiosPromise[Schema$Attachment] = js.native
  def get(
    params: ParamsDollarResourceDollarTimelineDollarAttachmentsDollarGet,
    callback: BodyResponseCallback[Schema$Attachment]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarTimelineDollarAttachmentsDollarGet,
    options: BodyResponseCallback[Schema$Attachment],
    callback: BodyResponseCallback[Schema$Attachment]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarTimelineDollarAttachmentsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Attachment] = js.native
  def get(
    params: ParamsDollarResourceDollarTimelineDollarAttachmentsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Attachment]
  ): Unit = js.native
  /**
    * mirror.timeline.attachments.insert
    * @desc Adds a new attachment to a timeline item.
    * @alias mirror.timeline.attachments.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.itemId The ID of the timeline item the attachment belongs to.
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Attachment] = js.native
  def insert(callback: BodyResponseCallback[Schema$Attachment]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarTimelineDollarAttachmentsDollarInsert): GaxiosPromise[Schema$Attachment] = js.native
  def insert(
    params: ParamsDollarResourceDollarTimelineDollarAttachmentsDollarInsert,
    callback: BodyResponseCallback[Schema$Attachment]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarTimelineDollarAttachmentsDollarInsert,
    options: BodyResponseCallback[Schema$Attachment],
    callback: BodyResponseCallback[Schema$Attachment]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarTimelineDollarAttachmentsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Attachment] = js.native
  def insert(
    params: ParamsDollarResourceDollarTimelineDollarAttachmentsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Attachment]
  ): Unit = js.native
  /**
    * mirror.timeline.attachments.list
    * @desc Returns a list of attachments for a timeline item.
    * @alias mirror.timeline.attachments.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.itemId The ID of the timeline item whose attachments should be listed.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$AttachmentsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$AttachmentsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarTimelineDollarAttachmentsDollarList): GaxiosPromise[Schema$AttachmentsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarTimelineDollarAttachmentsDollarList,
    callback: BodyResponseCallback[Schema$AttachmentsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarTimelineDollarAttachmentsDollarList,
    options: BodyResponseCallback[Schema$AttachmentsListResponse],
    callback: BodyResponseCallback[Schema$AttachmentsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarTimelineDollarAttachmentsDollarList, options: MethodOptions): GaxiosPromise[Schema$AttachmentsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarTimelineDollarAttachmentsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AttachmentsListResponse]
  ): Unit = js.native
}

