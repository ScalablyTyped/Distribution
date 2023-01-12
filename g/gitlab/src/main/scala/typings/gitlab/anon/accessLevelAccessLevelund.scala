package typings.gitlab.anon

import typings.gitlab.distTypesCoreTemplatesResourceAccessRequestsMod.AccessLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  accessLevel :gitlab.gitlab/dist/types/core/templates/ResourceAccessRequests.AccessLevel | undefined} & gitlab.gitlab/dist/types/core/infrastructure.Sudo */
trait accessLevelAccessLevelund extends StObject {
  
  var accessLevel: js.UndefOr[AccessLevel] = js.undefined
  
  var sudo: js.UndefOr[String | Double] = js.undefined
}
object accessLevelAccessLevelund {
  
  inline def apply(): accessLevelAccessLevelund = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[accessLevelAccessLevelund]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: accessLevelAccessLevelund] (val x: Self) extends AnyVal {
    
    inline def setAccessLevel(value: AccessLevel): Self = StObject.set(x, "accessLevel", value.asInstanceOf[js.Any])
    
    inline def setAccessLevelUndefined: Self = StObject.set(x, "accessLevel", js.undefined)
    
    inline def setSudo(value: String | Double): Self = StObject.set(x, "sudo", value.asInstanceOf[js.Any])
    
    inline def setSudoUndefined: Self = StObject.set(x, "sudo", js.undefined)
  }
}
