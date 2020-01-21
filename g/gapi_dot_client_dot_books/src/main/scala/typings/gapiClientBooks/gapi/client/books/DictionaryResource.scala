package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientBooks.AnonAltCpksver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DictionaryResource extends js.Object {
  /** Returns a list of offline dictionary metadata available */
  def listOfflineMetadata(request: AnonAltCpksver): Request_[Metadata]
}

object DictionaryResource {
  @scala.inline
  def apply(listOfflineMetadata: AnonAltCpksver => Request_[Metadata]): DictionaryResource = {
    val __obj = js.Dynamic.literal(listOfflineMetadata = js.Any.fromFunction1(listOfflineMetadata))
  
    __obj.asInstanceOf[DictionaryResource]
  }
}

