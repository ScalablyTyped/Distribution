package typings.gapiClientStreetviewpublish

import typings.gapiClientStreetviewpublish.gapi.client.streetviewpublish.PhotoResource
import typings.gapiClientStreetviewpublish.gapi.client.streetviewpublish.PhotosResource
import typings.gapiClientStreetviewpublish.gapiClientStreetviewpublishStrings.streetviewpublish
import typings.gapiClientStreetviewpublish.gapiClientStreetviewpublishStrings.v1
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
      val photo: PhotoResource = js.native
      val photos: PhotosResource = js.native
      /** Load Street View Publish API v1 */
      def load(name: streetviewpublish, version: v1): js.Thenable[Unit] = js.native
      def load(name: streetviewpublish, version: v1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

