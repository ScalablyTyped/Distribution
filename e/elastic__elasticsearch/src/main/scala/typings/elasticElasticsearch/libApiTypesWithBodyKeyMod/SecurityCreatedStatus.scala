package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityCreatedStatus extends StObject {
  
  var created: Boolean
}
object SecurityCreatedStatus {
  
  inline def apply(created: Boolean): SecurityCreatedStatus = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityCreatedStatus]
  }
  
  extension [Self <: SecurityCreatedStatus](x: Self) {
    
    inline def setCreated(value: Boolean): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
  }
}
