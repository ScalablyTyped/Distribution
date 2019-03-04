package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromoofferResource extends js.Object {
  def accept(request: gapiDotClientDotBooksLib.Anon_AltAndroidId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  def dismiss(request: gapiDotClientDotBooksLib.Anon_AltAndroidIdDevice): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Returns a list of promo offers available to the user */
  def get(request: gapiDotClientDotBooksLib.Anon_AltAndroidIdDeviceFields): gapiDotClientLib.gapiNs.clientNs.Request[Offers]
}

object PromoofferResource {
  @scala.inline
  def apply(
    accept: js.Function1[
      gapiDotClientDotBooksLib.Anon_AltAndroidId, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    dismiss: js.Function1[
      gapiDotClientDotBooksLib.Anon_AltAndroidIdDevice, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotBooksLib.Anon_AltAndroidIdDeviceFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Offers]
    ]
  ): PromoofferResource = {
    val __obj = js.Dynamic.literal(accept = accept, dismiss = dismiss, get = get)
  
    __obj.asInstanceOf[PromoofferResource]
  }
}

