package typings.gapiDotClientDotTranslate.gapi.client.translate

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotTranslate.Anon_AccesstokenAltBearertoken
import typings.gapiDotClientDotTranslate.Anon_AccesstokenAltBearertokenCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectionsResource extends js.Object {
  /** Detects the language of text within a request. */
  def detect(request: Anon_AccesstokenAltBearertoken): Request[DetectionsListResponse]
  /** Detects the language of text within a request. */
  def list(request: Anon_AccesstokenAltBearertokenCallback): Request[DetectionsListResponse]
}

object DetectionsResource {
  @scala.inline
  def apply(
    detect: Anon_AccesstokenAltBearertoken => Request[DetectionsListResponse],
    list: Anon_AccesstokenAltBearertokenCallback => Request[DetectionsListResponse]
  ): DetectionsResource = {
    val __obj = js.Dynamic.literal(detect = js.Any.fromFunction1(detect), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[DetectionsResource]
  }
}

