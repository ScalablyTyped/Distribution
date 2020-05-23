package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request
import typings.gapiClientBooks.anon.AltFields
import typings.gapiClientBooks.anon.Drivedocumentid
import typings.gapiClientBooks.anon.VolumeId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudloadingResource extends js.Object {
  def addBook(request: Drivedocumentid): Request[BooksCloudloadingResource]
  /** Remove the book and its contents */
  def deleteBook(request: VolumeId): Request[Unit]
  def updateBook(request: AltFields): Request[BooksCloudloadingResource]
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
}

