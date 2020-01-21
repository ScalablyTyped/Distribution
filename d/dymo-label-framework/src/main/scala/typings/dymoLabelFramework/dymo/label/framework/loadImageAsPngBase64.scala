package typings.dymoLabelFramework.dymo.label.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dymo.label.framework.loadImageAsPngBase64")
@js.native
object loadImageAsPngBase64 extends js.Object {
  /**
  	 * Loads an image from a URL or file and returns it as a base64-encoded PNG stream.
  	 * The loaded image is not necessarily in PNG format.
  	 * The image can be in any format supported by the Framework (by DYMO Label v.8).
  	 * The loaded data can be used to set content for an image object on a label.
  	 * Note: The comments for {@link openLabelFile} apply to this function as well.
  	 *
  	 * @param imageUri URL or file name to load the image from.
  	 *
  	 * @returns A base64-encoded PNG stream.
  	 */
  def apply(imageUri: String): String = js.native
}

