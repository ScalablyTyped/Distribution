package typings.googleapis.booksV1Mod.booksV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Promooffer")
@js.native
class ResourcePromooffer protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  /**
    * books.promooffer.accept
    * @alias books.promooffer.accept
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.androidId device android_id
    * @param {string=} params.device device device
    * @param {string=} params.manufacturer device manufacturer
    * @param {string=} params.model device model
    * @param {string=} params.offerId
    * @param {string=} params.product device product
    * @param {string=} params.serial device serial
    * @param {string=} params.volumeId Volume id to exercise the offer
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def accept(): GaxiosPromise[Unit] = js.native
  def accept(callback: BodyResponseCallback[Unit]): Unit = js.native
  def accept(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def accept(params: ParamsResourcePromoofferAccept): GaxiosPromise[Unit] = js.native
  def accept(params: ParamsResourcePromoofferAccept, callback: BodyResponseCallback[Unit]): Unit = js.native
  def accept(
    params: ParamsResourcePromoofferAccept,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def accept(params: ParamsResourcePromoofferAccept, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def accept(
    params: ParamsResourcePromoofferAccept,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * books.promooffer.dismiss
    * @alias books.promooffer.dismiss
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.androidId device android_id
    * @param {string=} params.device device device
    * @param {string=} params.manufacturer device manufacturer
    * @param {string=} params.model device model
    * @param {string=} params.offerId Offer to dimiss
    * @param {string=} params.product device product
    * @param {string=} params.serial device serial
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def dismiss(): GaxiosPromise[Unit] = js.native
  def dismiss(callback: BodyResponseCallback[Unit]): Unit = js.native
  def dismiss(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def dismiss(params: ParamsResourcePromoofferDismiss): GaxiosPromise[Unit] = js.native
  def dismiss(params: ParamsResourcePromoofferDismiss, callback: BodyResponseCallback[Unit]): Unit = js.native
  def dismiss(
    params: ParamsResourcePromoofferDismiss,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def dismiss(params: ParamsResourcePromoofferDismiss, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def dismiss(
    params: ParamsResourcePromoofferDismiss,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * books.promooffer.get
    * @desc Returns a list of promo offers available to the user
    * @alias books.promooffer.get
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.androidId device android_id
    * @param {string=} params.device device device
    * @param {string=} params.manufacturer device manufacturer
    * @param {string=} params.model device model
    * @param {string=} params.product device product
    * @param {string=} params.serial device serial
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaOffers] = js.native
  def get(callback: BodyResponseCallback[SchemaOffers]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOffers] = js.native
  def get(params: ParamsResourcePromoofferGet): GaxiosPromise[SchemaOffers] = js.native
  def get(params: ParamsResourcePromoofferGet, callback: BodyResponseCallback[SchemaOffers]): Unit = js.native
  def get(
    params: ParamsResourcePromoofferGet,
    options: BodyResponseCallback[SchemaOffers],
    callback: BodyResponseCallback[SchemaOffers]
  ): Unit = js.native
  def get(params: ParamsResourcePromoofferGet, options: MethodOptions): GaxiosPromise[SchemaOffers] = js.native
  def get(
    params: ParamsResourcePromoofferGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOffers]
  ): Unit = js.native
}
