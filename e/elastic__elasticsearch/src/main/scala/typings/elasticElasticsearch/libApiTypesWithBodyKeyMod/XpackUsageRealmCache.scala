package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageRealmCache extends StObject {
  
  var size: long
}
object XpackUsageRealmCache {
  
  inline def apply(size: long): XpackUsageRealmCache = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageRealmCache]
  }
  
  extension [Self <: XpackUsageRealmCache](x: Self) {
    
    inline def setSize(value: long): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
