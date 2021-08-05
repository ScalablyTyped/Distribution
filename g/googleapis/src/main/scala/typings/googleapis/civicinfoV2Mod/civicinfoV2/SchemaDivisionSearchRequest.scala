package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A search request for political geographies.
  */
trait SchemaDivisionSearchRequest extends StObject {
  
  var contextParams: js.UndefOr[SchemaContextParams] = js.undefined
}
object SchemaDivisionSearchRequest {
  
  inline def apply(): SchemaDivisionSearchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDivisionSearchRequest]
  }
  
  extension [Self <: SchemaDivisionSearchRequest](x: Self) {
    
    inline def setContextParams(value: SchemaContextParams): Self = StObject.set(x, "contextParams", value.asInstanceOf[js.Any])
    
    inline def setContextParamsUndefined: Self = StObject.set(x, "contextParams", js.undefined)
  }
}
