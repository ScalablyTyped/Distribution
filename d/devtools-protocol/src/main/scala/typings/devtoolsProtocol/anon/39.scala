package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Browser.SetDownloadBehaviorRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `39` extends StObject {
  
  var paramsType: js.Array[SetDownloadBehaviorRequest]
  
  var returnType: Unit
}
object `39` {
  
  inline def apply(paramsType: js.Array[SetDownloadBehaviorRequest], returnType: Unit): `39` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`39`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `39`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetDownloadBehaviorRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetDownloadBehaviorRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
