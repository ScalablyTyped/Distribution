package typings.gitlab.anon

import typings.gitlab.jobsMod.JobScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  scope :gitlab.gitlab/dist/types/core/services/Jobs.JobScope | undefined} & gitlab.gitlab/dist/types/core/infrastructure.Sudo */
@js.native
trait scopeJobScopeundefinedSud extends js.Object {
  
  var scope: js.UndefOr[JobScope] = js.native
  
  var sudo: js.UndefOr[String | Double] = js.native
}
object scopeJobScopeundefinedSud {
  
  @scala.inline
  def apply(): scopeJobScopeundefinedSud = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[scopeJobScopeundefinedSud]
  }
  
  @scala.inline
  implicit class scopeJobScopeundefinedSudOps[Self <: scopeJobScopeundefinedSud] (val x: Self) extends AnyVal {
    
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
    def setScope(value: JobScope): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    
    @scala.inline
    def setSudo(value: String | Double): Self = this.set("sudo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSudo: Self = this.set("sudo", js.undefined)
  }
}
