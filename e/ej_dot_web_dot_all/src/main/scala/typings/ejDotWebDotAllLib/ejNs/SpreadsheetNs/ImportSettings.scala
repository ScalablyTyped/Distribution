package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportSettings extends js.Object {
  /** Sets import mapper to perform import feature in Spreadsheet.
    */
  var importMapper: js.UndefOr[java.lang.String] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable import while initial loading.
    * @Default {false}
    */
  var importOnLoad: js.UndefOr[scala.Boolean] = js.undefined
  /** Sets import URL to access the online files in the Spreadsheet.
    */
  var importUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Gets or sets a value that indicates to define password while importing in the Spreadsheet.
    */
  var password: js.UndefOr[java.lang.String] = js.undefined
}

object ImportSettings {
  @scala.inline
  def apply(
    importMapper: java.lang.String = null,
    importOnLoad: js.UndefOr[scala.Boolean] = js.undefined,
    importUrl: java.lang.String = null,
    password: java.lang.String = null
  ): ImportSettings = {
    val __obj = js.Dynamic.literal()
    if (importMapper != null) __obj.updateDynamic("importMapper")(importMapper)
    if (!js.isUndefined(importOnLoad)) __obj.updateDynamic("importOnLoad")(importOnLoad)
    if (importUrl != null) __obj.updateDynamic("importUrl")(importUrl)
    if (password != null) __obj.updateDynamic("password")(password)
    __obj.asInstanceOf[ImportSettings]
  }
}

