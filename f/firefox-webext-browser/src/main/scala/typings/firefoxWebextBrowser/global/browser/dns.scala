package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.browser.dns.DNSRecord
import typings.firefoxWebextBrowser.browser.dns.ResolveFlags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Asynchronous DNS API
  *
  * Permissions: `dns`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object dns {
  
  @JSGlobal("browser.dns")
  @js.native
  val ^ : js.Any = js.native
  
  /* dns functions */
  /** Resolves a hostname to a DNS record. */
  inline def resolve(hostname: String): js.Promise[DNSRecord] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DNSRecord]]
  inline def resolve(hostname: String, flags: ResolveFlags): js.Promise[DNSRecord] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DNSRecord]]
}
