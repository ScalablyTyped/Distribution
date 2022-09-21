package typings.googleapis.artifactregistryV1Mod.artifactregistryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProjectSettings extends StObject {
  
  /**
    * The redirection state of the legacy repositories in this project.
    */
  var legacyRedirectionState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the project's settings. Always of the form: projects/{project-id\}/projectSettings In update request: never set In response: always set
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaProjectSettings {
  
  inline def apply(): SchemaProjectSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProjectSettings]
  }
  
  extension [Self <: SchemaProjectSettings](x: Self) {
    
    inline def setLegacyRedirectionState(value: String): Self = StObject.set(x, "legacyRedirectionState", value.asInstanceOf[js.Any])
    
    inline def setLegacyRedirectionStateNull: Self = StObject.set(x, "legacyRedirectionState", null)
    
    inline def setLegacyRedirectionStateUndefined: Self = StObject.set(x, "legacyRedirectionState", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
