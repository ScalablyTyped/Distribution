package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaContentReportSummary extends StObject {
  
  /**
    * Total number of reports attached to this (revision of) message.
    */
  var numberReports: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Totoal number of reports attached to all revisions of this message (i.e. since creation). Set only when the request asks for it.
    */
  var numberReportsAllRevisions: js.UndefOr[Double | Null] = js.undefined
}
object SchemaContentReportSummary {
  
  inline def apply(): SchemaContentReportSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContentReportSummary]
  }
  
  extension [Self <: SchemaContentReportSummary](x: Self) {
    
    inline def setNumberReports(value: Double): Self = StObject.set(x, "numberReports", value.asInstanceOf[js.Any])
    
    inline def setNumberReportsAllRevisions(value: Double): Self = StObject.set(x, "numberReportsAllRevisions", value.asInstanceOf[js.Any])
    
    inline def setNumberReportsAllRevisionsNull: Self = StObject.set(x, "numberReportsAllRevisions", null)
    
    inline def setNumberReportsAllRevisionsUndefined: Self = StObject.set(x, "numberReportsAllRevisions", js.undefined)
    
    inline def setNumberReportsNull: Self = StObject.set(x, "numberReports", null)
    
    inline def setNumberReportsUndefined: Self = StObject.set(x, "numberReports", js.undefined)
  }
}
