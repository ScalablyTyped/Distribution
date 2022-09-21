package typings.glReact.mod

import org.scalablytyped.runtime.StringDictionary
import typings.glReact.anon.Color
import typings.glReact.anon.Dst
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeProps extends StObject {
  
  var backbuffering: js.UndefOr[Boolean] = js.undefined
  
  var blendFunc: js.UndefOr[Dst] = js.undefined
  
  var children: js.UndefOr[Any] = js.undefined
  
  var clear: js.UndefOr[Color] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var ignoreUnusedUniforms: js.UndefOr[js.Array[String] | Boolean] = js.undefined
  
  var onDraw: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var shader: ShaderIdentifier | ShaderDefinition
  
  var sync: js.UndefOr[Boolean] = js.undefined
  
  var uniforms: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var uniformsOptions: js.UndefOr[Any] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object NodeProps {
  
  inline def apply(shader: ShaderIdentifier | ShaderDefinition): NodeProps = {
    val __obj = js.Dynamic.literal(shader = shader.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeProps]
  }
  
  extension [Self <: NodeProps](x: Self) {
    
    inline def setBackbuffering(value: Boolean): Self = StObject.set(x, "backbuffering", value.asInstanceOf[js.Any])
    
    inline def setBackbufferingUndefined: Self = StObject.set(x, "backbuffering", js.undefined)
    
    inline def setBlendFunc(value: Dst): Self = StObject.set(x, "blendFunc", value.asInstanceOf[js.Any])
    
    inline def setBlendFuncUndefined: Self = StObject.set(x, "blendFunc", js.undefined)
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClear(value: Color): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
    
    inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setIgnoreUnusedUniforms(value: js.Array[String] | Boolean): Self = StObject.set(x, "ignoreUnusedUniforms", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUnusedUniformsUndefined: Self = StObject.set(x, "ignoreUnusedUniforms", js.undefined)
    
    inline def setIgnoreUnusedUniformsVarargs(value: String*): Self = StObject.set(x, "ignoreUnusedUniforms", js.Array(value*))
    
    inline def setOnDraw(value: () => Unit): Self = StObject.set(x, "onDraw", js.Any.fromFunction0(value))
    
    inline def setOnDrawUndefined: Self = StObject.set(x, "onDraw", js.undefined)
    
    inline def setShader(value: ShaderIdentifier | ShaderDefinition): Self = StObject.set(x, "shader", value.asInstanceOf[js.Any])
    
    inline def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
    
    inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
    
    inline def setUniforms(value: StringDictionary[Any]): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
    
    inline def setUniformsOptions(value: Any): Self = StObject.set(x, "uniformsOptions", value.asInstanceOf[js.Any])
    
    inline def setUniformsOptionsUndefined: Self = StObject.set(x, "uniformsOptions", js.undefined)
    
    inline def setUniformsUndefined: Self = StObject.set(x, "uniforms", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
