package typings.glReact.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SurfaceProps extends StObject {
  
  var children: js.UndefOr[js.Any] = js.undefined
  
  var onLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onLoadError: js.UndefOr[js.Function1[/* e */ Error, Unit]] = js.undefined
  
  var preload: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var style: js.UndefOr[js.Any] = js.undefined
  
  var visitor: js.UndefOr[Visitor] = js.undefined
}
object SurfaceProps {
  
  @scala.inline
  def apply(): SurfaceProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SurfaceProps]
  }
  
  @scala.inline
  implicit class SurfacePropsMutableBuilder[Self <: SurfaceProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setOnLoad(value: () => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnLoadError(value: /* e */ Error => Unit): Self = StObject.set(x, "onLoadError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLoadErrorUndefined: Self = StObject.set(x, "onLoadError", js.undefined)
    
    @scala.inline
    def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    @scala.inline
    def setPreload(value: js.Array[js.Any]): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
    
    @scala.inline
    def setPreloadVarargs(value: js.Any*): Self = StObject.set(x, "preload", js.Array(value :_*))
    
    @scala.inline
    def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setVisitor(value: Visitor): Self = StObject.set(x, "visitor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisitorUndefined: Self = StObject.set(x, "visitor", js.undefined)
  }
}
