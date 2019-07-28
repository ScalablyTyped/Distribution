package typings.gapiDotTranslate.gapiNs.clientNs.languageNs

import typings.gapi.gapiNs.clientNs.HttpRequest
import typings.gapiDotTranslate.Anon_Fields
import typings.gapiDotTranslate.GoogleApiTranslateDetectionListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait detections extends js.Object {
  /**
  		 * Detect the language of text.
  		 */
  def list(`object`: Anon_Fields): HttpRequest[GoogleApiTranslateDetectionListResponse]
}

object detections {
  @scala.inline
  def apply(list: Anon_Fields => HttpRequest[GoogleApiTranslateDetectionListResponse]): detections = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[detections]
  }
}

