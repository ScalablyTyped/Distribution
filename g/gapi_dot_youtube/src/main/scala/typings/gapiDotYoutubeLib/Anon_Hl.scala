package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hl extends js.Object {
  /**
    * The hl parameter specifies the language that should be used for text values in the API response.
    */
  var hl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The id parameter specifies a comma-separated list of video category IDs for the resources that you are retrieving.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The part parameter specifies the videoCategory resource parts that the API response will include. Supported values are id and snippet.
    */
  var part: java.lang.String
  /**
    * The regionCode parameter instructs the API to return the list of video categories available in the specified country. The parameter value is an ISO 3166-1 alpha-2 country code.
    */
  var regionCode: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Hl {
  @scala.inline
  def apply(
    part: java.lang.String,
    hl: java.lang.String = null,
    id: java.lang.String = null,
    regionCode: java.lang.String = null
  ): Anon_Hl = {
    val __obj = js.Dynamic.literal(part = part)
    if (hl != null) __obj.updateDynamic("hl")(hl)
    if (id != null) __obj.updateDynamic("id")(id)
    if (regionCode != null) __obj.updateDynamic("regionCode")(regionCode)
    __obj.asInstanceOf[Anon_Hl]
  }
}

