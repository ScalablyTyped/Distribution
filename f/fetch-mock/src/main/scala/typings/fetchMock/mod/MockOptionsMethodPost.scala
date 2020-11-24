package typings.fetchMock.mod

import typings.fetchMock.fetchMockStrings.POST
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MockOptionsMethodPost extends MockOptions {
  
  @JSName("method")
  var method_MockOptionsMethodPost: js.UndefOr[POST] = js.native
}
object MockOptionsMethodPost {
  
  @scala.inline
  def apply(): MockOptionsMethodPost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MockOptionsMethodPost]
  }
  
  @scala.inline
  implicit class MockOptionsMethodPostOps[Self <: MockOptionsMethodPost] (val x: Self) extends AnyVal {
    
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
    def setMethod(value: POST): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
  }
}
