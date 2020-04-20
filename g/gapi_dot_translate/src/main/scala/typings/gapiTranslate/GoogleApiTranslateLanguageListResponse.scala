package typings.gapiTranslate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiTranslateLanguageListResponse extends js.Object {
  var data: AnonLanguages
}

object GoogleApiTranslateLanguageListResponse {
  @scala.inline
  def apply(data: AnonLanguages): GoogleApiTranslateLanguageListResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiTranslateLanguageListResponse]
  }
}

