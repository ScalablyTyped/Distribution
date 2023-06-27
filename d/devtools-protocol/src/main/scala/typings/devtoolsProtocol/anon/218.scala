package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Storage.TrackIndexedDBForStorageKeyRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `218` extends StObject {
  
  var paramsType: js.Array[TrackIndexedDBForStorageKeyRequest]
  
  var returnType: Unit
}
object `218` {
  
  inline def apply(paramsType: js.Array[TrackIndexedDBForStorageKeyRequest], returnType: Unit): `218` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`218`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `218`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[TrackIndexedDBForStorageKeyRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: TrackIndexedDBForStorageKeyRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
