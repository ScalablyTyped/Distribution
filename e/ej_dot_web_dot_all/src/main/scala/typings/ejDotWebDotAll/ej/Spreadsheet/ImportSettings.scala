package typings.ejDotWebDotAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportSettings extends js.Object {
  /** Sets import mapper to perform import feature in Spreadsheet.
    */
  var importMapper: js.UndefOr[String] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable import while initial loading.
    * @Default {false}
    */
  var importOnLoad: js.UndefOr[Boolean] = js.undefined
  /** Sets import URL to access the online files in the Spreadsheet.
    */
  var importUrl: js.UndefOr[String] = js.undefined
  /** Gets or sets a value that indicates to define password while importing in the Spreadsheet.
    */
  var password: js.UndefOr[String] = js.undefined
}

object ImportSettings {
  @scala.inline
  def apply(
    importMapper: String = null,
    importOnLoad: js.UndefOr[Boolean] = js.undefined,
    importUrl: String = null,
    password: String = null
  ): ImportSettings = {
    val __obj = js.Dynamic.literal()
    if (importMapper != null) __obj.updateDynamic("importMapper")(importMapper)
    if (!js.isUndefined(importOnLoad)) __obj.updateDynamic("importOnLoad")(importOnLoad)
    if (importUrl != null) __obj.updateDynamic("importUrl")(importUrl)
    if (password != null) __obj.updateDynamic("password")(password)
    __obj.asInstanceOf[ImportSettings]
  }
}

