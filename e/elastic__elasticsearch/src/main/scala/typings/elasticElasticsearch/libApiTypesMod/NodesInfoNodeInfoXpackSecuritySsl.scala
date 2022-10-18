package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesInfoNodeInfoXpackSecuritySsl extends StObject {
  
  var ssl: Record[String, String]
}
object NodesInfoNodeInfoXpackSecuritySsl {
  
  inline def apply(ssl: Record[String, String]): NodesInfoNodeInfoXpackSecuritySsl = {
    val __obj = js.Dynamic.literal(ssl = ssl.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesInfoNodeInfoXpackSecuritySsl]
  }
  
  extension [Self <: NodesInfoNodeInfoXpackSecuritySsl](x: Self) {
    
    inline def setSsl(value: Record[String, String]): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
  }
}
