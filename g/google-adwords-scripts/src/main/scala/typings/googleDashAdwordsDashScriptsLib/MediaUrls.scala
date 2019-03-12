package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaUrls extends js.Object {
  def getFullMediaUrl(): java.lang.String
  def getPreviewMediaUrl(): java.lang.String
  def getShrunkenMediaUrl(): java.lang.String
  def getVideoThumbnailMediaUrl(): java.lang.String
}

object MediaUrls {
  @scala.inline
  def apply(
    getFullMediaUrl: () => java.lang.String,
    getPreviewMediaUrl: () => java.lang.String,
    getShrunkenMediaUrl: () => java.lang.String,
    getVideoThumbnailMediaUrl: () => java.lang.String
  ): MediaUrls = {
    val __obj = js.Dynamic.literal(getFullMediaUrl = js.Any.fromFunction0(getFullMediaUrl), getPreviewMediaUrl = js.Any.fromFunction0(getPreviewMediaUrl), getShrunkenMediaUrl = js.Any.fromFunction0(getShrunkenMediaUrl), getVideoThumbnailMediaUrl = js.Any.fromFunction0(getVideoThumbnailMediaUrl))
  
    __obj.asInstanceOf[MediaUrls]
  }
}

