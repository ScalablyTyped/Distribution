package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesInfoNodeInfoTransport extends StObject {
  
  var bound_address: js.Array[String]
  
  var profiles: Record[String, String]
  
  var publish_address: String
}
object NodesInfoNodeInfoTransport {
  
  inline def apply(bound_address: js.Array[String], profiles: Record[String, String], publish_address: String): NodesInfoNodeInfoTransport = {
    val __obj = js.Dynamic.literal(bound_address = bound_address.asInstanceOf[js.Any], profiles = profiles.asInstanceOf[js.Any], publish_address = publish_address.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesInfoNodeInfoTransport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesInfoNodeInfoTransport] (val x: Self) extends AnyVal {
    
    inline def setBound_address(value: js.Array[String]): Self = StObject.set(x, "bound_address", value.asInstanceOf[js.Any])
    
    inline def setBound_addressVarargs(value: String*): Self = StObject.set(x, "bound_address", js.Array(value*))
    
    inline def setProfiles(value: Record[String, String]): Self = StObject.set(x, "profiles", value.asInstanceOf[js.Any])
    
    inline def setPublish_address(value: String): Self = StObject.set(x, "publish_address", value.asInstanceOf[js.Any])
  }
}
