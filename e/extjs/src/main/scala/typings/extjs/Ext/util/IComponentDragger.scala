package typings.extjs.Ext.util

import typings.extjs.Ext.dd.IDragTracker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IComponentDragger
  extends StObject
     with IDragTracker {
  
  /** [Config Option] (Boolean) */
  var constrain: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var constrainDelegate: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Move either the ghost Component or the target Component to its new position on drag
    * @param e Object
    */
  @JSName("onDrag")
  var onDrag_IComponentDragger: js.UndefOr[js.Function1[/* e */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Template method which should be overridden by each DragTracker instance
    * @param e Object
    */
  @JSName("onEnd")
  var onEnd_IComponentDragger: js.UndefOr[js.Function1[/* e */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Template method which should be overridden by each DragTracker instance
    * @param e Object
    */
  @JSName("onStart")
  var onStart_IComponentDragger: js.UndefOr[js.Function1[/* e */ js.UndefOr[Any], Unit]] = js.undefined
}
object IComponentDragger {
  
  inline def apply(): IComponentDragger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IComponentDragger]
  }
  
  extension [Self <: IComponentDragger](x: Self) {
    
    inline def setConstrain(value: Boolean): Self = StObject.set(x, "constrain", value.asInstanceOf[js.Any])
    
    inline def setConstrainDelegate(value: Boolean): Self = StObject.set(x, "constrainDelegate", value.asInstanceOf[js.Any])
    
    inline def setConstrainDelegateUndefined: Self = StObject.set(x, "constrainDelegate", js.undefined)
    
    inline def setConstrainUndefined: Self = StObject.set(x, "constrain", js.undefined)
    
    inline def setOnDrag(value: /* e */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
    
    inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
    
    inline def setOnEnd(value: /* e */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction1(value))
    
    inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
    
    inline def setOnStart(value: /* e */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction1(value))
    
    inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
  }
}
