package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DictionaryResource extends js.Object {
  /** Returns a list of offline dictionary metadata available */
  def listOfflineMetadata(request: gapiDotClientDotBooksLib.Anon_AltCpksver): gapiDotClientLib.gapiNs.clientNs.Request[Metadata]
}

object DictionaryResource {
  @scala.inline
  def apply(
    listOfflineMetadata: gapiDotClientDotBooksLib.Anon_AltCpksver => gapiDotClientLib.gapiNs.clientNs.Request[Metadata]
  ): DictionaryResource = {
    val __obj = js.Dynamic.literal(listOfflineMetadata = js.Any.fromFunction1(listOfflineMetadata))
  
    __obj.asInstanceOf[DictionaryResource]
  }
}

