package typings.ejWebAll.ej.Autocomplete

import typings.ejWebAll.ej.TextAlign
import typings.ejWebAll.ej.Type
import typings.ejWebAll.ej.filterType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiColumnSettingsColumn extends js.Object {
  /** Gets or sets a value that indicates to render the multicolumn with custom theme.
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Get or set a value that indicates to display the columns in the autocomplete mapping with column name of the dataSource.
    */
  var field: js.UndefOr[String] = js.undefined
  /** Specifies the search filter type. There are several types of search filter available such as â€˜startswithâ€™, â€˜containsâ€™, â€˜endswithâ€™, â€˜lessthanâ€™,
    * â€˜lessthanorequalâ€™, â€˜greaterthanâ€™, â€˜greaterthanorequalâ€™, â€˜equalâ€™, â€˜notequalâ€™.
    * @Default {ej.filterType.StartsWith}
    */
  var filterType: js.UndefOr[typings.ejWebAll.ej.filterType | String] = js.undefined
  /** Get or set a value that indicates to display the title of that particular column.
    */
  var headerText: js.UndefOr[String] = js.undefined
  /** This defines the text alignment of a particular column header cell value. See headerTextAlign
    * @Default {ej.TextAlign.Left}
    */
  var headerTextAlign: js.UndefOr[TextAlign | String] = js.undefined
  /** Gets or sets a value that indicates to align the text within the column. See textAlign
    * @Default {ej.TextAlign.Left}
    */
  var textAlign: js.UndefOr[TextAlign | String] = js.undefined
  /** Specifies the search data type. There are four types of data types available such as string, â€˜numberâ€™, â€˜booleanâ€™ and â€˜dateâ€™.
    * @Default {ej.Type.String}
    */
  var `type`: js.UndefOr[Type | String] = js.undefined
}

object MultiColumnSettingsColumn {
  @scala.inline
  def apply(
    cssClass: String = null,
    field: String = null,
    filterType: filterType | String = null,
    headerText: String = null,
    headerTextAlign: TextAlign | String = null,
    textAlign: TextAlign | String = null,
    `type`: Type | String = null
  ): MultiColumnSettingsColumn = {
    val __obj = js.Dynamic.literal()
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (filterType != null) __obj.updateDynamic("filterType")(filterType.asInstanceOf[js.Any])
    if (headerText != null) __obj.updateDynamic("headerText")(headerText.asInstanceOf[js.Any])
    if (headerTextAlign != null) __obj.updateDynamic("headerTextAlign")(headerTextAlign.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiColumnSettingsColumn]
  }
}

