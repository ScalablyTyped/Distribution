package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaShareSettings extends StObject {
  
  /**
    * A map of folder id and folder config to specify consumer projects for this shared-reservation. This is only valid when share_type's value is DIRECT_PROJECTS_UNDER_SPECIFIC_FOLDERS. Folder id should be a string of number, and without "folders/" prefix.
    */
  var folderMap: js.UndefOr[StringDictionary[SchemaShareSettingsFolderConfig] | Null] = js.undefined
  
  /**
    * A map of project id and project config. This is only valid when share_type's value is SPECIFIC_PROJECTS.
    */
  var projectMap: js.UndefOr[StringDictionary[SchemaShareSettingsProjectConfig] | Null] = js.undefined
  
  /**
    * A List of Project names to specify consumer projects for this shared-reservation. This is only valid when share_type's value is SPECIFIC_PROJECTS.
    */
  var projects: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Type of sharing for this shared-reservation
    */
  var shareType: js.UndefOr[String | Null] = js.undefined
}
object SchemaShareSettings {
  
  inline def apply(): SchemaShareSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShareSettings]
  }
  
  extension [Self <: SchemaShareSettings](x: Self) {
    
    inline def setFolderMap(value: StringDictionary[SchemaShareSettingsFolderConfig]): Self = StObject.set(x, "folderMap", value.asInstanceOf[js.Any])
    
    inline def setFolderMapNull: Self = StObject.set(x, "folderMap", null)
    
    inline def setFolderMapUndefined: Self = StObject.set(x, "folderMap", js.undefined)
    
    inline def setProjectMap(value: StringDictionary[SchemaShareSettingsProjectConfig]): Self = StObject.set(x, "projectMap", value.asInstanceOf[js.Any])
    
    inline def setProjectMapNull: Self = StObject.set(x, "projectMap", null)
    
    inline def setProjectMapUndefined: Self = StObject.set(x, "projectMap", js.undefined)
    
    inline def setProjects(value: js.Array[String]): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
    
    inline def setProjectsNull: Self = StObject.set(x, "projects", null)
    
    inline def setProjectsUndefined: Self = StObject.set(x, "projects", js.undefined)
    
    inline def setProjectsVarargs(value: String*): Self = StObject.set(x, "projects", js.Array(value*))
    
    inline def setShareType(value: String): Self = StObject.set(x, "shareType", value.asInstanceOf[js.Any])
    
    inline def setShareTypeNull: Self = StObject.set(x, "shareType", null)
    
    inline def setShareTypeUndefined: Self = StObject.set(x, "shareType", js.undefined)
  }
}
