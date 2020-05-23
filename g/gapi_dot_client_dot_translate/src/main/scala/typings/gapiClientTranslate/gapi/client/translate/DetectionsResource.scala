package typings.gapiClientTranslate.gapi.client.translate

import typings.gapiClient.gapi.client.Request
import typings.gapiClientTranslate.anon.Bearertoken
import typings.gapiClientTranslate.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectionsResource extends js.Object {
  /** Detects the language of text within a request. */
  def detect(request: Bearertoken): Request[DetectionsListResponse]
  /** Detects the language of text within a request. */
  def list(request: Callback): Request[DetectionsListResponse]
}

object DetectionsResource {
  @scala.inline
  def apply(
    detect: Bearertoken => Request[DetectionsListResponse],
    list: Callback => Request[DetectionsListResponse]
  ): DetectionsResource = {
    val __obj = js.Dynamic.literal(detect = js.Any.fromFunction1(detect), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[DetectionsResource]
  }
}

