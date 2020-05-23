package typings.gapiClientPhotoslibrary

import typings.gapiClientPhotoslibrary.gapi.client.photoslibrary.AlbumsResource
import typings.gapiClientPhotoslibrary.gapi.client.photoslibrary.MediaItemsResource
import typings.gapiClientPhotoslibrary.gapi.client.photoslibrary.SharedAlbumsResource
import typings.gapiClientPhotoslibrary.gapiClientPhotoslibraryStrings.photoslibrary
import typings.gapiClientPhotoslibrary.gapiClientPhotoslibraryStrings.v1
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
      /** Load Photos Library API v1 */
      def load(name: photoslibrary, version: v1): js.Thenable[Unit] = js.native
      def load(name: photoslibrary, version: v1, callback: js.Function0[_]): Unit = js.native
      @js.native
      object photoslibrary extends js.Object {
        val albums: AlbumsResource = js.native
        val mediaItems: MediaItemsResource = js.native
        val sharedAlbums: SharedAlbumsResource = js.native
      }
      
    }
    
  }
  
}

