package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlmExecuteLifecycleResponse extends StObject {
  
  var snapshot_name: Name
}
object SlmExecuteLifecycleResponse {
  
  inline def apply(snapshot_name: Name): SlmExecuteLifecycleResponse = {
    val __obj = js.Dynamic.literal(snapshot_name = snapshot_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlmExecuteLifecycleResponse]
  }
  
  extension [Self <: SlmExecuteLifecycleResponse](x: Self) {
    
    inline def setSnapshot_name(value: Name): Self = StObject.set(x, "snapshot_name", value.asInstanceOf[js.Any])
  }
}
