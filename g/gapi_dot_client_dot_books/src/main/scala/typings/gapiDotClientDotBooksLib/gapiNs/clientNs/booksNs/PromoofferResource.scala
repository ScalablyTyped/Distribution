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

