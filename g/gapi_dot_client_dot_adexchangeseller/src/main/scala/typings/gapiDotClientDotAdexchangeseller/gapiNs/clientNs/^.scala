package typings.gapiDotClientDotAdexchangeseller.gapiNs.clientNs

import typings.gapiDotClientDotAdexchangeseller.gapiDotClientDotAdexchangesellerStrings.adexchangeseller
import typings.gapiDotClientDotAdexchangeseller.gapiDotClientDotAdexchangesellerStrings.v2DOT0
import typings.gapiDotClientDotAdexchangeseller.gapiNs.clientNs.adexchangesellerNs.AccountsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val accounts: AccountsResource = js.native
  /** Load Ad Exchange Seller API v2.0 */
  def load(name: adexchangeseller, version: v2DOT0): js.Thenable[Unit] = js.native
  def load(name: adexchangeseller, version: v2DOT0, callback: js.Function0[_]): Unit = js.native
}

