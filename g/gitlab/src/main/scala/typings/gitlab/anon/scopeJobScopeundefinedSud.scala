package typings.gitlab.anon

import typings.gitlab.jobsMod.JobScope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  scope :gitlab.gitlab/dist/types/core/services/Jobs.JobScope | undefined} & gitlab.gitlab/dist/types/core/infrastructure.Sudo */
trait scopeJobScopeundefinedSud extends StObject {
  
  var scope: js.UndefOr[JobScope] = js.undefined
  
  var sudo: js.UndefOr[String | Double] = js.undefined
}
object scopeJobScopeundefinedSud {
  
  @scala.inline
  def apply(): scopeJobScopeundefinedSud = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[scopeJobScopeundefinedSud]
  }
  
  @scala.inline
  implicit class scopeJobScopeundefinedSudMutableBuilder[Self <: scopeJobScopeundefinedSud] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScope(value: JobScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setSudo(value: String | Double): Self = StObject.set(x, "sudo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSudoUndefined: Self = StObject.set(x, "sudo", js.undefined)
  }
}
