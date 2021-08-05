package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobCancelResponse extends StObject {
  
  var job: js.UndefOr[Job] = js.undefined
  
  var kind: js.UndefOr[String] = js.undefined
}
object JobCancelResponse {
  
  inline def apply(): JobCancelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobCancelResponse]
  }
  
  extension [Self <: JobCancelResponse](x: Self) {
    
    inline def setJob(value: Job): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    inline def setJobUndefined: Self = StObject.set(x, "job", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
