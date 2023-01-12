package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupStopJobResponse extends StObject {
  
  var stopped: Boolean
}
object RollupStopJobResponse {
  
  inline def apply(stopped: Boolean): RollupStopJobResponse = {
    val __obj = js.Dynamic.literal(stopped = stopped.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupStopJobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RollupStopJobResponse] (val x: Self) extends AnyVal {
    
    inline def setStopped(value: Boolean): Self = StObject.set(x, "stopped", value.asInstanceOf[js.Any])
  }
}
