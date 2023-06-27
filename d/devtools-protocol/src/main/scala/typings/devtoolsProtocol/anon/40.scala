package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Browser.CancelDownloadRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `40` extends StObject {
  
  var paramsType: js.Array[CancelDownloadRequest]
  
  var returnType: Unit
}
object `40` {
  
  inline def apply(paramsType: js.Array[CancelDownloadRequest], returnType: Unit): `40` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`40`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `40`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[CancelDownloadRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: CancelDownloadRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
