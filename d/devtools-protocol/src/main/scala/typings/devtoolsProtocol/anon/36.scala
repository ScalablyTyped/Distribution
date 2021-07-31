package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Browser.SetDownloadBehaviorRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `36` extends StObject {
  
  var paramsType: js.Array[SetDownloadBehaviorRequest]
  
  var returnType: Unit
}
object `36` {
  
  @scala.inline
  def apply(paramsType: js.Array[SetDownloadBehaviorRequest], returnType: Unit): `36` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`36`]
  }
  
  @scala.inline
  implicit class `36MutableBuilder`[Self <: `36`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[SetDownloadBehaviorRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: SetDownloadBehaviorRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
