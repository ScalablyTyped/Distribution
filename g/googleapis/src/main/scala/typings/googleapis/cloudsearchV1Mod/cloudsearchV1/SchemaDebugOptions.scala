package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDebugOptions extends StObject {
  
  /**
    * If you are asked by Google to help with debugging, set this field. Otherwise, ignore this field.
    */
  var enableDebugging: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaDebugOptions {
  
  inline def apply(): SchemaDebugOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDebugOptions]
  }
  
  extension [Self <: SchemaDebugOptions](x: Self) {
    
    inline def setEnableDebugging(value: Boolean): Self = StObject.set(x, "enableDebugging", value.asInstanceOf[js.Any])
    
    inline def setEnableDebuggingNull: Self = StObject.set(x, "enableDebugging", null)
    
    inline def setEnableDebuggingUndefined: Self = StObject.set(x, "enableDebugging", js.undefined)
  }
}
