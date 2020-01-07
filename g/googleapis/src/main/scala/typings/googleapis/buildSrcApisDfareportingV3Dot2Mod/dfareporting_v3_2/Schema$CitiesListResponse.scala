package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * City List Response
  */
@js.native
trait Schema$CitiesListResponse extends js.Object {
  /**
    * City collection.
    */
  var cities: js.UndefOr[js.Array[Schema$City]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#citiesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$CitiesListResponse {
  @scala.inline
  def apply(cities: js.Array[Schema$City] = null, kind: String = null): Schema$CitiesListResponse = {
    val __obj = js.Dynamic.literal()
    if (cities != null) __obj.updateDynamic("cities")(cities.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CitiesListResponse]
  }
}

