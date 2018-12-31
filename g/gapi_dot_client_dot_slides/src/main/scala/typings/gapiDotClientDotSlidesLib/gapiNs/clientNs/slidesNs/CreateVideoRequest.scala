package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateVideoRequest extends js.Object {
  /** The element properties for the video. */
  var elementProperties: js.UndefOr[PageElementProperties] = js.undefined
  /**
    * The video source's unique identifier for this video.
    *
    * e.g. For YouTube video https://www.youtube.com/watch?v=7U3axjORYZ0,
    * the ID is 7U3axjORYZ0.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A user-supplied object ID.
    *
    * If you specify an ID, it must be unique among all pages and page elements
    * in the presentation. The ID must start with an alphanumeric character or an
    * underscore (matches regex `[a-zA-Z0-9_]`); remaining characters
    * may include those as well as a hyphen or colon (matches regex
    * `[a-zA-Z0-9_-:]`).
    * The length of the ID must not be less than 5 or greater than 50.
    *
    * If you don't specify an ID, a unique one is generated.
    */
  var objectId: js.UndefOr[java.lang.String] = js.undefined
  /** The video source. */
  var source: js.UndefOr[java.lang.String] = js.undefined
}

