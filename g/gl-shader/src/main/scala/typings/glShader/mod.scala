package typings.glShader

import org.scalablytyped.runtime.StringDictionary
import typings.glShader.anon.Attributes
import typings.glShader.anon.Fragment
import typings.std.WebGLProgram
import typings.std.WebGLRenderingContext
import typings.std.WebGLShader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gl-shader", JSImport.Namespace)
  @js.native
  def apply(gl: WebGLRenderingContext, options: Attributes): Shader = js.native
  @JSImport("gl-shader", JSImport.Namespace)
  @js.native
  def apply(gl: WebGLRenderingContext, vertex: String, fragment: String): Shader = js.native
  @JSImport("gl-shader", JSImport.Namespace)
  @js.native
  def apply(
    gl: WebGLRenderingContext,
    vertex: String,
    fragment: String,
    uniforms: js.UndefOr[scala.Nothing],
    attributes: js.Array[Parameter]
  ): Shader = js.native
  @JSImport("gl-shader", JSImport.Namespace)
  @js.native
  def apply(gl: WebGLRenderingContext, vertex: String, fragment: String, uniforms: js.Array[Parameter]): Shader = js.native
  @JSImport("gl-shader", JSImport.Namespace)
  @js.native
  def apply(
    gl: WebGLRenderingContext,
    vertex: String,
    fragment: String,
    uniforms: js.Array[Parameter],
    attributes: js.Array[Parameter]
  ): Shader = js.native
  
  @js.native
  trait Attribute extends StObject {
    
    var location: js.Array[Double] | Double = js.native
    
    def pointer(): Double = js.native
    def pointer(
      `type`: js.UndefOr[scala.Nothing],
      normalized: js.UndefOr[scala.Nothing],
      stride: js.UndefOr[scala.Nothing],
      offset: Double
    ): Double = js.native
    def pointer(`type`: js.UndefOr[scala.Nothing], normalized: js.UndefOr[scala.Nothing], stride: Double): Double = js.native
    def pointer(
      `type`: js.UndefOr[scala.Nothing],
      normalized: js.UndefOr[scala.Nothing],
      stride: Double,
      offset: Double
    ): Double = js.native
    def pointer(`type`: js.UndefOr[scala.Nothing], normalized: Boolean): Double = js.native
    def pointer(
      `type`: js.UndefOr[scala.Nothing],
      normalized: Boolean,
      stride: js.UndefOr[scala.Nothing],
      offset: Double
    ): Double = js.native
    def pointer(`type`: js.UndefOr[scala.Nothing], normalized: Boolean, stride: Double): Double = js.native
    def pointer(`type`: js.UndefOr[scala.Nothing], normalized: Boolean, stride: Double, offset: Double): Double = js.native
    def pointer(`type`: Double): Double = js.native
    def pointer(
      `type`: Double,
      normalized: js.UndefOr[scala.Nothing],
      stride: js.UndefOr[scala.Nothing],
      offset: Double
    ): Double = js.native
    def pointer(`type`: Double, normalized: js.UndefOr[scala.Nothing], stride: Double): Double = js.native
    def pointer(`type`: Double, normalized: js.UndefOr[scala.Nothing], stride: Double, offset: Double): Double = js.native
    def pointer(`type`: Double, normalized: Boolean): Double = js.native
    def pointer(`type`: Double, normalized: Boolean, stride: js.UndefOr[scala.Nothing], offset: Double): Double = js.native
    def pointer(`type`: Double, normalized: Boolean, stride: Double): Double = js.native
    def pointer(`type`: Double, normalized: Boolean, stride: Double, offset: Double): Double = js.native
  }
  
  @js.native
  trait Parameter extends StObject {
    
    var name: String = js.native
    
    var `type`: String = js.native
  }
  object Parameter {
    
    @scala.inline
    def apply(name: String, `type`: String): Parameter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Parameter]
    }
    
    @scala.inline
    implicit class ParameterMutableBuilder[Self <: Parameter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Shader extends StObject {
    
    val attributes: StringDictionary[Attribute with js.Array[_]] = js.native
    
    def bind(): Unit = js.native
    
    def dispose(): Unit = js.native
    
    val fragShader: WebGLShader = js.native
    
    val gl: WebGLRenderingContext = js.native
    
    val program: WebGLProgram = js.native
    
    var uniforms: StringDictionary[js.Any] = js.native
    
    def update(obj: Fragment): Unit = js.native
    def update(vertex: String, fragment: String): Unit = js.native
    def update(
      vertex: String,
      fragment: String,
      uniforms: js.UndefOr[scala.Nothing],
      attributes: js.Array[Parameter]
    ): Unit = js.native
    def update(vertex: String, fragment: String, uniforms: js.Array[Parameter]): Unit = js.native
    def update(vertex: String, fragment: String, uniforms: js.Array[Parameter], attributes: js.Array[Parameter]): Unit = js.native
    
    val vertShader: WebGLShader = js.native
  }
}
