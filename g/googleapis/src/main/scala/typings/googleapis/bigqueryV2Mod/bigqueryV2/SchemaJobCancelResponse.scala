package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaJobCancelResponse extends StObject {
  
  /**
    * The final state of the job.
    */
  var job: js.UndefOr[SchemaJob] = js.native
  
  /**
    * The resource type of the response.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaJobCancelResponse {
  
  @scala.inline
  def apply(): SchemaJobCancelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobCancelResponse]
  }
  
  @scala.inline
  implicit class SchemaJobCancelResponseMutableBuilder[Self <: SchemaJobCancelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJob(value: SchemaJob): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobUndefined: Self = StObject.set(x, "job", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
