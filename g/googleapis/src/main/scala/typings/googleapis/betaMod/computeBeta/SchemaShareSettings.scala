package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaShareSettings extends StObject {
  
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
