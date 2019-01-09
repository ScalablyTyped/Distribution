package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentScriptOptions extends js.Object {
  /* contentScripts functions */
  /** Register a content script programmatically */
  def register(
    contentScriptOptions: firefoxDashWebextDashBrowserLib.browserNs.contentScriptsNs.RegisteredContentScriptOptions
  ): js.Promise[
    firefoxDashWebextDashBrowserLib.browserNs.contentScriptsNs.RegisteredContentScript
  ]
}

