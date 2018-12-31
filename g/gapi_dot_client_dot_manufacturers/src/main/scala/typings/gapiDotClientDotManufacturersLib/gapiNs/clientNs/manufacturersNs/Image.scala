package typings
package gapiDotClientDotManufacturersLib.gapiNs.clientNs.manufacturersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  /**
    * The URL of the image. For crawled images, this is the provided URL. For
    * uploaded images, this is a serving URL from Google if the image has been
    * processed successfully.
    */
  var imageUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The status of the image.
    * @OutputOnly
    */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of the image, i.e., crawled or uploaded.
    * @OutputOnly
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

