package typings
package firefoxDashWebextDashBrowserLib.browserNs.userScriptsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object that represents a user script registered programmatically */
trait RegisteredUserScript extends js.Object {
  /** Unregister a user script registered programmatically */
  def unregister(): js.Promise[_]
}

