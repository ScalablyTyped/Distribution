package typings.gapiDotTranslate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiTranslateDetectionListResponse extends js.Object {
  var data: Anon_Detections
}

object GoogleApiTranslateDetectionListResponse {
  @scala.inline
  def apply(data: Anon_Detections): GoogleApiTranslateDetectionListResponse = {
    val __obj = js.Dynamic.literal(data = data)
  
    __obj.asInstanceOf[GoogleApiTranslateDetectionListResponse]
  }
}

