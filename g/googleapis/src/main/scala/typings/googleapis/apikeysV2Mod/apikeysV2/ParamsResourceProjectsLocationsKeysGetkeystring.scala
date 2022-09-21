package typings.googleapis.apikeysV2Mod.apikeysV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsKeysGetkeystring
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the API key to be retrieved.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsKeysGetkeystring {
  
  inline def apply(): ParamsResourceProjectsLocationsKeysGetkeystring = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsKeysGetkeystring]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsKeysGetkeystring](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
