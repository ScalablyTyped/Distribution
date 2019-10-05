package typings.gapiDotClientDotBooks.gapi.client.books

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotBooks.Anon_AltCpksver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DictionaryResource extends js.Object {
  /** Returns a list of offline dictionary metadata available */
  def listOfflineMetadata(request: Anon_AltCpksver): Request[Metadata]
}

object DictionaryResource {
  @scala.inline
  def apply(listOfflineMetadata: Anon_AltCpksver => Request[Metadata]): DictionaryResource = {
    val __obj = js.Dynamic.literal(listOfflineMetadata = js.Any.fromFunction1(listOfflineMetadata))
  
    __obj.asInstanceOf[DictionaryResource]
  }
}

