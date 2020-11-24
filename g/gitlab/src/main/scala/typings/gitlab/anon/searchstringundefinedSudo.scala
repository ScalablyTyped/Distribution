package typings.gitlab.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  search :string | undefined} & gitlab.gitlab/dist/types/core/infrastructure.Sudo */
@js.native
trait searchstringundefinedSudo extends js.Object {
  
  var search: js.UndefOr[String] = js.native
  
  var sudo: js.UndefOr[String | Double] = js.native
}
object searchstringundefinedSudo {
  
  @scala.inline
  def apply(): searchstringundefinedSudo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[searchstringundefinedSudo]
  }
  
  @scala.inline
  implicit class searchstringundefinedSudoOps[Self <: searchstringundefinedSudo] (val x: Self) extends AnyVal {
    
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
    def setSearch(value: String): Self = this.set("search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
    
    @scala.inline
    def setSudo(value: String | Double): Self = this.set("sudo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSudo: Self = this.set("sudo", js.undefined)
  }
}
