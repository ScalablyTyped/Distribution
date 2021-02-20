package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.browser.dns.DNSRecord
import typings.firefoxWebextBrowser.browser.dns.ResolveFlags
import org.scalablytyped.runtime.StObject
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
object dns {
  
  /* dns functions */
  /** Resolves a hostname to a DNS record. */
  @JSGlobal("browser.dns.resolve")
  @js.native
  def resolve(hostname: String): js.Promise[DNSRecord] = js.native
  @JSGlobal("browser.dns.resolve")
  @js.native
  def resolve(hostname: String, flags: ResolveFlags): js.Promise[DNSRecord] = js.native
}
