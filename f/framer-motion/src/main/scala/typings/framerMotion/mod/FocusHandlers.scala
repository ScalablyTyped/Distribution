package typings.framerMotion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @public
  */
trait FocusHandlers extends StObject {
  
  /**
    * Properties or variant label to animate to while the focus gesture is recognised.
    *
    * ```jsx
    * <motion.input whileFocus={{ scale: 1.2 }} />
    * ```
    */
  var whileFocus: js.UndefOr[VariantLabels | TargetAndTransition] = js.undefined
}
object FocusHandlers {
  
  inline def apply(): FocusHandlers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FocusHandlers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FocusHandlers] (val x: Self) extends AnyVal {
    
    inline def setWhileFocus(value: VariantLabels | TargetAndTransition): Self = StObject.set(x, "whileFocus", value.asInstanceOf[js.Any])
    
    inline def setWhileFocusUndefined: Self = StObject.set(x, "whileFocus", js.undefined)
    
    inline def setWhileFocusVarargs(value: String*): Self = StObject.set(x, "whileFocus", js.Array(value*))
  }
}
