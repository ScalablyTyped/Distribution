package typings.gapiClientBooks.gapi.client.books

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BooksVolumesRecommendedRateResponse extends js.Object {
  var consistency_token: js.UndefOr[String] = js.undefined
}

object BooksVolumesRecommendedRateResponse {
  @scala.inline
  def apply(consistency_token: String = null): BooksVolumesRecommendedRateResponse = {
    val __obj = js.Dynamic.literal()
    if (consistency_token != null) __obj.updateDynamic("consistency_token")(consistency_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[BooksVolumesRecommendedRateResponse]
  }
}

