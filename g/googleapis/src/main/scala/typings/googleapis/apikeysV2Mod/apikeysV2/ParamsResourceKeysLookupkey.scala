package typings.googleapis.apikeysV2Mod.apikeysV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceKeysLookupkey
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Finds the project that owns the key string value.
    */
  var keyString: js.UndefOr[String] = js.undefined
}
object ParamsResourceKeysLookupkey {
  
  inline def apply(): ParamsResourceKeysLookupkey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceKeysLookupkey]
  }
  
  extension [Self <: ParamsResourceKeysLookupkey](x: Self) {
    
    inline def setKeyString(value: String): Self = StObject.set(x, "keyString", value.asInstanceOf[js.Any])
    
    inline def setKeyStringUndefined: Self = StObject.set(x, "keyString", js.undefined)
  }
}
