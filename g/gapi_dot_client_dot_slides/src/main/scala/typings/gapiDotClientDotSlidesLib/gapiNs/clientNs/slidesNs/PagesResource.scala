package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagesResource extends js.Object {
  /** Gets the latest version of the specified page in the presentation. */
  def get(request: gapiDotClientDotSlidesLib.Anon_AccesstokenPrettyPrintBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[Page]
  /**
    * Generates a thumbnail of the latest version of the specified page in the
    * presentation and returns a URL to the thumbnail image.
    */
  def getThumbnail(
    request: gapiDotClientDotSlidesLib.Anon_AccesstokenPrettyPrintBearertokenThumbnailPropertiesmimeType
  ): gapiDotClientLib.gapiNs.clientNs.Request[Thumbnail]
}

