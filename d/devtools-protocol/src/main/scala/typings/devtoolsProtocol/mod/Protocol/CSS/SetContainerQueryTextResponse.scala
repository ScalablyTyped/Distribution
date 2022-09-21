package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetContainerQueryTextResponse extends StObject {
  
  /**
    * The resulting CSS container query rule after modification.
    */
  var containerQuery: CSSContainerQuery
}
object SetContainerQueryTextResponse {
  
  inline def apply(containerQuery: CSSContainerQuery): SetContainerQueryTextResponse = {
    val __obj = js.Dynamic.literal(containerQuery = containerQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetContainerQueryTextResponse]
  }
  
  extension [Self <: SetContainerQueryTextResponse](x: Self) {
    
    inline def setContainerQuery(value: CSSContainerQuery): Self = StObject.set(x, "containerQuery", value.asInstanceOf[js.Any])
  }
}
