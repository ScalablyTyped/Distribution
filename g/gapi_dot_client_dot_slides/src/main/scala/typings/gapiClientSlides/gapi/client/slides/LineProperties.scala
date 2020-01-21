package typings.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineProperties extends js.Object {
  /** The dash style of the line. */
  var dashStyle: js.UndefOr[String] = js.undefined
  /** The style of the arrow at the end of the line. */
  var endArrow: js.UndefOr[String] = js.undefined
  /**
    * The fill of the line. The default line fill matches the defaults for new
    * lines created in the Slides editor.
    */
  var lineFill: js.UndefOr[LineFill] = js.undefined
  /** The hyperlink destination of the line. If unset, there is no link. */
  var link: js.UndefOr[Link] = js.undefined
  /** The style of the arrow at the beginning of the line. */
  var startArrow: js.UndefOr[String] = js.undefined
  /** The thickness of the line. */
  var weight: js.UndefOr[Dimension] = js.undefined
}

object LineProperties {
  @scala.inline
  def apply(
    dashStyle: String = null,
    endArrow: String = null,
    lineFill: LineFill = null,
    link: Link = null,
    startArrow: String = null,
    weight: Dimension = null
  ): LineProperties = {
    val __obj = js.Dynamic.literal()
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (endArrow != null) __obj.updateDynamic("endArrow")(endArrow.asInstanceOf[js.Any])
    if (lineFill != null) __obj.updateDynamic("lineFill")(lineFill.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (startArrow != null) __obj.updateDynamic("startArrow")(startArrow.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineProperties]
  }
}

