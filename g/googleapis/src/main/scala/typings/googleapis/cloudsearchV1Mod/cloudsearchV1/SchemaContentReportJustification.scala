package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaContentReportJustification extends StObject {
  
  /**
    * Optional. User-generated free-text justification for the content report.
    */
  var userJustification: js.UndefOr[String | Null] = js.undefined
}
object SchemaContentReportJustification {
  
  inline def apply(): SchemaContentReportJustification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContentReportJustification]
  }
  
  extension [Self <: SchemaContentReportJustification](x: Self) {
    
    inline def setUserJustification(value: String): Self = StObject.set(x, "userJustification", value.asInstanceOf[js.Any])
    
    inline def setUserJustificationNull: Self = StObject.set(x, "userJustification", null)
    
    inline def setUserJustificationUndefined: Self = StObject.set(x, "userJustification", js.undefined)
  }
}
