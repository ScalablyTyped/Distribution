package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaDimensions extends js.Object {
  def getFullMediaDimensions(): Dimensions
  def getPreviewMediaDimensions(): Dimensions
  def getShrunkenMediaDimensions(): Dimensions
  def getVideoThumbnailDimensions(): Dimensions
}

object MediaDimensions {
  @scala.inline
  def apply(
    getFullMediaDimensions: js.Function0[Dimensions],
    getPreviewMediaDimensions: js.Function0[Dimensions],
    getShrunkenMediaDimensions: js.Function0[Dimensions],
    getVideoThumbnailDimensions: js.Function0[Dimensions]
  ): MediaDimensions = {
    val __obj = js.Dynamic.literal(getFullMediaDimensions = getFullMediaDimensions, getPreviewMediaDimensions = getPreviewMediaDimensions, getShrunkenMediaDimensions = getShrunkenMediaDimensions, getVideoThumbnailDimensions = getVideoThumbnailDimensions)
  
    __obj.asInstanceOf[MediaDimensions]
  }
}

