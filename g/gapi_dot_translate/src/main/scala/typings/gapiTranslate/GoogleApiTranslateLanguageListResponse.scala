package typings.gapiTranslate

import typings.gapiTranslate.anon.Languages
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiTranslateLanguageListResponse extends js.Object {
  var data: Languages
}

object GoogleApiTranslateLanguageListResponse {
  @scala.inline
  def apply(data: Languages): GoogleApiTranslateLanguageListResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiTranslateLanguageListResponse]
  }
}

