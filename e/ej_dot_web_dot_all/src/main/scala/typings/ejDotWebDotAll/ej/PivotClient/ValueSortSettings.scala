package typings.ejDotWebDotAll.ej.PivotClient

import typings.ejDotWebDotAll.ej.PivotAnalysis.SortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueSortSettings extends js.Object {
  /** Allows you to set the string for separating column headers provided in the headerText property.
    */
  var headerDelimiters: js.UndefOr[String] = js.undefined
  /** Contains the header of the specific column to which value sorting is applied.
    */
  var headerText: js.UndefOr[String] = js.undefined
  /** Allows you to set the sorting order of values of the field.
    * @Default {ej.PivotAnalysis.SortOrder.Ascending}
    */
  var sortOrder: js.UndefOr[SortOrder | String] = js.undefined
}

object ValueSortSettings {
  @scala.inline
  def apply(headerDelimiters: String = null, headerText: String = null, sortOrder: SortOrder | String = null): ValueSortSettings = {
    val __obj = js.Dynamic.literal()
    if (headerDelimiters != null) __obj.updateDynamic("headerDelimiters")(headerDelimiters.asInstanceOf[js.Any])
    if (headerText != null) __obj.updateDynamic("headerText")(headerText.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueSortSettings]
  }
}

