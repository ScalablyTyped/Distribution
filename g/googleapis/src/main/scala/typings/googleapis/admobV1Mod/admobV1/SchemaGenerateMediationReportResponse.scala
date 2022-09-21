package typings.googleapis.admobV1Mod.admobV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGenerateMediationReportResponse extends StObject {
  
  /**
    * Additional information about the generated report, such as warnings about the data.
    */
  var footer: js.UndefOr[SchemaReportFooter] = js.undefined
  
  /**
    * Report generation settings that describes the report contents, such as the report date range and localization settings.
    */
  var header: js.UndefOr[SchemaReportHeader] = js.undefined
  
  /**
    * Actual report data.
    */
  var row: js.UndefOr[SchemaReportRow] = js.undefined
}
object SchemaGenerateMediationReportResponse {
  
  inline def apply(): SchemaGenerateMediationReportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGenerateMediationReportResponse]
  }
  
  extension [Self <: SchemaGenerateMediationReportResponse](x: Self) {
    
    inline def setFooter(value: SchemaReportFooter): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setHeader(value: SchemaReportHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setRow(value: SchemaReportRow): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
  }
}
