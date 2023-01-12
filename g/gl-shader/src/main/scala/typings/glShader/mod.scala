package typings.glShader

import org.scalablytyped.runtime.StringDictionary
import typings.glShader.anon.Attributes
import typings.glShader.anon.Fragment
import typings.std.WebGLProgram
import typings.std.WebGLRenderingContext
import typings.std.WebGLShader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(gl: WebGLRenderingContext, options: Attributes): Shader = (^.asInstanceOf[js.Dynamic].apply(gl.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Shader]
  inline def apply(gl: WebGLRenderingContext, vertex: String, fragment: String): Shader = (^.asInstanceOf[js.Dynamic].apply(gl.asInstanceOf[js.Any], vertex.asInstanceOf[js.Any], fragment.asInstanceOf[js.Any])).asInstanceOf[Shader]
  inline def apply(gl: WebGLRenderingContext, vertex: String, fragment: String, uniforms: js.Array[Parameter]): Shader = (^.asInstanceOf[js.Dynamic].apply(gl.asInstanceOf[js.Any], vertex.asInstanceOf[js.Any], fragment.asInstanceOf[js.Any], uniforms.asInstanceOf[js.Any])).asInstanceOf[Shader]
  inline def apply(
    gl: WebGLRenderingContext,
    vertex: String,
    fragment: String,
    uniforms: js.Array[Parameter],
    attributes: js.Array[Parameter]
  ): Shader = (^.asInstanceOf[js.Dynamic].apply(gl.asInstanceOf[js.Any], vertex.asInstanceOf[js.Any], fragment.asInstanceOf[js.Any], uniforms.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Shader]
  inline def apply(
    gl: WebGLRenderingContext,
    vertex: String,
    fragment: String,
    uniforms: Unit,
    attributes: js.Array[Parameter]
  ): Shader = (^.asInstanceOf[js.Dynamic].apply(gl.asInstanceOf[js.Any], vertex.asInstanceOf[js.Any], fragment.asInstanceOf[js.Any], uniforms.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Shader]
  
  @JSImport("gl-shader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Attribute extends StObject {
    
    var location: js.Array[Double] | Double = js.native
    
    def pointer(): Double = js.native
    def pointer(`type`: Double): Double = js.native
    def pointer(`type`: Double, normalized: Boolean): Double = js.native
    def pointer(`type`: Double, normalized: Boolean, stride: Double): Double = js.native
    def pointer(`type`: Double, normalized: Boolean, stride: Double, offset: Double): Double = js.native
    def pointer(`type`: Double, normalized: Boolean, stride: Unit, offset: Double): Double = js.native
    def pointer(`type`: Double, normalized: Unit, stride: Double): Double = js.native
    def pointer(`type`: Double, normalized: Unit, stride: Double, offset: Double): Double = js.native
    def pointer(`type`: Double, normalized: Unit, stride: Unit, offset: Double): Double = js.native
    def pointer(`type`: Unit, normalized: Boolean): Double = js.native
    def pointer(`type`: Unit, normalized: Boolean, stride: Double): Double = js.native
    def pointer(`type`: Unit, normalized: Boolean, stride: Double, offset: Double): Double = js.native
    def pointer(`type`: Unit, normalized: Boolean, stride: Unit, offset: Double): Double = js.native
    def pointer(`type`: Unit, normalized: Unit, stride: Double): Double = js.native
    def pointer(`type`: Unit, normalized: Unit, stride: Double, offset: Double): Double = js.native
    def pointer(`type`: Unit, normalized: Unit, stride: Unit, offset: Double): Double = js.native
  }
  
  trait Parameter extends StObject {
    
    var name: String
    
    var `type`: String
  }
  object Parameter {
    
    inline def apply(name: String, `type`: String): Parameter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Parameter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Parameter] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Shader extends StObject {
    
    val attributes: StringDictionary[Attribute & js.Array[Any]] = js.native
    
    def bind(): Unit = js.native
    
    def dispose(): Unit = js.native
    
    val fragShader: WebGLShader = js.native
    
    val gl: WebGLRenderingContext = js.native
    
    val program: WebGLProgram = js.native
    
    var uniforms: StringDictionary[Any] = js.native
    
    def update(obj: Fragment): Unit = js.native
    def update(vertex: String, fragment: String): Unit = js.native
    def update(vertex: String, fragment: String, uniforms: js.Array[Parameter]): Unit = js.native
    def update(vertex: String, fragment: String, uniforms: js.Array[Parameter], attributes: js.Array[Parameter]): Unit = js.native
    def update(vertex: String, fragment: String, uniforms: Unit, attributes: js.Array[Parameter]): Unit = js.native
    
    val vertShader: WebGLShader = js.native
  }
}
