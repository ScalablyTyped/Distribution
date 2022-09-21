package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedContentReportType extends StObject {
  
  /**
    * Required. Google-defined system violation, covering the most common violations.
    */
  var systemViolation: js.UndefOr[String | Null] = js.undefined
}
object SchemaAppsDynamiteSharedContentReportType {
  
  inline def apply(): SchemaAppsDynamiteSharedContentReportType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedContentReportType]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedContentReportType](x: Self) {
    
    inline def setSystemViolation(value: String): Self = StObject.set(x, "systemViolation", value.asInstanceOf[js.Any])
    
    inline def setSystemViolationNull: Self = StObject.set(x, "systemViolation", null)
    
    inline def setSystemViolationUndefined: Self = StObject.set(x, "systemViolation", js.undefined)
  }
}
