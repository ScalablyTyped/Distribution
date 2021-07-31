package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Storage.UntrackCacheStorageForOriginRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `188` extends StObject {
  
  var paramsType: js.Array[UntrackCacheStorageForOriginRequest]
  
  var returnType: Unit
}
object `188` {
  
  @scala.inline
  def apply(paramsType: js.Array[UntrackCacheStorageForOriginRequest], returnType: Unit): `188` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`188`]
  }
  
  @scala.inline
  implicit class `188MutableBuilder`[Self <: `188`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[UntrackCacheStorageForOriginRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: UntrackCacheStorageForOriginRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
