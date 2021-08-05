package typings.elasticElasticsearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DEFAULT extends StObject {
  
  var DEFAULT: String
  
  var SNIFF_INTERVAL: String
  
  var SNIFF_ON_CONNECTION_FAULT: String
  
  var SNIFF_ON_START: String
}
object DEFAULT {
  
  inline def apply(DEFAULT: String, SNIFF_INTERVAL: String, SNIFF_ON_CONNECTION_FAULT: String, SNIFF_ON_START: String): DEFAULT = {
    val __obj = js.Dynamic.literal(DEFAULT = DEFAULT.asInstanceOf[js.Any], SNIFF_INTERVAL = SNIFF_INTERVAL.asInstanceOf[js.Any], SNIFF_ON_CONNECTION_FAULT = SNIFF_ON_CONNECTION_FAULT.asInstanceOf[js.Any], SNIFF_ON_START = SNIFF_ON_START.asInstanceOf[js.Any])
    __obj.asInstanceOf[DEFAULT]
  }
  
  extension [Self <: DEFAULT](x: Self) {
    
    inline def setDEFAULT(value: String): Self = StObject.set(x, "DEFAULT", value.asInstanceOf[js.Any])
    
    inline def setSNIFF_INTERVAL(value: String): Self = StObject.set(x, "SNIFF_INTERVAL", value.asInstanceOf[js.Any])
    
    inline def setSNIFF_ON_CONNECTION_FAULT(value: String): Self = StObject.set(x, "SNIFF_ON_CONNECTION_FAULT", value.asInstanceOf[js.Any])
    
    inline def setSNIFF_ON_START(value: String): Self = StObject.set(x, "SNIFF_ON_START", value.asInstanceOf[js.Any])
  }
}
