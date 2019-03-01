package typings
package gapiDotClientDotToolresultsLib.gapiNs.clientNs.toolresultsNs

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
  var stepId: js.UndefOr[java.lang.String] = js.undefined
  /** The thumbnail. */
  var thumbnail: js.UndefOr[Thumbnail] = js.undefined
}

object Image {
  @scala.inline
  def apply(
    error: Status = null,
    sourceImage: ToolOutputReference = null,
    stepId: java.lang.String = null,
    thumbnail: Thumbnail = null
  ): Image = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (sourceImage != null) __obj.updateDynamic("sourceImage")(sourceImage)
    if (stepId != null) __obj.updateDynamic("stepId")(stepId)
    if (thumbnail != null) __obj.updateDynamic("thumbnail")(thumbnail)
    __obj.asInstanceOf[Image]
  }
}

