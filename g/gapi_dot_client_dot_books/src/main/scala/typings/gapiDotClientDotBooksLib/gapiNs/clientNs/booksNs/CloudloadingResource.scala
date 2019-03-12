package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudloadingResource extends js.Object {
  def addBook(request: gapiDotClientDotBooksLib.Anon_AltDrivedocumentid): gapiDotClientLib.gapiNs.clientNs.Request[BooksCloudloadingResource]
  /** Remove the book and its contents */
  def deleteBook(request: gapiDotClientDotBooksLib.Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIp): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  def updateBook(request: gapiDotClientDotBooksLib.Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIpBoolean): gapiDotClientLib.gapiNs.clientNs.Request[BooksCloudloadingResource]
}

object CloudloadingResource {
  @scala.inline
  def apply(
    addBook: gapiDotClientDotBooksLib.Anon_AltDrivedocumentid => gapiDotClientLib.gapiNs.clientNs.Request[BooksCloudloadingResource],
    deleteBook: gapiDotClientDotBooksLib.Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIp => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    updateBook: gapiDotClientDotBooksLib.Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIpBoolean => gapiDotClientLib.gapiNs.clientNs.Request[BooksCloudloadingResource]
  ): CloudloadingResource = {
    val __obj = js.Dynamic.literal(addBook = js.Any.fromFunction1(addBook), deleteBook = js.Any.fromFunction1(deleteBook), updateBook = js.Any.fromFunction1(updateBook))
  
    __obj.asInstanceOf[CloudloadingResource]
  }
}

