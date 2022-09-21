package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaJobCancelResponse extends StObject {
  
  /**
    * The final state of the job.
    */
  var job: js.UndefOr[SchemaJob] = js.undefined
  
  /**
    * The resource type of the response.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaJobCancelResponse {
  
  inline def apply(): SchemaJobCancelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobCancelResponse]
  }
  
  extension [Self <: SchemaJobCancelResponse](x: Self) {
    
    inline def setJob(value: SchemaJob): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    inline def setJobUndefined: Self = StObject.set(x, "job", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
