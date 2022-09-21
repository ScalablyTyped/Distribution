package typings.googleapis.cloudbuildV1alpha1Mod.cloudbuildV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNotifierConfig extends StObject {
  
  /**
    * The API version of this configuration format.
    */
  var apiVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of notifier to use (e.g. SMTPNotifier).
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Metadata for referring to/handling/deploying this notifier.
    */
  var metadata: js.UndefOr[SchemaNotifierMetadata] = js.undefined
  
  /**
    * The actual configuration for this notifier.
    */
  var spec: js.UndefOr[SchemaNotifierSpec] = js.undefined
}
object SchemaNotifierConfig {
  
  inline def apply(): SchemaNotifierConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNotifierConfig]
  }
  
  extension [Self <: SchemaNotifierConfig](x: Self) {
    
    inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionNull: Self = StObject.set(x, "apiVersion", null)
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMetadata(value: SchemaNotifierMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setSpec(value: SchemaNotifierSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
  }
}
