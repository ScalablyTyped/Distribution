package typings.gapiTranslate.gapi.client.language

import typings.gapi.gapi.client.HttpRequest
import typings.gapiTranslate.GoogleApiTranslateLanguageListResponse
import typings.gapiTranslate.anon.Target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait languages extends js.Object {
  /**
    * List the source/target languages supported by the API
    */
  def list(`object`: Target): HttpRequest[GoogleApiTranslateLanguageListResponse]
}

object languages {
  @scala.inline
  def apply(list: Target => HttpRequest[GoogleApiTranslateLanguageListResponse]): languages = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[languages]
  }
}

