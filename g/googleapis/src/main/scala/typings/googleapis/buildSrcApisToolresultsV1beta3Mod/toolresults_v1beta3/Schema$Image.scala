package typings.googleapis.buildSrcApisToolresultsV1beta3Mod.toolresults_v1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An image, with a link to the main image and a thumbnail.
  */
@js.native
trait Schema$Image extends js.Object {
  /**
    * An error explaining why the thumbnail could not be rendered.
    */
  var error: js.UndefOr[Schema$Status] = js.native
  /**
    * A reference to the full-size, original image.  This is the same as the
    * tool_outputs entry for the image under its Step.  Always set.
    */
  var sourceImage: js.UndefOr[Schema$ToolOutputReference] = js.native
  /**
    * The step to which the image is attached.  Always set.
    */
  var stepId: js.UndefOr[String] = js.native
  /**
    * The thumbnail.
    */
  var thumbnail: js.UndefOr[Schema$Thumbnail] = js.native
}

object Schema$Image {
  @scala.inline
  def apply(
    error: Schema$Status = null,
    sourceImage: Schema$ToolOutputReference = null,
    stepId: String = null,
    thumbnail: Schema$Thumbnail = null
  ): Schema$Image = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (sourceImage != null) __obj.updateDynamic("sourceImage")(sourceImage.asInstanceOf[js.Any])
    if (stepId != null) __obj.updateDynamic("stepId")(stepId.asInstanceOf[js.Any])
    if (thumbnail != null) __obj.updateDynamic("thumbnail")(thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Image]
  }
}

