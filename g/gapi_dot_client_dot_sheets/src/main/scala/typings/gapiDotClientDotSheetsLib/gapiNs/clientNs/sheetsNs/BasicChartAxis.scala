package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicChartAxis extends js.Object {
  /**
    * The format of the title.
    * Only valid if the axis is not associated with the domain.
    */
  var format: js.UndefOr[TextFormat] = js.undefined
  /** The position of this axis. */
  var position: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The title of this axis. If set, this overrides any title inferred
    * from headers of the data.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** The axis title text position. */
  var titleTextPosition: js.UndefOr[TextPosition] = js.undefined
}

object BasicChartAxis {
  @scala.inline
  def apply(
    format: TextFormat = null,
    position: java.lang.String = null,
    title: java.lang.String = null,
    titleTextPosition: TextPosition = null
  ): BasicChartAxis = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (position != null) __obj.updateDynamic("position")(position)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleTextPosition != null) __obj.updateDynamic("titleTextPosition")(titleTextPosition)
    __obj.asInstanceOf[BasicChartAxis]
  }
}

