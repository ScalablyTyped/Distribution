package typings.googleapis.buildSrcApisBooksV1Mod.books_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$BooksVolumesRecommendedRateResponse extends js.Object {
  var consistency_token: js.UndefOr[String] = js.native
}

object Schema$BooksVolumesRecommendedRateResponse {
  @scala.inline
  def apply(consistency_token: String = null): Schema$BooksVolumesRecommendedRateResponse = {
    val __obj = js.Dynamic.literal()
    if (consistency_token != null) __obj.updateDynamic("consistency_token")(consistency_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BooksVolumesRecommendedRateResponse]
  }
}

