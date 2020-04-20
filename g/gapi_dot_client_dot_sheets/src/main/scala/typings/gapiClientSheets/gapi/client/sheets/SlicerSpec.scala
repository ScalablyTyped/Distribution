package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlicerSpec extends js.Object {
  /**
    * True if the filter should apply to pivot tables.
    * If not set, default to `True`.
    */
  var applyToPivotTables: js.UndefOr[Boolean] = js.undefined
  /** The background color of the slicer. */
  var backgroundColor: js.UndefOr[Color] = js.undefined
  /**
    * The background color of the slicer.
    * If background_color is also set, this field takes precedence.
    */
  var backgroundColorStyle: js.UndefOr[ColorStyle] = js.undefined
  /** The column index in the data table on which the filter is applied to. */
  var columnIndex: js.UndefOr[Double] = js.undefined
  /** The data range of the slicer. */
  var dataRange: js.UndefOr[GridRange] = js.undefined
  /** The filtering criteria of the slicer. */
  var filterCriteria: js.UndefOr[FilterCriteria] = js.undefined
  /**
    * The horizontal alignment of title in the slicer.
    * If unspecified, defaults to `LEFT`
    */
  var horizontalAlignment: js.UndefOr[String] = js.undefined
  /** The text format of title in the slicer. */
  var textFormat: js.UndefOr[TextFormat] = js.undefined
  /** The title of the slicer. */
  var title: js.UndefOr[String] = js.undefined
}

object SlicerSpec {
  @scala.inline
  def apply(
    applyToPivotTables: js.UndefOr[Boolean] = js.undefined,
    backgroundColor: Color = null,
    backgroundColorStyle: ColorStyle = null,
    columnIndex: Int | Double = null,
    dataRange: GridRange = null,
    filterCriteria: FilterCriteria = null,
    horizontalAlignment: String = null,
    textFormat: TextFormat = null,
    title: String = null
  ): SlicerSpec = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(applyToPivotTables)) __obj.updateDynamic("applyToPivotTables")(applyToPivotTables.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (backgroundColorStyle != null) __obj.updateDynamic("backgroundColorStyle")(backgroundColorStyle.asInstanceOf[js.Any])
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (dataRange != null) __obj.updateDynamic("dataRange")(dataRange.asInstanceOf[js.Any])
    if (filterCriteria != null) __obj.updateDynamic("filterCriteria")(filterCriteria.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (textFormat != null) __obj.updateDynamic("textFormat")(textFormat.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlicerSpec]
  }
}

