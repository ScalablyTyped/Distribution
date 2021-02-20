package typings.easeljs.createjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStageGLOptions extends StObject {
  
  var antialias: js.UndefOr[Boolean] = js.native
  
  var autoPurge: js.UndefOr[Double] = js.native
  
  var premultiply: js.UndefOr[Boolean] = js.native
  
  var preserveBuffer: js.UndefOr[Boolean] = js.native
  
  var transparent: js.UndefOr[Boolean] = js.native
}
object IStageGLOptions {
  
  @scala.inline
  def apply(): IStageGLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStageGLOptions]
  }
  
  @scala.inline
  implicit class IStageGLOptionsMutableBuilder[Self <: IStageGLOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAntialias(value: Boolean): Self = StObject.set(x, "antialias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAntialiasUndefined: Self = StObject.set(x, "antialias", js.undefined)
    
    @scala.inline
    def setAutoPurge(value: Double): Self = StObject.set(x, "autoPurge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPurgeUndefined: Self = StObject.set(x, "autoPurge", js.undefined)
    
    @scala.inline
    def setPremultiply(value: Boolean): Self = StObject.set(x, "premultiply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPremultiplyUndefined: Self = StObject.set(x, "premultiply", js.undefined)
    
    @scala.inline
    def setPreserveBuffer(value: Boolean): Self = StObject.set(x, "preserveBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveBufferUndefined: Self = StObject.set(x, "preserveBuffer", js.undefined)
    
    @scala.inline
    def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
  }
}
