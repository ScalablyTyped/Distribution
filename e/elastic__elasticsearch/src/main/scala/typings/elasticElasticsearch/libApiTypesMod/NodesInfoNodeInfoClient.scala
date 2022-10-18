package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesInfoNodeInfoClient extends StObject {
  
  var `type`: String
}
object NodesInfoNodeInfoClient {
  
  inline def apply(`type`: String): NodesInfoNodeInfoClient = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesInfoNodeInfoClient]
  }
  
  extension [Self <: NodesInfoNodeInfoClient](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
