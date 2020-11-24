package typings.googleapis.booksV1Mod.booksV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Mylibrary$Readingpositions")
@js.native
class ResourceMylibraryReadingpositions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * books.mylibrary.readingpositions.get
    * @desc Retrieves my reading position information for a volume.
    * @alias books.mylibrary.readingpositions.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.contentVersion Volume content version for which this reading position is requested.
    * @param {string=} params.source String to identify the originator of this request.
    * @param {string} params.volumeId ID of volume for which to retrieve a reading position.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaReadingPosition] = js.native
  def get(callback: BodyResponseCallback[SchemaReadingPosition]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaReadingPosition] = js.native
  def get(params: ParamsResourceMylibraryReadingpositionsGet): GaxiosPromise[SchemaReadingPosition] = js.native
  def get(
    params: ParamsResourceMylibraryReadingpositionsGet,
    callback: BodyResponseCallback[SchemaReadingPosition]
  ): Unit = js.native
  def get(
    params: ParamsResourceMylibraryReadingpositionsGet,
    options: BodyResponseCallback[SchemaReadingPosition],
    callback: BodyResponseCallback[SchemaReadingPosition]
  ): Unit = js.native
  def get(params: ParamsResourceMylibraryReadingpositionsGet, options: MethodOptions): GaxiosPromise[SchemaReadingPosition] = js.native
  def get(
    params: ParamsResourceMylibraryReadingpositionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReadingPosition]
  ): Unit = js.native
  
  /**
    * books.mylibrary.readingpositions.setPosition
    * @desc Sets my reading position information for a volume.
    * @alias books.mylibrary.readingpositions.setPosition
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.action Action that caused this reading position to be set.
    * @param {string=} params.contentVersion Volume content version for which this reading position applies.
    * @param {string=} params.deviceCookie Random persistent device cookie optional on set position.
    * @param {string} params.position Position string for the new volume reading position.
    * @param {string=} params.source String to identify the originator of this request.
    * @param {string} params.timestamp RFC 3339 UTC format timestamp associated with this reading position.
    * @param {string} params.volumeId ID of volume for which to update the reading position.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setPosition(): GaxiosPromise[Unit] = js.native
  def setPosition(callback: BodyResponseCallback[Unit]): Unit = js.native
  def setPosition(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def setPosition(params: ParamsResourceMylibraryReadingpositionsSetposition): GaxiosPromise[Unit] = js.native
  def setPosition(params: ParamsResourceMylibraryReadingpositionsSetposition, callback: BodyResponseCallback[Unit]): Unit = js.native
  def setPosition(
    params: ParamsResourceMylibraryReadingpositionsSetposition,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def setPosition(params: ParamsResourceMylibraryReadingpositionsSetposition, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def setPosition(
    params: ParamsResourceMylibraryReadingpositionsSetposition,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
}
