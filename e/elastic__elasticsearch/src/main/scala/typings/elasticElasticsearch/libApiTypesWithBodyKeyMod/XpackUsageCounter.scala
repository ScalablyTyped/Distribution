package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageCounter extends StObject {
  
  var active: long
  
  var total: long
}
object XpackUsageCounter {
  
  inline def apply(active: long, total: long): XpackUsageCounter = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageCounter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XpackUsageCounter] (val x: Self) extends AnyVal {
    
    inline def setActive(value: long): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: long): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
