package typings.fabric.fabricImplMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Callbacks extends StObject {
  
  /** Invoked on every step of animation */
  var onChange: js.UndefOr[js.Function] = js.undefined
  
  /** Invoked on completion */
  var onComplete: js.UndefOr[js.Function] = js.undefined
}
object Callbacks {
  
  inline def apply(): Callbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Callbacks]
  }
  
  extension [Self <: Callbacks](x: Self) {
    
    inline def setOnChange(value: js.Function): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnComplete(value: js.Function): Self = StObject.set(x, "onComplete", value.asInstanceOf[js.Any])
    
    inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
  }
}
