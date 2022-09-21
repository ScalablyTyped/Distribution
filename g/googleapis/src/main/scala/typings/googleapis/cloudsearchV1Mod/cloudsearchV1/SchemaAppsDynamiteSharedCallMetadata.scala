package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedCallMetadata extends StObject {
  
  /**
    * Metadata specific for the Meet call.
    */
  var meetMetadata: js.UndefOr[SchemaAppsDynamiteSharedMeetMetadata] = js.undefined
}
object SchemaAppsDynamiteSharedCallMetadata {
  
  inline def apply(): SchemaAppsDynamiteSharedCallMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedCallMetadata]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedCallMetadata](x: Self) {
    
    inline def setMeetMetadata(value: SchemaAppsDynamiteSharedMeetMetadata): Self = StObject.set(x, "meetMetadata", value.asInstanceOf[js.Any])
    
    inline def setMeetMetadataUndefined: Self = StObject.set(x, "meetMetadata", js.undefined)
  }
}
