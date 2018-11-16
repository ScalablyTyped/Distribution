package typings
package firefoxDashWebextDashBrowserLib.browserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object extensionTypesNs {
  /** The origin of the CSS to inject, this affects the cascading order (priority) of the stylesheet. */
  type CSSOrigin = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.user | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.author
  type Date = java.lang.String | scala.Double | js.Object
  /* extensionTypes types */
  /** The format of an image. */
  type ImageFormat = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.jpeg | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.png
  /** The soonest that the JavaScript or CSS will be injected into the tab. */
  type RunAt = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.document_start | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.document_end | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.document_idle
}
