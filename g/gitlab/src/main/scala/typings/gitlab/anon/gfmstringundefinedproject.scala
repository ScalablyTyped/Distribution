package typings.gitlab.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  gfm :string | undefined,   project :string | number | undefined} & gitlab.gitlab/dist/types/core/infrastructure.Sudo */
@js.native
trait gfmstringundefinedproject extends js.Object {
  
  var gfm: js.UndefOr[String] = js.native
  
  var project: js.UndefOr[String | Double] = js.native
  
  var sudo: js.UndefOr[String | Double] = js.native
}
object gfmstringundefinedproject {
  
  @scala.inline
  def apply(): gfmstringundefinedproject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[gfmstringundefinedproject]
  }
  
  @scala.inline
  implicit class gfmstringundefinedprojectOps[Self <: gfmstringundefinedproject] (val x: Self) extends AnyVal {
    
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
    def setGfm(value: String): Self = this.set("gfm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGfm: Self = this.set("gfm", js.undefined)
    
    @scala.inline
    def setProject(value: String | Double): Self = this.set("project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProject: Self = this.set("project", js.undefined)
    
    @scala.inline
    def setSudo(value: String | Double): Self = this.set("sudo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSudo: Self = this.set("sudo", js.undefined)
  }
}
