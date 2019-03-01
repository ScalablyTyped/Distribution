package typings
package ejDotWebDotAllLib.ejNs.PdfViewerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureSettings extends js.Object {
  /** Gets/sets the color of the handwritten signature.
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Gets/sets the opacity of the handwritten signature.
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
}

object SignatureSettings {
  @scala.inline
  def apply(color: java.lang.String = null, opacity: scala.Int | scala.Double = null): SignatureSettings = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureSettings]
  }
}

