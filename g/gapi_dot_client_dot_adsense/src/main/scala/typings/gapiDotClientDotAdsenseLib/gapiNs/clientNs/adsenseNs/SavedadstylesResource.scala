package typings
package gapiDotClientDotAdsenseLib.gapiNs.clientNs.adsenseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavedadstylesResource extends js.Object {
  /** List a specific saved ad style for the specified account. */
  def get(request: gapiDotClientDotAdsenseLib.Anon_AccountIdAltFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[SavedAdStyle] = js.native
  /** Get a specific saved ad style from the user's account. */
  def get(request: gapiDotClientDotAdsenseLib.Anon_AltFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[SavedAdStyle] = js.native
  /** List all saved ad styles in the specified account. */
  def list(request: gapiDotClientDotAdsenseLib.Anon_AccountId): gapiDotClientLib.gapiNs.clientNs.Request[SavedAdStyles] = js.native
  /** List all saved ad styles in the user's account. */
  def list(request: gapiDotClientDotAdsenseLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[SavedAdStyles] = js.native
}

