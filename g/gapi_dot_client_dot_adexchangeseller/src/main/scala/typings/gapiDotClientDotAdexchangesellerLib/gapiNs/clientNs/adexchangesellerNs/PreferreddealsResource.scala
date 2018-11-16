package typings
package gapiDotClientDotAdexchangesellerLib.gapiNs.clientNs.adexchangesellerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PreferreddealsResource extends js.Object {
  /** Get information about the selected Ad Exchange Preferred Deal. */
  def get(request: gapiDotClientDotAdexchangesellerLib.Anon_PrettyPrintAccountIdQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[PreferredDeal]
  /** List the preferred deals for this Ad Exchange account. */
  def list(request: gapiDotClientDotAdexchangesellerLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[PreferredDeals]
}

