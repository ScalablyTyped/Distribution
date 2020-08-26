package typings.gettextParser.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTextTranslations extends js.Object {
  var charset: String = js.native
  var headers: StringDictionary[String] = js.native
  var translations: StringDictionary[StringDictionary[GetTextTranslation]] = js.native
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
  @scala.inline
  implicit class GetTextTranslationsOps[Self <: GetTextTranslations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCharset(value: String): Self = this.set("charset", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setTranslations(value: StringDictionary[StringDictionary[GetTextTranslation]]): Self = this.set("translations", value.asInstanceOf[js.Any])
  }
  
}

