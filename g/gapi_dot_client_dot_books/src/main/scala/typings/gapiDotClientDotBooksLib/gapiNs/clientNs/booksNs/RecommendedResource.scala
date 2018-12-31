package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecommendedResource extends js.Object {
  /** Return a list of recommended books for the current user. */
  def list(request: gapiDotClientDotBooksLib.Anon_SourcePrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Volumes]
  /** Rate a recommended book for the current user. */
  def rate(request: gapiDotClientDotBooksLib.Anon_SourcePrettyPrintQuotaUserLocaleKey): gapiDotClientLib.gapiNs.clientNs.Request[BooksVolumesRecommendedRateResponse]
}

