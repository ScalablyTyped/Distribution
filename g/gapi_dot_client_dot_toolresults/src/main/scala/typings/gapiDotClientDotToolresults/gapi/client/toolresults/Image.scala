package typings.gapiDotClientDotToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  /** An error explaining why the thumbnail could not be rendered. */
  var error: js.UndefOr[Status] = js.undefined
  /**
    * A reference to the full-size, original image.
    *
    * This is the same as the tool_outputs entry for the image under its Step.
    *
    * Always set.
    */
  var sourceImage: js.UndefOr[ToolOutputReference] = js.undefined
  /**
    * The step to which the image is attached.
    *
    * Always set.
    */
  var stepId: js.UndefOr[String] = js.undefined
  /** The thumbnail. */
  var thumbnail: js.UndefOr[Thumbnail] = js.undefined
}

object Image {
  @scala.inline
  def apply(
    error: Status = null,
    sourceImage: ToolOutputReference = null,
    stepId: String = null,
    thumbnail: Thumbnail = null
  ): Image = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (sourceImage != null) __obj.updateDynamic("sourceImage")(sourceImage.asInstanceOf[js.Any])
    if (stepId != null) __obj.updateDynamic("stepId")(stepId.asInstanceOf[js.Any])
    if (thumbnail != null) __obj.updateDynamic("thumbnail")(thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
}

