package typings.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFeedOutputConfig extends StObject {
  
  /**
    * Destination on Pub/Sub.
    */
  var pubsubDestination: js.UndefOr[SchemaPubsubDestination] = js.undefined
}
object SchemaFeedOutputConfig {
  
  inline def apply(): SchemaFeedOutputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFeedOutputConfig]
  }
  
  extension [Self <: SchemaFeedOutputConfig](x: Self) {
    
    inline def setPubsubDestination(value: SchemaPubsubDestination): Self = StObject.set(x, "pubsubDestination", value.asInstanceOf[js.Any])
    
    inline def setPubsubDestinationUndefined: Self = StObject.set(x, "pubsubDestination", js.undefined)
  }
}
