package typings.googleapis.buildSrcApisBooksV1Mod.books_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Familysharing")
@js.native
class Resource$Familysharing protected () extends js.Object {
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
  def getFamilyInfo(): GaxiosPromise[Schema$FamilyInfo] = js.native
  def getFamilyInfo(callback: BodyResponseCallback[Schema$FamilyInfo]): Unit = js.native
  def getFamilyInfo(params: ParamsDollarResourceDollarFamilysharingDollarGetfamilyinfo): GaxiosPromise[Schema$FamilyInfo] = js.native
  def getFamilyInfo(
    params: ParamsDollarResourceDollarFamilysharingDollarGetfamilyinfo,
    callback: BodyResponseCallback[Schema$FamilyInfo]
  ): Unit = js.native
  def getFamilyInfo(
    params: ParamsDollarResourceDollarFamilysharingDollarGetfamilyinfo,
    options: BodyResponseCallback[Schema$FamilyInfo],
    callback: BodyResponseCallback[Schema$FamilyInfo]
  ): Unit = js.native
  def getFamilyInfo(params: ParamsDollarResourceDollarFamilysharingDollarGetfamilyinfo, options: MethodOptions): GaxiosPromise[Schema$FamilyInfo] = js.native
  def getFamilyInfo(
    params: ParamsDollarResourceDollarFamilysharingDollarGetfamilyinfo,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$FamilyInfo]
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
  def share(params: ParamsDollarResourceDollarFamilysharingDollarShare): GaxiosPromise[Unit] = js.native
  def share(params: ParamsDollarResourceDollarFamilysharingDollarShare, callback: BodyResponseCallback[Unit]): Unit = js.native
  def share(
    params: ParamsDollarResourceDollarFamilysharingDollarShare,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def share(params: ParamsDollarResourceDollarFamilysharingDollarShare, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def share(
    params: ParamsDollarResourceDollarFamilysharingDollarShare,
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
  def unshare(params: ParamsDollarResourceDollarFamilysharingDollarUnshare): GaxiosPromise[Unit] = js.native
  def unshare(params: ParamsDollarResourceDollarFamilysharingDollarUnshare, callback: BodyResponseCallback[Unit]): Unit = js.native
  def unshare(
    params: ParamsDollarResourceDollarFamilysharingDollarUnshare,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def unshare(params: ParamsDollarResourceDollarFamilysharingDollarUnshare, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def unshare(
    params: ParamsDollarResourceDollarFamilysharingDollarUnshare,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
}

