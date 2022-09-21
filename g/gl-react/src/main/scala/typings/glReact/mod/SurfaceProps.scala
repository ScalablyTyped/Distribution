package typings.glReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SurfaceProps extends StObject {
  
  var children: js.UndefOr[Any] = js.undefined
  
  var onLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onLoadError: js.UndefOr[js.Function1[/* e */ js.Error, Unit]] = js.undefined
  
  var preload: js.UndefOr[js.Array[Any]] = js.undefined
  
  var style: js.UndefOr[Any] = js.undefined
  
  var visitor: js.UndefOr[Visitor] = js.undefined
}
object SurfaceProps {
  
  inline def apply(): SurfaceProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SurfaceProps]
  }
  
  extension [Self <: SurfaceProps](x: Self) {
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setOnLoad(value: () => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction0(value))
    
    inline def setOnLoadError(value: /* e */ js.Error => Unit): Self = StObject.set(x, "onLoadError", js.Any.fromFunction1(value))
    
    inline def setOnLoadErrorUndefined: Self = StObject.set(x, "onLoadError", js.undefined)
    
    inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    inline def setPreload(value: js.Array[Any]): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
    
    inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
    
    inline def setPreloadVarargs(value: Any*): Self = StObject.set(x, "preload", js.Array(value*))
    
    inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setVisitor(value: Visitor): Self = StObject.set(x, "visitor", value.asInstanceOf[js.Any])
    
    inline def setVisitorUndefined: Self = StObject.set(x, "visitor", js.undefined)
  }
}
