package typings.gapiDotTranslate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiTranslateLanguageListResponse extends js.Object {
  var data: Anon_Languages
}

object GoogleApiTranslateLanguageListResponse {
  @scala.inline
  def apply(data: Anon_Languages): GoogleApiTranslateLanguageListResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GoogleApiTranslateLanguageListResponse]
  }
}

