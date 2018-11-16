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

