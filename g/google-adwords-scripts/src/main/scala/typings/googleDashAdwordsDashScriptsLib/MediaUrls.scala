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
    getFullMediaUrl: js.Function0[java.lang.String],
    getPreviewMediaUrl: js.Function0[java.lang.String],
    getShrunkenMediaUrl: js.Function0[java.lang.String],
    getVideoThumbnailMediaUrl: js.Function0[java.lang.String]
  ): MediaUrls = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getFullMediaUrl")(getFullMediaUrl)
    __obj.updateDynamic("getPreviewMediaUrl")(getPreviewMediaUrl)
    __obj.updateDynamic("getShrunkenMediaUrl")(getShrunkenMediaUrl)
    __obj.updateDynamic("getVideoThumbnailMediaUrl")(getVideoThumbnailMediaUrl)
    __obj.asInstanceOf[MediaUrls]
  }
}

