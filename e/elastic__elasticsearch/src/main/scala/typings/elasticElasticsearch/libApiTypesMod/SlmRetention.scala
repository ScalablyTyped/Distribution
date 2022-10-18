package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlmRetention extends StObject {
  
  var expire_after: Duration
  
  var max_count: integer
  
  var min_count: integer
}
object SlmRetention {
  
  inline def apply(expire_after: Duration, max_count: integer, min_count: integer): SlmRetention = {
    val __obj = js.Dynamic.literal(expire_after = expire_after.asInstanceOf[js.Any], max_count = max_count.asInstanceOf[js.Any], min_count = min_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlmRetention]
  }
  
  extension [Self <: SlmRetention](x: Self) {
    
    inline def setExpire_after(value: Duration): Self = StObject.set(x, "expire_after", value.asInstanceOf[js.Any])
    
    inline def setMax_count(value: integer): Self = StObject.set(x, "max_count", value.asInstanceOf[js.Any])
    
    inline def setMin_count(value: integer): Self = StObject.set(x, "min_count", value.asInstanceOf[js.Any])
  }
}
