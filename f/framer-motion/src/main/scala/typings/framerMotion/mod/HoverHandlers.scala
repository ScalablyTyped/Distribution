package typings.framerMotion.mod

import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @public
  */
trait HoverHandlers extends StObject {
  
  /**
    * Callback function that fires when pointer stops hovering over the component.
    *
    * ```jsx
    * <motion.div onHoverEnd={() => console.log("Hover ends")} />
    * ```
    */
  var onHoverEnd: js.UndefOr[js.Function2[/* event */ MouseEvent, /* info */ EventInfo, Unit]] = js.undefined
  
  /**
    * Callback function that fires when pointer starts hovering over the component.
    *
    * ```jsx
    * <motion.div onHoverStart={() => console.log('Hover starts')} />
    * ```
    */
  var onHoverStart: js.UndefOr[js.Function2[/* event */ MouseEvent, /* info */ EventInfo, Unit]] = js.undefined
  
  /**
    * Properties or variant label to animate to while the hover gesture is recognised.
    *
    * ```jsx
    * <motion.div whileHover={{ scale: 1.2 }} />
    * ```
    */
  var whileHover: js.UndefOr[VariantLabels | TargetAndTransition] = js.undefined
}
object HoverHandlers {
  
  inline def apply(): HoverHandlers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HoverHandlers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HoverHandlers] (val x: Self) extends AnyVal {
    
    inline def setOnHoverEnd(value: (/* event */ MouseEvent, /* info */ EventInfo) => Unit): Self = StObject.set(x, "onHoverEnd", js.Any.fromFunction2(value))
    
    inline def setOnHoverEndUndefined: Self = StObject.set(x, "onHoverEnd", js.undefined)
    
    inline def setOnHoverStart(value: (/* event */ MouseEvent, /* info */ EventInfo) => Unit): Self = StObject.set(x, "onHoverStart", js.Any.fromFunction2(value))
    
    inline def setOnHoverStartUndefined: Self = StObject.set(x, "onHoverStart", js.undefined)
    
    inline def setWhileHover(value: VariantLabels | TargetAndTransition): Self = StObject.set(x, "whileHover", value.asInstanceOf[js.Any])
    
    inline def setWhileHoverUndefined: Self = StObject.set(x, "whileHover", js.undefined)
    
    inline def setWhileHoverVarargs(value: String*): Self = StObject.set(x, "whileHover", js.Array(value*))
  }
}
