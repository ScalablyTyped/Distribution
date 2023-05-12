package typings.googleCloudSpanner.mod

import typings.googleGax.buildSrcGaxMod.CallOptions
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetInstanceConfigOptions] (val x: Self) extends AnyVal {
    
    inline def setGaxOptions(value: CallOptions): Self = StObject.set(x, "gaxOptions", value.asInstanceOf[js.Any])
    
    inline def setGaxOptionsUndefined: Self = StObject.set(x, "gaxOptions", js.undefined)
  }
}
