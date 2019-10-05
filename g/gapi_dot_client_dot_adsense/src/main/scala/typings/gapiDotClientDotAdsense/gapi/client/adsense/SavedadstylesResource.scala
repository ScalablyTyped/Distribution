package typings.gapiDotClientDotAdsense.gapi.client.adsense

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAdsense.Anon_AccountId
import typings.gapiDotClientDotAdsense.Anon_AccountIdAltFieldsKeyOauthtoken
import typings.gapiDotClientDotAdsense.Anon_Alt
import typings.gapiDotClientDotAdsense.Anon_AltFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavedadstylesResource extends js.Object {
  /** List a specific saved ad style for the specified account. */
  def get(request: Anon_AccountIdAltFieldsKeyOauthtoken): Request[SavedAdStyle] = js.native
  /** Get a specific saved ad style from the user's account. */
  def get(request: Anon_AltFieldsKeyOauthtoken): Request[SavedAdStyle] = js.native
  /** List all saved ad styles in the specified account. */
  def list(request: Anon_AccountId): Request[SavedAdStyles] = js.native
  /** List all saved ad styles in the user's account. */
  def list(request: Anon_Alt): Request[SavedAdStyles] = js.native
}

