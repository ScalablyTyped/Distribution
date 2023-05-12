package typings.framerMotion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLRenderState extends StObject {
  
  /**
    * A mutable record of styles we want to apply directly to the rendered Element
    * every frame. We use a mutable data structure to reduce GC during animations.
    */
  var style: ResolvedValues
  
  /**
    * A mutable record of transforms we want to apply directly to the rendered Element
    * every frame. We use a mutable data structure to reduce GC during animations.
    */
  var transform: ResolvedValues
  
  /**
    * A mutable record of transform origins we want to apply directly to the rendered Element
    * every frame. We use a mutable data structure to reduce GC during animations.
    */
  var transformOrigin: TransformOrigin
  
  /**
    * A mutable record of CSS variables we want to apply directly to the rendered Element
    * every frame. We use a mutable data structure to reduce GC during animations.
    */
  var vars: ResolvedValues
}
object HTMLRenderState {
  
  inline def apply(
    style: ResolvedValues,
    transform: ResolvedValues,
    transformOrigin: TransformOrigin,
    vars: ResolvedValues
  ): HTMLRenderState = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], transformOrigin = transformOrigin.asInstanceOf[js.Any], vars = vars.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLRenderState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HTMLRenderState] (val x: Self) extends AnyVal {
    
    inline def setStyle(value: ResolvedValues): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setTransform(value: ResolvedValues): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformOrigin(value: TransformOrigin): Self = StObject.set(x, "transformOrigin", value.asInstanceOf[js.Any])
    
    inline def setVars(value: ResolvedValues): Self = StObject.set(x, "vars", value.asInstanceOf[js.Any])
  }
}
