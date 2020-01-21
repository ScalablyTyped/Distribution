package typings.firefoxWebextBrowser.browser.dns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.dns.resolve")
@js.native
object resolve extends js.Object {
  /* dns functions */
  /** Resolves a hostname to a DNS record. */
  def apply(hostname: String): js.Promise[DNSRecord] = js.native
  def apply(hostname: String, flags: ResolveFlags): js.Promise[DNSRecord] = js.native
}

