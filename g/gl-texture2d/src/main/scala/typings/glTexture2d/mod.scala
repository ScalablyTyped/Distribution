package typings.glTexture2d

import typings.ndarray.mod.Data
import typings.ndarray.mod.NdArray
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.ImageBitmap
import typings.std.ImageData
import typings.std.WebGLRenderingContext
import typings.std.WebGLTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(gl: WebGLRenderingContext, array: NdArray[Data[Double]]): Texture = (^.asInstanceOf[js.Dynamic].apply(gl.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[Texture]
  inline def apply(gl: WebGLRenderingContext, input: js.Tuple2[Double, Double]): Texture = (^.asInstanceOf[js.Dynamic].apply(gl.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[Texture]
  inline def apply(gl: WebGLRenderingContext, input: js.Tuple2[Double, Double], format: Unit, `type`: GLenum): Texture = (^.asInstanceOf[js.Dynamic].apply(gl.asInstanceOf[js.Any], input.asInstanceOf[js.Any], format.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Texture]
  inline def apply(gl: WebGLRenderingContext, input: js.Tuple2[Double, Double], format: GLenum): Texture = (^.asInstanceOf[js.Dynamic].apply(gl.asInstanceOf[js.Any], input.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Texture]
  inline def apply(gl: WebGLRenderingContext, input: js.Tuple2[Double, Double], format: GLenum, `type`: GLenum): Texture = (^.asInstanceOf[js.Dynamic].apply(gl.asInstanceOf[js.Any], input.asInstanceOf[js.Any], format.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Texture]
  inline def apply(gl: WebGLRenderingContext, input: InputType): Texture = (^.asInstanceOf[js.Dynamic].apply(gl.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[Texture]
  inline def apply(gl: WebGLRenderingContext, input: InputType, format: Unit, `type`: GLenum): Texture = (^.asInstanceOf[js.Dynamic].apply(gl.asInstanceOf[js.Any], input.asInstanceOf[js.Any], format.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Texture]
  inline def apply(gl: WebGLRenderingContext, input: InputType, format: GLenum): Texture = (^.asInstanceOf[js.Dynamic].apply(gl.asInstanceOf[js.Any], input.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Texture]
  inline def apply(gl: WebGLRenderingContext, input: InputType, format: GLenum, `type`: GLenum): Texture = (^.asInstanceOf[js.Dynamic].apply(gl.asInstanceOf[js.Any], input.asInstanceOf[js.Any], format.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Texture]
  inline def apply(gl: WebGLRenderingContext, input: RawObject): Texture = (^.asInstanceOf[js.Dynamic].apply(gl.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[Texture]
  inline def apply(gl: WebGLRenderingContext, input: RawObject, format: Unit, `type`: GLenum): Texture = (^.asInstanceOf[js.Dynamic].apply(gl.asInstanceOf[js.Any], input.asInstanceOf[js.Any], format.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Texture]
  inline def apply(gl: WebGLRenderingContext, input: RawObject, format: GLenum): Texture = (^.asInstanceOf[js.Dynamic].apply(gl.asInstanceOf[js.Any], input.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Texture]
  inline def apply(gl: WebGLRenderingContext, input: RawObject, format: GLenum, `type`: GLenum): Texture = (^.asInstanceOf[js.Dynamic].apply(gl.asInstanceOf[js.Any], input.asInstanceOf[js.Any], format.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Texture]
  
  @JSImport("gl-texture2d", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type GLenum = Double
  
  type InputType = ImageData | HTMLCanvasElement | HTMLImageElement | HTMLVideoElement
  
  trait RawObject extends StObject {
    
    var height: Double
    
    var raw: js.typedarray.ArrayBufferView | InputType | ImageBitmap
    
    var width: Double
  }
  object RawObject {
    
    inline def apply(height: Double, raw: js.typedarray.ArrayBufferView | InputType | ImageBitmap, width: Double): RawObject = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RawObject] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: js.typedarray.ArrayBufferView | InputType | ImageBitmap): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Texture extends StObject {
    
    def bind(): Double = js.native
    def bind(id: Double): Double = js.native
    
    def dispose(): Unit = js.native
    
    val format: GLenum = js.native
    
    def generateMipmap(): Unit = js.native
    
    val gl: WebGLRenderingContext = js.native
    
    val handle: WebGLTexture = js.native
    
    var magFilter: GLenum = js.native
    
    var minFilter: GLenum = js.native
    
    var mipSamples: GLenum = js.native
    
    def setPixels(data: InputType): Unit = js.native
    def setPixels(data: InputType, offset: js.Tuple2[Double, Double]): Unit = js.native
    def setPixels(data: InputType, offset: js.Tuple2[Double, Double], mipLevel: GLenum): Unit = js.native
    def setPixels(data: InputType, offset: Unit, mipLevel: GLenum): Unit = js.native
    def setPixels(data: RawObject): Unit = js.native
    def setPixels(data: RawObject, offset: js.Tuple2[Double, Double]): Unit = js.native
    def setPixels(data: RawObject, offset: js.Tuple2[Double, Double], mipLevel: GLenum): Unit = js.native
    def setPixels(data: RawObject, offset: Unit, mipLevel: GLenum): Unit = js.native
    def setPixels(data: NdArray[Data[Double]]): Unit = js.native
    def setPixels(data: NdArray[Data[Double]], offset: js.Tuple2[Double, Double]): Unit = js.native
    def setPixels(data: NdArray[Data[Double]], offset: js.Tuple2[Double, Double], mipLevel: GLenum): Unit = js.native
    def setPixels(data: NdArray[Data[Double]], offset: Unit, mipLevel: GLenum): Unit = js.native
    
    var shape: js.Tuple2[Double, Double] = js.native
    
    val `type`: GLenum = js.native
    
    var wrap: js.Tuple2[GLenum, GLenum] = js.native
  }
}
