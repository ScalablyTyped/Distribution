package typings.elasticElasticsearch.libApiTypesMod

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
  
  extension [Self <: XpackUsageMlCounter](x: Self) {
    
    inline def setCount(value: long): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
  }
}
