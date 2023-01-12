package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageIpFilter extends StObject {
  
  var http: Boolean
  
  var transport: Boolean
}
object XpackUsageIpFilter {
  
  inline def apply(http: Boolean, transport: Boolean): XpackUsageIpFilter = {
    val __obj = js.Dynamic.literal(http = http.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageIpFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XpackUsageIpFilter] (val x: Self) extends AnyVal {
    
    inline def setHttp(value: Boolean): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    inline def setTransport(value: Boolean): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
  }
}
