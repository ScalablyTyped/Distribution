package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountriesListResponse extends js.Object {
  var countries: js.UndefOr[js.Array[Country]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object CountriesListResponse {
  @scala.inline
  def apply(countries: js.Array[Country] = null, kind: String = null): CountriesListResponse = {
    val __obj = js.Dynamic.literal()
    if (countries != null) __obj.updateDynamic("countries")(countries.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountriesListResponse]
  }
}

