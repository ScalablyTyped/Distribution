package typings.googleapis.buildSrcApisAdsensehostV4Dot1Mod.adsensehost_v4_1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adsensehost/v4.1", "adsensehost_v4_1.Resource$Associationsessions")
@js.native
class Resource$Associationsessions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adsensehost.associationsessions.start
    * @desc Create an association session for initiating an association with an
    * AdSense user.
    * @alias adsensehost.associationsessions.start
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.productCode Products to associate with the user.
    * @param {string=} params.userLocale The preferred locale of the user.
    * @param {string=} params.websiteLocale The locale of the user's hosted website.
    * @param {string} params.websiteUrl The URL of the user's hosted website.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def start(): GaxiosPromise[Schema$AssociationSession] = js.native
  def start(callback: BodyResponseCallback[Schema$AssociationSession]): Unit = js.native
  def start(params: ParamsDollarResourceDollarAssociationsessionsDollarStart): GaxiosPromise[Schema$AssociationSession] = js.native
  def start(
    params: ParamsDollarResourceDollarAssociationsessionsDollarStart,
    callback: BodyResponseCallback[Schema$AssociationSession]
  ): Unit = js.native
  def start(
    params: ParamsDollarResourceDollarAssociationsessionsDollarStart,
    options: BodyResponseCallback[Schema$AssociationSession],
    callback: BodyResponseCallback[Schema$AssociationSession]
  ): Unit = js.native
  def start(params: ParamsDollarResourceDollarAssociationsessionsDollarStart, options: MethodOptions): GaxiosPromise[Schema$AssociationSession] = js.native
  def start(
    params: ParamsDollarResourceDollarAssociationsessionsDollarStart,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AssociationSession]
  ): Unit = js.native
  /**
    * adsensehost.associationsessions.verify
    * @desc Verify an association session after the association callback
    * returns from AdSense signup.
    * @alias adsensehost.associationsessions.verify
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.token The token returned to the association callback URL.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def verify(): GaxiosPromise[Schema$AssociationSession] = js.native
  def verify(callback: BodyResponseCallback[Schema$AssociationSession]): Unit = js.native
  def verify(params: ParamsDollarResourceDollarAssociationsessionsDollarVerify): GaxiosPromise[Schema$AssociationSession] = js.native
  def verify(
    params: ParamsDollarResourceDollarAssociationsessionsDollarVerify,
    callback: BodyResponseCallback[Schema$AssociationSession]
  ): Unit = js.native
  def verify(
    params: ParamsDollarResourceDollarAssociationsessionsDollarVerify,
    options: BodyResponseCallback[Schema$AssociationSession],
    callback: BodyResponseCallback[Schema$AssociationSession]
  ): Unit = js.native
  def verify(params: ParamsDollarResourceDollarAssociationsessionsDollarVerify, options: MethodOptions): GaxiosPromise[Schema$AssociationSession] = js.native
  def verify(
    params: ParamsDollarResourceDollarAssociationsessionsDollarVerify,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AssociationSession]
  ): Unit = js.native
}

