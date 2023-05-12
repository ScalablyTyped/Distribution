package typings.devtoolsProtocol.mod.Protocol.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResetSharedStorageBudgetRequest extends StObject {
  
  var ownerOrigin: String
}
object ResetSharedStorageBudgetRequest {
  
  inline def apply(ownerOrigin: String): ResetSharedStorageBudgetRequest = {
    val __obj = js.Dynamic.literal(ownerOrigin = ownerOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetSharedStorageBudgetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResetSharedStorageBudgetRequest] (val x: Self) extends AnyVal {
    
    inline def setOwnerOrigin(value: String): Self = StObject.set(x, "ownerOrigin", value.asInstanceOf[js.Any])
  }
}
