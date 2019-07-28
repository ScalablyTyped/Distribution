package typings.gapiDotClientDotStreetviewpublish.gapiNs.clientNs

import typings.gapiDotClientDotStreetviewpublish.gapiDotClientDotStreetviewpublishStrings.streetviewpublish
import typings.gapiDotClientDotStreetviewpublish.gapiDotClientDotStreetviewpublishStrings.v1
import typings.gapiDotClientDotStreetviewpublish.gapiNs.clientNs.streetviewpublishNs.PhotoResource
import typings.gapiDotClientDotStreetviewpublish.gapiNs.clientNs.streetviewpublishNs.PhotosResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val photo: PhotoResource = js.native
  val photos: PhotosResource = js.native
  /** Load Street View Publish API v1 */
  def load(name: streetviewpublish, version: v1): js.Thenable[Unit] = js.native
  def load(name: streetviewpublish, version: v1, callback: js.Function0[_]): Unit = js.native
}

