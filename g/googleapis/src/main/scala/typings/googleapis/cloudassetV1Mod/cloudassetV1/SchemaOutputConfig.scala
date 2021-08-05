package typings.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Output configuration for export assets destination.
  */
trait SchemaOutputConfig extends StObject {
  
  /**
    * Destination on Cloud Storage.
    */
  var gcsDestination: js.UndefOr[SchemaGcsDestination] = js.undefined
}
object SchemaOutputConfig {
  
  inline def apply(): SchemaOutputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOutputConfig]
  }
  
  extension [Self <: SchemaOutputConfig](x: Self) {
    
    inline def setGcsDestination(value: SchemaGcsDestination): Self = StObject.set(x, "gcsDestination", value.asInstanceOf[js.Any])
    
    inline def setGcsDestinationUndefined: Self = StObject.set(x, "gcsDestination", js.undefined)
  }
}
