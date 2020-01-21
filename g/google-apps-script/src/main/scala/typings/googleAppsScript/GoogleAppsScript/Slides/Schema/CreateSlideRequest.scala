package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSlideRequest extends js.Object {
  var insertionIndex: js.UndefOr[Double] = js.undefined
  var objectId: js.UndefOr[String] = js.undefined
  var placeholderIdMappings: js.UndefOr[js.Array[LayoutPlaceholderIdMapping]] = js.undefined
  var slideLayoutReference: js.UndefOr[LayoutReference] = js.undefined
}

object CreateSlideRequest {
  @scala.inline
  def apply(
    insertionIndex: Int | Double = null,
    objectId: String = null,
    placeholderIdMappings: js.Array[LayoutPlaceholderIdMapping] = null,
    slideLayoutReference: LayoutReference = null
  ): CreateSlideRequest = {
    val __obj = js.Dynamic.literal()
    if (insertionIndex != null) __obj.updateDynamic("insertionIndex")(insertionIndex.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (placeholderIdMappings != null) __obj.updateDynamic("placeholderIdMappings")(placeholderIdMappings.asInstanceOf[js.Any])
    if (slideLayoutReference != null) __obj.updateDynamic("slideLayoutReference")(slideLayoutReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSlideRequest]
  }
}

