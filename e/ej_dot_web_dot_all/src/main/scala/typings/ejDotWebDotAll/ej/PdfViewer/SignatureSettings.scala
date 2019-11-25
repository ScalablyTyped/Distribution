package typings.ejDotWebDotAll.ej.PdfViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureSettings extends js.Object {
  /** Gets/sets the color of the handwritten signature.
    */
  var color: js.UndefOr[String] = js.undefined
  /** Gets/sets the opacity of the handwritten signature.
    */
  var opacity: js.UndefOr[Double] = js.undefined
}

object SignatureSettings {
  @scala.inline
  def apply(color: String = null, opacity: Int | Double = null): SignatureSettings = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureSettings]
  }
}

