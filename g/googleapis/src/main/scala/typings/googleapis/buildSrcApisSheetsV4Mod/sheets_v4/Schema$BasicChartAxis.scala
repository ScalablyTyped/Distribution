package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An axis of the chart. A chart may not have more than one axis per axis
  * position.
  */
@js.native
trait Schema$BasicChartAxis extends js.Object {
  /**
    * The format of the title. Only valid if the axis is not associated with
    * the domain.
    */
  var format: js.UndefOr[Schema$TextFormat] = js.native
  /**
    * The position of this axis.
    */
  var position: js.UndefOr[String] = js.native
  /**
    * The title of this axis. If set, this overrides any title inferred from
    * headers of the data.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The axis title text position.
    */
  var titleTextPosition: js.UndefOr[Schema$TextPosition] = js.native
}

object Schema$BasicChartAxis {
  @scala.inline
  def apply(
    format: Schema$TextFormat = null,
    position: String = null,
    title: String = null,
    titleTextPosition: Schema$TextPosition = null
  ): Schema$BasicChartAxis = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleTextPosition != null) __obj.updateDynamic("titleTextPosition")(titleTextPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BasicChartAxis]
  }
}

