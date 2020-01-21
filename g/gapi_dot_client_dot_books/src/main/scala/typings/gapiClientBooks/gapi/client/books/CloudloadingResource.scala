package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientBooks.AnonAltDrivedocumentid
import typings.gapiClientBooks.AnonAltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIp
import typings.gapiClientBooks.AnonAltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIpBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudloadingResource extends js.Object {
  def addBook(request: AnonAltDrivedocumentid): Request_[BooksCloudloadingResource]
  /** Remove the book and its contents */
  def deleteBook(request: AnonAltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIp): Request_[Unit]
  def updateBook(request: AnonAltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIpBoolean): Request_[BooksCloudloadingResource]
}

object CloudloadingResource {
  @scala.inline
  def apply(
    addBook: AnonAltDrivedocumentid => Request_[BooksCloudloadingResource],
    deleteBook: AnonAltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIp => Request_[Unit],
    updateBook: AnonAltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIpBoolean => Request_[BooksCloudloadingResource]
  ): CloudloadingResource = {
    val __obj = js.Dynamic.literal(addBook = js.Any.fromFunction1(addBook), deleteBook = js.Any.fromFunction1(deleteBook), updateBook = js.Any.fromFunction1(updateBook))
  
    __obj.asInstanceOf[CloudloadingResource]
  }
}

