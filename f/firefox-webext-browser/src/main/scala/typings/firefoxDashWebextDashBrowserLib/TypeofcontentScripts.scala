package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofcontentScripts extends js.Object {
  /* contentScripts functions */
  /** Register a content script programmatically */
  def register(
    contentScriptOptions: firefoxDashWebextDashBrowserLib.browserNs.contentScriptsNs.RegisteredContentScriptOptions
  ): js.Promise[
    firefoxDashWebextDashBrowserLib.browserNs.contentScriptsNs.RegisteredContentScript
  ]
}

object TypeofcontentScripts {
  @scala.inline
  def apply(
    register: firefoxDashWebextDashBrowserLib.browserNs.contentScriptsNs.RegisteredContentScriptOptions => js.Promise[
      firefoxDashWebextDashBrowserLib.browserNs.contentScriptsNs.RegisteredContentScript
    ]
  ): TypeofcontentScripts = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction1(register))
  
    __obj.asInstanceOf[TypeofcontentScripts]
  }
}

