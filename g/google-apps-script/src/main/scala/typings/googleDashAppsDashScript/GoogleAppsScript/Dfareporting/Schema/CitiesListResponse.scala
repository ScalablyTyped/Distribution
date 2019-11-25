package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CitiesListResponse extends js.Object {
  var cities: js.UndefOr[js.Array[City]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object CitiesListResponse {
  @scala.inline
  def apply(cities: js.Array[City] = null, kind: String = null): CitiesListResponse = {
    val __obj = js.Dynamic.literal()
    if (cities != null) __obj.updateDynamic("cities")(cities.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[CitiesListResponse]
  }
}

