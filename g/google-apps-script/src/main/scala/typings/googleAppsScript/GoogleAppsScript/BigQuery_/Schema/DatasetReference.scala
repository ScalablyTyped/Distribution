package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetReference extends StObject {
  
  var datasetId: js.UndefOr[String] = js.undefined
  
  var projectId: js.UndefOr[String] = js.undefined
}
object DatasetReference {
  
  @scala.inline
  def apply(): DatasetReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetReference]
  }
  
  @scala.inline
  implicit class DatasetReferenceMutableBuilder[Self <: DatasetReference] (val x: Self) extends AnyVal {
    
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
