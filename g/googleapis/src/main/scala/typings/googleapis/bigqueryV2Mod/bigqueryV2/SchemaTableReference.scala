package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaTableReference extends StObject {
  
  /**
    * [Required] The ID of the dataset containing this table.
    */
  var datasetId: js.UndefOr[String] = js.native
  
  /**
    * [Required] The ID of the project containing this table.
    */
  var projectId: js.UndefOr[String] = js.native
  
  /**
    * [Required] The ID of the table. The ID must contain only letters (a-z,
    * A-Z), numbers (0-9), or underscores (_). The maximum length is 1,024
    * characters.
    */
  var tableId: js.UndefOr[String] = js.native
}
object SchemaTableReference {
  
  @scala.inline
  def apply(): SchemaTableReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableReference]
  }
  
  @scala.inline
  implicit class SchemaTableReferenceMutableBuilder[Self <: SchemaTableReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
  }
}
