package typings.domWebcodecs

import typings.std.GLenum
import typings.std.GLint
import typings.std.GLsizei
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGL2RenderingContextBase extends StObject {
  
  def texImage3D(
    target: GLenum,
    level: GLint,
    internalformat: GLint,
    width: GLsizei,
    height: GLsizei,
    depth: GLsizei,
    border: GLint,
    format: GLenum,
    `type`: GLenum,
    source: TexImageSourceWebCodecs
  ): Unit
  
  def texSubImage3D(
    target: GLenum,
    level: GLint,
    xoffset: GLint,
    yoffset: GLint,
    zoffset: GLint,
    width: GLsizei,
    height: GLsizei,
    depth: GLsizei,
    format: GLenum,
    `type`: GLenum,
    source: TexImageSourceWebCodecs
  ): Unit
}
object WebGL2RenderingContextBase {
  
  inline def apply(
    texImage3D: (GLenum, GLint, GLint, GLsizei, GLsizei, GLsizei, GLint, GLenum, GLenum, TexImageSourceWebCodecs) => Unit,
    texSubImage3D: (GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLenum, TexImageSourceWebCodecs) => Unit
  ): WebGL2RenderingContextBase = {
    val __obj = js.Dynamic.literal(texImage3D = js.Any.fromFunction10(texImage3D), texSubImage3D = js.Any.fromFunction11(texSubImage3D))
    __obj.asInstanceOf[WebGL2RenderingContextBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebGL2RenderingContextBase] (val x: Self) extends AnyVal {
    
    inline def setTexImage3D(
      value: (GLenum, GLint, GLint, GLsizei, GLsizei, GLsizei, GLint, GLenum, GLenum, TexImageSourceWebCodecs) => Unit
    ): Self = StObject.set(x, "texImage3D", js.Any.fromFunction10(value))
    
    inline def setTexSubImage3D(
      value: (GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLenum, TexImageSourceWebCodecs) => Unit
    ): Self = StObject.set(x, "texSubImage3D", js.Any.fromFunction11(value))
  }
}
