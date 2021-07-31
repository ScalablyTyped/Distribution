package typings.facebookJsSdk.facebook

import typings.facebookJsSdk.facebookJsSdkStrings.delete
import typings.facebookJsSdk.facebookJsSdkStrings.get
import typings.facebookJsSdk.facebookJsSdkStrings.post
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FacebookStatic extends StObject {
  
  var AppEvents: js.Any = js.native
  
  var Canvas: js.Any = js.native
  
  var Event: FacebookStaticEvent = js.native
  
  var XFBML: js.Any = js.native
  
  def api[TResponse](path: String, callback: js.Function1[/* response */ TResponse, Unit]): Unit = js.native
  def api[TParams /* <: js.Object */, TResponse](path: String, params: TParams, callback: js.Function1[/* response */ TResponse, Unit]): Unit = js.native
  @JSName("api")
  def api_delete[TParams /* <: js.Object */, TResponse](
    path: String,
    method: delete,
    params: TParams,
    callback: js.Function1[/* response */ TResponse, Unit]
  ): Unit = js.native
  @JSName("api")
  def api_get[TParams /* <: js.Object */, TResponse](path: String, method: get, params: TParams, callback: js.Function1[/* response */ TResponse, Unit]): Unit = js.native
  @JSName("api")
  def api_post[TParams /* <: js.Object */, TResponse](
    path: String,
    method: post,
    params: TParams,
    callback: js.Function1[/* response */ TResponse, Unit]
  ): Unit = js.native
  
  /**
    * The method FB.getAuthResponse() is a synchronous accessor for the current authResponse.
    * The synchronous nature of this method is what sets it apart from the other login methods.
    *
    * This method is similar in nature to FB.getLoginStatus(), but it returns just the authResponse object.
    */
  def getAuthResponse(): AuthResponse | Null = js.native
  
  /**
    * FB.getLoginStatus() allows you to determine if a user is
    * logged in to Facebook and has authenticated your app.
    *
    * @param callback function to handle the response.
    * @param roundtrip force a roundtrip to Facebook - effectively refreshing the cache of the response object
    */
  def getLoginStatus(callback: js.Function1[/* response */ StatusResponse, Unit]): Unit = js.native
  def getLoginStatus(callback: js.Function1[/* response */ StatusResponse, Unit], roundtrip: Boolean): Unit = js.native
  
  /**
    * The method FB.init() is used to initialize and setup the SDK.
    *
    * @param params params for the initialization.
    */
  def init(params: InitParams): Unit = js.native
  
  /**
    * Use this function to log the user in
    *
    * Calling FB.login() results in the JS SDK attempting to open a popup window.
    * As such, this method should only be called after a user click event, otherwise
    * the popup window will be blocked by most browsers.
    *
    * @param options optional ILoginOption to add params such as scope.
    */
  def login(): Unit = js.native
  /**
    * Use this function to log the user in
    *
    * Calling FB.login() results in the JS SDK attempting to open a popup window.
    * As such, this method should only be called after a user click event, otherwise
    * the popup window will be blocked by most browsers.
    *
    * @param callback function to handle the response.
    * @param options optional ILoginOption to add params such as scope.
    */
  def login(callback: js.Function1[/* response */ StatusResponse, Unit]): Unit = js.native
  def login(callback: js.Function1[/* response */ StatusResponse, Unit], options: LoginOptions): Unit = js.native
  def login(options: LoginOptions): Unit = js.native
  
  /**
    * The method FB.logout() logs the user out of your site and, in some cases, Facebook.
    *
    * @param callback optional function to handle the response
    */
  def logout(): Unit = js.native
  def logout(callback: js.Function1[/* response */ StatusResponse, Unit]): Unit = js.native
  
  /**
    * @see https://developers.facebook.com/docs/pages/page-tab-dialog
    */
  def ui(params: AddPageTabDialogParams): Unit = js.native
  def ui(params: AddPageTabDialogParams, callback: js.Function1[/* response */ DialogResponse, Unit]): Unit = js.native
  /**
    * @see https://developers.facebook.com/docs/marketing-api/guides/collection#collection-ads-dialog
    */
  def ui(params: CollectionAdsDialogParams): Unit = js.native
  def ui(
    params: CollectionAdsDialogParams,
    callback: js.Function1[/* response */ CollectionAdsDialogResponse, Unit]
  ): Unit = js.native
  /**
    * @see https://developers.facebook.com/docs/marketing-api/guides/offer-ads/#create-offer-dialog
    */
  def ui(params: CreateOfferDialogParams): Unit = js.native
  def ui(
    params: CreateOfferDialogParams,
    callback: js.Function1[/* response */ CreateOfferDialogResponse, Unit]
  ): Unit = js.native
  /**
    * @see https://developers.facebook.com/docs/games/services/gamerequests
    */
  def ui(params: GameRequestDialogParams): Unit = js.native
  def ui(
    params: GameRequestDialogParams,
    callback: js.Function1[/* response */ GameRequestDialogResponse, Unit]
  ): Unit = js.native
  /**
    * @see https://developers.facebook.com/docs/marketing-api/guides/canvas-ads#canvas-ads-dialog
    */
  def ui(params: InstantExperiencesAdsDialogParams): Unit = js.native
  def ui(
    params: InstantExperiencesAdsDialogParams,
    callback: js.Function1[/* response */ InstantExperiencesAdsDialogResponse, Unit]
  ): Unit = js.native
  /**
    * @see https://developers.facebook.com/docs/marketing-api/guides/canvas-ads#canvas-preview-dialog
    */
  def ui(params: InstantExperiencesPreviewDialogParams): Unit = js.native
  def ui(
    params: InstantExperiencesPreviewDialogParams,
    callback: js.Function1[/* response */ DialogResponse, Unit]
  ): Unit = js.native
  /**
    * @see https://developers.facebook.com/docs/marketing-api/guides/lead-ads/create#create-leadgen-dialog
    */
  def ui(params: LeadgenDialogParams): Unit = js.native
  def ui(params: LeadgenDialogParams, callback: js.Function1[/* response */ LeadgenDialogResponse, Unit]): Unit = js.native
  /**
    * @see https://developers.facebook.com/docs/videos/live-video/exploring-live#golivedialog
    */
  def ui(params: LiveDialogParams): Unit = js.native
  def ui(params: LiveDialogParams, callback: js.Function1[/* response */ LiveDialogResponse, Unit]): Unit = js.native
  /**
    * @see https://developers.facebook.com/docs/payments/reference/paydialog
    */
  def ui(params: PayDialogParams): Unit = js.native
  def ui(params: PayDialogParams, callback: js.Function1[/* response */ PayDialogResponse, Unit]): Unit = js.native
  /**
    * @see https://developers.facebook.com/docs/games_payments/payments_lite
    */
  def ui(params: PaymentsLiteDialogParams): Unit = js.native
  def ui(
    params: PaymentsLiteDialogParams,
    callback: js.Function1[/* response */ PaymentsLiteDialogResponse, Unit]
  ): Unit = js.native
  /**
    * @see https://developers.facebook.com/docs/sharing/reference/send-dialog
    */
  def ui(params: SendDialogParams): Unit = js.native
  def ui(params: SendDialogParams, callback: js.Function1[/* response */ DialogResponse, Unit]): Unit = js.native
  /**
    * @see https://developers.facebook.com/docs/sharing/reference/share-dialog
    */
  def ui(params: ShareDialogParams): Unit = js.native
  def ui(params: ShareDialogParams, callback: js.Function1[/* response */ ShareDialogResponse, Unit]): Unit = js.native
  /**
    * @see https://developers.facebook.com/docs/sharing/reference/share-dialog
    */
  def ui(params: ShareOpenGraphDialogParams): Unit = js.native
  def ui(
    params: ShareOpenGraphDialogParams,
    callback: js.Function1[/* response */ ShareOpenGraphDialogResponse, Unit]
  ): Unit = js.native
}
