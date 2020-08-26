package typings.googleapis.booksV1Mod.booksV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Familysharing")
@js.native
class ResourceFamilysharing protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * books.familysharing.getFamilyInfo
    * @desc Gets information regarding the family that the user is part of.
    * @alias books.familysharing.getFamilyInfo
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.source String to identify the originator of this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getFamilyInfo(): GaxiosPromise[SchemaFamilyInfo] = js.native
  def getFamilyInfo(callback: BodyResponseCallback[SchemaFamilyInfo]): Unit = js.native
  def getFamilyInfo(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaFamilyInfo] = js.native
  def getFamilyInfo(params: ParamsResourceFamilysharingGetfamilyinfo): GaxiosPromise[SchemaFamilyInfo] = js.native
  def getFamilyInfo(params: ParamsResourceFamilysharingGetfamilyinfo, callback: BodyResponseCallback[SchemaFamilyInfo]): Unit = js.native
  def getFamilyInfo(
    params: ParamsResourceFamilysharingGetfamilyinfo,
    options: BodyResponseCallback[SchemaFamilyInfo],
    callback: BodyResponseCallback[SchemaFamilyInfo]
  ): Unit = js.native
  def getFamilyInfo(params: ParamsResourceFamilysharingGetfamilyinfo, options: MethodOptions): GaxiosPromise[SchemaFamilyInfo] = js.native
  def getFamilyInfo(
    params: ParamsResourceFamilysharingGetfamilyinfo,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFamilyInfo]
  ): Unit = js.native
  /**
    * books.familysharing.share
    * @desc Initiates sharing of the content with the user's family. Empty
    * response indicates success.
    * @alias books.familysharing.share
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.docId The docid to share.
    * @param {string=} params.source String to identify the originator of this request.
    * @param {string=} params.volumeId The volume to share.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def share(): GaxiosPromise[Unit] = js.native
  def share(callback: BodyResponseCallback[Unit]): Unit = js.native
  def share(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def share(params: ParamsResourceFamilysharingShare): GaxiosPromise[Unit] = js.native
  def share(params: ParamsResourceFamilysharingShare, callback: BodyResponseCallback[Unit]): Unit = js.native
  def share(
    params: ParamsResourceFamilysharingShare,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def share(params: ParamsResourceFamilysharingShare, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def share(
    params: ParamsResourceFamilysharingShare,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * books.familysharing.unshare
    * @desc Initiates revoking content that has already been shared with the
    * user's family. Empty response indicates success.
    * @alias books.familysharing.unshare
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.docId The docid to unshare.
    * @param {string=} params.source String to identify the originator of this request.
    * @param {string=} params.volumeId The volume to unshare.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def unshare(): GaxiosPromise[Unit] = js.native
  def unshare(callback: BodyResponseCallback[Unit]): Unit = js.native
  def unshare(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def unshare(params: ParamsResourceFamilysharingUnshare): GaxiosPromise[Unit] = js.native
  def unshare(params: ParamsResourceFamilysharingUnshare, callback: BodyResponseCallback[Unit]): Unit = js.native
  def unshare(
    params: ParamsResourceFamilysharingUnshare,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def unshare(params: ParamsResourceFamilysharingUnshare, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def unshare(
    params: ParamsResourceFamilysharingUnshare,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
}

