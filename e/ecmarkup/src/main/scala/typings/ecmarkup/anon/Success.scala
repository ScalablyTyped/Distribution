package typings.ecmarkup.anon

import typings.ecmarkup.ecmarkupBooleans.`false`
import typings.ecmarkup.libLintCollectNodesMod.CollectNodesReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Success
  extends StObject
     with CollectNodesReturnType {
  
  var success: `false`
}
object Success {
  
  inline def apply(): Success = {
    val __obj = js.Dynamic.literal(success = false)
    __obj.asInstanceOf[Success]
  }
  
  extension [Self <: Success](x: Self) {
    
    inline def setSuccess(value: `false`): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
