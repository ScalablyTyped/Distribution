package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlicerSpec extends js.Object {
  /**
    * True if the filter should apply to pivot tables.
    * If not set, default to `True`.
    */
  var applyToPivotTables: js.UndefOr[Boolean] = js.native
  /** The background color of the slicer. */
  var backgroundColor: js.UndefOr[Color] = js.native
  /**
    * The background color of the slicer.
    * If background_color is also set, this field takes precedence.
    */
  var backgroundColorStyle: js.UndefOr[ColorStyle] = js.native
  /** The column index in the data table on which the filter is applied to. */
  var columnIndex: js.UndefOr[Double] = js.native
  /** The data range of the slicer. */
  var dataRange: js.UndefOr[GridRange] = js.native
  /** The filtering criteria of the slicer. */
  var filterCriteria: js.UndefOr[FilterCriteria] = js.native
  /**
    * The horizontal alignment of title in the slicer.
    * If unspecified, defaults to `LEFT`
    */
  var horizontalAlignment: js.UndefOr[String] = js.native
  /** The text format of title in the slicer. */
  var textFormat: js.UndefOr[TextFormat] = js.native
  /** The title of the slicer. */
  var title: js.UndefOr[String] = js.native
}

object SlicerSpec {
  @scala.inline
  def apply(): SlicerSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlicerSpec]
  }
  @scala.inline
  implicit class SlicerSpecOps[Self <: SlicerSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplyToPivotTables(value: Boolean): Self = this.set("applyToPivotTables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplyToPivotTables: Self = this.set("applyToPivotTables", js.undefined)
    @scala.inline
    def setBackgroundColor(value: Color): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBackgroundColorStyle(value: ColorStyle): Self = this.set("backgroundColorStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColorStyle: Self = this.set("backgroundColorStyle", js.undefined)
    @scala.inline
    def setColumnIndex(value: Double): Self = this.set("columnIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnIndex: Self = this.set("columnIndex", js.undefined)
    @scala.inline
    def setDataRange(value: GridRange): Self = this.set("dataRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataRange: Self = this.set("dataRange", js.undefined)
    @scala.inline
    def setFilterCriteria(value: FilterCriteria): Self = this.set("filterCriteria", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterCriteria: Self = this.set("filterCriteria", js.undefined)
    @scala.inline
    def setHorizontalAlignment(value: String): Self = this.set("horizontalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalAlignment: Self = this.set("horizontalAlignment", js.undefined)
    @scala.inline
    def setTextFormat(value: TextFormat): Self = this.set("textFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextFormat: Self = this.set("textFormat", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

