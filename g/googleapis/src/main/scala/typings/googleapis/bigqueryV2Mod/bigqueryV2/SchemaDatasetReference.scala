package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDatasetReference extends StObject {
  
  /**
    * [Required] A unique ID for this dataset, without the project name. The ID
    * must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_).
    * The maximum length is 1,024 characters.
    */
  var datasetId: js.UndefOr[String] = js.undefined
  
  /**
    * [Optional] The ID of the project containing this dataset.
    */
  var projectId: js.UndefOr[String] = js.undefined
}
object SchemaDatasetReference {
  
  @scala.inline
  def apply(): SchemaDatasetReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatasetReference]
  }
  
  @scala.inline
  implicit class SchemaDatasetReferenceMutableBuilder[Self <: SchemaDatasetReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
