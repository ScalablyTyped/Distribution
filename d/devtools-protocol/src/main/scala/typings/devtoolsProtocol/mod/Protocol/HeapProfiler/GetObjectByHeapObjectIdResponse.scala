package typings.devtoolsProtocol.mod.Protocol.HeapProfiler

import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetObjectByHeapObjectIdResponse extends StObject {
  
  /**
    * Evaluation result.
    */
  var result: RemoteObject
}
object GetObjectByHeapObjectIdResponse {
  
  inline def apply(result: RemoteObject): GetObjectByHeapObjectIdResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectByHeapObjectIdResponse]
  }
  
  extension [Self <: GetObjectByHeapObjectIdResponse](x: Self) {
    
    inline def setResult(value: RemoteObject): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
