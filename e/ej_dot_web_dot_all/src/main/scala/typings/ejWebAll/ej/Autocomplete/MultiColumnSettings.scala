package typings.ejWebAll.ej.Autocomplete

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiColumnSettings extends js.Object {
  /** Field and Header Text collections can be defined and customized through columns field.
    */
  var columns: js.UndefOr[js.Array[MultiColumnSettingsColumn]] = js.native
  /** Allow list of data to be displayed in several columns.
    * @Default {false}
    */
  var enable: js.UndefOr[Boolean] = js.native
  /** This property allows user to search text for any number of fields in the suggestion list without modifying the selected text format.
    */
  var searchColumnIndices: js.UndefOr[js.Array[_]] = js.native
  /** Allow header text to be displayed in corresponding columns.
    * @Default {true}
    */
  var showHeader: js.UndefOr[Boolean] = js.native
  /** Displayed selected value and autocomplete search based on mentioned column value specified in that format.
    */
  var stringFormat: js.UndefOr[String] = js.native
}

object MultiColumnSettings {
  @scala.inline
  def apply(): MultiColumnSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiColumnSettings]
  }
  @scala.inline
  implicit class MultiColumnSettingsOps[Self <: MultiColumnSettings] (val x: Self) extends AnyVal {
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
    def setColumnsVarargs(value: MultiColumnSettingsColumn*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[MultiColumnSettingsColumn]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    @scala.inline
    def setSearchColumnIndicesVarargs(value: js.Any*): Self = this.set("searchColumnIndices", js.Array(value :_*))
    @scala.inline
    def setSearchColumnIndices(value: js.Array[_]): Self = this.set("searchColumnIndices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchColumnIndices: Self = this.set("searchColumnIndices", js.undefined)
    @scala.inline
    def setShowHeader(value: Boolean): Self = this.set("showHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowHeader: Self = this.set("showHeader", js.undefined)
    @scala.inline
    def setStringFormat(value: String): Self = this.set("stringFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStringFormat: Self = this.set("stringFormat", js.undefined)
  }
  
}

