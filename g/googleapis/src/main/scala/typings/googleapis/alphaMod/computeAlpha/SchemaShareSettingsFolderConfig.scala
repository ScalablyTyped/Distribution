package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaShareSettingsFolderConfig extends StObject {
  
  /**
    * The folder ID, should be same as the key of this folder config in the parent map. Folder id should be a string of number, and without "folders/" prefix.
    */
  var folderId: js.UndefOr[String | Null] = js.undefined
}
object SchemaShareSettingsFolderConfig {
  
  inline def apply(): SchemaShareSettingsFolderConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShareSettingsFolderConfig]
  }
  
  extension [Self <: SchemaShareSettingsFolderConfig](x: Self) {
    
    inline def setFolderId(value: String): Self = StObject.set(x, "folderId", value.asInstanceOf[js.Any])
    
    inline def setFolderIdNull: Self = StObject.set(x, "folderId", null)
    
    inline def setFolderIdUndefined: Self = StObject.set(x, "folderId", js.undefined)
  }
}
