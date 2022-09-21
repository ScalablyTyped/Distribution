package typings.googleapis.analyticsdataV1betaMod.analyticsdataV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCohortSpec extends StObject {
  
  /**
    * Optional settings for a cohort report.
    */
  var cohortReportSettings: js.UndefOr[SchemaCohortReportSettings] = js.undefined
  
  /**
    * Defines the selection criteria to group users into cohorts. Most cohort reports define only a single cohort. If multiple cohorts are specified, each cohort can be recognized in the report by their name.
    */
  var cohorts: js.UndefOr[js.Array[SchemaCohort]] = js.undefined
  
  /**
    * Cohort reports follow cohorts over an extended reporting date range. This range specifies an offset duration to follow the cohorts over.
    */
  var cohortsRange: js.UndefOr[SchemaCohortsRange] = js.undefined
}
object SchemaCohortSpec {
  
  inline def apply(): SchemaCohortSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCohortSpec]
  }
  
  extension [Self <: SchemaCohortSpec](x: Self) {
    
    inline def setCohortReportSettings(value: SchemaCohortReportSettings): Self = StObject.set(x, "cohortReportSettings", value.asInstanceOf[js.Any])
    
    inline def setCohortReportSettingsUndefined: Self = StObject.set(x, "cohortReportSettings", js.undefined)
    
    inline def setCohorts(value: js.Array[SchemaCohort]): Self = StObject.set(x, "cohorts", value.asInstanceOf[js.Any])
    
    inline def setCohortsRange(value: SchemaCohortsRange): Self = StObject.set(x, "cohortsRange", value.asInstanceOf[js.Any])
    
    inline def setCohortsRangeUndefined: Self = StObject.set(x, "cohortsRange", js.undefined)
    
    inline def setCohortsUndefined: Self = StObject.set(x, "cohorts", js.undefined)
    
    inline def setCohortsVarargs(value: SchemaCohort*): Self = StObject.set(x, "cohorts", js.Array(value*))
  }
}
