package typings.ejWebAll.ej.FileExplorer

import typings.ejWebAll.ej.FilterType_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterSettings extends js.Object {
  /** It allows to search the text given in search Textbox in every keyup event. When this property was set as false, searching will works only on Enter key and searchbar blur.
    * @Default {true}
    */
  var allowSearchOnTyping: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables to perform the filter operation with case sensitive.
    * @Default {false}
    */
  var caseSensitiveSearch: js.UndefOr[Boolean] = js.undefined
  /** Sets the search filter type. There are several filter types available such as &quot;startswith&quot;, &quot;contains&quot;, &quot;endswith&quot;. See filterType.
    * @Default {ej.FileExplorer.filterType.Contains}
    */
  var filterType: js.UndefOr[FilterType_ | String] = js.undefined
}

object FilterSettings {
  @scala.inline
  def apply(
    allowSearchOnTyping: js.UndefOr[Boolean] = js.undefined,
    caseSensitiveSearch: js.UndefOr[Boolean] = js.undefined,
    filterType: FilterType_ | String = null
  ): FilterSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowSearchOnTyping)) __obj.updateDynamic("allowSearchOnTyping")(allowSearchOnTyping.asInstanceOf[js.Any])
    if (!js.isUndefined(caseSensitiveSearch)) __obj.updateDynamic("caseSensitiveSearch")(caseSensitiveSearch.asInstanceOf[js.Any])
    if (filterType != null) __obj.updateDynamic("filterType")(filterType.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterSettings]
  }
}

