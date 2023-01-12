package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGetServiceCredentialsNodesCredentialsFileToken extends StObject {
  
  var nodes: js.Array[String]
}
object SecurityGetServiceCredentialsNodesCredentialsFileToken {
  
  inline def apply(nodes: js.Array[String]): SecurityGetServiceCredentialsNodesCredentialsFileToken = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGetServiceCredentialsNodesCredentialsFileToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityGetServiceCredentialsNodesCredentialsFileToken] (val x: Self) extends AnyVal {
    
    inline def setNodes(value: js.Array[String]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: String*): Self = StObject.set(x, "nodes", js.Array(value*))
  }
}
