package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.SetLifecycleEventsEnabledRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `182` extends StObject {
  
  var paramsType: js.Array[SetLifecycleEventsEnabledRequest]
  
  var returnType: Unit
}
object `182` {
  
  inline def apply(paramsType: js.Array[SetLifecycleEventsEnabledRequest], returnType: Unit): `182` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`182`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `182`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetLifecycleEventsEnabledRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetLifecycleEventsEnabledRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
