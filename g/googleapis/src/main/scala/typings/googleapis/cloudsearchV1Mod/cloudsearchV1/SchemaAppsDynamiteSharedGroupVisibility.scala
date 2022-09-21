package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedGroupVisibility extends StObject {
  
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaAppsDynamiteSharedGroupVisibility {
  
  inline def apply(): SchemaAppsDynamiteSharedGroupVisibility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedGroupVisibility]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedGroupVisibility](x: Self) {
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
