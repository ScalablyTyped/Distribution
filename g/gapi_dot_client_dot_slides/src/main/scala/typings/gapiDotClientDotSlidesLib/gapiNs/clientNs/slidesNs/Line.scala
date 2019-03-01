package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Line extends js.Object {
  /** The properties of the line. */
  var lineProperties: js.UndefOr[LineProperties] = js.undefined
  /** The type of the line. */
  var lineType: js.UndefOr[java.lang.String] = js.undefined
}

object Line {
  @scala.inline
  def apply(lineProperties: LineProperties = null, lineType: java.lang.String = null): Line = {
    val __obj = js.Dynamic.literal()
    if (lineProperties != null) __obj.updateDynamic("lineProperties")(lineProperties)
    if (lineType != null) __obj.updateDynamic("lineType")(lineType)
    __obj.asInstanceOf[Line]
  }
}

