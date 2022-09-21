package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLocationMetadata extends StObject {
  
  /**
    * The legacy BigQuery location ID, e.g. “EU” for the “europe” location. This is for any API consumers that need the legacy “US” and “EU” locations.
    */
  var legacyLocationId: js.UndefOr[String | Null] = js.undefined
}
object SchemaLocationMetadata {
  
  inline def apply(): SchemaLocationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocationMetadata]
  }
  
  extension [Self <: SchemaLocationMetadata](x: Self) {
    
    inline def setLegacyLocationId(value: String): Self = StObject.set(x, "legacyLocationId", value.asInstanceOf[js.Any])
    
    inline def setLegacyLocationIdNull: Self = StObject.set(x, "legacyLocationId", null)
    
    inline def setLegacyLocationIdUndefined: Self = StObject.set(x, "legacyLocationId", js.undefined)
  }
}
