package typings.glShader

import typings.glShader.mod.Parameter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Attributes extends StObject {
    
    var attributes: js.UndefOr[js.Array[Parameter]] = js.undefined
    
    var fragment: String
    
    var uniforms: js.UndefOr[js.Array[Parameter]] = js.undefined
    
    var vertex: String
  }
  object Attributes {
    
    inline def apply(fragment: String, vertex: String): Attributes = {
      val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], vertex = vertex.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attributes]
    }
    
    extension [Self <: Attributes](x: Self) {
      
      inline def setAttributes(value: js.Array[Parameter]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setAttributesVarargs(value: Parameter*): Self = StObject.set(x, "attributes", js.Array(value*))
      
      inline def setFragment(value: String): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
      
      inline def setUniforms(value: js.Array[Parameter]): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
      
      inline def setUniformsUndefined: Self = StObject.set(x, "uniforms", js.undefined)
      
      inline def setUniformsVarargs(value: Parameter*): Self = StObject.set(x, "uniforms", js.Array(value*))
      
      inline def setVertex(value: String): Self = StObject.set(x, "vertex", value.asInstanceOf[js.Any])
    }
  }
  
  trait Fragment extends StObject {
    
    var attributes: js.Array[Parameter]
    
    var fragment: String
    
    var uniforms: js.Array[Parameter]
    
    var vertex: String
  }
  object Fragment {
    
    inline def apply(attributes: js.Array[Parameter], fragment: String, uniforms: js.Array[Parameter], vertex: String): Fragment = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], fragment = fragment.asInstanceOf[js.Any], uniforms = uniforms.asInstanceOf[js.Any], vertex = vertex.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fragment]
    }
    
    extension [Self <: Fragment](x: Self) {
      
      inline def setAttributes(value: js.Array[Parameter]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesVarargs(value: Parameter*): Self = StObject.set(x, "attributes", js.Array(value*))
      
      inline def setFragment(value: String): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
      
      inline def setUniforms(value: js.Array[Parameter]): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
      
      inline def setUniformsVarargs(value: Parameter*): Self = StObject.set(x, "uniforms", js.Array(value*))
      
      inline def setVertex(value: String): Self = StObject.set(x, "vertex", value.asInstanceOf[js.Any])
    }
  }
}
