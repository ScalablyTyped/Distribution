package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.NavigateToHistoryEntryRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `168` extends StObject {
  
  var paramsType: js.Array[NavigateToHistoryEntryRequest]
  
  var returnType: Unit
}
object `168` {
  
  inline def apply(paramsType: js.Array[NavigateToHistoryEntryRequest], returnType: Unit): `168` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`168`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `168`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[NavigateToHistoryEntryRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: NavigateToHistoryEntryRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
