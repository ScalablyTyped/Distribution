package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientBooks.AnonAltAndroidId
import typings.gapiClientBooks.AnonAltAndroidIdDevice
import typings.gapiClientBooks.AnonAltAndroidIdDeviceFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromoofferResource extends js.Object {
  def accept(request: AnonAltAndroidId): Request_[Unit]
  def dismiss(request: AnonAltAndroidIdDevice): Request_[Unit]
  /** Returns a list of promo offers available to the user */
  def get(request: AnonAltAndroidIdDeviceFields): Request_[Offers]
}

object PromoofferResource {
  @scala.inline
  def apply(
    accept: AnonAltAndroidId => Request_[Unit],
    dismiss: AnonAltAndroidIdDevice => Request_[Unit],
    get: AnonAltAndroidIdDeviceFields => Request_[Offers]
  ): PromoofferResource = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction1(accept), dismiss = js.Any.fromFunction1(dismiss), get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[PromoofferResource]
  }
}

