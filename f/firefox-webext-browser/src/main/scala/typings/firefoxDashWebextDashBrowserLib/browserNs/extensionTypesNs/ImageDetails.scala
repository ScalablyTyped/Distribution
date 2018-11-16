package typings
package firefoxDashWebextDashBrowserLib.browserNs.extensionTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Details about the format and quality of an image. */

trait ImageDetails extends js.Object {
  /** The format of the resulting image. Default is `"jpeg"`. */
  var format: js.UndefOr[ImageFormat] = js.undefined
  /**
           * When format is `"jpeg"`, controls the quality of the resulting image. This value is ignored for PNG images.
           * As quality is decreased, the resulting image will have more visual artifacts, and the number of bytes needed
           * to store it will decrease.
           */
  var quality: js.UndefOr[scala.Double] = js.undefined
}

