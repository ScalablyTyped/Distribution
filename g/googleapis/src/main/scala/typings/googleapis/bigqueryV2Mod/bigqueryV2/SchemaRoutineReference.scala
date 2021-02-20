package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaRoutineReference extends StObject {
  
  /**
    * [Required] The ID of the dataset containing this routine.
    */
  var datasetId: js.UndefOr[String] = js.native
  
  /**
    * [Required] The ID of the project containing this routine.
    */
  var projectId: js.UndefOr[String] = js.native
  
  /**
    * [Required] The ID of the routine. The ID must contain only letters (a-z,
    * A-Z), numbers (0-9), or underscores (_). The maximum length is 256
    * characters.
    */
  var routineId: js.UndefOr[String] = js.native
}
object SchemaRoutineReference {
  
  @scala.inline
  def apply(): SchemaRoutineReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoutineReference]
  }
  
  @scala.inline
  implicit class SchemaRoutineReferenceMutableBuilder[Self <: SchemaRoutineReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setRoutineId(value: String): Self = StObject.set(x, "routineId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutineIdUndefined: Self = StObject.set(x, "routineId", js.undefined)
  }
}
