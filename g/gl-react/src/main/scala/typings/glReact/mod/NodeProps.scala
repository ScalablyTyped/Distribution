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
  
  var children: js.UndefOr[js.Any] = js.undefined
  
  var clear: js.UndefOr[Color] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var ignoreUnusedUniforms: js.UndefOr[js.Array[String] | Boolean] = js.undefined
  
  var onDraw: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var shader: ShaderIdentifier | ShaderDefinition
  
  var sync: js.UndefOr[Boolean] = js.undefined
  
  var uniforms: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  var uniformsOptions: js.UndefOr[js.Any] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object NodeProps {
  
  @scala.inline
  def apply(shader: ShaderIdentifier | ShaderDefinition): NodeProps = {
    val __obj = js.Dynamic.literal(shader = shader.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeProps]
  }
  
  @scala.inline
  implicit class NodePropsMutableBuilder[Self <: NodeProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackbuffering(value: Boolean): Self = StObject.set(x, "backbuffering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackbufferingUndefined: Self = StObject.set(x, "backbuffering", js.undefined)
    
    @scala.inline
    def setBlendFunc(value: Dst): Self = StObject.set(x, "blendFunc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlendFuncUndefined: Self = StObject.set(x, "blendFunc", js.undefined)
    
    @scala.inline
    def setChildren(value: js.Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setClear(value: Color): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setIgnoreUnusedUniforms(value: js.Array[String] | Boolean): Self = StObject.set(x, "ignoreUnusedUniforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreUnusedUniformsUndefined: Self = StObject.set(x, "ignoreUnusedUniforms", js.undefined)
    
    @scala.inline
    def setIgnoreUnusedUniformsVarargs(value: String*): Self = StObject.set(x, "ignoreUnusedUniforms", js.Array(value :_*))
    
    @scala.inline
    def setOnDraw(value: () => Unit): Self = StObject.set(x, "onDraw", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnDrawUndefined: Self = StObject.set(x, "onDraw", js.undefined)
    
    @scala.inline
    def setShader(value: ShaderIdentifier | ShaderDefinition): Self = StObject.set(x, "shader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
    
    @scala.inline
    def setUniforms(value: StringDictionary[js.Any]): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniformsOptions(value: js.Any): Self = StObject.set(x, "uniformsOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniformsOptionsUndefined: Self = StObject.set(x, "uniformsOptions", js.undefined)
    
    @scala.inline
    def setUniformsUndefined: Self = StObject.set(x, "uniforms", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
