package typings.elasticElasticsearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofConnectionPool extends StObject {
  
  /* static member */
  var resurrectStrategies: None
}
object TypeofConnectionPool {
  
  inline def apply(resurrectStrategies: None): TypeofConnectionPool = {
    val __obj = js.Dynamic.literal(resurrectStrategies = resurrectStrategies.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofConnectionPool]
  }
  
  extension [Self <: TypeofConnectionPool](x: Self) {
    
    inline def setResurrectStrategies(value: None): Self = StObject.set(x, "resurrectStrategies", value.asInstanceOf[js.Any])
  }
}
