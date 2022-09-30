package typings.googleCloudSpanner.mod

import typings.googleGax.gaxMod.CallOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInstanceConfigOptions extends StObject {
  
  var gaxOptions: js.UndefOr[CallOptions] = js.undefined
}
object GetInstanceConfigOptions {
  
  inline def apply(): GetInstanceConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInstanceConfigOptions]
  }
  
  extension [Self <: GetInstanceConfigOptions](x: Self) {
    
    inline def setGaxOptions(value: CallOptions): Self = StObject.set(x, "gaxOptions", value.asInstanceOf[js.Any])
    
    inline def setGaxOptionsUndefined: Self = StObject.set(x, "gaxOptions", js.undefined)
  }
}
