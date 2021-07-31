package typings.ecmarkup.anon

import typings.ecmarkup.collectNodesMod.CollectNodesReturnType
import typings.ecmarkup.ecmarkupBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Success
  extends StObject
     with CollectNodesReturnType {
  
  var success: `false`
}
object Success {
  
  @scala.inline
  def apply(): Success = {
    val __obj = js.Dynamic.literal(success = false)
    __obj.asInstanceOf[Success]
  }
  
  @scala.inline
  implicit class SuccessMutableBuilder[Self <: Success] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: `false`): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
