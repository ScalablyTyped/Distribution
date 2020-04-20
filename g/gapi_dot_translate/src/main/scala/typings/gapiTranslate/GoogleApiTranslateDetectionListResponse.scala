package typings.gapiTranslate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiTranslateDetectionListResponse extends js.Object {
  var data: AnonDetections
}

object GoogleApiTranslateDetectionListResponse {
  @scala.inline
  def apply(data: AnonDetections): GoogleApiTranslateDetectionListResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiTranslateDetectionListResponse]
  }
}

