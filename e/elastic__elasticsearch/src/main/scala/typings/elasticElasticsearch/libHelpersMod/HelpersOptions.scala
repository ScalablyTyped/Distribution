package typings.elasticElasticsearch.libHelpersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HelpersOptions extends StObject {
  
  var client: typings.elasticElasticsearch.libClientMod.default
  
  var maxRetries: Double
  
  var metaHeader: String | Null
}
object HelpersOptions {
  
  inline def apply(client: typings.elasticElasticsearch.libClientMod.default, maxRetries: Double): HelpersOptions = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], maxRetries = maxRetries.asInstanceOf[js.Any], metaHeader = null)
    __obj.asInstanceOf[HelpersOptions]
  }
  
  extension [Self <: HelpersOptions](x: Self) {
    
    inline def setClient(value: typings.elasticElasticsearch.libClientMod.default): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    
    inline def setMetaHeader(value: String): Self = StObject.set(x, "metaHeader", value.asInstanceOf[js.Any])
    
    inline def setMetaHeaderNull: Self = StObject.set(x, "metaHeader", null)
  }
}
