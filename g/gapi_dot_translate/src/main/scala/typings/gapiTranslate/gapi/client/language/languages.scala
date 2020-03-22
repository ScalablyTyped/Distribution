package typings.gapiTranslate.gapi.client.language

import typings.gapi.gapi.client.HttpRequest
import typings.gapiTranslate.AnonTarget
import typings.gapiTranslate.GoogleApiTranslateLanguageListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait languages extends js.Object {
  /**
  		 * List the source/target languages supported by the API
  		 */
  def list(`object`: AnonTarget): HttpRequest[GoogleApiTranslateLanguageListResponse]
}

object languages {
  @scala.inline
  def apply(list: AnonTarget => HttpRequest[GoogleApiTranslateLanguageListResponse]): languages = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[languages]
  }
}

