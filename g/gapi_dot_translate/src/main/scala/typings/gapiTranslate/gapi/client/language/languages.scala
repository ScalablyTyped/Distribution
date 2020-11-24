package typings.gapiTranslate.gapi.client.language

import typings.gapi.gapi.client.HttpRequest
import typings.gapiTranslate.GoogleApiTranslateLanguageListResponse
import typings.gapiTranslate.anon.Target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait languages extends js.Object {
  
  /**
    * List the source/target languages supported by the API
    */
  def list(`object`: Target): HttpRequest[GoogleApiTranslateLanguageListResponse] = js.native
}
object languages {
  
  @scala.inline
  def apply(list: Target => HttpRequest[GoogleApiTranslateLanguageListResponse]): languages = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[languages]
  }
  
  @scala.inline
  implicit class languagesOps[Self <: languages] (val x: Self) extends AnyVal {
    
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
    def setList(value: Target => HttpRequest[GoogleApiTranslateLanguageListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
}
