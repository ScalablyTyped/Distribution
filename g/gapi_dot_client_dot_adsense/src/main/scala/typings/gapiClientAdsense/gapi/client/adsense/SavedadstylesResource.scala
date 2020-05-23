package typings.gapiClientAdsense.gapi.client.adsense

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdsense.anon.AccountId
import typings.gapiClientAdsense.anon.Alt
import typings.gapiClientAdsense.anon.KeyOauthtoken
import typings.gapiClientAdsense.anon.SavedAdStyleId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavedadstylesResource extends js.Object {
  /** Get a specific saved ad style from the user's account. */
  def get(request: KeyOauthtoken): Request[SavedAdStyle] = js.native
  /** List a specific saved ad style for the specified account. */
  def get(request: SavedAdStyleId): Request[SavedAdStyle] = js.native
  /** List all saved ad styles in the specified account. */
  def list(request: AccountId): Request[SavedAdStyles] = js.native
  /** List all saved ad styles in the user's account. */
  def list(request: Alt): Request[SavedAdStyles] = js.native
}

