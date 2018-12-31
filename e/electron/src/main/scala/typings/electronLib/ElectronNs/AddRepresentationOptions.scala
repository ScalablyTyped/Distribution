package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddRepresentationOptions extends js.Object {
  /**
    * The buffer containing the raw image data.
    */
  var buffer: js.UndefOr[nodeLib.Buffer] = js.undefined
  /**
    * The data URL containing either a base 64 encoded PNG or JPEG image.
    */
  var dataURL: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Defaults to 0. Required if a bitmap buffer is specified as buffer.
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * The scale factor to add the image representation for.
    */
  var scaleFactor: scala.Double
  /**
    * Defaults to 0. Required if a bitmap buffer is specified as buffer.
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

