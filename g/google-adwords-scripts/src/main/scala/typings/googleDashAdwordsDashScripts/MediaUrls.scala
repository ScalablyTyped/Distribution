package typings.googleDashAdwordsDashScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaUrls extends js.Object {
  def getFullMediaUrl(): String
  def getPreviewMediaUrl(): String
  def getShrunkenMediaUrl(): String
  def getVideoThumbnailMediaUrl(): String
}

object MediaUrls {
  @scala.inline
  def apply(
    getFullMediaUrl: () => String,
    getPreviewMediaUrl: () => String,
    getShrunkenMediaUrl: () => String,
    getVideoThumbnailMediaUrl: () => String
  ): MediaUrls = {
    val __obj = js.Dynamic.literal(getFullMediaUrl = js.Any.fromFunction0(getFullMediaUrl), getPreviewMediaUrl = js.Any.fromFunction0(getPreviewMediaUrl), getShrunkenMediaUrl = js.Any.fromFunction0(getShrunkenMediaUrl), getVideoThumbnailMediaUrl = js.Any.fromFunction0(getVideoThumbnailMediaUrl))
  
    __obj.asInstanceOf[MediaUrls]
  }
}

