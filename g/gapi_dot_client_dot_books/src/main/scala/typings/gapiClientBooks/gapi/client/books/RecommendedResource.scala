package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientBooks.AnonMaxAllowedMaturityRating
import typings.gapiClientBooks.AnonRating
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecommendedResource extends js.Object {
  /** Return a list of recommended books for the current user. */
  def list(request: AnonMaxAllowedMaturityRating): Request_[Volumes]
  /** Rate a recommended book for the current user. */
  def rate(request: AnonRating): Request_[BooksVolumesRecommendedRateResponse]
}

object RecommendedResource {
  @scala.inline
  def apply(
    list: AnonMaxAllowedMaturityRating => Request_[Volumes],
    rate: AnonRating => Request_[BooksVolumesRecommendedRateResponse]
  ): RecommendedResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), rate = js.Any.fromFunction1(rate))
    __obj.asInstanceOf[RecommendedResource]
  }
}

