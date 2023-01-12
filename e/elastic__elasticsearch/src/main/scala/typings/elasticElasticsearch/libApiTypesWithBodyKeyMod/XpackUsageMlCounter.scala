package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageMlCounter extends StObject {
  
  var count: long
}
object XpackUsageMlCounter {
  
  inline def apply(count: long): XpackUsageMlCounter = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageMlCounter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XpackUsageMlCounter] (val x: Self) extends AnyVal {
    
    inline def setCount(value: long): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
  }
}
