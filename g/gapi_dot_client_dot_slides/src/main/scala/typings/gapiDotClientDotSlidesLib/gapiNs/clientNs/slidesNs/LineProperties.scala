package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineProperties extends js.Object {
  /** The dash style of the line. */
  var dashStyle: js.UndefOr[java.lang.String] = js.undefined
  /** The style of the arrow at the end of the line. */
  var endArrow: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The fill of the line. The default line fill matches the defaults for new
    * lines created in the Slides editor.
    */
  var lineFill: js.UndefOr[LineFill] = js.undefined
  /** The hyperlink destination of the line. If unset, there is no link. */
  var link: js.UndefOr[Link] = js.undefined
  /** The style of the arrow at the beginning of the line. */
  var startArrow: js.UndefOr[java.lang.String] = js.undefined
  /** The thickness of the line. */
  var weight: js.UndefOr[Dimension] = js.undefined
}

