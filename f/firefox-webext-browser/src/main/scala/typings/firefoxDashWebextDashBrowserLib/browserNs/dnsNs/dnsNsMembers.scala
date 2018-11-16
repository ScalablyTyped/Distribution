package typings
package firefoxDashWebextDashBrowserLib.browserNs.dnsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.dns")
@js.native
object dnsNsMembers extends js.Object {
  /* dns functions */
  /** Resolves a hostname to a DNS record. */
  def resolve(hostname: java.lang.String): stdLib.Promise[DNSRecord] = js.native
  /* dns functions */
  /** Resolves a hostname to a DNS record. */
  def resolve(hostname: java.lang.String, flags: ResolveFlags): stdLib.Promise[DNSRecord] = js.native
}

