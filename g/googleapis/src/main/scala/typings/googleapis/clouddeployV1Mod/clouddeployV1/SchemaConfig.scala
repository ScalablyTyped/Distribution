package typings.googleapis.clouddeployV1Mod.clouddeployV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConfig extends StObject {
  
  /**
    * Output only. Default Skaffold version that is assigned when a Release is created without specifying a Skaffold version.
    */
  var defaultSkaffoldVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the configuration.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. All supported versions of Skaffold.
    */
  var supportedVersions: js.UndefOr[js.Array[SchemaSkaffoldVersion]] = js.undefined
}
object SchemaConfig {
  
  inline def apply(): SchemaConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfig]
  }
  
  extension [Self <: SchemaConfig](x: Self) {
    
    inline def setDefaultSkaffoldVersion(value: String): Self = StObject.set(x, "defaultSkaffoldVersion", value.asInstanceOf[js.Any])
    
    inline def setDefaultSkaffoldVersionNull: Self = StObject.set(x, "defaultSkaffoldVersion", null)
    
    inline def setDefaultSkaffoldVersionUndefined: Self = StObject.set(x, "defaultSkaffoldVersion", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSupportedVersions(value: js.Array[SchemaSkaffoldVersion]): Self = StObject.set(x, "supportedVersions", value.asInstanceOf[js.Any])
    
    inline def setSupportedVersionsUndefined: Self = StObject.set(x, "supportedVersions", js.undefined)
    
    inline def setSupportedVersionsVarargs(value: SchemaSkaffoldVersion*): Self = StObject.set(x, "supportedVersions", js.Array(value*))
  }
}
