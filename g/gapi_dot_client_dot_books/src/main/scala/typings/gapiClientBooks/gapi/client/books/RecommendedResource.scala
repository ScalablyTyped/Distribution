package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientBooks.AnonAltFieldsKeyLocaleMaxAllowedMaturityRating
import typings.gapiClientBooks.AnonAltFieldsKeyLocaleOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecommendedResource extends js.Object {
  /** Return a list of recommended books for the current user. */
  def list(request: AnonAltFieldsKeyLocaleMaxAllowedMaturityRating): Request_[Volumes]
  /** Rate a recommended book for the current user. */
  def rate(request: AnonAltFieldsKeyLocaleOauthtokenPrettyPrint): Request_[BooksVolumesRecommendedRateResponse]
}

object RecommendedResource {
  @scala.inline
  def apply(
    list: AnonAltFieldsKeyLocaleMaxAllowedMaturityRating => Request_[Volumes],
    rate: AnonAltFieldsKeyLocaleOauthtokenPrettyPrint => Request_[BooksVolumesRecommendedRateResponse]
  ): RecommendedResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), rate = js.Any.fromFunction1(rate))
  
    __obj.asInstanceOf[RecommendedResource]
  }
}

