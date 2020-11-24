package typings.gapiTranslate.gapi.client.language

import typings.gapi.gapi.client.HttpRequest
import typings.gapiTranslate.GoogleApiTranslateTranslationListResponse
import typings.gapiTranslate.anon.Cid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait translations extends js.Object {
  
  /**
    * Returns text translations from one language to another.
    */
  def list(`object`: Cid): HttpRequest[GoogleApiTranslateTranslationListResponse] = js.native
}
object translations {
  
  @scala.inline
  def apply(list: Cid => HttpRequest[GoogleApiTranslateTranslationListResponse]): translations = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[translations]
  }
  
  @scala.inline
  implicit class translationsOps[Self <: translations] (val x: Self) extends AnyVal {
    
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
    def setList(value: Cid => HttpRequest[GoogleApiTranslateTranslationListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
}
