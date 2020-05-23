package typings.gapiTranslate

import typings.gapiTranslate.anon.Translations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiTranslateTranslationListResponse extends js.Object {
  var data: Translations
}

object GoogleApiTranslateTranslationListResponse {
  @scala.inline
  def apply(data: Translations): GoogleApiTranslateTranslationListResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiTranslateTranslationListResponse]
  }
}

