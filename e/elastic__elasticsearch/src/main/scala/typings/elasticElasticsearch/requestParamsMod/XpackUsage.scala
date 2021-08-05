package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsage
  extends StObject
     with Generic {
  
  var master_timeout: js.UndefOr[String] = js.undefined
}
object XpackUsage {
  
  inline def apply(): XpackUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XpackUsage]
  }
  
  extension [Self <: XpackUsage](x: Self) {
    
    inline def setMaster_timeout(value: String): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
  }
}
