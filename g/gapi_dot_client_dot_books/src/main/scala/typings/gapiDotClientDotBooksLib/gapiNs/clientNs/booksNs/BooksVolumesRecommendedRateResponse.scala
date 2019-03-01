package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BooksVolumesRecommendedRateResponse extends js.Object {
  var consistency_token: js.UndefOr[java.lang.String] = js.undefined
}

object BooksVolumesRecommendedRateResponse {
  @scala.inline
  def apply(consistency_token: java.lang.String = null): BooksVolumesRecommendedRateResponse = {
    val __obj = js.Dynamic.literal()
    if (consistency_token != null) __obj.updateDynamic("consistency_token")(consistency_token)
    __obj.asInstanceOf[BooksVolumesRecommendedRateResponse]
  }
}

