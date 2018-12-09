package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val bookshelves: gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs.BookshelvesResource = js.native
  val cloudloading: gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs.CloudloadingResource = js.native
  val dictionary: gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs.DictionaryResource = js.native
  val layers: gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs.LayersResource = js.native
  val myconfig: gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs.MyconfigResource = js.native
  val mylibrary: gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs.MylibraryResource = js.native
  val notification: gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs.NotificationResource = js.native
  val onboarding: gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs.OnboardingResource = js.native
  val personalizedstream: gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs.PersonalizedstreamResource = js.native
  val promooffer: gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs.PromoofferResource = js.native
  val series: gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs.SeriesResource = js.native
  val volumes: gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs.VolumesResource = js.native
  /** Load Books API v1 */
  def load(
    name: gapiDotClientDotBooksLib.gapiDotClientDotBooksLibStrings.books,
    version: gapiDotClientDotBooksLib.gapiDotClientDotBooksLibStrings.v1
  ): js.Thenable[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotBooksLib.gapiDotClientDotBooksLibStrings.books,
    version: gapiDotClientDotBooksLib.gapiDotClientDotBooksLibStrings.v1,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

