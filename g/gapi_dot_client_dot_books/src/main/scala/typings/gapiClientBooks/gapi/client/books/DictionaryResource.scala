package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request
import typings.gapiClientBooks.anon.Cpksver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DictionaryResource extends js.Object {
  /** Returns a list of offline dictionary metadata available */
  def listOfflineMetadata(request: Cpksver): Request[Metadata] = js.native
}

object DictionaryResource {
  @scala.inline
  def apply(listOfflineMetadata: Cpksver => Request[Metadata]): DictionaryResource = {
    val __obj = js.Dynamic.literal(listOfflineMetadata = js.Any.fromFunction1(listOfflineMetadata))
    __obj.asInstanceOf[DictionaryResource]
  }
  @scala.inline
  implicit class DictionaryResourceOps[Self <: DictionaryResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setListOfflineMetadata(value: Cpksver => Request[Metadata]): Self = this.set("listOfflineMetadata", js.Any.fromFunction1(value))
  }
  
}

