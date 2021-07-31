package typings.elasticElasticsearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofConnectionPool extends StObject {
  
  /* static member */
  var resurrectStrategies: None
}
object TypeofConnectionPool {
  
  @scala.inline
  def apply(resurrectStrategies: None): TypeofConnectionPool = {
    val __obj = js.Dynamic.literal(resurrectStrategies = resurrectStrategies.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofConnectionPool]
  }
  
  @scala.inline
  implicit class TypeofConnectionPoolMutableBuilder[Self <: TypeofConnectionPool] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResurrectStrategies(value: None): Self = StObject.set(x, "resurrectStrategies", value.asInstanceOf[js.Any])
  }
}
