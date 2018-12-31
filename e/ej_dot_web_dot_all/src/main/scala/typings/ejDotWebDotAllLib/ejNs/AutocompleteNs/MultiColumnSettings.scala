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

