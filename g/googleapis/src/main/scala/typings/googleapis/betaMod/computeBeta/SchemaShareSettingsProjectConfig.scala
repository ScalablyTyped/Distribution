package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaShareSettingsProjectConfig extends StObject {
  
  /**
    * The project ID, should be same as the key of this project config in the parent map.
    */
  var projectId: js.UndefOr[String | Null] = js.undefined
}
object SchemaShareSettingsProjectConfig {
  
  inline def apply(): SchemaShareSettingsProjectConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShareSettingsProjectConfig]
  }
  
  extension [Self <: SchemaShareSettingsProjectConfig](x: Self) {
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
