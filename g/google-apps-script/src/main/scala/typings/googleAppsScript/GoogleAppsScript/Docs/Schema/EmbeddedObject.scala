package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmbeddedObject extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var embeddedDrawingProperties: js.UndefOr[js.Any] = js.undefined
  var embeddedObjectBorder: js.UndefOr[EmbeddedObjectBorder] = js.undefined
  var imageProperties: js.UndefOr[ImageProperties] = js.undefined
  var linkedContentReference: js.UndefOr[LinkedContentReference] = js.undefined
  var marginBottom: js.UndefOr[Dimension] = js.undefined
  var marginLeft: js.UndefOr[Dimension] = js.undefined
  var marginRight: js.UndefOr[Dimension] = js.undefined
  var marginTop: js.UndefOr[Dimension] = js.undefined
  var size: js.UndefOr[Size] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object EmbeddedObject {
  @scala.inline
  def apply(
    description: String = null,
    embeddedDrawingProperties: js.Any = null,
    embeddedObjectBorder: EmbeddedObjectBorder = null,
    imageProperties: ImageProperties = null,
    linkedContentReference: LinkedContentReference = null,
    marginBottom: Dimension = null,
    marginLeft: Dimension = null,
    marginRight: Dimension = null,
    marginTop: Dimension = null,
    size: Size = null,
    title: String = null
  ): EmbeddedObject = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (embeddedDrawingProperties != null) __obj.updateDynamic("embeddedDrawingProperties")(embeddedDrawingProperties.asInstanceOf[js.Any])
    if (embeddedObjectBorder != null) __obj.updateDynamic("embeddedObjectBorder")(embeddedObjectBorder.asInstanceOf[js.Any])
    if (imageProperties != null) __obj.updateDynamic("imageProperties")(imageProperties.asInstanceOf[js.Any])
    if (linkedContentReference != null) __obj.updateDynamic("linkedContentReference")(linkedContentReference.asInstanceOf[js.Any])
    if (marginBottom != null) __obj.updateDynamic("marginBottom")(marginBottom.asInstanceOf[js.Any])
    if (marginLeft != null) __obj.updateDynamic("marginLeft")(marginLeft.asInstanceOf[js.Any])
    if (marginRight != null) __obj.updateDynamic("marginRight")(marginRight.asInstanceOf[js.Any])
    if (marginTop != null) __obj.updateDynamic("marginTop")(marginTop.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmbeddedObject]
  }
}

