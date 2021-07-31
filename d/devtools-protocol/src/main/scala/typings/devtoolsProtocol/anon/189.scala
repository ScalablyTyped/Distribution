package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Storage.UntrackIndexedDBForOriginRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `189` extends StObject {
  
  var paramsType: js.Array[UntrackIndexedDBForOriginRequest]
  
  var returnType: Unit
}
object `189` {
  
  @scala.inline
  def apply(paramsType: js.Array[UntrackIndexedDBForOriginRequest], returnType: Unit): `189` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`189`]
  }
  
  @scala.inline
  implicit class `189MutableBuilder`[Self <: `189`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[UntrackIndexedDBForOriginRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: UntrackIndexedDBForOriginRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
