package typings.gapiTranslate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiTranslateTranslationListResponse extends js.Object {
  var data: AnonTranslations
}

object GoogleApiTranslateTranslationListResponse {
  @scala.inline
  def apply(data: AnonTranslations): GoogleApiTranslateTranslationListResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GoogleApiTranslateTranslationListResponse]
  }
}

