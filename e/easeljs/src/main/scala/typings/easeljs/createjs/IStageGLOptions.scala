package typings.easeljs.createjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStageGLOptions extends StObject {
  
  var antialias: js.UndefOr[Boolean] = js.undefined
  
  var autoPurge: js.UndefOr[Double] = js.undefined
  
  var premultiply: js.UndefOr[Boolean] = js.undefined
  
  var preserveBuffer: js.UndefOr[Boolean] = js.undefined
  
  var transparent: js.UndefOr[Boolean] = js.undefined
}
object IStageGLOptions {
  
  inline def apply(): IStageGLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStageGLOptions]
  }
  
  extension [Self <: IStageGLOptions](x: Self) {
    
    inline def setAntialias(value: Boolean): Self = StObject.set(x, "antialias", value.asInstanceOf[js.Any])
    
    inline def setAntialiasUndefined: Self = StObject.set(x, "antialias", js.undefined)
    
    inline def setAutoPurge(value: Double): Self = StObject.set(x, "autoPurge", value.asInstanceOf[js.Any])
    
    inline def setAutoPurgeUndefined: Self = StObject.set(x, "autoPurge", js.undefined)
    
    inline def setPremultiply(value: Boolean): Self = StObject.set(x, "premultiply", value.asInstanceOf[js.Any])
    
    inline def setPremultiplyUndefined: Self = StObject.set(x, "premultiply", js.undefined)
    
    inline def setPreserveBuffer(value: Boolean): Self = StObject.set(x, "preserveBuffer", value.asInstanceOf[js.Any])
    
    inline def setPreserveBufferUndefined: Self = StObject.set(x, "preserveBuffer", js.undefined)
    
    inline def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
    
    inline def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
  }
}
