package typings
package firefoxDashWebextDashBrowserLib.browserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object extensionTypesNs {
  /** The origin of the CSS to inject, this affects the cascading order (priority) of the stylesheet. */
  type CSSOrigin = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.user | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.author
  type Date = java.lang.String | scala.Double | js.Object
  type ExtensionFileOrCode = firefoxDashWebextDashBrowserLib.Anon_File | firefoxDashWebextDashBrowserLib.Anon_Code
  /* extensionTypes types */
  /** The format of an image. */
  type ImageFormat = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.jpeg | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.png
  /** A plain JSON value */
  type PlainJSONValue = scala.Null | java.lang.String | scala.Double | scala.Boolean | _PlainJSONArray | _PlainJSONObject
  /** The soonest that the JavaScript or CSS will be injected into the tab. */
  type RunAt = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.document_start | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.document_end | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.document_idle
}
