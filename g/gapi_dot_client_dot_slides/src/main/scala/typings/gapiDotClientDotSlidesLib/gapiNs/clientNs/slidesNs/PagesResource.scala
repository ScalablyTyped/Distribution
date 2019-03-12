package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagesResource extends js.Object {
  /** Gets the latest version of the specified page in the presentation. */
  def get(request: gapiDotClientDotSlidesLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Page]
  /**
    * Generates a thumbnail of the latest version of the specified page in the
    * presentation and returns a URL to the thumbnail image.
    */
  def getThumbnail(request: gapiDotClientDotSlidesLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Thumbnail]
}

object PagesResource {
  @scala.inline
  def apply(
    get: gapiDotClientDotSlidesLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[Page],
    getThumbnail: gapiDotClientDotSlidesLib.Anon_AccesstokenAlt => gapiDotClientLib.gapiNs.clientNs.Request[Thumbnail]
  ): PagesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getThumbnail = js.Any.fromFunction1(getThumbnail))
  
    __obj.asInstanceOf[PagesResource]
  }
}

