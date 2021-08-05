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
  
  inline def apply(): DatasetReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetReference]
  }
  
  extension [Self <: DatasetReference](x: Self) {
    
    inline def setDatasetReference(value: SchemaDatasetReference): Self = StObject.set(x, "datasetReference", value.asInstanceOf[js.Any])
    
    inline def setDatasetReferenceUndefined: Self = StObject.set(x, "datasetReference", js.undefined)
    
    inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
  }
}
