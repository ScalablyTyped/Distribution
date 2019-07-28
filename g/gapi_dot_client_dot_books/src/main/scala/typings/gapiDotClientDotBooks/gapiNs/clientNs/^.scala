package typings.gapiDotClientDotBooks.gapiNs.clientNs

import typings.gapiDotClientDotBooks.gapiDotClientDotBooksStrings.books
import typings.gapiDotClientDotBooks.gapiDotClientDotBooksStrings.v1
import typings.gapiDotClientDotBooks.gapiNs.clientNs.booksNs.BookshelvesResource
import typings.gapiDotClientDotBooks.gapiNs.clientNs.booksNs.CloudloadingResource
import typings.gapiDotClientDotBooks.gapiNs.clientNs.booksNs.DictionaryResource
import typings.gapiDotClientDotBooks.gapiNs.clientNs.booksNs.LayersResource
import typings.gapiDotClientDotBooks.gapiNs.clientNs.booksNs.MyconfigResource
import typings.gapiDotClientDotBooks.gapiNs.clientNs.booksNs.MylibraryResource
import typings.gapiDotClientDotBooks.gapiNs.clientNs.booksNs.NotificationResource
import typings.gapiDotClientDotBooks.gapiNs.clientNs.booksNs.OnboardingResource
import typings.gapiDotClientDotBooks.gapiNs.clientNs.booksNs.PersonalizedstreamResource
import typings.gapiDotClientDotBooks.gapiNs.clientNs.booksNs.PromoofferResource
import typings.gapiDotClientDotBooks.gapiNs.clientNs.booksNs.SeriesResource
import typings.gapiDotClientDotBooks.gapiNs.clientNs.booksNs.VolumesResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val bookshelves: BookshelvesResource = js.native
  val cloudloading: CloudloadingResource = js.native
  val dictionary: DictionaryResource = js.native
  val layers: LayersResource = js.native
  val myconfig: MyconfigResource = js.native
  val mylibrary: MylibraryResource = js.native
  val notification: NotificationResource = js.native
  val onboarding: OnboardingResource = js.native
  val personalizedstream: PersonalizedstreamResource = js.native
  val promooffer: PromoofferResource = js.native
  val series: SeriesResource = js.native
  val volumes: VolumesResource = js.native
  /** Load Books API v1 */
  def load(name: books, version: v1): js.Thenable[Unit] = js.native
  def load(name: books, version: v1, callback: js.Function0[_]): Unit = js.native
}

