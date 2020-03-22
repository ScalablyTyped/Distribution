package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientBooks.AnonAltFields
import typings.gapiClientBooks.AnonDrivedocumentid
import typings.gapiClientBooks.AnonVolumeId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudloadingResource extends js.Object {
  def addBook(request: AnonDrivedocumentid): Request_[BooksCloudloadingResource]
  /** Remove the book and its contents */
  def deleteBook(request: AnonVolumeId): Request_[Unit]
  def updateBook(request: AnonAltFields): Request_[BooksCloudloadingResource]
}

object CloudloadingResource {
  @scala.inline
  def apply(
    addBook: AnonDrivedocumentid => Request_[BooksCloudloadingResource],
    deleteBook: AnonVolumeId => Request_[Unit],
    updateBook: AnonAltFields => Request_[BooksCloudloadingResource]
  ): CloudloadingResource = {
    val __obj = js.Dynamic.literal(addBook = js.Any.fromFunction1(addBook), deleteBook = js.Any.fromFunction1(deleteBook), updateBook = js.Any.fromFunction1(updateBook))
  
    __obj.asInstanceOf[CloudloadingResource]
  }
}

