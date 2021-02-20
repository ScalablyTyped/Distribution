package typings.fabric.fabricImplMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Callbacks extends StObject {
  
  /** Invoked on every step of animation */
  var onChange: js.UndefOr[js.Function] = js.native
  
  /** Invoked on completion */
  var onComplete: js.UndefOr[js.Function] = js.native
}
object Callbacks {
  
  @scala.inline
  def apply(): Callbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Callbacks]
  }
  
  @scala.inline
  implicit class CallbacksMutableBuilder[Self <: Callbacks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnChange(value: js.Function): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnComplete(value: js.Function): Self = StObject.set(x, "onComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
  }
}
