package typings.ejWebAll.ej.Autocomplete

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiColumnSettings extends js.Object {
  /** Field and Header Text collections can be defined and customized through columns field.
    */
  var columns: js.UndefOr[js.Array[MultiColumnSettingsColumn]] = js.undefined
  /** Allow list of data to be displayed in several columns.
    * @Default {false}
    */
  var enable: js.UndefOr[Boolean] = js.undefined
  /** This property allows user to search text for any number of fields in the suggestion list without modifying the selected text format.
    */
  var searchColumnIndices: js.UndefOr[js.Array[_]] = js.undefined
  /** Allow header text to be displayed in corresponding columns.
    * @Default {true}
    */
  var showHeader: js.UndefOr[Boolean] = js.undefined
  /** Displayed selected value and autocomplete search based on mentioned column value specified in that format.
    */
  var stringFormat: js.UndefOr[String] = js.undefined
}

object MultiColumnSettings {
  @scala.inline
  def apply(
    columns: js.Array[MultiColumnSettingsColumn] = null,
    enable: js.UndefOr[Boolean] = js.undefined,
    searchColumnIndices: js.Array[_] = null,
    showHeader: js.UndefOr[Boolean] = js.undefined,
    stringFormat: String = null
  ): MultiColumnSettings = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable.asInstanceOf[js.Any])
    if (searchColumnIndices != null) __obj.updateDynamic("searchColumnIndices")(searchColumnIndices.asInstanceOf[js.Any])
    if (!js.isUndefined(showHeader)) __obj.updateDynamic("showHeader")(showHeader.asInstanceOf[js.Any])
    if (stringFormat != null) __obj.updateDynamic("stringFormat")(stringFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiColumnSettings]
  }
}

