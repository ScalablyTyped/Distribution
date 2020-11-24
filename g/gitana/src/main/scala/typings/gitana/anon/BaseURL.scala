package typings.gitana.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseURL extends js.Object {
  
  var baseURL: String = js.native
}
object BaseURL {
  
  @scala.inline
  def apply(baseURL: String): BaseURL = {
    val __obj = js.Dynamic.literal(baseURL = baseURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseURL]
  }
  
  @scala.inline
  implicit class BaseURLOps[Self <: BaseURL] (val x: Self) extends AnyVal {
    
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
    def setBaseURL(value: String): Self = this.set("baseURL", value.asInstanceOf[js.Any])
  }
}
