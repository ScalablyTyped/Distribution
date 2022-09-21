package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaterialParameters extends StObject {
  
  var alphaTest: js.UndefOr[Double] = js.undefined
  
  var blendDst: js.UndefOr[BlendingSrcFactor] = js.undefined
  
  var blendDstAlpha: js.UndefOr[Double] = js.undefined
  
  var blendEquation: js.UndefOr[BlendingEquation] = js.undefined
  
  var blendEquationAlpha: js.UndefOr[Double] = js.undefined
  
  var blendSrc: js.UndefOr[BlendingDstFactor] = js.undefined
  
  var blendSrcAlpha: js.UndefOr[Double] = js.undefined
  
  var blending: js.UndefOr[Blending] = js.undefined
  
  var colorWrite: js.UndefOr[Boolean] = js.undefined
  
  var depthFunc: js.UndefOr[DepthModes] = js.undefined
  
  var depthTest: js.UndefOr[Boolean] = js.undefined
  
  var depthWrite: js.UndefOr[Boolean] = js.undefined
  
  var fog: js.UndefOr[Boolean] = js.undefined
  
  var lights: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var overdraw: js.UndefOr[Double] = js.undefined
  
  var polygonOffset: js.UndefOr[Boolean] = js.undefined
  
  var polygonOffsetFactor: js.UndefOr[Double] = js.undefined
  
  var polygonOffsetUnits: js.UndefOr[Double] = js.undefined
  
  var precision: js.UndefOr[Double] = js.undefined
  
  var premultipliedAlpha: js.UndefOr[Boolean] = js.undefined
  
  var shading: js.UndefOr[Shading] = js.undefined
  
  var side: js.UndefOr[Side] = js.undefined
  
  var transparent: js.UndefOr[Boolean] = js.undefined
  
  var vertexColors: js.UndefOr[Colors] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object MaterialParameters {
  
  inline def apply(): MaterialParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaterialParameters]
  }
  
  extension [Self <: MaterialParameters](x: Self) {
    
    inline def setAlphaTest(value: Double): Self = StObject.set(x, "alphaTest", value.asInstanceOf[js.Any])
    
    inline def setAlphaTestUndefined: Self = StObject.set(x, "alphaTest", js.undefined)
    
    inline def setBlendDst(value: BlendingSrcFactor): Self = StObject.set(x, "blendDst", value.asInstanceOf[js.Any])
    
    inline def setBlendDstAlpha(value: Double): Self = StObject.set(x, "blendDstAlpha", value.asInstanceOf[js.Any])
    
    inline def setBlendDstAlphaUndefined: Self = StObject.set(x, "blendDstAlpha", js.undefined)
    
    inline def setBlendDstUndefined: Self = StObject.set(x, "blendDst", js.undefined)
    
    inline def setBlendEquation(value: BlendingEquation): Self = StObject.set(x, "blendEquation", value.asInstanceOf[js.Any])
    
    inline def setBlendEquationAlpha(value: Double): Self = StObject.set(x, "blendEquationAlpha", value.asInstanceOf[js.Any])
    
    inline def setBlendEquationAlphaUndefined: Self = StObject.set(x, "blendEquationAlpha", js.undefined)
    
    inline def setBlendEquationUndefined: Self = StObject.set(x, "blendEquation", js.undefined)
    
    inline def setBlendSrc(value: BlendingDstFactor): Self = StObject.set(x, "blendSrc", value.asInstanceOf[js.Any])
    
    inline def setBlendSrcAlpha(value: Double): Self = StObject.set(x, "blendSrcAlpha", value.asInstanceOf[js.Any])
    
    inline def setBlendSrcAlphaUndefined: Self = StObject.set(x, "blendSrcAlpha", js.undefined)
    
    inline def setBlendSrcUndefined: Self = StObject.set(x, "blendSrc", js.undefined)
    
    inline def setBlending(value: Blending): Self = StObject.set(x, "blending", value.asInstanceOf[js.Any])
    
    inline def setBlendingUndefined: Self = StObject.set(x, "blending", js.undefined)
    
    inline def setColorWrite(value: Boolean): Self = StObject.set(x, "colorWrite", value.asInstanceOf[js.Any])
    
    inline def setColorWriteUndefined: Self = StObject.set(x, "colorWrite", js.undefined)
    
    inline def setDepthFunc(value: DepthModes): Self = StObject.set(x, "depthFunc", value.asInstanceOf[js.Any])
    
    inline def setDepthFuncUndefined: Self = StObject.set(x, "depthFunc", js.undefined)
    
    inline def setDepthTest(value: Boolean): Self = StObject.set(x, "depthTest", value.asInstanceOf[js.Any])
    
    inline def setDepthTestUndefined: Self = StObject.set(x, "depthTest", js.undefined)
    
    inline def setDepthWrite(value: Boolean): Self = StObject.set(x, "depthWrite", value.asInstanceOf[js.Any])
    
    inline def setDepthWriteUndefined: Self = StObject.set(x, "depthWrite", js.undefined)
    
    inline def setFog(value: Boolean): Self = StObject.set(x, "fog", value.asInstanceOf[js.Any])
    
    inline def setFogUndefined: Self = StObject.set(x, "fog", js.undefined)
    
    inline def setLights(value: Boolean): Self = StObject.set(x, "lights", value.asInstanceOf[js.Any])
    
    inline def setLightsUndefined: Self = StObject.set(x, "lights", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setOverdraw(value: Double): Self = StObject.set(x, "overdraw", value.asInstanceOf[js.Any])
    
    inline def setOverdrawUndefined: Self = StObject.set(x, "overdraw", js.undefined)
    
    inline def setPolygonOffset(value: Boolean): Self = StObject.set(x, "polygonOffset", value.asInstanceOf[js.Any])
    
    inline def setPolygonOffsetFactor(value: Double): Self = StObject.set(x, "polygonOffsetFactor", value.asInstanceOf[js.Any])
    
    inline def setPolygonOffsetFactorUndefined: Self = StObject.set(x, "polygonOffsetFactor", js.undefined)
    
    inline def setPolygonOffsetUndefined: Self = StObject.set(x, "polygonOffset", js.undefined)
    
    inline def setPolygonOffsetUnits(value: Double): Self = StObject.set(x, "polygonOffsetUnits", value.asInstanceOf[js.Any])
    
    inline def setPolygonOffsetUnitsUndefined: Self = StObject.set(x, "polygonOffsetUnits", js.undefined)
    
    inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setPremultipliedAlpha(value: Boolean): Self = StObject.set(x, "premultipliedAlpha", value.asInstanceOf[js.Any])
    
    inline def setPremultipliedAlphaUndefined: Self = StObject.set(x, "premultipliedAlpha", js.undefined)
    
    inline def setShading(value: Shading): Self = StObject.set(x, "shading", value.asInstanceOf[js.Any])
    
    inline def setShadingUndefined: Self = StObject.set(x, "shading", js.undefined)
    
    inline def setSide(value: Side): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    
    inline def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
    
    inline def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
    
    inline def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
    
    inline def setVertexColors(value: Colors): Self = StObject.set(x, "vertexColors", value.asInstanceOf[js.Any])
    
    inline def setVertexColorsUndefined: Self = StObject.set(x, "vertexColors", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
