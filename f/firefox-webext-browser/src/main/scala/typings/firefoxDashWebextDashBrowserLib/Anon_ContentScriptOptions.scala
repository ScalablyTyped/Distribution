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

object Anon_ContentScriptOptions {
  @scala.inline
  def apply(
    register: js.Function1[
      firefoxDashWebextDashBrowserLib.browserNs.contentScriptsNs.RegisteredContentScriptOptions, 
      js.Promise[
        firefoxDashWebextDashBrowserLib.browserNs.contentScriptsNs.RegisteredContentScript
      ]
    ]
  ): Anon_ContentScriptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("register")(register)
    __obj.asInstanceOf[Anon_ContentScriptOptions]
  }
}

