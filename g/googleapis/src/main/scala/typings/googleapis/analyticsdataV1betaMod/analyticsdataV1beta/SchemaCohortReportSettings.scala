package typings.googleapis.analyticsdataV1betaMod.analyticsdataV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCohortReportSettings extends StObject {
  
  /**
    * If true, accumulates the result from first touch day to the end day. Not supported in `RunReportRequest`.
    */
  var accumulate: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaCohortReportSettings {
  
  inline def apply(): SchemaCohortReportSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCohortReportSettings]
  }
  
  extension [Self <: SchemaCohortReportSettings](x: Self) {
    
    inline def setAccumulate(value: Boolean): Self = StObject.set(x, "accumulate", value.asInstanceOf[js.Any])
    
    inline def setAccumulateNull: Self = StObject.set(x, "accumulate", null)
    
    inline def setAccumulateUndefined: Self = StObject.set(x, "accumulate", js.undefined)
  }
}
