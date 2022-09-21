package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstancePropertiesPatch extends StObject {
  
  /**
    * The label key-value pairs that you want to patch onto the instance.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The metadata key-value pairs that you want to patch onto the instance. For more information, see Project and instance metadata.
    */
  var metadata: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaInstancePropertiesPatch {
  
  inline def apply(): SchemaInstancePropertiesPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancePropertiesPatch]
  }
  
  extension [Self <: SchemaInstancePropertiesPatch](x: Self) {
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMetadata(value: StringDictionary[String]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
