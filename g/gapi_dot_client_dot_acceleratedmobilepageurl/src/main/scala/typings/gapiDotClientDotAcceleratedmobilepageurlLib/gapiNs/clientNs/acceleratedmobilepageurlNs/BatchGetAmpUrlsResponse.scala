package typings
package gapiDotClientDotAcceleratedmobilepageurlLib.gapiNs.clientNs.acceleratedmobilepageurlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetAmpUrlsResponse extends js.Object {
  /**
    * For each URL in BatchAmpUrlsRequest, the URL response. The response might
    * not be in the same order as URLs in the batch request.
    * If BatchAmpUrlsRequest contains duplicate URLs, AmpUrl is generated
    * only once.
    */
  var ampUrls: js.UndefOr[js.Array[AmpUrl]] = js.undefined
  /** The errors for requested URLs that have no AMP URL. */
  var urlErrors: js.UndefOr[js.Array[AmpUrlError]] = js.undefined
}

