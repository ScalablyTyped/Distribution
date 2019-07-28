package typings.gapiDotTranslate.gapiNs.clientNs.languageNs

import typings.gapi.gapiNs.clientNs.HttpRequest
import typings.gapiDotTranslate.Anon_FieldsTarget
import typings.gapiDotTranslate.GoogleApiTranslateLanguageListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait languages extends js.Object {
  /**
  		 * List the source/target languages supported by the API
  		 */
  def list(`object`: Anon_FieldsTarget): HttpRequest[GoogleApiTranslateLanguageListResponse]
}

object languages {
  @scala.inline
  def apply(list: Anon_FieldsTarget => HttpRequest[GoogleApiTranslateLanguageListResponse]): languages = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[languages]
  }
}

