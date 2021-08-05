package typings.gitlab.anon

import typings.gitlab.jobsMod.JobScope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  scope :gitlab.gitlab/dist/types/core/services/Jobs.JobScope} & gitlab.gitlab/dist/types/core/infrastructure.Sudo */
trait scopeJobScopeSudo extends StObject {
  
  var scope: JobScope
  
  var sudo: js.UndefOr[String | Double] = js.undefined
}
object scopeJobScopeSudo {
  
  inline def apply(scope: JobScope): scopeJobScopeSudo = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[scopeJobScopeSudo]
  }
  
  extension [Self <: scopeJobScopeSudo](x: Self) {
    
    inline def setScope(value: JobScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setSudo(value: String | Double): Self = StObject.set(x, "sudo", value.asInstanceOf[js.Any])
    
    inline def setSudoUndefined: Self = StObject.set(x, "sudo", js.undefined)
  }
}
