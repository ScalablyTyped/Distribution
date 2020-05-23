package typings.gapiClientBooks

import typings.gapiClientBooks.gapi.client.books.BookshelvesResource
import typings.gapiClientBooks.gapi.client.books.CloudloadingResource
import typings.gapiClientBooks.gapi.client.books.DictionaryResource
import typings.gapiClientBooks.gapi.client.books.LayersResource
import typings.gapiClientBooks.gapi.client.books.MyconfigResource
import typings.gapiClientBooks.gapi.client.books.MylibraryResource
import typings.gapiClientBooks.gapi.client.books.NotificationResource
import typings.gapiClientBooks.gapi.client.books.OnboardingResource
import typings.gapiClientBooks.gapi.client.books.PersonalizedstreamResource
import typings.gapiClientBooks.gapi.client.books.PromoofferResource
import typings.gapiClientBooks.gapi.client.books.SeriesResource
import typings.gapiClientBooks.gapi.client.books.VolumesResource
import typings.gapiClientBooks.gapiClientBooksStrings.books
import typings.gapiClientBooks.gapiClientBooksStrings.v1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object gapi extends js.Object {
    @js.native
    object client extends js.Object {
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
    
  }
  
}

