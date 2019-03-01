package typings
package ejDotWebDotAllLib.ejNs.AutocompleteNs

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
  var enable: js.UndefOr[scala.Boolean] = js.undefined
  /** This property allows user to search text for any number of fields in the suggestion list without modifying the selected text format.
    */
  var searchColumnIndices: js.UndefOr[js.Array[_]] = js.undefined
  /** Allow header text to be displayed in corresponding columns.
    * @Default {true}
    */
  var showHeader: js.UndefOr[scala.Boolean] = js.undefined
  /** Displayed selected value and autocomplete search based on mentioned column value specified in that format.
    */
  var stringFormat: js.UndefOr[java.lang.String] = js.undefined
}

object MultiColumnSettings {
  @scala.inline
  def apply(
    columns: js.Array[MultiColumnSettingsColumn] = null,
    enable: js.UndefOr[scala.Boolean] = js.undefined,
    searchColumnIndices: js.Array[_] = null,
    showHeader: js.UndefOr[scala.Boolean] = js.undefined,
    stringFormat: java.lang.String = null
  ): MultiColumnSettings = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable)
    if (searchColumnIndices != null) __obj.updateDynamic("searchColumnIndices")(searchColumnIndices)
    if (!js.isUndefined(showHeader)) __obj.updateDynamic("showHeader")(showHeader)
    if (stringFormat != null) __obj.updateDynamic("stringFormat")(stringFormat)
    __obj.asInstanceOf[MultiColumnSettings]
  }
}

