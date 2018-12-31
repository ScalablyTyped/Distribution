package typings
package ejDotWebDotAllLib.ejNs.FileExplorerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterSettings extends js.Object {
  /** It allows to search the text given in search Textbox in every keyup event. When this property was set as false, searching will works only on Enter key and searchbar blur.
    * @Default {true}
    */
  var allowSearchOnTyping: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables to perform the filter operation with case sensitive.
    * @Default {false}
    */
  var caseSensitiveSearch: js.UndefOr[scala.Boolean] = js.undefined
  /** Sets the search filter type. There are several filter types available such as &quot;startswith&quot;, &quot;contains&quot;, &quot;endswith&quot;. See filterType.
    * @Default {ej.FileExplorer.filterType.Contains}
    */
  var filterType: js.UndefOr[ejDotWebDotAllLib.ejNs.FilterType | java.lang.String] = js.undefined
}

