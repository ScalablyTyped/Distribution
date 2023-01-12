package typings.domWebcodecs

import typings.std.GLenum
import typings.std.GLint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGLRenderingContextOverloads extends StObject {
  
  def texImage2D(
    target: GLenum,
    level: GLint,
    internalformat: GLint,
    format: GLenum,
    `type`: GLenum,
    source: TexImageSourceWebCodecs
  ): Unit
  
  def texSubImage2D(
    target: GLenum,
    level: GLint,
    xoffset: GLint,
    yoffset: GLint,
    format: GLenum,
    `type`: GLenum,
    source: TexImageSourceWebCodecs
  ): Unit
}
object WebGLRenderingContextOverloads {
  
  inline def apply(
    texImage2D: (GLenum, GLint, GLint, GLenum, GLenum, TexImageSourceWebCodecs) => Unit,
    texSubImage2D: (GLenum, GLint, GLint, GLint, GLenum, GLenum, TexImageSourceWebCodecs) => Unit
  ): WebGLRenderingContextOverloads = {
    val __obj = js.Dynamic.literal(texImage2D = js.Any.fromFunction6(texImage2D), texSubImage2D = js.Any.fromFunction7(texSubImage2D))
    __obj.asInstanceOf[WebGLRenderingContextOverloads]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebGLRenderingContextOverloads] (val x: Self) extends AnyVal {
    
    inline def setTexImage2D(value: (GLenum, GLint, GLint, GLenum, GLenum, TexImageSourceWebCodecs) => Unit): Self = StObject.set(x, "texImage2D", js.Any.fromFunction6(value))
    
    inline def setTexSubImage2D(value: (GLenum, GLint, GLint, GLint, GLenum, GLenum, TexImageSourceWebCodecs) => Unit): Self = StObject.set(x, "texSubImage2D", js.Any.fromFunction7(value))
  }
}
