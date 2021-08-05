package typings.devtoolsProtocol.mod.Protocol.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryObjectsResponse extends StObject {
  
  /**
    * Array with objects.
    */
  var objects: RemoteObject
}
object QueryObjectsResponse {
  
  inline def apply(objects: RemoteObject): QueryObjectsResponse = {
    val __obj = js.Dynamic.literal(objects = objects.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryObjectsResponse]
  }
  
  extension [Self <: QueryObjectsResponse](x: Self) {
    
    inline def setObjects(value: RemoteObject): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
  }
}
