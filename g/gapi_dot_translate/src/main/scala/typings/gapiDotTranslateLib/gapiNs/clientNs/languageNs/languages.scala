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
    list: js.Function1[
      gapiDotTranslateLib.Anon_FieldsTarget, 
      gapiLib.gapiNs.clientNs.HttpRequest[gapiDotTranslateLib.GoogleApiTranslateLanguageListResponse]
    ]
  ): languages = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[languages]
  }
}

