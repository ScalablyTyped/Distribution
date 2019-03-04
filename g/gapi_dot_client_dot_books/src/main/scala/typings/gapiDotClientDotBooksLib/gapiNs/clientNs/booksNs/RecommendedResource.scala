package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecommendedResource extends js.Object {
  /** Return a list of recommended books for the current user. */
  def list(request: gapiDotClientDotBooksLib.Anon_AltFieldsKeyLocaleMaxAllowedMaturityRating): gapiDotClientLib.gapiNs.clientNs.Request[Volumes]
  /** Rate a recommended book for the current user. */
  def rate(request: gapiDotClientDotBooksLib.Anon_AltFieldsKeyLocaleOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[BooksVolumesRecommendedRateResponse]
}

object RecommendedResource {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotClientDotBooksLib.Anon_AltFieldsKeyLocaleMaxAllowedMaturityRating, 
      gapiDotClientLib.gapiNs.clientNs.Request[Volumes]
    ],
    rate: js.Function1[
      gapiDotClientDotBooksLib.Anon_AltFieldsKeyLocaleOauthtokenPrettyPrint, 
      gapiDotClientLib.gapiNs.clientNs.Request[BooksVolumesRecommendedRateResponse]
    ]
  ): RecommendedResource = {
    val __obj = js.Dynamic.literal(list = list, rate = rate)
  
    __obj.asInstanceOf[RecommendedResource]
  }
}

