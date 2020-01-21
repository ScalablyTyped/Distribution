package typings.googleapis.booksV1Mod.booksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaBooksVolumesRecommendedRateResponse extends js.Object {
  var consistency_token: js.UndefOr[String] = js.native
}

object SchemaBooksVolumesRecommendedRateResponse {
  @scala.inline
  def apply(consistency_token: String = null): SchemaBooksVolumesRecommendedRateResponse = {
    val __obj = js.Dynamic.literal()
    if (consistency_token != null) __obj.updateDynamic("consistency_token")(consistency_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBooksVolumesRecommendedRateResponse]
  }
}

