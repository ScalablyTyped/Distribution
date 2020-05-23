package typings.gapiClientUrlshortener

import typings.gapiClientUrlshortener.gapi.client.urlshortener.UrlResource
import typings.gapiClientUrlshortener.gapiClientUrlshortenerStrings.urlshortener
import typings.gapiClientUrlshortener.gapiClientUrlshortenerStrings.v1
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
      val url: UrlResource = js.native
      /** Load URL Shortener API v1 */
      def load(name: urlshortener, version: v1): js.Thenable[Unit] = js.native
      def load(name: urlshortener, version: v1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

