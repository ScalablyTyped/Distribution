package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudloadingResource extends js.Object {
  def addBook(request: gapiDotClientDotBooksLib.Anon_Name): gapiDotClientLib.gapiNs.clientNs.Request[BooksCloudloadingResource]
  /** Remove the book and its contents */
  def deleteBook(request: gapiDotClientDotBooksLib.Anon_PrettyPrintQuotaUserKey): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  def updateBook(request: gapiDotClientDotBooksLib.Anon_PrettyPrintQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[BooksCloudloadingResource]
}

