package typings.googleAppsScript.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentsOnly extends js.Object {
  
  var contentsOnly: js.UndefOr[Boolean] = js.native
  
  var formatOnly: js.UndefOr[Boolean] = js.native
}
object ContentsOnly {
  
  @scala.inline
  def apply(): ContentsOnly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentsOnly]
  }
  
  @scala.inline
  implicit class ContentsOnlyOps[Self <: ContentsOnly] (val x: Self) extends AnyVal {
    
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
    def setContentsOnly(value: Boolean): Self = this.set("contentsOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentsOnly: Self = this.set("contentsOnly", js.undefined)
    
    @scala.inline
    def setFormatOnly(value: Boolean): Self = this.set("formatOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatOnly: Self = this.set("formatOnly", js.undefined)
  }
}
