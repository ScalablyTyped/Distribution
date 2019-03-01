package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawCaptionEventArgs extends js.Object {
  /** returns the object of the bullet graph.
    */
  var Object: js.UndefOr[js.Any] = js.undefined
  /** returns the current captionSettings element.
    */
  var captionElement: js.UndefOr[stdLib.HTMLElement] = js.undefined
  /** returns the type of the captionSettings.
    */
  var captionType: js.UndefOr[java.lang.String] = js.undefined
  /** returns the options of the scale element.
    */
  var scaleElement: js.UndefOr[stdLib.HTMLElement] = js.undefined
}

object DrawCaptionEventArgs {
  @scala.inline
  def apply(
    Object: js.Any = null,
    captionElement: stdLib.HTMLElement = null,
    captionType: java.lang.String = null,
    scaleElement: stdLib.HTMLElement = null
  ): DrawCaptionEventArgs = {
    val __obj = js.Dynamic.literal()
    if (Object != null) __obj.updateDynamic("Object")(Object)
    if (captionElement != null) __obj.updateDynamic("captionElement")(captionElement)
    if (captionType != null) __obj.updateDynamic("captionType")(captionType)
    if (scaleElement != null) __obj.updateDynamic("scaleElement")(scaleElement)
    __obj.asInstanceOf[DrawCaptionEventArgs]
  }
}

