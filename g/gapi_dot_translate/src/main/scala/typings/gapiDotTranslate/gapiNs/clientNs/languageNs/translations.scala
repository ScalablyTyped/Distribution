package typings.gapiDotTranslate.gapiNs.clientNs.languageNs

import typings.gapi.gapiNs.clientNs.HttpRequest
import typings.gapiDotTranslate.Anon_Cid
import typings.gapiDotTranslate.GoogleApiTranslateTranslationListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait translations extends js.Object {
  /**
  		 * Returns text translations from one language to another.
  		 */
  def list(`object`: Anon_Cid): HttpRequest[GoogleApiTranslateTranslationListResponse]
}

object translations {
  @scala.inline
  def apply(list: Anon_Cid => HttpRequest[GoogleApiTranslateTranslationListResponse]): translations = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[translations]
  }
}

