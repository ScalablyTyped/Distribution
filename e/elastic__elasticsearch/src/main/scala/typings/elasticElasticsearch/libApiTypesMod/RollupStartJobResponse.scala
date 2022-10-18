package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupStartJobResponse extends StObject {
  
  var started: Boolean
}
object RollupStartJobResponse {
  
  inline def apply(started: Boolean): RollupStartJobResponse = {
    val __obj = js.Dynamic.literal(started = started.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupStartJobResponse]
  }
  
  extension [Self <: RollupStartJobResponse](x: Self) {
    
    inline def setStarted(value: Boolean): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
  }
}
