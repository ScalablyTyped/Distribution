package typings.elasticElasticsearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait None extends StObject {
  
  var none: Double
  
  var optimistic: Double
  
  var ping: Double
}
object None {
  
  inline def apply(none: Double, optimistic: Double, ping: Double): None = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], optimistic = optimistic.asInstanceOf[js.Any], ping = ping.asInstanceOf[js.Any])
    __obj.asInstanceOf[None]
  }
  
  extension [Self <: None](x: Self) {
    
    inline def setNone(value: Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setOptimistic(value: Double): Self = StObject.set(x, "optimistic", value.asInstanceOf[js.Any])
    
    inline def setPing(value: Double): Self = StObject.set(x, "ping", value.asInstanceOf[js.Any])
  }
}
