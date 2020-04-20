package typings.gapiTranslate.gapi.client.language

import typings.gapi.gapi.client.HttpRequest
import typings.gapiTranslate.AnonFields
import typings.gapiTranslate.GoogleApiTranslateDetectionListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait detections extends js.Object {
  /**
  		 * Detect the language of text.
  		 */
  def list(`object`: AnonFields): HttpRequest[GoogleApiTranslateDetectionListResponse]
}

object detections {
  @scala.inline
  def apply(list: AnonFields => HttpRequest[GoogleApiTranslateDetectionListResponse]): detections = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[detections]
  }
}

