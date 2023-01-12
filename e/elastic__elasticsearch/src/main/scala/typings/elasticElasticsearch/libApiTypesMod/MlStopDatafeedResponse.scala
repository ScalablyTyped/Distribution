package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlStopDatafeedResponse extends StObject {
  
  var stopped: Boolean
}
object MlStopDatafeedResponse {
  
  inline def apply(stopped: Boolean): MlStopDatafeedResponse = {
    val __obj = js.Dynamic.literal(stopped = stopped.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlStopDatafeedResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlStopDatafeedResponse] (val x: Self) extends AnyVal {
    
    inline def setStopped(value: Boolean): Self = StObject.set(x, "stopped", value.asInstanceOf[js.Any])
  }
}
