package typings.googleapis.buildSrcApisBooksV1Mod.books_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Promooffer")
@js.native
class Resource$Promooffer protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
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
  def accept(params: ParamsDollarResourceDollarPromoofferDollarAccept): GaxiosPromise[Unit] = js.native
  def accept(params: ParamsDollarResourceDollarPromoofferDollarAccept, callback: BodyResponseCallback[Unit]): Unit = js.native
  def accept(
    params: ParamsDollarResourceDollarPromoofferDollarAccept,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def accept(params: ParamsDollarResourceDollarPromoofferDollarAccept, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def accept(
    params: ParamsDollarResourceDollarPromoofferDollarAccept,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
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
  def dismiss(params: ParamsDollarResourceDollarPromoofferDollarDismiss): GaxiosPromise[Unit] = js.native
  def dismiss(params: ParamsDollarResourceDollarPromoofferDollarDismiss, callback: BodyResponseCallback[Unit]): Unit = js.native
  def dismiss(
    params: ParamsDollarResourceDollarPromoofferDollarDismiss,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def dismiss(params: ParamsDollarResourceDollarPromoofferDollarDismiss, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def dismiss(
    params: ParamsDollarResourceDollarPromoofferDollarDismiss,
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
  def get(): GaxiosPromise[Schema$Offers] = js.native
  def get(callback: BodyResponseCallback[Schema$Offers]): Unit = js.native
  def get(params: ParamsDollarResourceDollarPromoofferDollarGet): GaxiosPromise[Schema$Offers] = js.native
  def get(
    params: ParamsDollarResourceDollarPromoofferDollarGet,
    callback: BodyResponseCallback[Schema$Offers]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarPromoofferDollarGet,
    options: BodyResponseCallback[Schema$Offers],
    callback: BodyResponseCallback[Schema$Offers]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarPromoofferDollarGet, options: MethodOptions): GaxiosPromise[Schema$Offers] = js.native
  def get(
    params: ParamsDollarResourceDollarPromoofferDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Offers]
  ): Unit = js.native
}

