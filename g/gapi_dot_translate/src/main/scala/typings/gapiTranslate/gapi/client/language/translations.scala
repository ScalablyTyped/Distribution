package typings.gapiTranslate.gapi.client.language

import typings.gapi.gapi.client.HttpRequest
import typings.gapiTranslate.AnonCid
import typings.gapiTranslate.GoogleApiTranslateTranslationListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait translations extends js.Object {
  /**
  		 * Returns text translations from one language to another.
  		 */
  def list(`object`: AnonCid): HttpRequest[GoogleApiTranslateTranslationListResponse]
}

object translations {
  @scala.inline
  def apply(list: AnonCid => HttpRequest[GoogleApiTranslateTranslationListResponse]): translations = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[translations]
  }
}

