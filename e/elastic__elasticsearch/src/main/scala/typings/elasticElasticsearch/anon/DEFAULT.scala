package typings.elasticElasticsearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DEFAULT extends StObject {
  
  var DEFAULT: String = js.native
  
  var SNIFF_INTERVAL: String = js.native
  
  var SNIFF_ON_CONNECTION_FAULT: String = js.native
  
  var SNIFF_ON_START: String = js.native
}
object DEFAULT {
  
  @scala.inline
  def apply(DEFAULT: String, SNIFF_INTERVAL: String, SNIFF_ON_CONNECTION_FAULT: String, SNIFF_ON_START: String): DEFAULT = {
    val __obj = js.Dynamic.literal(DEFAULT = DEFAULT.asInstanceOf[js.Any], SNIFF_INTERVAL = SNIFF_INTERVAL.asInstanceOf[js.Any], SNIFF_ON_CONNECTION_FAULT = SNIFF_ON_CONNECTION_FAULT.asInstanceOf[js.Any], SNIFF_ON_START = SNIFF_ON_START.asInstanceOf[js.Any])
    __obj.asInstanceOf[DEFAULT]
  }
  
  @scala.inline
  implicit class DEFAULTMutableBuilder[Self <: DEFAULT] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDEFAULT(value: String): Self = StObject.set(x, "DEFAULT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSNIFF_INTERVAL(value: String): Self = StObject.set(x, "SNIFF_INTERVAL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSNIFF_ON_CONNECTION_FAULT(value: String): Self = StObject.set(x, "SNIFF_ON_CONNECTION_FAULT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSNIFF_ON_START(value: String): Self = StObject.set(x, "SNIFF_ON_START", value.asInstanceOf[js.Any])
  }
}
