package typings.gapiDotClientDotBooks.gapiNs.clientNs.booksNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotBooks.Anon_AltDrivedocumentid
import typings.gapiDotClientDotBooks.Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIp
import typings.gapiDotClientDotBooks.Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIpBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudloadingResource extends js.Object {
  def addBook(request: Anon_AltDrivedocumentid): Request[BooksCloudloadingResource]
  /** Remove the book and its contents */
  def deleteBook(request: Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIp): Request[Unit]
  def updateBook(request: Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIpBoolean): Request[BooksCloudloadingResource]
}

object CloudloadingResource {
  @scala.inline
  def apply(
    addBook: Anon_AltDrivedocumentid => Request[BooksCloudloadingResource],
    deleteBook: Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIp => Request[Unit],
    updateBook: Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIpBoolean => Request[BooksCloudloadingResource]
  ): CloudloadingResource = {
    val __obj = js.Dynamic.literal(addBook = js.Any.fromFunction1(addBook), deleteBook = js.Any.fromFunction1(deleteBook), updateBook = js.Any.fromFunction1(updateBook))
  
    __obj.asInstanceOf[CloudloadingResource]
  }
}

