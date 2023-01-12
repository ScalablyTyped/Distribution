package typings.editly.mod

import typings.editly.editlyStrings.`editly-banner`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * WARNING: Undocumented feature!
	 */
trait EditlyBannerLayer
  extends StObject
     with BaseLayer
     with Layer {
  
  /**
  		 * Layer type.
  		 */
  @JSName("type")
  var type_EditlyBannerLayer: `editly-banner`
}
object EditlyBannerLayer {
  
  inline def apply(): EditlyBannerLayer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("editly-banner")
    __obj.asInstanceOf[EditlyBannerLayer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditlyBannerLayer] (val x: Self) extends AnyVal {
    
    inline def setType(value: `editly-banner`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
