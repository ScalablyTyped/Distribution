package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGLCapabilities extends StObject {
  
  var floatFragmentTextures: Any
  
  var floatVertexTextures: Any
  
  def getMaxAnisotropy(): Double
  
  def getMaxPrecision(precision: String): String
  
  var logarithmicDepthBuffer: Any
  
  var maxAttributes: Any
  
  var maxCubemapSize: Any
  
  var maxFragmentUniforms: Any
  
  var maxTextureSize: Any
  
  var maxTextures: Any
  
  var maxVaryings: Any
  
  var maxVertexTextures: Any
  
  var maxVertexUniforms: Any
  
  var precision: Any
  
  var vertexTextures: Any
}
object WebGLCapabilities {
  
  inline def apply(
    floatFragmentTextures: Any,
    floatVertexTextures: Any,
    getMaxAnisotropy: () => Double,
    getMaxPrecision: String => String,
    logarithmicDepthBuffer: Any,
    maxAttributes: Any,
    maxCubemapSize: Any,
    maxFragmentUniforms: Any,
    maxTextureSize: Any,
    maxTextures: Any,
    maxVaryings: Any,
    maxVertexTextures: Any,
    maxVertexUniforms: Any,
    precision: Any,
    vertexTextures: Any
  ): WebGLCapabilities = {
    val __obj = js.Dynamic.literal(floatFragmentTextures = floatFragmentTextures.asInstanceOf[js.Any], floatVertexTextures = floatVertexTextures.asInstanceOf[js.Any], getMaxAnisotropy = js.Any.fromFunction0(getMaxAnisotropy), getMaxPrecision = js.Any.fromFunction1(getMaxPrecision), logarithmicDepthBuffer = logarithmicDepthBuffer.asInstanceOf[js.Any], maxAttributes = maxAttributes.asInstanceOf[js.Any], maxCubemapSize = maxCubemapSize.asInstanceOf[js.Any], maxFragmentUniforms = maxFragmentUniforms.asInstanceOf[js.Any], maxTextureSize = maxTextureSize.asInstanceOf[js.Any], maxTextures = maxTextures.asInstanceOf[js.Any], maxVaryings = maxVaryings.asInstanceOf[js.Any], maxVertexTextures = maxVertexTextures.asInstanceOf[js.Any], maxVertexUniforms = maxVertexUniforms.asInstanceOf[js.Any], precision = precision.asInstanceOf[js.Any], vertexTextures = vertexTextures.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLCapabilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebGLCapabilities] (val x: Self) extends AnyVal {
    
    inline def setFloatFragmentTextures(value: Any): Self = StObject.set(x, "floatFragmentTextures", value.asInstanceOf[js.Any])
    
    inline def setFloatVertexTextures(value: Any): Self = StObject.set(x, "floatVertexTextures", value.asInstanceOf[js.Any])
    
    inline def setGetMaxAnisotropy(value: () => Double): Self = StObject.set(x, "getMaxAnisotropy", js.Any.fromFunction0(value))
    
    inline def setGetMaxPrecision(value: String => String): Self = StObject.set(x, "getMaxPrecision", js.Any.fromFunction1(value))
    
    inline def setLogarithmicDepthBuffer(value: Any): Self = StObject.set(x, "logarithmicDepthBuffer", value.asInstanceOf[js.Any])
    
    inline def setMaxAttributes(value: Any): Self = StObject.set(x, "maxAttributes", value.asInstanceOf[js.Any])
    
    inline def setMaxCubemapSize(value: Any): Self = StObject.set(x, "maxCubemapSize", value.asInstanceOf[js.Any])
    
    inline def setMaxFragmentUniforms(value: Any): Self = StObject.set(x, "maxFragmentUniforms", value.asInstanceOf[js.Any])
    
    inline def setMaxTextureSize(value: Any): Self = StObject.set(x, "maxTextureSize", value.asInstanceOf[js.Any])
    
    inline def setMaxTextures(value: Any): Self = StObject.set(x, "maxTextures", value.asInstanceOf[js.Any])
    
    inline def setMaxVaryings(value: Any): Self = StObject.set(x, "maxVaryings", value.asInstanceOf[js.Any])
    
    inline def setMaxVertexTextures(value: Any): Self = StObject.set(x, "maxVertexTextures", value.asInstanceOf[js.Any])
    
    inline def setMaxVertexUniforms(value: Any): Self = StObject.set(x, "maxVertexUniforms", value.asInstanceOf[js.Any])
    
    inline def setPrecision(value: Any): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setVertexTextures(value: Any): Self = StObject.set(x, "vertexTextures", value.asInstanceOf[js.Any])
  }
}
