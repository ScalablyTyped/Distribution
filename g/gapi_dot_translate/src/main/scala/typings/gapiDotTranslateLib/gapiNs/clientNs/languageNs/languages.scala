package typings
package gapiDotTranslateLib.gapiNs.clientNs.languageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait languages extends js.Object {
  /**
  		 * List the source/target languages supported by the API
  		 */
  def list(`object`: gapiDotTranslateLib.Anon_FieldsTarget): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotTranslateLib.GoogleApiTranslateLanguageListResponse]
}

object languages {
  @scala.inline
  def apply(
    list: gapiDotTranslateLib.Anon_FieldsTarget => gapiLib.gapiNs.clientNs.HttpRequest[gapiDotTranslateLib.GoogleApiTranslateLanguageListResponse]
  ): languages = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[languages]
  }
}

