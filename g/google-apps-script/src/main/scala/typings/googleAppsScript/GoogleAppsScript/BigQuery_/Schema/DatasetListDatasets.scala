package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatasetListDatasets extends StObject {
  
  var datasetReference: js.UndefOr[DatasetReference] = js.native
  
  var friendlyName: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var labels: js.UndefOr[js.Object] = js.native
  
  var location: js.UndefOr[String] = js.native
}
object DatasetListDatasets {
  
  @scala.inline
  def apply(): DatasetListDatasets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetListDatasets]
  }
  
  @scala.inline
  implicit class DatasetListDatasetsMutableBuilder[Self <: DatasetListDatasets] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatasetReference(value: DatasetReference): Self = StObject.set(x, "datasetReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetReferenceUndefined: Self = StObject.set(x, "datasetReference", js.undefined)
    
    @scala.inline
    def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLabels(value: js.Object): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
  }
}
