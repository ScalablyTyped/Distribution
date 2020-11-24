package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateFolder extends js.Object {
  
  var data: js.UndefOr[CreateFolderData] = js.native
  
  var jsonapi: js.UndefOr[JsonApiVersionJsonapi] = js.native
}
object CreateFolder {
  
  @scala.inline
  def apply(): CreateFolder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFolder]
  }
  
  @scala.inline
  implicit class CreateFolderOps[Self <: CreateFolder] (val x: Self) extends AnyVal {
    
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
    def setData(value: CreateFolderData): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setJsonapi(value: JsonApiVersionJsonapi): Self = this.set("jsonapi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsonapi: Self = this.set("jsonapi", js.undefined)
  }
}
