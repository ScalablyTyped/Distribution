package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request
import typings.gapiClientBooks.anon.MaxAllowedMaturityRating
import typings.gapiClientBooks.anon.Rating
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecommendedResource extends js.Object {
  /** Return a list of recommended books for the current user. */
  def list(request: MaxAllowedMaturityRating): Request[Volumes]
  /** Rate a recommended book for the current user. */
  def rate(request: Rating): Request[BooksVolumesRecommendedRateResponse]
}

object RecommendedResource {
  @scala.inline
  def apply(
    list: MaxAllowedMaturityRating => Request[Volumes],
    rate: Rating => Request[BooksVolumesRecommendedRateResponse]
  ): RecommendedResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), rate = js.Any.fromFunction1(rate))
    __obj.asInstanceOf[RecommendedResource]
  }
}

