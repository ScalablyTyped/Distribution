package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageSsl extends StObject {
  
  var http: XpackUsageFeatureToggle
  
  var transport: XpackUsageFeatureToggle
}
object XpackUsageSsl {
  
  inline def apply(http: XpackUsageFeatureToggle, transport: XpackUsageFeatureToggle): XpackUsageSsl = {
    val __obj = js.Dynamic.literal(http = http.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageSsl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XpackUsageSsl] (val x: Self) extends AnyVal {
    
    inline def setHttp(value: XpackUsageFeatureToggle): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    inline def setTransport(value: XpackUsageFeatureToggle): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
  }
}
