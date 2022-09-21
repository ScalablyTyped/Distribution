package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExpansionFile extends StObject {
  
  /**
    * If set, this field indicates that this APK has an expansion file uploaded to it: this APK does not reference another APK's expansion file. The field's value is the size of the uploaded expansion file in bytes.
    */
  var fileSize: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If set, this APK's expansion file references another APK's expansion file. The file_size field will not be set.
    */
  var referencesVersion: js.UndefOr[Double | Null] = js.undefined
}
object SchemaExpansionFile {
  
  inline def apply(): SchemaExpansionFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExpansionFile]
  }
  
  extension [Self <: SchemaExpansionFile](x: Self) {
    
    inline def setFileSize(value: String): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
    
    inline def setFileSizeNull: Self = StObject.set(x, "fileSize", null)
    
    inline def setFileSizeUndefined: Self = StObject.set(x, "fileSize", js.undefined)
    
    inline def setReferencesVersion(value: Double): Self = StObject.set(x, "referencesVersion", value.asInstanceOf[js.Any])
    
    inline def setReferencesVersionNull: Self = StObject.set(x, "referencesVersion", null)
    
    inline def setReferencesVersionUndefined: Self = StObject.set(x, "referencesVersion", js.undefined)
  }
}
