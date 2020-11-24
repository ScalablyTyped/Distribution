package typings.docusignEsign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Include extends js.Object {
  
  var include: js.UndefOr[String] = js.native
  
  var includeItems: js.UndefOr[String] = js.native
  
  var startPosition: js.UndefOr[String] = js.native
  
  var userFilter: js.UndefOr[String] = js.native
}
object Include {
  
  @scala.inline
  def apply(): Include = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Include]
  }
  
  @scala.inline
  implicit class IncludeOps[Self <: Include] (val x: Self) extends AnyVal {
    
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
    def setInclude(value: String): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    
    @scala.inline
    def setIncludeItems(value: String): Self = this.set("includeItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeItems: Self = this.set("includeItems", js.undefined)
    
    @scala.inline
    def setStartPosition(value: String): Self = this.set("startPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartPosition: Self = this.set("startPosition", js.undefined)
    
    @scala.inline
    def setUserFilter(value: String): Self = this.set("userFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserFilter: Self = this.set("userFilter", js.undefined)
  }
}
