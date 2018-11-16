package typings
package gapiDotClientDotVisionLib.gapiNs.clientNs.visionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Page extends js.Object {
  /** List of blocks of text, images etc on this page. */
  var blocks: js.UndefOr[js.Array[Block]] = js.undefined
  /** Page height in pixels. */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** Additional information detected on the page. */
  var property: js.UndefOr[TextProperty] = js.undefined
  /** Page width in pixels. */
  var width: js.UndefOr[scala.Double] = js.undefined
}

