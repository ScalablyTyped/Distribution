package typings.ejDotWebDotAll.ej.datavisualization.BulletGraph

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawCaptionEventArgs extends js.Object {
  /** returns the object of the bullet graph.
    */
  var Object: js.UndefOr[js.Any] = js.undefined
  /** returns the current captionSettings element.
    */
  var captionElement: js.UndefOr[HTMLElement] = js.undefined
  /** returns the type of the captionSettings.
    */
  var captionType: js.UndefOr[String] = js.undefined
  /** returns the options of the scale element.
    */
  var scaleElement: js.UndefOr[HTMLElement] = js.undefined
}

object DrawCaptionEventArgs {
  @scala.inline
  def apply(
    Object: js.Any = null,
    captionElement: HTMLElement = null,
    captionType: String = null,
    scaleElement: HTMLElement = null
  ): DrawCaptionEventArgs = {
    val __obj = js.Dynamic.literal()
    if (Object != null) __obj.updateDynamic("Object")(Object.asInstanceOf[js.Any])
    if (captionElement != null) __obj.updateDynamic("captionElement")(captionElement.asInstanceOf[js.Any])
    if (captionType != null) __obj.updateDynamic("captionType")(captionType.asInstanceOf[js.Any])
    if (scaleElement != null) __obj.updateDynamic("scaleElement")(scaleElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawCaptionEventArgs]
  }
}

