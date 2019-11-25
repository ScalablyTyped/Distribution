package typings.gapiDotClientDotSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShapeProperties extends js.Object {
  /**
    * The hyperlink destination of the shape. If unset, there is no link. Links
    * are not inherited from parent placeholders.
    */
  var link: js.UndefOr[Link] = js.undefined
  /**
    * The outline of the shape. If unset, the outline is inherited from a
    * parent placeholder if it exists. If the shape has no parent, then the
    * default outline depends on the shape type, matching the defaults for
    * new shapes created in the Slides editor.
    */
  var outline: js.UndefOr[Outline] = js.undefined
  /**
    * The shadow properties of the shape. If unset, the shadow is inherited from
    * a parent placeholder if it exists. If the shape has no parent, then the
    * default shadow matches the defaults for new shapes created in the Slides
    * editor. This property is read-only.
    */
  var shadow: js.UndefOr[Shadow] = js.undefined
  /**
    * The background fill of the shape. If unset, the background fill is
    * inherited from a parent placeholder if it exists. If the shape has no
    * parent, then the default background fill depends on the shape type,
    * matching the defaults for new shapes created in the Slides editor.
    */
  var shapeBackgroundFill: js.UndefOr[ShapeBackgroundFill] = js.undefined
}

object ShapeProperties {
  @scala.inline
  def apply(
    link: Link = null,
    outline: Outline = null,
    shadow: Shadow = null,
    shapeBackgroundFill: ShapeBackgroundFill = null
  ): ShapeProperties = {
    val __obj = js.Dynamic.literal()
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (outline != null) __obj.updateDynamic("outline")(outline.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (shapeBackgroundFill != null) __obj.updateDynamic("shapeBackgroundFill")(shapeBackgroundFill.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeProperties]
  }
}

