package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MigrationDeprecationsDeprecation extends StObject {
  
  var details: String
  
  var level: MigrationDeprecationsDeprecationLevel
  
  var message: String
  
  var url: String
}
object MigrationDeprecationsDeprecation {
  
  inline def apply(details: String, level: MigrationDeprecationsDeprecationLevel, message: String, url: String): MigrationDeprecationsDeprecation = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationDeprecationsDeprecation]
  }
  
  extension [Self <: MigrationDeprecationsDeprecation](x: Self) {
    
    inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: MigrationDeprecationsDeprecationLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
