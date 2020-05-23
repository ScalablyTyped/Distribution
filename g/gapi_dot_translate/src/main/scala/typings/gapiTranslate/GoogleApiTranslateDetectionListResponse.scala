package typings.gapiTranslate

import typings.gapiTranslate.anon.Detections
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiTranslateDetectionListResponse extends js.Object {
  var data: Detections
}

object GoogleApiTranslateDetectionListResponse {
  @scala.inline
  def apply(data: Detections): GoogleApiTranslateDetectionListResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiTranslateDetectionListResponse]
  }
}

