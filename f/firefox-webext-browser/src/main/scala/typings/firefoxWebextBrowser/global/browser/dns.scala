package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.browser.dns.DNSRecord
import typings.firefoxWebextBrowser.browser.dns.ResolveFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Asynchronous DNS API
  *
  * Permissions: `dns`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
@JSGlobal("browser.dns")
@js.native
object dns extends js.Object {
  
  /* dns functions */
  /** Resolves a hostname to a DNS record. */
  def resolve(hostname: String): js.Promise[DNSRecord] = js.native
  def resolve(hostname: String, flags: ResolveFlags): js.Promise[DNSRecord] = js.native
}
