package typings
package gapiDotClientDotTranslateLib.gapiNs.clientNs.translateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectionsResource extends js.Object {
  /** Detects the language of text within a request. */
  def detect(request: gapiDotClientDotTranslateLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[DetectionsListResponse]
  /** Detects the language of text within a request. */
  def list(request: gapiDotClientDotTranslateLib.Anon_AccesstokenAltBearertokenCallback): gapiDotClientLib.gapiNs.clientNs.Request[DetectionsListResponse]
}

object DetectionsResource {
  @scala.inline
  def apply(
    detect: gapiDotClientDotTranslateLib.Anon_AccesstokenAltBearertoken => gapiDotClientLib.gapiNs.clientNs.Request[DetectionsListResponse],
    list: gapiDotClientDotTranslateLib.Anon_AccesstokenAltBearertokenCallback => gapiDotClientLib.gapiNs.clientNs.Request[DetectionsListResponse]
  ): DetectionsResource = {
    val __obj = js.Dynamic.literal(detect = js.Any.fromFunction1(detect), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[DetectionsResource]
  }
}

