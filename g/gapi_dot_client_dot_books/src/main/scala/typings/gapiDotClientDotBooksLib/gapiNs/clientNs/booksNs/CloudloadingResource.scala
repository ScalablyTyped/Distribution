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
    addBook: js.Function1[
      gapiDotClientDotBooksLib.Anon_AltDrivedocumentid, 
      gapiDotClientLib.gapiNs.clientNs.Request[BooksCloudloadingResource]
    ],
    deleteBook: js.Function1[
      gapiDotClientDotBooksLib.Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIp, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    updateBook: js.Function1[
      gapiDotClientDotBooksLib.Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIpBoolean, 
      gapiDotClientLib.gapiNs.clientNs.Request[BooksCloudloadingResource]
    ]
  ): CloudloadingResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addBook")(addBook)
    __obj.updateDynamic("deleteBook")(deleteBook)
    __obj.updateDynamic("updateBook")(updateBook)
    __obj.asInstanceOf[CloudloadingResource]
  }
}

