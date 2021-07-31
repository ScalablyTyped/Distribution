package typings.googleapis.anon

import org.scalablytyped.runtime.StringDictionary
import typings.googleapis.bigqueryV2Mod.bigqueryV2.SchemaDatasetReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetReference extends StObject {
  
  var datasetReference: js.UndefOr[SchemaDatasetReference] = js.undefined
  
  var friendlyName: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var kind: js.UndefOr[String] = js.undefined
  
  var labels: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var location: js.UndefOr[String] = js.undefined
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
    def setDatasetReference(value: SchemaDatasetReference): Self = StObject.set(x, "datasetReference", value.asInstanceOf[js.Any])
    
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
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
  }
}
