package typings.dragControls.anon

import org.scalablytyped.runtime.Instantiable2
import typings.std.WebGLRenderingContext
import typings.three.mod.WebGLUniforms
import typings.three.srcRenderersWebglWebGLProgramMod.WebGLProgram
import typings.three.srcRenderersWebglWebGLTexturesMod.WebGLTextures
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofWebGLUniforms
  extends StObject
     with Instantiable2[/* gl */ WebGLRenderingContext, /* program */ WebGLProgram, WebGLUniforms] {
  
  def seqWithValue(seq: Any, values: js.Array[Any]): js.Array[Any] = js.native
  
  def upload(gl: WebGLRenderingContext, seq: Any, values: js.Array[Any], textures: WebGLTextures): Unit = js.native
}
