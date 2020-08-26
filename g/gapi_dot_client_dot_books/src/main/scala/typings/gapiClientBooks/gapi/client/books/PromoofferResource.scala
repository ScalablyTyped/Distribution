package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request
import typings.gapiClientBooks.anon.AndroidId
import typings.gapiClientBooks.anon.Device
import typings.gapiClientBooks.anon.Manufacturer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromoofferResource extends js.Object {
  def accept(request: AndroidId): Request[Unit] = js.native
  def dismiss(request: Device): Request[Unit] = js.native
  /** Returns a list of promo offers available to the user */
  def get(request: Manufacturer): Request[Offers] = js.native
}

object PromoofferResource {
  @scala.inline
  def apply(
    accept: AndroidId => Request[Unit],
    dismiss: Device => Request[Unit],
    get: Manufacturer => Request[Offers]
  ): PromoofferResource = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction1(accept), dismiss = js.Any.fromFunction1(dismiss), get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[PromoofferResource]
  }
  @scala.inline
  implicit class PromoofferResourceOps[Self <: PromoofferResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccept(value: AndroidId => Request[Unit]): Self = this.set("accept", js.Any.fromFunction1(value))
    @scala.inline
    def setDismiss(value: Device => Request[Unit]): Self = this.set("dismiss", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Manufacturer => Request[Offers]): Self = this.set("get", js.Any.fromFunction1(value))
  }
  
}

