package typings.foundation.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://foundation.zurb.com/docs/components/equalizer.html#optional-javascript-configuration
trait EqualizerOptions extends StObject {
  
  var equalize_on_stack: js.UndefOr[Boolean] = js.undefined
  
  var use_tallest: js.UndefOr[Boolean] = js.undefined
}
object EqualizerOptions {
  
  inline def apply(): EqualizerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EqualizerOptions]
  }
  
  extension [Self <: EqualizerOptions](x: Self) {
    
    inline def setEqualize_on_stack(value: Boolean): Self = StObject.set(x, "equalize_on_stack", value.asInstanceOf[js.Any])
    
    inline def setEqualize_on_stackUndefined: Self = StObject.set(x, "equalize_on_stack", js.undefined)
    
    inline def setUse_tallest(value: Boolean): Self = StObject.set(x, "use_tallest", value.asInstanceOf[js.Any])
    
    inline def setUse_tallestUndefined: Self = StObject.set(x, "use_tallest", js.undefined)
  }
}
