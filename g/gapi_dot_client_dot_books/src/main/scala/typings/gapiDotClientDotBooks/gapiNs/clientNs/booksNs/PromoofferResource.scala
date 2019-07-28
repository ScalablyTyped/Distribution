package typings.gapiDotClientDotBooks.gapiNs.clientNs.booksNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotBooks.Anon_AltAndroidId
import typings.gapiDotClientDotBooks.Anon_AltAndroidIdDevice
import typings.gapiDotClientDotBooks.Anon_AltAndroidIdDeviceFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromoofferResource extends js.Object {
  def accept(request: Anon_AltAndroidId): Request[Unit]
  def dismiss(request: Anon_AltAndroidIdDevice): Request[Unit]
  /** Returns a list of promo offers available to the user */
  def get(request: Anon_AltAndroidIdDeviceFields): Request[Offers]
}

object PromoofferResource {
  @scala.inline
  def apply(
    accept: Anon_AltAndroidId => Request[Unit],
    dismiss: Anon_AltAndroidIdDevice => Request[Unit],
    get: Anon_AltAndroidIdDeviceFields => Request[Offers]
  ): PromoofferResource = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction1(accept), dismiss = js.Any.fromFunction1(dismiss), get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[PromoofferResource]
  }
}

