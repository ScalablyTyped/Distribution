package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityTransientMetadataConfig extends StObject {
  
  var enabled: Boolean
}
object SecurityTransientMetadataConfig {
  
  inline def apply(enabled: Boolean): SecurityTransientMetadataConfig = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityTransientMetadataConfig]
  }
  
  extension [Self <: SecurityTransientMetadataConfig](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
