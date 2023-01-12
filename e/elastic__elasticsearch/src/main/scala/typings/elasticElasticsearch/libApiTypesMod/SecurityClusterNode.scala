package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityClusterNode extends StObject {
  
  var name: Name
}
object SecurityClusterNode {
  
  inline def apply(name: Name): SecurityClusterNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityClusterNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityClusterNode] (val x: Self) extends AnyVal {
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
