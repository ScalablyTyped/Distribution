package typings
package firefoxDashWebextDashBrowserLib.browserNs.contentScriptsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.contentScripts")
@js.native
object ^ extends js.Object {
  /* contentScripts functions */
  /** Register a content script programmatically */
  def register(
    contentScriptOptions: firefoxDashWebextDashBrowserLib.browserNs.contentScriptsNs.RegisteredContentScriptOptions
  ): js.Promise[
    firefoxDashWebextDashBrowserLib.browserNs.contentScriptsNs.RegisteredContentScript
  ] = js.native
}

