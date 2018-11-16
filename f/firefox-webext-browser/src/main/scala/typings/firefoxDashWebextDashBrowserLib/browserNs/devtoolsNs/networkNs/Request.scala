package typings
package firefoxDashWebextDashBrowserLib.browserNs.devtoolsNs.networkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* devtools.network types */
/**
     * Represents a network request for a document resource (script, image and so on). See HAR Specification for
     * reference.
     */

trait Request extends js.Object {
  /** Returns content of the response body. */
  def getContent(): stdLib.Promise[js.Object]
}

