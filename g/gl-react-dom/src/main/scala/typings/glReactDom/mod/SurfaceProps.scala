package typings.glReactDom.mod

import typings.std.Error
import typings.std.WebGLContextAttributes
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.glReactDom.glviewdomMod.GLViewDOMProps because var conflicts: style. Inlined onContextCreate, onContextFailure, onContextLost, onContextRestored, webglContextAttributes, pixelRatio, width, height, debug */ @js.native
trait SurfaceProps
  extends typings.glReact.mod.SurfaceProps {
  
  var debug: js.UndefOr[Double] = js.native
  
  var height: Double = js.native
  
  var onContextCreate: js.UndefOr[js.Function1[/* gl */ WebGLRenderingContext, Unit]] = js.native
  
  var onContextFailure: js.UndefOr[js.Function1[/* e */ Error, Unit]] = js.native
  
  var onContextLost: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onContextRestored: js.UndefOr[js.Function1[/* gl */ WebGLRenderingContext, Unit]] = js.native
  
  var pixelRatio: js.UndefOr[Double] = js.native
  
  var webglContextAttributes: js.UndefOr[WebGLContextAttributes] = js.native
  
  var width: Double = js.native
}
object SurfaceProps {
  
  @scala.inline
  def apply(height: Double, width: Double): SurfaceProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SurfaceProps]
  }
  
  @scala.inline
  implicit class SurfacePropsOps[Self <: SurfaceProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebug(value: Double): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setOnContextCreate(value: /* gl */ WebGLRenderingContext => Unit): Self = this.set("onContextCreate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnContextCreate: Self = this.set("onContextCreate", js.undefined)
    
    @scala.inline
    def setOnContextFailure(value: /* e */ Error => Unit): Self = this.set("onContextFailure", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnContextFailure: Self = this.set("onContextFailure", js.undefined)
    
    @scala.inline
    def setOnContextLost(value: () => Unit): Self = this.set("onContextLost", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnContextLost: Self = this.set("onContextLost", js.undefined)
    
    @scala.inline
    def setOnContextRestored(value: /* gl */ WebGLRenderingContext => Unit): Self = this.set("onContextRestored", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnContextRestored: Self = this.set("onContextRestored", js.undefined)
    
    @scala.inline
    def setPixelRatio(value: Double): Self = this.set("pixelRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePixelRatio: Self = this.set("pixelRatio", js.undefined)
    
    @scala.inline
    def setWebglContextAttributes(value: WebGLContextAttributes): Self = this.set("webglContextAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebglContextAttributes: Self = this.set("webglContextAttributes", js.undefined)
  }
}
