package typings.gapiClientAdsense.gapi.client.adsense

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdsense.AnonAccountId
import typings.gapiClientAdsense.AnonAccountIdAltFieldsKeyOauthtoken
import typings.gapiClientAdsense.AnonAlt
import typings.gapiClientAdsense.AnonAltFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavedadstylesResource extends js.Object {
  /** List a specific saved ad style for the specified account. */
  def get(request: AnonAccountIdAltFieldsKeyOauthtoken): Request_[SavedAdStyle] = js.native
  /** Get a specific saved ad style from the user's account. */
  def get(request: AnonAltFieldsKeyOauthtoken): Request_[SavedAdStyle] = js.native
  /** List all saved ad styles in the specified account. */
  def list(request: AnonAccountId): Request_[SavedAdStyles] = js.native
  /** List all saved ad styles in the user's account. */
  def list(request: AnonAlt): Request_[SavedAdStyles] = js.native
}

