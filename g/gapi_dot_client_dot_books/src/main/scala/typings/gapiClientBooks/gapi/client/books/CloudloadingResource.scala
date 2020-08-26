package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request
import typings.gapiClientBooks.anon.AltFields
import typings.gapiClientBooks.anon.Drivedocumentid
import typings.gapiClientBooks.anon.VolumeId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudloadingResource extends js.Object {
  def addBook(request: Drivedocumentid): Request[BooksCloudloadingResource] = js.native
  /** Remove the book and its contents */
  def deleteBook(request: VolumeId): Request[Unit] = js.native
  def updateBook(request: AltFields): Request[BooksCloudloadingResource] = js.native
}

object CloudloadingResource {
  @scala.inline
  def apply(
    addBook: Drivedocumentid => Request[BooksCloudloadingResource],
    deleteBook: VolumeId => Request[Unit],
    updateBook: AltFields => Request[BooksCloudloadingResource]
  ): CloudloadingResource = {
    val __obj = js.Dynamic.literal(addBook = js.Any.fromFunction1(addBook), deleteBook = js.Any.fromFunction1(deleteBook), updateBook = js.Any.fromFunction1(updateBook))
    __obj.asInstanceOf[CloudloadingResource]
  }
  @scala.inline
  implicit class CloudloadingResourceOps[Self <: CloudloadingResource] (val x: Self) extends AnyVal {
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
    def setAddBook(value: Drivedocumentid => Request[BooksCloudloadingResource]): Self = this.set("addBook", js.Any.fromFunction1(value))
    @scala.inline
    def setDeleteBook(value: VolumeId => Request[Unit]): Self = this.set("deleteBook", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdateBook(value: AltFields => Request[BooksCloudloadingResource]): Self = this.set("updateBook", js.Any.fromFunction1(value))
  }
  
}

