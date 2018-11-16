package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TextContent extends js.Object {
  /** The bulleted lists contained in this text, keyed by list ID. */
  var lists: js.UndefOr[stdLib.Record[java.lang.String, List]] = js.undefined
  /**
               * The text contents broken down into its component parts, including styling
               * information. This property is read-only.
               */
  var textElements: js.UndefOr[js.Array[TextElement]] = js.undefined
}

