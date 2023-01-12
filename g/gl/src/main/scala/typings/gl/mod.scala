package typings.gl

import typings.gl.glStrings.ANGLE_instanced_arrays
import typings.gl.glStrings.EXT_blend_minmax
import typings.gl.glStrings.EXT_color_buffer_float
import typings.gl.glStrings.EXT_color_buffer_half_float
import typings.gl.glStrings.EXT_float_blend
import typings.gl.glStrings.EXT_frag_depth
import typings.gl.glStrings.EXT_sRGB
import typings.gl.glStrings.EXT_shader_texture_lod
import typings.gl.glStrings.EXT_texture_compression_bptc
import typings.gl.glStrings.EXT_texture_compression_rgtc
import typings.gl.glStrings.EXT_texture_filter_anisotropic
import typings.gl.glStrings.KHR_parallel_shader_compile
import typings.gl.glStrings.OES_element_index_uint
import typings.gl.glStrings.OES_fbo_render_mipmap
import typings.gl.glStrings.OES_standard_derivatives
import typings.gl.glStrings.OES_texture_float
import typings.gl.glStrings.OES_texture_float_linear
import typings.gl.glStrings.OES_texture_half_float
import typings.gl.glStrings.OES_texture_half_float_linear
import typings.gl.glStrings.OES_vertex_array_object
import typings.gl.glStrings.OVR_multiview2
import typings.gl.glStrings.STACKGL_destroy_context
import typings.gl.glStrings.STACKGL_resize_drawingbuffer
import typings.gl.glStrings.WEBGL_color_buffer_float
import typings.gl.glStrings.WEBGL_compressed_texture_astc
import typings.gl.glStrings.WEBGL_compressed_texture_etc
import typings.gl.glStrings.WEBGL_compressed_texture_etc1
import typings.gl.glStrings.WEBGL_compressed_texture_s3tc
import typings.gl.glStrings.WEBGL_compressed_texture_s3tc_srgb
import typings.gl.glStrings.WEBGL_debug_renderer_info
import typings.gl.glStrings.WEBGL_debug_shaders
import typings.gl.glStrings.WEBGL_depth_texture
import typings.gl.glStrings.WEBGL_draw_buffers
import typings.gl.glStrings.WEBGL_lose_context
import typings.gl.glStrings.WEBGL_multi_draw
import typings.std.ANGLEInstancedArrays
import typings.std.BufferSource
import typings.std.EXTBlendMinmax
import typings.std.EXTColorBufferFloat
import typings.std.EXTColorBufferHalfFloat
import typings.std.EXTFloatBlend
import typings.std.EXTFragDepth
import typings.std.EXTSRGB
import typings.std.EXTShaderTextureLod
import typings.std.EXTTextureCompressionBptc
import typings.std.EXTTextureCompressionRgtc
import typings.std.EXTTextureFilterAnisotropic
import typings.std.Float32List
import typings.std.GLbitfield
import typings.std.GLboolean
import typings.std.GLclampf
import typings.std.GLenum
import typings.std.GLfloat
import typings.std.GLint
import typings.std.GLintptr
import typings.std.GLsizei
import typings.std.GLsizeiptr
import typings.std.GLuint
import typings.std.HTMLCanvasElement
import typings.std.Int32List
import typings.std.KHRParallelShaderCompile
import typings.std.OESElementIndexUint
import typings.std.OESFboRenderMipmap
import typings.std.OESStandardDerivatives
import typings.std.OESTextureFloat
import typings.std.OESTextureFloatLinear
import typings.std.OESTextureHalfFloat
import typings.std.OESTextureHalfFloatLinear
import typings.std.OESVertexArrayObject
import typings.std.OVRMultiview2
import typings.std.OffscreenCanvas
import typings.std.TexImageSource
import typings.std.WEBGLColorBufferFloat
import typings.std.WEBGLCompressedTextureAstc
import typings.std.WEBGLCompressedTextureEtc
import typings.std.WEBGLCompressedTextureEtc1
import typings.std.WEBGLCompressedTextureS3tc
import typings.std.WEBGLCompressedTextureS3tcSrgb
import typings.std.WEBGLDebugRendererInfo
import typings.std.WEBGLDebugShaders
import typings.std.WEBGLDepthTexture
import typings.std.WEBGLDrawBuffers
import typings.std.WEBGLLoseContext
import typings.std.WEBGLMultiDraw
import typings.std.WebGLActiveInfo
import typings.std.WebGLBuffer
import typings.std.WebGLContextAttributes
import typings.std.WebGLFramebuffer
import typings.std.WebGLProgram
import typings.std.WebGLRenderbuffer
import typings.std.WebGLRenderingContext
import typings.std.WebGLShader
import typings.std.WebGLShaderPrecisionFormat
import typings.std.WebGLTexture
import typings.std.WebGLUniformLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(width: Double, height: Double): WebGLRenderingContext & StackGLExtension = (^.asInstanceOf[js.Dynamic].apply(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[WebGLRenderingContext & StackGLExtension]
  inline def apply(width: Double, height: Double, options: WebGLContextAttributes): WebGLRenderingContext & StackGLExtension = (^.asInstanceOf[js.Dynamic].apply(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WebGLRenderingContext & StackGLExtension]
  
  @JSImport("gl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined std.WebGLRenderingContext & gl.gl.StackGLExtension & {new (): std.WebGLRenderingContext & gl.gl.StackGLExtension,   prototype :std.WebGLRenderingContext & gl.gl.StackGLExtension} */
  object WebGLRenderingContext {
    
    @JSImport("gl", "WebGLRenderingContext")
    @js.native
    val ^ : js.Any = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.ACTIVE_ATTRIBUTES")
    @js.native
    val ACTIVE_ATTRIBUTES: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.ACTIVE_TEXTURE")
    @js.native
    val ACTIVE_TEXTURE: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.ACTIVE_UNIFORMS")
    @js.native
    val ACTIVE_UNIFORMS: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.ALIASED_LINE_WIDTH_RANGE")
    @js.native
    val ALIASED_LINE_WIDTH_RANGE: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.ALIASED_POINT_SIZE_RANGE")
    @js.native
    val ALIASED_POINT_SIZE_RANGE: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.ALPHA")
    @js.native
    val ALPHA: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.ALPHA_BITS")
    @js.native
    val ALPHA_BITS: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.ALWAYS")
    @js.native
    val ALWAYS: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.ARRAY_BUFFER")
    @js.native
    val ARRAY_BUFFER: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.ARRAY_BUFFER_BINDING")
    @js.native
    val ARRAY_BUFFER_BINDING: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.ATTACHED_SHADERS")
    @js.native
    val ATTACHED_SHADERS: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.BACK")
    @js.native
    val BACK: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.BLEND")
    @js.native
    val BLEND: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.BLEND_COLOR")
    @js.native
    val BLEND_COLOR: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.BLEND_DST_ALPHA")
    @js.native
    val BLEND_DST_ALPHA: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.BLEND_DST_RGB")
    @js.native
    val BLEND_DST_RGB: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.BLEND_EQUATION")
    @js.native
    val BLEND_EQUATION: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.BLEND_EQUATION_ALPHA")
    @js.native
    val BLEND_EQUATION_ALPHA: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.BLEND_EQUATION_RGB")
    @js.native
    val BLEND_EQUATION_RGB: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.BLEND_SRC_ALPHA")
    @js.native
    val BLEND_SRC_ALPHA: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.BLEND_SRC_RGB")
    @js.native
    val BLEND_SRC_RGB: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.BLUE_BITS")
    @js.native
    val BLUE_BITS: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.BOOL")
    @js.native
    val BOOL: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.BOOL_VEC2")
    @js.native
    val BOOL_VEC2: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.BOOL_VEC3")
    @js.native
    val BOOL_VEC3: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.BOOL_VEC4")
    @js.native
    val BOOL_VEC4: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.BROWSER_DEFAULT_WEBGL")
    @js.native
    val BROWSER_DEFAULT_WEBGL: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.BUFFER_SIZE")
    @js.native
    val BUFFER_SIZE: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.BUFFER_USAGE")
    @js.native
    val BUFFER_USAGE: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.BYTE")
    @js.native
    val BYTE: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.CCW")
    @js.native
    val CCW: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.CLAMP_TO_EDGE")
    @js.native
    val CLAMP_TO_EDGE: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.COLOR_ATTACHMENT0")
    @js.native
    val COLOR_ATTACHMENT0: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.COLOR_BUFFER_BIT")
    @js.native
    val COLOR_BUFFER_BIT: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.COLOR_CLEAR_VALUE")
    @js.native
    val COLOR_CLEAR_VALUE: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.COLOR_WRITEMASK")
    @js.native
    val COLOR_WRITEMASK: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.COMPILE_STATUS")
    @js.native
    val COMPILE_STATUS: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.COMPRESSED_TEXTURE_FORMATS")
    @js.native
    val COMPRESSED_TEXTURE_FORMATS: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.CONSTANT_ALPHA")
    @js.native
    val CONSTANT_ALPHA: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.CONSTANT_COLOR")
    @js.native
    val CONSTANT_COLOR: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.CONTEXT_LOST_WEBGL")
    @js.native
    val CONTEXT_LOST_WEBGL: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.CULL_FACE")
    @js.native
    val CULL_FACE: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.CULL_FACE_MODE")
    @js.native
    val CULL_FACE_MODE: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.CURRENT_PROGRAM")
    @js.native
    val CURRENT_PROGRAM: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.CURRENT_VERTEX_ATTRIB")
    @js.native
    val CURRENT_VERTEX_ATTRIB: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.CW")
    @js.native
    val CW: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.DECR")
    @js.native
    val DECR: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.DECR_WRAP")
    @js.native
    val DECR_WRAP: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.DELETE_STATUS")
    @js.native
    val DELETE_STATUS: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.DEPTH_ATTACHMENT")
    @js.native
    val DEPTH_ATTACHMENT: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.DEPTH_BITS")
    @js.native
    val DEPTH_BITS: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.DEPTH_BUFFER_BIT")
    @js.native
    val DEPTH_BUFFER_BIT: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.DEPTH_CLEAR_VALUE")
    @js.native
    val DEPTH_CLEAR_VALUE: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.DEPTH_COMPONENT")
    @js.native
    val DEPTH_COMPONENT: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.DEPTH_COMPONENT16")
    @js.native
    val DEPTH_COMPONENT16: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.DEPTH_FUNC")
    @js.native
    val DEPTH_FUNC: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.DEPTH_RANGE")
    @js.native
    val DEPTH_RANGE: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.DEPTH_STENCIL")
    @js.native
    val DEPTH_STENCIL: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.DEPTH_STENCIL_ATTACHMENT")
    @js.native
    val DEPTH_STENCIL_ATTACHMENT: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.DEPTH_TEST")
    @js.native
    val DEPTH_TEST: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.DEPTH_WRITEMASK")
    @js.native
    val DEPTH_WRITEMASK: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.DITHER")
    @js.native
    val DITHER: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.DONT_CARE")
    @js.native
    val DONT_CARE: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.DST_ALPHA")
    @js.native
    val DST_ALPHA: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.DST_COLOR")
    @js.native
    val DST_COLOR: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.DYNAMIC_DRAW")
    @js.native
    val DYNAMIC_DRAW: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.ELEMENT_ARRAY_BUFFER")
    @js.native
    val ELEMENT_ARRAY_BUFFER: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.ELEMENT_ARRAY_BUFFER_BINDING")
    @js.native
    val ELEMENT_ARRAY_BUFFER_BINDING: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.EQUAL")
    @js.native
    val EQUAL: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.FASTEST")
    @js.native
    val FASTEST: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.FLOAT")
    @js.native
    val FLOAT: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.FLOAT_MAT2")
    @js.native
    val FLOAT_MAT2: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.FLOAT_MAT3")
    @js.native
    val FLOAT_MAT3: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.FLOAT_MAT4")
    @js.native
    val FLOAT_MAT4: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.FLOAT_VEC2")
    @js.native
    val FLOAT_VEC2: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.FLOAT_VEC3")
    @js.native
    val FLOAT_VEC3: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.FLOAT_VEC4")
    @js.native
    val FLOAT_VEC4: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.FRAGMENT_SHADER")
    @js.native
    val FRAGMENT_SHADER: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.FRAMEBUFFER")
    @js.native
    val FRAMEBUFFER: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.FRAMEBUFFER_ATTACHMENT_OBJECT_NAME")
    @js.native
    val FRAMEBUFFER_ATTACHMENT_OBJECT_NAME: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE")
    @js.native
    val FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE")
    @js.native
    val FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL")
    @js.native
    val FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.FRAMEBUFFER_BINDING")
    @js.native
    val FRAMEBUFFER_BINDING: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.FRAMEBUFFER_COMPLETE")
    @js.native
    val FRAMEBUFFER_COMPLETE: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.FRAMEBUFFER_INCOMPLETE_ATTACHMENT")
    @js.native
    val FRAMEBUFFER_INCOMPLETE_ATTACHMENT: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.FRAMEBUFFER_INCOMPLETE_DIMENSIONS")
    @js.native
    val FRAMEBUFFER_INCOMPLETE_DIMENSIONS: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT")
    @js.native
    val FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.FRAMEBUFFER_UNSUPPORTED")
    @js.native
    val FRAMEBUFFER_UNSUPPORTED: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.FRONT")
    @js.native
    val FRONT: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.FRONT_AND_BACK")
    @js.native
    val FRONT_AND_BACK: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.FRONT_FACE")
    @js.native
    val FRONT_FACE: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.FUNC_ADD")
    @js.native
    val FUNC_ADD: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.FUNC_REVERSE_SUBTRACT")
    @js.native
    val FUNC_REVERSE_SUBTRACT: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.FUNC_SUBTRACT")
    @js.native
    val FUNC_SUBTRACT: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.GENERATE_MIPMAP_HINT")
    @js.native
    val GENERATE_MIPMAP_HINT: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.GEQUAL")
    @js.native
    val GEQUAL: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.GREATER")
    @js.native
    val GREATER: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.GREEN_BITS")
    @js.native
    val GREEN_BITS: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.HIGH_FLOAT")
    @js.native
    val HIGH_FLOAT: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.HIGH_INT")
    @js.native
    val HIGH_INT: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.IMPLEMENTATION_COLOR_READ_FORMAT")
    @js.native
    val IMPLEMENTATION_COLOR_READ_FORMAT: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.IMPLEMENTATION_COLOR_READ_TYPE")
    @js.native
    val IMPLEMENTATION_COLOR_READ_TYPE: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.INCR")
    @js.native
    val INCR: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.INCR_WRAP")
    @js.native
    val INCR_WRAP: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.INT")
    @js.native
    val INT: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.INT_VEC2")
    @js.native
    val INT_VEC2: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.INT_VEC3")
    @js.native
    val INT_VEC3: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.INT_VEC4")
    @js.native
    val INT_VEC4: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.INVALID_ENUM")
    @js.native
    val INVALID_ENUM: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.INVALID_FRAMEBUFFER_OPERATION")
    @js.native
    val INVALID_FRAMEBUFFER_OPERATION: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.INVALID_OPERATION")
    @js.native
    val INVALID_OPERATION: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.INVALID_VALUE")
    @js.native
    val INVALID_VALUE: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.INVERT")
    @js.native
    val INVERT: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.KEEP")
    @js.native
    val KEEP: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.LEQUAL")
    @js.native
    val LEQUAL: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.LESS")
    @js.native
    val LESS: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.LINEAR")
    @js.native
    val LINEAR: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.LINEAR_MIPMAP_LINEAR")
    @js.native
    val LINEAR_MIPMAP_LINEAR: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.LINEAR_MIPMAP_NEAREST")
    @js.native
    val LINEAR_MIPMAP_NEAREST: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.LINES")
    @js.native
    val LINES: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.LINE_LOOP")
    @js.native
    val LINE_LOOP: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.LINE_STRIP")
    @js.native
    val LINE_STRIP: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.LINE_WIDTH")
    @js.native
    val LINE_WIDTH: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.LINK_STATUS")
    @js.native
    val LINK_STATUS: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.LOW_FLOAT")
    @js.native
    val LOW_FLOAT: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.LOW_INT")
    @js.native
    val LOW_INT: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.LUMINANCE")
    @js.native
    val LUMINANCE: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.LUMINANCE_ALPHA")
    @js.native
    val LUMINANCE_ALPHA: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.MAX_COMBINED_TEXTURE_IMAGE_UNITS")
    @js.native
    val MAX_COMBINED_TEXTURE_IMAGE_UNITS: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.MAX_CUBE_MAP_TEXTURE_SIZE")
    @js.native
    val MAX_CUBE_MAP_TEXTURE_SIZE: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.MAX_FRAGMENT_UNIFORM_VECTORS")
    @js.native
    val MAX_FRAGMENT_UNIFORM_VECTORS: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.MAX_RENDERBUFFER_SIZE")
    @js.native
    val MAX_RENDERBUFFER_SIZE: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.MAX_TEXTURE_IMAGE_UNITS")
    @js.native
    val MAX_TEXTURE_IMAGE_UNITS: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.MAX_TEXTURE_SIZE")
    @js.native
    val MAX_TEXTURE_SIZE: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.MAX_VARYING_VECTORS")
    @js.native
    val MAX_VARYING_VECTORS: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.MAX_VERTEX_ATTRIBS")
    @js.native
    val MAX_VERTEX_ATTRIBS: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.MAX_VERTEX_TEXTURE_IMAGE_UNITS")
    @js.native
    val MAX_VERTEX_TEXTURE_IMAGE_UNITS: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.MAX_VERTEX_UNIFORM_VECTORS")
    @js.native
    val MAX_VERTEX_UNIFORM_VECTORS: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.MAX_VIEWPORT_DIMS")
    @js.native
    val MAX_VIEWPORT_DIMS: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.MEDIUM_FLOAT")
    @js.native
    val MEDIUM_FLOAT: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.MEDIUM_INT")
    @js.native
    val MEDIUM_INT: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.MIRRORED_REPEAT")
    @js.native
    val MIRRORED_REPEAT: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.NEAREST")
    @js.native
    val NEAREST: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.NEAREST_MIPMAP_LINEAR")
    @js.native
    val NEAREST_MIPMAP_LINEAR: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.NEAREST_MIPMAP_NEAREST")
    @js.native
    val NEAREST_MIPMAP_NEAREST: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.NEVER")
    @js.native
    val NEVER: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.NICEST")
    @js.native
    val NICEST: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.NONE")
    @js.native
    val NONE: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.NOTEQUAL")
    @js.native
    val NOTEQUAL: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.NO_ERROR")
    @js.native
    val NO_ERROR: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.ONE")
    @js.native
    val ONE: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.ONE_MINUS_CONSTANT_ALPHA")
    @js.native
    val ONE_MINUS_CONSTANT_ALPHA: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.ONE_MINUS_CONSTANT_COLOR")
    @js.native
    val ONE_MINUS_CONSTANT_COLOR: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.ONE_MINUS_DST_ALPHA")
    @js.native
    val ONE_MINUS_DST_ALPHA: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.ONE_MINUS_DST_COLOR")
    @js.native
    val ONE_MINUS_DST_COLOR: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.ONE_MINUS_SRC_ALPHA")
    @js.native
    val ONE_MINUS_SRC_ALPHA: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.ONE_MINUS_SRC_COLOR")
    @js.native
    val ONE_MINUS_SRC_COLOR: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.OUT_OF_MEMORY")
    @js.native
    val OUT_OF_MEMORY: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.PACK_ALIGNMENT")
    @js.native
    val PACK_ALIGNMENT: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.POINTS")
    @js.native
    val POINTS: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.POLYGON_OFFSET_FACTOR")
    @js.native
    val POLYGON_OFFSET_FACTOR: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.POLYGON_OFFSET_FILL")
    @js.native
    val POLYGON_OFFSET_FILL: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.POLYGON_OFFSET_UNITS")
    @js.native
    val POLYGON_OFFSET_UNITS: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.RED_BITS")
    @js.native
    val RED_BITS: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.RENDERBUFFER")
    @js.native
    val RENDERBUFFER: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.RENDERBUFFER_ALPHA_SIZE")
    @js.native
    val RENDERBUFFER_ALPHA_SIZE: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.RENDERBUFFER_BINDING")
    @js.native
    val RENDERBUFFER_BINDING: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.RENDERBUFFER_BLUE_SIZE")
    @js.native
    val RENDERBUFFER_BLUE_SIZE: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.RENDERBUFFER_DEPTH_SIZE")
    @js.native
    val RENDERBUFFER_DEPTH_SIZE: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.RENDERBUFFER_GREEN_SIZE")
    @js.native
    val RENDERBUFFER_GREEN_SIZE: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.RENDERBUFFER_HEIGHT")
    @js.native
    val RENDERBUFFER_HEIGHT: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.RENDERBUFFER_INTERNAL_FORMAT")
    @js.native
    val RENDERBUFFER_INTERNAL_FORMAT: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.RENDERBUFFER_RED_SIZE")
    @js.native
    val RENDERBUFFER_RED_SIZE: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.RENDERBUFFER_STENCIL_SIZE")
    @js.native
    val RENDERBUFFER_STENCIL_SIZE: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.RENDERBUFFER_WIDTH")
    @js.native
    val RENDERBUFFER_WIDTH: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.RENDERER")
    @js.native
    val RENDERER: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.REPEAT")
    @js.native
    val REPEAT: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.REPLACE")
    @js.native
    val REPLACE: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.RGB")
    @js.native
    val RGB: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.RGB565")
    @js.native
    val RGB565: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.RGB5_A1")
    @js.native
    val RGB5_A1: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.RGBA")
    @js.native
    val RGBA: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.RGBA4")
    @js.native
    val RGBA4: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.SAMPLER_2D")
    @js.native
    val SAMPLER_2D: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.SAMPLER_CUBE")
    @js.native
    val SAMPLER_CUBE: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.SAMPLES")
    @js.native
    val SAMPLES: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.SAMPLE_ALPHA_TO_COVERAGE")
    @js.native
    val SAMPLE_ALPHA_TO_COVERAGE: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.SAMPLE_BUFFERS")
    @js.native
    val SAMPLE_BUFFERS: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.SAMPLE_COVERAGE")
    @js.native
    val SAMPLE_COVERAGE: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.SAMPLE_COVERAGE_INVERT")
    @js.native
    val SAMPLE_COVERAGE_INVERT: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.SAMPLE_COVERAGE_VALUE")
    @js.native
    val SAMPLE_COVERAGE_VALUE: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.SCISSOR_BOX")
    @js.native
    val SCISSOR_BOX: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.SCISSOR_TEST")
    @js.native
    val SCISSOR_TEST: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.SHADER_TYPE")
    @js.native
    val SHADER_TYPE: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.SHADING_LANGUAGE_VERSION")
    @js.native
    val SHADING_LANGUAGE_VERSION: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.SHORT")
    @js.native
    val SHORT: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.SRC_ALPHA")
    @js.native
    val SRC_ALPHA: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.SRC_ALPHA_SATURATE")
    @js.native
    val SRC_ALPHA_SATURATE: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.SRC_COLOR")
    @js.native
    val SRC_COLOR: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.STATIC_DRAW")
    @js.native
    val STATIC_DRAW: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.STENCIL_ATTACHMENT")
    @js.native
    val STENCIL_ATTACHMENT: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.STENCIL_BACK_FAIL")
    @js.native
    val STENCIL_BACK_FAIL: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.STENCIL_BACK_FUNC")
    @js.native
    val STENCIL_BACK_FUNC: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.STENCIL_BACK_PASS_DEPTH_FAIL")
    @js.native
    val STENCIL_BACK_PASS_DEPTH_FAIL: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.STENCIL_BACK_PASS_DEPTH_PASS")
    @js.native
    val STENCIL_BACK_PASS_DEPTH_PASS: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.STENCIL_BACK_REF")
    @js.native
    val STENCIL_BACK_REF: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.STENCIL_BACK_VALUE_MASK")
    @js.native
    val STENCIL_BACK_VALUE_MASK: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.STENCIL_BACK_WRITEMASK")
    @js.native
    val STENCIL_BACK_WRITEMASK: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.STENCIL_BITS")
    @js.native
    val STENCIL_BITS: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.STENCIL_BUFFER_BIT")
    @js.native
    val STENCIL_BUFFER_BIT: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.STENCIL_CLEAR_VALUE")
    @js.native
    val STENCIL_CLEAR_VALUE: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.STENCIL_FAIL")
    @js.native
    val STENCIL_FAIL: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.STENCIL_FUNC")
    @js.native
    val STENCIL_FUNC: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.STENCIL_INDEX8")
    @js.native
    val STENCIL_INDEX8: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.STENCIL_PASS_DEPTH_FAIL")
    @js.native
    val STENCIL_PASS_DEPTH_FAIL: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.STENCIL_PASS_DEPTH_PASS")
    @js.native
    val STENCIL_PASS_DEPTH_PASS: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.STENCIL_REF")
    @js.native
    val STENCIL_REF: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.STENCIL_TEST")
    @js.native
    val STENCIL_TEST: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.STENCIL_VALUE_MASK")
    @js.native
    val STENCIL_VALUE_MASK: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.STENCIL_WRITEMASK")
    @js.native
    val STENCIL_WRITEMASK: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.STREAM_DRAW")
    @js.native
    val STREAM_DRAW: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.SUBPIXEL_BITS")
    @js.native
    val SUBPIXEL_BITS: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.TEXTURE")
    @js.native
    val TEXTURE: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.TEXTURE0")
    @js.native
    val TEXTURE0: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.TEXTURE1")
    @js.native
    val TEXTURE1: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.TEXTURE10")
    @js.native
    val TEXTURE10: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.TEXTURE11")
    @js.native
    val TEXTURE11: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.TEXTURE12")
    @js.native
    val TEXTURE12: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.TEXTURE13")
    @js.native
    val TEXTURE13: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.TEXTURE14")
    @js.native
    val TEXTURE14: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.TEXTURE15")
    @js.native
    val TEXTURE15: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.TEXTURE16")
    @js.native
    val TEXTURE16: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.TEXTURE17")
    @js.native
    val TEXTURE17: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.TEXTURE18")
    @js.native
    val TEXTURE18: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.TEXTURE19")
    @js.native
    val TEXTURE19: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.TEXTURE2")
    @js.native
    val TEXTURE2: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.TEXTURE20")
    @js.native
    val TEXTURE20: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.TEXTURE21")
    @js.native
    val TEXTURE21: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.TEXTURE22")
    @js.native
    val TEXTURE22: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.TEXTURE23")
    @js.native
    val TEXTURE23: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.TEXTURE24")
    @js.native
    val TEXTURE24: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.TEXTURE25")
    @js.native
    val TEXTURE25: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.TEXTURE26")
    @js.native
    val TEXTURE26: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.TEXTURE27")
    @js.native
    val TEXTURE27: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.TEXTURE28")
    @js.native
    val TEXTURE28: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.TEXTURE29")
    @js.native
    val TEXTURE29: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.TEXTURE3")
    @js.native
    val TEXTURE3: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.TEXTURE30")
    @js.native
    val TEXTURE30: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.TEXTURE31")
    @js.native
    val TEXTURE31: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.TEXTURE4")
    @js.native
    val TEXTURE4: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.TEXTURE5")
    @js.native
    val TEXTURE5: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.TEXTURE6")
    @js.native
    val TEXTURE6: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.TEXTURE7")
    @js.native
    val TEXTURE7: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.TEXTURE8")
    @js.native
    val TEXTURE8: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.TEXTURE9")
    @js.native
    val TEXTURE9: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.TEXTURE_2D")
    @js.native
    val TEXTURE_2D: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.TEXTURE_BINDING_2D")
    @js.native
    val TEXTURE_BINDING_2D: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.TEXTURE_BINDING_CUBE_MAP")
    @js.native
    val TEXTURE_BINDING_CUBE_MAP: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.TEXTURE_CUBE_MAP")
    @js.native
    val TEXTURE_CUBE_MAP: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_X")
    @js.native
    val TEXTURE_CUBE_MAP_NEGATIVE_X: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Y")
    @js.native
    val TEXTURE_CUBE_MAP_NEGATIVE_Y: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Z")
    @js.native
    val TEXTURE_CUBE_MAP_NEGATIVE_Z: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_X")
    @js.native
    val TEXTURE_CUBE_MAP_POSITIVE_X: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Y")
    @js.native
    val TEXTURE_CUBE_MAP_POSITIVE_Y: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Z")
    @js.native
    val TEXTURE_CUBE_MAP_POSITIVE_Z: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.TEXTURE_MAG_FILTER")
    @js.native
    val TEXTURE_MAG_FILTER: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.TEXTURE_MIN_FILTER")
    @js.native
    val TEXTURE_MIN_FILTER: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.TEXTURE_WRAP_S")
    @js.native
    val TEXTURE_WRAP_S: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.TEXTURE_WRAP_T")
    @js.native
    val TEXTURE_WRAP_T: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.TRIANGLES")
    @js.native
    val TRIANGLES: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.TRIANGLE_FAN")
    @js.native
    val TRIANGLE_FAN: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.TRIANGLE_STRIP")
    @js.native
    val TRIANGLE_STRIP: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.UNPACK_ALIGNMENT")
    @js.native
    val UNPACK_ALIGNMENT: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.UNPACK_COLORSPACE_CONVERSION_WEBGL")
    @js.native
    val UNPACK_COLORSPACE_CONVERSION_WEBGL: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.UNPACK_FLIP_Y_WEBGL")
    @js.native
    val UNPACK_FLIP_Y_WEBGL: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.UNPACK_PREMULTIPLY_ALPHA_WEBGL")
    @js.native
    val UNPACK_PREMULTIPLY_ALPHA_WEBGL: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.UNSIGNED_BYTE")
    @js.native
    val UNSIGNED_BYTE: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.UNSIGNED_INT")
    @js.native
    val UNSIGNED_INT: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.UNSIGNED_SHORT")
    @js.native
    val UNSIGNED_SHORT: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.UNSIGNED_SHORT_4_4_4_4")
    @js.native
    val UNSIGNED_SHORT_4_4_4_4: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.UNSIGNED_SHORT_5_5_5_1")
    @js.native
    val UNSIGNED_SHORT_5_5_5_1: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.UNSIGNED_SHORT_5_6_5")
    @js.native
    val UNSIGNED_SHORT_5_6_5: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.VALIDATE_STATUS")
    @js.native
    val VALIDATE_STATUS: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.VENDOR")
    @js.native
    val VENDOR: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.VERSION")
    @js.native
    val VERSION: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.VERTEX_ATTRIB_ARRAY_BUFFER_BINDING")
    @js.native
    val VERTEX_ATTRIB_ARRAY_BUFFER_BINDING: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.VERTEX_ATTRIB_ARRAY_ENABLED")
    @js.native
    val VERTEX_ATTRIB_ARRAY_ENABLED: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.VERTEX_ATTRIB_ARRAY_NORMALIZED")
    @js.native
    val VERTEX_ATTRIB_ARRAY_NORMALIZED: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.VERTEX_ATTRIB_ARRAY_POINTER")
    @js.native
    val VERTEX_ATTRIB_ARRAY_POINTER: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.VERTEX_ATTRIB_ARRAY_SIZE")
    @js.native
    val VERTEX_ATTRIB_ARRAY_SIZE: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.VERTEX_ATTRIB_ARRAY_STRIDE")
    @js.native
    val VERTEX_ATTRIB_ARRAY_STRIDE: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.VERTEX_ATTRIB_ARRAY_TYPE")
    @js.native
    val VERTEX_ATTRIB_ARRAY_TYPE: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.VERTEX_SHADER")
    @js.native
    val VERTEX_SHADER: GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.VIEWPORT")
    @js.native
    val VIEWPORT_ : GLenum = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.ZERO")
    @js.native
    val ZERO: GLenum = js.native
    
    /* standard dom */
    inline def activeTexture(texture: GLenum): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("activeTexture")(texture.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* standard dom */
    inline def attachShader(program: WebGLProgram, shader: WebGLShader): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attachShader")(program.asInstanceOf[js.Any], shader.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* standard dom */
    inline def bindAttribLocation(program: WebGLProgram, index: GLuint, name: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bindAttribLocation")(program.asInstanceOf[js.Any], index.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* standard dom */
    inline def bindBuffer(target: GLenum): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("bindBuffer")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def bindBuffer(target: GLenum, buffer: WebGLBuffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bindBuffer")(target.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* standard dom */
    inline def bindFramebuffer(target: GLenum): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("bindFramebuffer")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def bindFramebuffer(target: GLenum, framebuffer: WebGLFramebuffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bindFramebuffer")(target.asInstanceOf[js.Any], framebuffer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* standard dom */
    inline def bindRenderbuffer(target: GLenum): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("bindRenderbuffer")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def bindRenderbuffer(target: GLenum, renderbuffer: WebGLRenderbuffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bindRenderbuffer")(target.asInstanceOf[js.Any], renderbuffer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* standard dom */
    inline def bindTexture(target: GLenum): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("bindTexture")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def bindTexture(target: GLenum, texture: WebGLTexture): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bindTexture")(target.asInstanceOf[js.Any], texture.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* standard dom */
    inline def blendColor(red: GLclampf, green: GLclampf, blue: GLclampf, alpha: GLclampf): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("blendColor")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* standard dom */
    inline def blendEquation(mode: GLenum): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("blendEquation")(mode.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* standard dom */
    inline def blendEquationSeparate(modeRGB: GLenum, modeAlpha: GLenum): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("blendEquationSeparate")(modeRGB.asInstanceOf[js.Any], modeAlpha.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* standard dom */
    inline def blendFunc(sfactor: GLenum, dfactor: GLenum): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("blendFunc")(sfactor.asInstanceOf[js.Any], dfactor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* standard dom */
    inline def blendFuncSeparate(srcRGB: GLenum, dstRGB: GLenum, srcAlpha: GLenum, dstAlpha: GLenum): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("blendFuncSeparate")(srcRGB.asInstanceOf[js.Any], dstRGB.asInstanceOf[js.Any], srcAlpha.asInstanceOf[js.Any], dstAlpha.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def bufferData(target: GLenum, data: Null, usage: GLenum): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferData")(target.asInstanceOf[js.Any], data.asInstanceOf[js.Any], usage.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /* standard dom */
    inline def bufferData(target: GLenum, data: BufferSource, usage: GLenum): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferData")(target.asInstanceOf[js.Any], data.asInstanceOf[js.Any], usage.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /* standard dom */
    inline def bufferData(target: GLenum, size: GLsizeiptr, usage: GLenum): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferData")(target.asInstanceOf[js.Any], size.asInstanceOf[js.Any], usage.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* standard dom */
    inline def bufferSubData(target: GLenum, offset: GLintptr, data: BufferSource): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferSubData")(target.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.canvas")
    @js.native
    val canvas: HTMLCanvasElement | OffscreenCanvas = js.native
    
    /* standard dom */
    inline def checkFramebufferStatus(target: GLenum): GLenum = ^.asInstanceOf[js.Dynamic].applyDynamic("checkFramebufferStatus")(target.asInstanceOf[js.Any]).asInstanceOf[GLenum]
    
    /* standard dom */
    inline def clear(mask: GLbitfield): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(mask.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* standard dom */
    inline def clearColor(red: GLclampf, green: GLclampf, blue: GLclampf, alpha: GLclampf): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clearColor")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* standard dom */
    inline def clearDepth(depth: GLclampf): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearDepth")(depth.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* standard dom */
    inline def clearStencil(s: GLint): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearStencil")(s.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* standard dom */
    inline def colorMask(red: GLboolean, green: GLboolean, blue: GLboolean, alpha: GLboolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("colorMask")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* standard dom */
    inline def compileShader(shader: WebGLShader): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("compileShader")(shader.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* standard dom */
    inline def compressedTexImage2D(
      target: GLenum,
      level: GLint,
      internalformat: GLenum,
      width: GLsizei,
      height: GLsizei,
      border: GLint,
      data: js.typedarray.ArrayBufferView
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compressedTexImage2D")(target.asInstanceOf[js.Any], level.asInstanceOf[js.Any], internalformat.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], border.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* standard dom */
    inline def compressedTexSubImage2D(
      target: GLenum,
      level: GLint,
      xoffset: GLint,
      yoffset: GLint,
      width: GLsizei,
      height: GLsizei,
      format: GLenum,
      data: js.typedarray.ArrayBufferView
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compressedTexSubImage2D")(target.asInstanceOf[js.Any], level.asInstanceOf[js.Any], xoffset.asInstanceOf[js.Any], yoffset.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], format.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* standard dom */
    inline def copyTexImage2D(
      target: GLenum,
      level: GLint,
      internalformat: GLenum,
      x: GLint,
      y: GLint,
      width: GLsizei,
      height: GLsizei,
      border: GLint
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyTexImage2D")(target.asInstanceOf[js.Any], level.asInstanceOf[js.Any], internalformat.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], border.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* standard dom */
    inline def copyTexSubImage2D(
      target: GLenum,
      level: GLint,
      xoffset: GLint,
      yoffset: GLint,
      x: GLint,
      y: GLint,
      width: GLsizei,
      height: GLsizei
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyTexSubImage2D")(target.asInstanceOf[js.Any], level.asInstanceOf[js.Any], xoffset.asInstanceOf[js.Any], yoffset.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* standard dom */
    inline def createBuffer(): WebGLBuffer | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("createBuffer")().asInstanceOf[WebGLBuffer | Null]
    
    /* standard dom */
    inline def createFramebuffer(): WebGLFramebuffer | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("createFramebuffer")().asInstanceOf[WebGLFramebuffer | Null]
    
    /* standard dom */
    inline def createProgram(): WebGLProgram | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("createProgram")().asInstanceOf[WebGLProgram | Null]
    
    /* standard dom */
    inline def createRenderbuffer(): WebGLRenderbuffer | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("createRenderbuffer")().asInstanceOf[WebGLRenderbuffer | Null]
    
    /* standard dom */
    inline def createShader(`type`: GLenum): WebGLShader | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("createShader")(`type`.asInstanceOf[js.Any]).asInstanceOf[WebGLShader | Null]
    
    /* standard dom */
    inline def createTexture(): WebGLTexture | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("createTexture")().asInstanceOf[WebGLTexture | Null]
    
    /* standard dom */
    inline def cullFace(mode: GLenum): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cullFace")(mode.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* standard dom */
    inline def deleteBuffer(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteBuffer")().asInstanceOf[Unit]
    inline def deleteBuffer(buffer: WebGLBuffer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* standard dom */
    inline def deleteFramebuffer(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteFramebuffer")().asInstanceOf[Unit]
    inline def deleteFramebuffer(framebuffer: WebGLFramebuffer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteFramebuffer")(framebuffer.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* standard dom */
    inline def deleteProgram(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteProgram")().asInstanceOf[Unit]
    inline def deleteProgram(program: WebGLProgram): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteProgram")(program.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* standard dom */
    inline def deleteRenderbuffer(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteRenderbuffer")().asInstanceOf[Unit]
    inline def deleteRenderbuffer(renderbuffer: WebGLRenderbuffer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteRenderbuffer")(renderbuffer.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* standard dom */
    inline def deleteShader(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteShader")().asInstanceOf[Unit]
    inline def deleteShader(shader: WebGLShader): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteShader")(shader.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* standard dom */
    inline def deleteTexture(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteTexture")().asInstanceOf[Unit]
    inline def deleteTexture(texture: WebGLTexture): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteTexture")(texture.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* standard dom */
    inline def depthFunc(func: GLenum): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("depthFunc")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* standard dom */
    inline def depthMask(flag: GLboolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("depthMask")(flag.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* standard dom */
    inline def depthRange(zNear: GLclampf, zFar: GLclampf): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("depthRange")(zNear.asInstanceOf[js.Any], zFar.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* standard dom */
    inline def detachShader(program: WebGLProgram, shader: WebGLShader): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detachShader")(program.asInstanceOf[js.Any], shader.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* standard dom */
    inline def disable(cap: GLenum): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")(cap.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* standard dom */
    inline def disableVertexAttribArray(index: GLuint): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableVertexAttribArray")(index.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* standard dom */
    inline def drawArrays(mode: GLenum, first: GLint, count: GLsizei): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawArrays")(mode.asInstanceOf[js.Any], first.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* standard dom */
    inline def drawElements(mode: GLenum, count: GLsizei, `type`: GLenum, offset: GLintptr): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawElements")(mode.asInstanceOf[js.Any], count.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.drawingBufferHeight")
    @js.native
    val drawingBufferHeight: GLsizei = js.native
    
    /* standard dom */
    @JSImport("gl", "WebGLRenderingContext.drawingBufferWidth")
    @js.native
    val drawingBufferWidth: GLsizei = js.native
    
    /* standard dom */
    inline def enable(cap: GLenum): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")(cap.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* standard dom */
    inline def enableVertexAttribArray(index: GLuint): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableVertexAttribArray")(index.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* standard dom */
    inline def finish(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("finish")().asInstanceOf[Unit]
    
    /* standard dom */
    inline def flush(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")().asInstanceOf[Unit]
    
    /* standard dom */
    inline def framebufferRenderbuffer(target: GLenum, attachment: GLenum, renderbuffertarget: GLenum): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("framebufferRenderbuffer")(target.asInstanceOf[js.Any], attachment.asInstanceOf[js.Any], renderbuffertarget.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def framebufferRenderbuffer(target: GLenum, attachment: GLenum, renderbuffertarget: GLenum, renderbuffer: WebGLRenderbuffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("framebufferRenderbuffer")(target.asInstanceOf[js.Any], attachment.asInstanceOf[js.Any], renderbuffertarget.asInstanceOf[js.Any], renderbuffer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def framebufferTexture2D(target: GLenum, attachment: GLenum, textarget: GLenum, texture: Null, level: GLint): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("framebufferTexture2D")(target.asInstanceOf[js.Any], attachment.asInstanceOf[js.Any], textarget.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /* standard dom */
    inline def framebufferTexture2D(target: GLenum, attachment: GLenum, textarget: GLenum, texture: WebGLTexture, level: GLint): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("framebufferTexture2D")(target.asInstanceOf[js.Any], attachment.asInstanceOf[js.Any], textarget.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* standard dom */
    inline def frontFace(mode: GLenum): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("frontFace")(mode.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* standard dom */
    inline def generateMipmap(target: GLenum): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("generateMipmap")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* standard dom */
    inline def getActiveAttrib(program: WebGLProgram, index: GLuint): WebGLActiveInfo | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getActiveAttrib")(program.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[WebGLActiveInfo | Null]
    
    /* standard dom */
    inline def getActiveUniform(program: WebGLProgram, index: GLuint): WebGLActiveInfo | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getActiveUniform")(program.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[WebGLActiveInfo | Null]
    
    /* standard dom */
    inline def getAttachedShaders(program: WebGLProgram): js.Array[WebGLShader] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getAttachedShaders")(program.asInstanceOf[js.Any]).asInstanceOf[js.Array[WebGLShader] | Null]
    
    /* standard dom */
    inline def getAttribLocation(program: WebGLProgram, name: String): GLint = (^.asInstanceOf[js.Dynamic].applyDynamic("getAttribLocation")(program.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[GLint]
    
    /* standard dom */
    inline def getBufferParameter(target: GLenum, pname: GLenum): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getBufferParameter")(target.asInstanceOf[js.Any], pname.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /* standard dom */
    inline def getContextAttributes(): WebGLContextAttributes | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getContextAttributes")().asInstanceOf[WebGLContextAttributes | Null]
    
    /* standard dom */
    inline def getError(): GLenum = ^.asInstanceOf[js.Dynamic].applyDynamic("getError")().asInstanceOf[GLenum]
    
    /* standard dom */
    inline def getExtension(name: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtension")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /* standard dom */
    inline def getExtension_ANGLEinstancedarrays(extensionName: ANGLE_instanced_arrays): ANGLEInstancedArrays | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtension")(extensionName.asInstanceOf[js.Any]).asInstanceOf[ANGLEInstancedArrays | Null]
    
    /* standard dom */
    inline def getExtension_EXTblendminmax(extensionName: EXT_blend_minmax): EXTBlendMinmax | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtension")(extensionName.asInstanceOf[js.Any]).asInstanceOf[EXTBlendMinmax | Null]
    
    /* standard dom */
    inline def getExtension_EXTcolorbufferfloat(extensionName: EXT_color_buffer_float): EXTColorBufferFloat | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtension")(extensionName.asInstanceOf[js.Any]).asInstanceOf[EXTColorBufferFloat | Null]
    
    /* standard dom */
    inline def getExtension_EXTcolorbufferhalffloat(extensionName: EXT_color_buffer_half_float): EXTColorBufferHalfFloat | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtension")(extensionName.asInstanceOf[js.Any]).asInstanceOf[EXTColorBufferHalfFloat | Null]
    
    /* standard dom */
    inline def getExtension_EXTfloatblend(extensionName: EXT_float_blend): EXTFloatBlend | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtension")(extensionName.asInstanceOf[js.Any]).asInstanceOf[EXTFloatBlend | Null]
    
    /* standard dom */
    inline def getExtension_EXTfragdepth(extensionName: EXT_frag_depth): EXTFragDepth | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtension")(extensionName.asInstanceOf[js.Any]).asInstanceOf[EXTFragDepth | Null]
    
    /* standard dom */
    inline def getExtension_EXTsRGB(extensionName: EXT_sRGB): EXTSRGB | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtension")(extensionName.asInstanceOf[js.Any]).asInstanceOf[EXTSRGB | Null]
    
    /* standard dom */
    inline def getExtension_EXTshadertexturelod(extensionName: EXT_shader_texture_lod): EXTShaderTextureLod | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtension")(extensionName.asInstanceOf[js.Any]).asInstanceOf[EXTShaderTextureLod | Null]
    
    /* standard dom */
    inline def getExtension_EXTtexturecompressionbptc(extensionName: EXT_texture_compression_bptc): EXTTextureCompressionBptc | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtension")(extensionName.asInstanceOf[js.Any]).asInstanceOf[EXTTextureCompressionBptc | Null]
    
    /* standard dom */
    inline def getExtension_EXTtexturecompressionrgtc(extensionName: EXT_texture_compression_rgtc): EXTTextureCompressionRgtc | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtension")(extensionName.asInstanceOf[js.Any]).asInstanceOf[EXTTextureCompressionRgtc | Null]
    
    /* standard dom */
    inline def getExtension_EXTtexturefilteranisotropic(extensionName: EXT_texture_filter_anisotropic): EXTTextureFilterAnisotropic | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtension")(extensionName.asInstanceOf[js.Any]).asInstanceOf[EXTTextureFilterAnisotropic | Null]
    
    /* standard dom */
    inline def getExtension_KHRparallelshadercompile(extensionName: KHR_parallel_shader_compile): KHRParallelShaderCompile | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtension")(extensionName.asInstanceOf[js.Any]).asInstanceOf[KHRParallelShaderCompile | Null]
    
    /* standard dom */
    inline def getExtension_OESelementindexuint(extensionName: OES_element_index_uint): OESElementIndexUint | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtension")(extensionName.asInstanceOf[js.Any]).asInstanceOf[OESElementIndexUint | Null]
    
    /* standard dom */
    inline def getExtension_OESfborendermipmap(extensionName: OES_fbo_render_mipmap): OESFboRenderMipmap | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtension")(extensionName.asInstanceOf[js.Any]).asInstanceOf[OESFboRenderMipmap | Null]
    
    /* standard dom */
    inline def getExtension_OESstandardderivatives(extensionName: OES_standard_derivatives): OESStandardDerivatives | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtension")(extensionName.asInstanceOf[js.Any]).asInstanceOf[OESStandardDerivatives | Null]
    
    /* standard dom */
    inline def getExtension_OEStexturefloat(extensionName: OES_texture_float): OESTextureFloat | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtension")(extensionName.asInstanceOf[js.Any]).asInstanceOf[OESTextureFloat | Null]
    
    /* standard dom */
    inline def getExtension_OEStexturefloatlinear(extensionName: OES_texture_float_linear): OESTextureFloatLinear | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtension")(extensionName.asInstanceOf[js.Any]).asInstanceOf[OESTextureFloatLinear | Null]
    
    /* standard dom */
    inline def getExtension_OEStexturehalffloat(extensionName: OES_texture_half_float): OESTextureHalfFloat | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtension")(extensionName.asInstanceOf[js.Any]).asInstanceOf[OESTextureHalfFloat | Null]
    
    /* standard dom */
    inline def getExtension_OEStexturehalffloatlinear(extensionName: OES_texture_half_float_linear): OESTextureHalfFloatLinear | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtension")(extensionName.asInstanceOf[js.Any]).asInstanceOf[OESTextureHalfFloatLinear | Null]
    
    /* standard dom */
    inline def getExtension_OESvertexarrayobject(extensionName: OES_vertex_array_object): OESVertexArrayObject | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtension")(extensionName.asInstanceOf[js.Any]).asInstanceOf[OESVertexArrayObject | Null]
    
    /* standard dom */
    inline def getExtension_OVRmultiview2(extensionName: OVR_multiview2): OVRMultiview2 | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtension")(extensionName.asInstanceOf[js.Any]).asInstanceOf[OVRMultiview2 | Null]
    
    inline def getExtension_STACKGLdestroycontext(extensionName: STACKGL_destroy_context): STACKGLDestroyContext | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtension")(extensionName.asInstanceOf[js.Any]).asInstanceOf[STACKGLDestroyContext | Null]
    
    inline def getExtension_STACKGLresizedrawingbuffer(extensionName: STACKGL_resize_drawingbuffer): STACKGLResizeDrawingbuffer | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtension")(extensionName.asInstanceOf[js.Any]).asInstanceOf[STACKGLResizeDrawingbuffer | Null]
    
    /* standard dom */
    inline def getExtension_WEBGLcolorbufferfloat(extensionName: WEBGL_color_buffer_float): WEBGLColorBufferFloat | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtension")(extensionName.asInstanceOf[js.Any]).asInstanceOf[WEBGLColorBufferFloat | Null]
    
    /* standard dom */
    inline def getExtension_WEBGLcompressedtextureastc(extensionName: WEBGL_compressed_texture_astc): WEBGLCompressedTextureAstc | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtension")(extensionName.asInstanceOf[js.Any]).asInstanceOf[WEBGLCompressedTextureAstc | Null]
    
    /* standard dom */
    inline def getExtension_WEBGLcompressedtextureetc(extensionName: WEBGL_compressed_texture_etc): WEBGLCompressedTextureEtc | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtension")(extensionName.asInstanceOf[js.Any]).asInstanceOf[WEBGLCompressedTextureEtc | Null]
    
    /* standard dom */
    inline def getExtension_WEBGLcompressedtextureetc1(extensionName: WEBGL_compressed_texture_etc1): WEBGLCompressedTextureEtc1 | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtension")(extensionName.asInstanceOf[js.Any]).asInstanceOf[WEBGLCompressedTextureEtc1 | Null]
    
    /* standard dom */
    inline def getExtension_WEBGLcompressedtextures3tc(extensionName: WEBGL_compressed_texture_s3tc): WEBGLCompressedTextureS3tc | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtension")(extensionName.asInstanceOf[js.Any]).asInstanceOf[WEBGLCompressedTextureS3tc | Null]
    
    /* standard dom */
    inline def getExtension_WEBGLcompressedtextures3tcsrgb(extensionName: WEBGL_compressed_texture_s3tc_srgb): WEBGLCompressedTextureS3tcSrgb | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtension")(extensionName.asInstanceOf[js.Any]).asInstanceOf[WEBGLCompressedTextureS3tcSrgb | Null]
    
    /* standard dom */
    inline def getExtension_WEBGLdebugrendererinfo(extensionName: WEBGL_debug_renderer_info): WEBGLDebugRendererInfo | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtension")(extensionName.asInstanceOf[js.Any]).asInstanceOf[WEBGLDebugRendererInfo | Null]
    
    /* standard dom */
    inline def getExtension_WEBGLdebugshaders(extensionName: WEBGL_debug_shaders): WEBGLDebugShaders | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtension")(extensionName.asInstanceOf[js.Any]).asInstanceOf[WEBGLDebugShaders | Null]
    
    /* standard dom */
    inline def getExtension_WEBGLdepthtexture(extensionName: WEBGL_depth_texture): WEBGLDepthTexture | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtension")(extensionName.asInstanceOf[js.Any]).asInstanceOf[WEBGLDepthTexture | Null]
    
    /* standard dom */
    inline def getExtension_WEBGLdrawbuffers(extensionName: WEBGL_draw_buffers): WEBGLDrawBuffers | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtension")(extensionName.asInstanceOf[js.Any]).asInstanceOf[WEBGLDrawBuffers | Null]
    
    /* standard dom */
    inline def getExtension_WEBGLlosecontext(extensionName: WEBGL_lose_context): WEBGLLoseContext | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtension")(extensionName.asInstanceOf[js.Any]).asInstanceOf[WEBGLLoseContext | Null]
    
    /* standard dom */
    inline def getExtension_WEBGLmultidraw(extensionName: WEBGL_multi_draw): WEBGLMultiDraw | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtension")(extensionName.asInstanceOf[js.Any]).asInstanceOf[WEBGLMultiDraw | Null]
    
    /* standard dom */
    inline def getFramebufferAttachmentParameter(target: GLenum, attachment: GLenum, pname: GLenum): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getFramebufferAttachmentParameter")(target.asInstanceOf[js.Any], attachment.asInstanceOf[js.Any], pname.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /* standard dom */
    inline def getParameter(pname: GLenum): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getParameter")(pname.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /* standard dom */
    inline def getProgramInfoLog(program: WebGLProgram): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getProgramInfoLog")(program.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    
    /* standard dom */
    inline def getProgramParameter(program: WebGLProgram, pname: GLenum): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getProgramParameter")(program.asInstanceOf[js.Any], pname.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /* standard dom */
    inline def getRenderbufferParameter(target: GLenum, pname: GLenum): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getRenderbufferParameter")(target.asInstanceOf[js.Any], pname.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /* standard dom */
    inline def getShaderInfoLog(shader: WebGLShader): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getShaderInfoLog")(shader.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    
    /* standard dom */
    inline def getShaderParameter(shader: WebGLShader, pname: GLenum): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getShaderParameter")(shader.asInstanceOf[js.Any], pname.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /* standard dom */
    inline def getShaderPrecisionFormat(shadertype: GLenum, precisiontype: GLenum): WebGLShaderPrecisionFormat | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getShaderPrecisionFormat")(shadertype.asInstanceOf[js.Any], precisiontype.asInstanceOf[js.Any])).asInstanceOf[WebGLShaderPrecisionFormat | Null]
    
    /* standard dom */
    inline def getShaderSource(shader: WebGLShader): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getShaderSource")(shader.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    
    /* standard dom */
    inline def getSupportedExtensions(): js.Array[String] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getSupportedExtensions")().asInstanceOf[js.Array[String] | Null]
    
    /* standard dom */
    inline def getTexParameter(target: GLenum, pname: GLenum): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getTexParameter")(target.asInstanceOf[js.Any], pname.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /* standard dom */
    inline def getUniform(program: WebGLProgram, location: WebGLUniformLocation): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getUniform")(program.asInstanceOf[js.Any], location.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /* standard dom */
    inline def getUniformLocation(program: WebGLProgram, name: String): WebGLUniformLocation | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getUniformLocation")(program.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[WebGLUniformLocation | Null]
    
    /* standard dom */
    inline def getVertexAttrib(index: GLuint, pname: GLenum): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getVertexAttrib")(index.asInstanceOf[js.Any], pname.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /* standard dom */
    inline def getVertexAttribOffset(index: GLuint, pname: GLenum): GLintptr = (^.asInstanceOf[js.Dynamic].applyDynamic("getVertexAttribOffset")(index.asInstanceOf[js.Any], pname.asInstanceOf[js.Any])).asInstanceOf[GLintptr]
    
    /* standard dom */
    inline def hint(target: GLenum, mode: GLenum): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hint")(target.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* standard dom */
    inline def isBuffer(): GLboolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBuffer")().asInstanceOf[GLboolean]
    inline def isBuffer(buffer: WebGLBuffer): GLboolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[GLboolean]
    
    /* standard dom */
    inline def isContextLost(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isContextLost")().asInstanceOf[Boolean]
    
    /* standard dom */
    inline def isEnabled(cap: GLenum): GLboolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnabled")(cap.asInstanceOf[js.Any]).asInstanceOf[GLboolean]
    
    /* standard dom */
    inline def isFramebuffer(): GLboolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFramebuffer")().asInstanceOf[GLboolean]
    inline def isFramebuffer(framebuffer: WebGLFramebuffer): GLboolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFramebuffer")(framebuffer.asInstanceOf[js.Any]).asInstanceOf[GLboolean]
    
    /* standard dom */
    inline def isProgram(): GLboolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isProgram")().asInstanceOf[GLboolean]
    inline def isProgram(program: WebGLProgram): GLboolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isProgram")(program.asInstanceOf[js.Any]).asInstanceOf[GLboolean]
    
    /* standard dom */
    inline def isRenderbuffer(): GLboolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRenderbuffer")().asInstanceOf[GLboolean]
    inline def isRenderbuffer(renderbuffer: WebGLRenderbuffer): GLboolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRenderbuffer")(renderbuffer.asInstanceOf[js.Any]).asInstanceOf[GLboolean]
    
    /* standard dom */
    inline def isShader(): GLboolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isShader")().asInstanceOf[GLboolean]
    inline def isShader(shader: WebGLShader): GLboolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isShader")(shader.asInstanceOf[js.Any]).asInstanceOf[GLboolean]
    
    /* standard dom */
    inline def isTexture(): GLboolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTexture")().asInstanceOf[GLboolean]
    inline def isTexture(texture: WebGLTexture): GLboolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTexture")(texture.asInstanceOf[js.Any]).asInstanceOf[GLboolean]
    
    /* standard dom */
    inline def lineWidth(width: GLfloat): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("lineWidth")(width.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* standard dom */
    inline def linkProgram(program: WebGLProgram): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("linkProgram")(program.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def pixelStorei(pname: GLenum, param: GLboolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pixelStorei")(pname.asInstanceOf[js.Any], param.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /* standard dom */
    inline def pixelStorei(pname: GLenum, param: GLint): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pixelStorei")(pname.asInstanceOf[js.Any], param.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* standard dom */
    inline def polygonOffset(factor: GLfloat, units: GLfloat): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("polygonOffset")(factor.asInstanceOf[js.Any], units.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* standard dom */
    inline def readPixels(x: GLint, y: GLint, width: GLsizei, height: GLsizei, format: GLenum, `type`: GLenum): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readPixels")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], format.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def readPixels(
      x: GLint,
      y: GLint,
      width: GLsizei,
      height: GLsizei,
      format: GLenum,
      `type`: GLenum,
      pixels: js.typedarray.ArrayBufferView
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readPixels")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], format.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], pixels.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* standard dom */
    inline def renderbufferStorage(target: GLenum, internalformat: GLenum, width: GLsizei, height: GLsizei): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderbufferStorage")(target.asInstanceOf[js.Any], internalformat.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* standard dom */
    inline def sampleCoverage(value: GLclampf, invert: GLboolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sampleCoverage")(value.asInstanceOf[js.Any], invert.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* standard dom */
    inline def scissor(x: GLint, y: GLint, width: GLsizei, height: GLsizei): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scissor")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* standard dom */
    inline def shaderSource(shader: WebGLShader, source: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("shaderSource")(shader.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* standard dom */
    inline def stencilFunc(func: GLenum, ref: GLint, mask: GLuint): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stencilFunc")(func.asInstanceOf[js.Any], ref.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* standard dom */
    inline def stencilFuncSeparate(face: GLenum, func: GLenum, ref: GLint, mask: GLuint): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stencilFuncSeparate")(face.asInstanceOf[js.Any], func.asInstanceOf[js.Any], ref.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* standard dom */
    inline def stencilMask(mask: GLuint): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stencilMask")(mask.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* standard dom */
    inline def stencilMaskSeparate(face: GLenum, mask: GLuint): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stencilMaskSeparate")(face.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* standard dom */
    inline def stencilOp(fail: GLenum, zfail: GLenum, zpass: GLenum): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stencilOp")(fail.asInstanceOf[js.Any], zfail.asInstanceOf[js.Any], zpass.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* standard dom */
    inline def stencilOpSeparate(face: GLenum, fail: GLenum, zfail: GLenum, zpass: GLenum): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stencilOpSeparate")(face.asInstanceOf[js.Any], fail.asInstanceOf[js.Any], zfail.asInstanceOf[js.Any], zpass.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* standard dom */
    inline def texImage2D(
      target: GLenum,
      level: GLint,
      internalformat: GLint,
      format: GLenum,
      `type`: GLenum,
      source: TexImageSource
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("texImage2D")(target.asInstanceOf[js.Any], level.asInstanceOf[js.Any], internalformat.asInstanceOf[js.Any], format.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /* standard dom */
    inline def texImage2D(
      target: GLenum,
      level: GLint,
      internalformat: GLint,
      width: GLsizei,
      height: GLsizei,
      border: GLint,
      format: GLenum,
      `type`: GLenum
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("texImage2D")(target.asInstanceOf[js.Any], level.asInstanceOf[js.Any], internalformat.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], border.asInstanceOf[js.Any], format.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def texImage2D(
      target: GLenum,
      level: GLint,
      internalformat: GLint,
      width: GLsizei,
      height: GLsizei,
      border: GLint,
      format: GLenum,
      `type`: GLenum,
      pixels: js.typedarray.ArrayBufferView
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("texImage2D")(target.asInstanceOf[js.Any], level.asInstanceOf[js.Any], internalformat.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], border.asInstanceOf[js.Any], format.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], pixels.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* standard dom */
    inline def texParameterf(target: GLenum, pname: GLenum, param: GLfloat): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("texParameterf")(target.asInstanceOf[js.Any], pname.asInstanceOf[js.Any], param.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* standard dom */
    inline def texParameteri(target: GLenum, pname: GLenum, param: GLint): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("texParameteri")(target.asInstanceOf[js.Any], pname.asInstanceOf[js.Any], param.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* standard dom */
    inline def texSubImage2D(
      target: GLenum,
      level: GLint,
      xoffset: GLint,
      yoffset: GLint,
      format: GLenum,
      `type`: GLenum,
      source: TexImageSource
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("texSubImage2D")(target.asInstanceOf[js.Any], level.asInstanceOf[js.Any], xoffset.asInstanceOf[js.Any], yoffset.asInstanceOf[js.Any], format.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /* standard dom */
    inline def texSubImage2D(
      target: GLenum,
      level: GLint,
      xoffset: GLint,
      yoffset: GLint,
      width: GLsizei,
      height: GLsizei,
      format: GLenum,
      `type`: GLenum
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("texSubImage2D")(target.asInstanceOf[js.Any], level.asInstanceOf[js.Any], xoffset.asInstanceOf[js.Any], yoffset.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], format.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def texSubImage2D(
      target: GLenum,
      level: GLint,
      xoffset: GLint,
      yoffset: GLint,
      width: GLsizei,
      height: GLsizei,
      format: GLenum,
      `type`: GLenum,
      pixels: js.typedarray.ArrayBufferView
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("texSubImage2D")(target.asInstanceOf[js.Any], level.asInstanceOf[js.Any], xoffset.asInstanceOf[js.Any], yoffset.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], format.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], pixels.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def uniform1f(location: Null, x: GLfloat): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uniform1f")(location.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /* standard dom */
    inline def uniform1f(location: WebGLUniformLocation, x: GLfloat): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uniform1f")(location.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def uniform1fv(location: Null, v: Float32List | js.Iterable[GLfloat]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uniform1fv")(location.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /* standard dom */
    /* standard dom.iterable */
    inline def uniform1fv(location: WebGLUniformLocation, v: Float32List | js.Iterable[GLfloat]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uniform1fv")(location.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def uniform1i(location: Null, x: GLint): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uniform1i")(location.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /* standard dom */
    inline def uniform1i(location: WebGLUniformLocation, x: GLint): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uniform1i")(location.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def uniform1iv(location: Null, v: Int32List | js.Iterable[GLint]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uniform1iv")(location.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /* standard dom */
    /* standard dom.iterable */
    inline def uniform1iv(location: WebGLUniformLocation, v: Int32List | js.Iterable[GLint]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uniform1iv")(location.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def uniform2f(location: Null, x: GLfloat, y: GLfloat): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uniform2f")(location.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /* standard dom */
    inline def uniform2f(location: WebGLUniformLocation, x: GLfloat, y: GLfloat): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uniform2f")(location.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def uniform2fv(location: Null, v: Float32List | js.Iterable[GLfloat]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uniform2fv")(location.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /* standard dom */
    /* standard dom.iterable */
    inline def uniform2fv(location: WebGLUniformLocation, v: Float32List | js.Iterable[GLfloat]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uniform2fv")(location.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def uniform2i(location: Null, x: GLint, y: GLint): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uniform2i")(location.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /* standard dom */
    inline def uniform2i(location: WebGLUniformLocation, x: GLint, y: GLint): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uniform2i")(location.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def uniform2iv(location: Null, v: Int32List | js.Iterable[GLint]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uniform2iv")(location.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /* standard dom */
    /* standard dom.iterable */
    inline def uniform2iv(location: WebGLUniformLocation, v: Int32List | js.Iterable[GLint]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uniform2iv")(location.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def uniform3f(location: Null, x: GLfloat, y: GLfloat, z: GLfloat): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uniform3f")(location.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /* standard dom */
    inline def uniform3f(location: WebGLUniformLocation, x: GLfloat, y: GLfloat, z: GLfloat): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uniform3f")(location.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def uniform3fv(location: Null, v: Float32List | js.Iterable[GLfloat]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uniform3fv")(location.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /* standard dom */
    /* standard dom.iterable */
    inline def uniform3fv(location: WebGLUniformLocation, v: Float32List | js.Iterable[GLfloat]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uniform3fv")(location.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def uniform3i(location: Null, x: GLint, y: GLint, z: GLint): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uniform3i")(location.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /* standard dom */
    inline def uniform3i(location: WebGLUniformLocation, x: GLint, y: GLint, z: GLint): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uniform3i")(location.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def uniform3iv(location: Null, v: Int32List | js.Iterable[GLint]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uniform3iv")(location.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /* standard dom */
    /* standard dom.iterable */
    inline def uniform3iv(location: WebGLUniformLocation, v: Int32List | js.Iterable[GLint]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uniform3iv")(location.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def uniform4f(location: Null, x: GLfloat, y: GLfloat, z: GLfloat, w: GLfloat): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uniform4f")(location.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /* standard dom */
    inline def uniform4f(location: WebGLUniformLocation, x: GLfloat, y: GLfloat, z: GLfloat, w: GLfloat): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uniform4f")(location.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def uniform4fv(location: Null, v: Float32List | js.Iterable[GLfloat]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uniform4fv")(location.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /* standard dom */
    /* standard dom.iterable */
    inline def uniform4fv(location: WebGLUniformLocation, v: Float32List | js.Iterable[GLfloat]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uniform4fv")(location.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def uniform4i(location: Null, x: GLint, y: GLint, z: GLint, w: GLint): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uniform4i")(location.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /* standard dom */
    inline def uniform4i(location: WebGLUniformLocation, x: GLint, y: GLint, z: GLint, w: GLint): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uniform4i")(location.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def uniform4iv(location: Null, v: Int32List | js.Iterable[GLint]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uniform4iv")(location.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /* standard dom */
    /* standard dom.iterable */
    inline def uniform4iv(location: WebGLUniformLocation, v: Int32List | js.Iterable[GLint]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uniform4iv")(location.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def uniformMatrix2fv(location: Null, transpose: GLboolean, value: Float32List | js.Iterable[GLfloat]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uniformMatrix2fv")(location.asInstanceOf[js.Any], transpose.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /* standard dom */
    /* standard dom.iterable */
    inline def uniformMatrix2fv(location: WebGLUniformLocation, transpose: GLboolean, value: Float32List | js.Iterable[GLfloat]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uniformMatrix2fv")(location.asInstanceOf[js.Any], transpose.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def uniformMatrix3fv(location: Null, transpose: GLboolean, value: Float32List | js.Iterable[GLfloat]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uniformMatrix3fv")(location.asInstanceOf[js.Any], transpose.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /* standard dom */
    /* standard dom.iterable */
    inline def uniformMatrix3fv(location: WebGLUniformLocation, transpose: GLboolean, value: Float32List | js.Iterable[GLfloat]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uniformMatrix3fv")(location.asInstanceOf[js.Any], transpose.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def uniformMatrix4fv(location: Null, transpose: GLboolean, value: Float32List | js.Iterable[GLfloat]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uniformMatrix4fv")(location.asInstanceOf[js.Any], transpose.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /* standard dom */
    /* standard dom.iterable */
    inline def uniformMatrix4fv(location: WebGLUniformLocation, transpose: GLboolean, value: Float32List | js.Iterable[GLfloat]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uniformMatrix4fv")(location.asInstanceOf[js.Any], transpose.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* standard dom */
    inline def useProgram(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useProgram")().asInstanceOf[Unit]
    inline def useProgram(program: WebGLProgram): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useProgram")(program.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* standard dom */
    inline def validateProgram(program: WebGLProgram): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateProgram")(program.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* standard dom */
    inline def vertexAttrib1f(index: GLuint, x: GLfloat): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("vertexAttrib1f")(index.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* standard dom */
    /* standard dom.iterable */
    inline def vertexAttrib1fv(index: GLuint, values: Float32List | js.Iterable[GLfloat]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("vertexAttrib1fv")(index.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* standard dom */
    inline def vertexAttrib2f(index: GLuint, x: GLfloat, y: GLfloat): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("vertexAttrib2f")(index.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* standard dom */
    /* standard dom.iterable */
    inline def vertexAttrib2fv(index: GLuint, values: Float32List | js.Iterable[GLfloat]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("vertexAttrib2fv")(index.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* standard dom */
    inline def vertexAttrib3f(index: GLuint, x: GLfloat, y: GLfloat, z: GLfloat): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("vertexAttrib3f")(index.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* standard dom */
    /* standard dom.iterable */
    inline def vertexAttrib3fv(index: GLuint, values: Float32List | js.Iterable[GLfloat]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("vertexAttrib3fv")(index.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* standard dom */
    inline def vertexAttrib4f(index: GLuint, x: GLfloat, y: GLfloat, z: GLfloat, w: GLfloat): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("vertexAttrib4f")(index.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* standard dom */
    /* standard dom.iterable */
    inline def vertexAttrib4fv(index: GLuint, values: Float32List | js.Iterable[GLfloat]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("vertexAttrib4fv")(index.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* standard dom */
    inline def vertexAttribPointer(
      index: GLuint,
      size: GLint,
      `type`: GLenum,
      normalized: GLboolean,
      stride: GLsizei,
      offset: GLintptr
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("vertexAttribPointer")(index.asInstanceOf[js.Any], size.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], normalized.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* standard dom */
    inline def viewport(x: GLint, y: GLint, width: GLsizei, height: GLsizei): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("viewport")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  trait STACKGLDestroyContext extends StObject {
    
    def destroy(): Unit
  }
  object STACKGLDestroyContext {
    
    inline def apply(destroy: () => Unit): STACKGLDestroyContext = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
      __obj.asInstanceOf[STACKGLDestroyContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: STACKGLDestroyContext] (val x: Self) extends AnyVal {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    }
  }
  
  trait STACKGLResizeDrawingbuffer extends StObject {
    
    def resize(width: GLint, height: GLint): Unit
  }
  object STACKGLResizeDrawingbuffer {
    
    inline def apply(resize: (GLint, GLint) => Unit): STACKGLResizeDrawingbuffer = {
      val __obj = js.Dynamic.literal(resize = js.Any.fromFunction2(resize))
      __obj.asInstanceOf[STACKGLResizeDrawingbuffer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: STACKGLResizeDrawingbuffer] (val x: Self) extends AnyVal {
      
      inline def setResize(value: (GLint, GLint) => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait StackGLExtension extends StObject {
    
    @JSName("getExtension")
    def getExtension_STACKGLdestroycontext(extensionName: STACKGL_destroy_context): STACKGLDestroyContext | Null = js.native
    @JSName("getExtension")
    def getExtension_STACKGLresizedrawingbuffer(extensionName: STACKGL_resize_drawingbuffer): STACKGLResizeDrawingbuffer | Null = js.native
  }
}
