package typings.gettextParser.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTextTranslations extends js.Object {
  var charset: String
  var headers: StringDictionary[String]
  var translations: StringDictionary[StringDictionary[GetTextTranslation]]
}

object GetTextTranslations {
  @scala.inline
  def apply(
    charset: String,
    headers: StringDictionary[String],
    translations: StringDictionary[StringDictionary[GetTextTranslation]]
  ): GetTextTranslations = {
    val __obj = js.Dynamic.literal(charset = charset.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetTextTranslations]
  }
}

