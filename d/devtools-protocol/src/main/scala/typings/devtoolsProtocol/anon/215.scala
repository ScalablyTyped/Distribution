package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Storage.TrackCacheStorageForOriginRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `215` extends StObject {
  
  var paramsType: js.Array[TrackCacheStorageForOriginRequest]
  
  var returnType: Unit
}
object `215` {
  
  inline def apply(paramsType: js.Array[TrackCacheStorageForOriginRequest], returnType: Unit): `215` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`215`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `215`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[TrackCacheStorageForOriginRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: TrackCacheStorageForOriginRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
