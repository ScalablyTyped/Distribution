package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageDatafeed extends StObject {
  
  var count: long
}
object XpackUsageDatafeed {
  
  inline def apply(count: long): XpackUsageDatafeed = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageDatafeed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XpackUsageDatafeed] (val x: Self) extends AnyVal {
    
    inline def setCount(value: long): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
  }
}
