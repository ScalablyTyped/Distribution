package typings.glShader

import typings.glShader.mod.Parameter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Attributes extends StObject {
    
    var attributes: js.UndefOr[js.Array[Parameter]] = js.native
    
    var fragment: String = js.native
    
    var uniforms: js.UndefOr[js.Array[Parameter]] = js.native
    
    var vertex: String = js.native
  }
  object Attributes {
    
    @scala.inline
    def apply(fragment: String, vertex: String): Attributes = {
      val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], vertex = vertex.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attributes]
    }
    
    @scala.inline
    implicit class AttributesMutableBuilder[Self <: Attributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: js.Array[Parameter]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setAttributesVarargs(value: Parameter*): Self = StObject.set(x, "attributes", js.Array(value :_*))
      
      @scala.inline
      def setFragment(value: String): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniforms(value: js.Array[Parameter]): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniformsUndefined: Self = StObject.set(x, "uniforms", js.undefined)
      
      @scala.inline
      def setUniformsVarargs(value: Parameter*): Self = StObject.set(x, "uniforms", js.Array(value :_*))
      
      @scala.inline
      def setVertex(value: String): Self = StObject.set(x, "vertex", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Fragment extends StObject {
    
    var attributes: js.Array[Parameter] = js.native
    
    var fragment: String = js.native
    
    var uniforms: js.Array[Parameter] = js.native
    
    var vertex: String = js.native
  }
  object Fragment {
    
    @scala.inline
    def apply(attributes: js.Array[Parameter], fragment: String, uniforms: js.Array[Parameter], vertex: String): Fragment = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], fragment = fragment.asInstanceOf[js.Any], uniforms = uniforms.asInstanceOf[js.Any], vertex = vertex.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fragment]
    }
    
    @scala.inline
    implicit class FragmentMutableBuilder[Self <: Fragment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: js.Array[Parameter]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesVarargs(value: Parameter*): Self = StObject.set(x, "attributes", js.Array(value :_*))
      
      @scala.inline
      def setFragment(value: String): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniforms(value: js.Array[Parameter]): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniformsVarargs(value: Parameter*): Self = StObject.set(x, "uniforms", js.Array(value :_*))
      
      @scala.inline
      def setVertex(value: String): Self = StObject.set(x, "vertex", value.asInstanceOf[js.Any])
    }
  }
}
