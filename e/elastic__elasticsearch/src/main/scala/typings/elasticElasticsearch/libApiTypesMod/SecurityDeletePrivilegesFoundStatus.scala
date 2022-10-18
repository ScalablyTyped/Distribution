package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityDeletePrivilegesFoundStatus extends StObject {
  
  var found: Boolean
}
object SecurityDeletePrivilegesFoundStatus {
  
  inline def apply(found: Boolean): SecurityDeletePrivilegesFoundStatus = {
    val __obj = js.Dynamic.literal(found = found.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityDeletePrivilegesFoundStatus]
  }
  
  extension [Self <: SecurityDeletePrivilegesFoundStatus](x: Self) {
    
    inline def setFound(value: Boolean): Self = StObject.set(x, "found", value.asInstanceOf[js.Any])
  }
}
