package typings
package firefoxDashWebextDashBrowserLib.browserNs.contentScriptsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object that represents a content script registered programmatically */

trait RegisteredContentScript extends js.Object {
  /** Unregister a content script registered programmatically */
  def unregister(): stdLib.Promise[_]
}

