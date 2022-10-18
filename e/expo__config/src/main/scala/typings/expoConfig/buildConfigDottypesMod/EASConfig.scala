package typings.expoConfig.buildConfigDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EASConfig extends StObject {
  
  var projectId: js.UndefOr[String] = js.undefined
}
object EASConfig {
  
  inline def apply(): EASConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EASConfig]
  }
  
  extension [Self <: EASConfig](x: Self) {
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
