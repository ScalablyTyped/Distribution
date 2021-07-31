package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Storage.TrackCacheStorageForOriginRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `186` extends StObject {
  
  var paramsType: js.Array[TrackCacheStorageForOriginRequest]
  
  var returnType: Unit
}
object `186` {
  
  @scala.inline
  def apply(paramsType: js.Array[TrackCacheStorageForOriginRequest], returnType: Unit): `186` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`186`]
  }
  
  @scala.inline
  implicit class `186MutableBuilder`[Self <: `186`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[TrackCacheStorageForOriginRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: TrackCacheStorageForOriginRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
