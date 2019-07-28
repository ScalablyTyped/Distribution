package typings.gapiDotClientDotBooks.gapiNs.clientNs.booksNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotBooks.Anon_AltFieldsKeyLocaleMaxAllowedMaturityRating
import typings.gapiDotClientDotBooks.Anon_AltFieldsKeyLocaleOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecommendedResource extends js.Object {
  /** Return a list of recommended books for the current user. */
  def list(request: Anon_AltFieldsKeyLocaleMaxAllowedMaturityRating): Request[Volumes]
  /** Rate a recommended book for the current user. */
  def rate(request: Anon_AltFieldsKeyLocaleOauthtokenPrettyPrint): Request[BooksVolumesRecommendedRateResponse]
}

object RecommendedResource {
  @scala.inline
  def apply(
    list: Anon_AltFieldsKeyLocaleMaxAllowedMaturityRating => Request[Volumes],
    rate: Anon_AltFieldsKeyLocaleOauthtokenPrettyPrint => Request[BooksVolumesRecommendedRateResponse]
  ): RecommendedResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), rate = js.Any.fromFunction1(rate))
  
    __obj.asInstanceOf[RecommendedResource]
  }
}

