package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ReadingpositionsResource extends js.Object {
  /** Retrieves my reading position information for a volume. */
  def get(request: gapiDotClientDotBooksLib.Anon_SourcePrettyPrintQuotaUserContentVersionKey): gapiDotClientLib.gapiNs.clientNs.Request[ReadingPosition]
  /** Sets my reading position information for a volume. */
  def setPosition(request: gapiDotClientDotBooksLib.Anon_SourceTimestamp): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
}

