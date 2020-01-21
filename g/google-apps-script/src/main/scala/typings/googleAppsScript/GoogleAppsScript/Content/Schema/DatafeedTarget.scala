package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatafeedTarget extends js.Object {
  var country: js.UndefOr[String] = js.undefined
  var excludedDestinations: js.UndefOr[js.Array[String]] = js.undefined
  var includedDestinations: js.UndefOr[js.Array[String]] = js.undefined
  var language: js.UndefOr[String] = js.undefined
}

object DatafeedTarget {
  @scala.inline
  def apply(
    country: String = null,
    excludedDestinations: js.Array[String] = null,
    includedDestinations: js.Array[String] = null,
    language: String = null
  ): DatafeedTarget = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (excludedDestinations != null) __obj.updateDynamic("excludedDestinations")(excludedDestinations.asInstanceOf[js.Any])
    if (includedDestinations != null) __obj.updateDynamic("includedDestinations")(includedDestinations.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatafeedTarget]
  }
}

