package typings.foundation.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://foundation.zurb.com/docs/components/equalizer.html#optional-javascript-configuration
@js.native
trait EqualizerOptions extends StObject {
  
  var equalize_on_stack: js.UndefOr[Boolean] = js.native
  
  var use_tallest: js.UndefOr[Boolean] = js.native
}
object EqualizerOptions {
  
  @scala.inline
  def apply(): EqualizerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EqualizerOptions]
  }
  
  @scala.inline
  implicit class EqualizerOptionsMutableBuilder[Self <: EqualizerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEqualize_on_stack(value: Boolean): Self = StObject.set(x, "equalize_on_stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEqualize_on_stackUndefined: Self = StObject.set(x, "equalize_on_stack", js.undefined)
    
    @scala.inline
    def setUse_tallest(value: Boolean): Self = StObject.set(x, "use_tallest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUse_tallestUndefined: Self = StObject.set(x, "use_tallest", js.undefined)
  }
}
