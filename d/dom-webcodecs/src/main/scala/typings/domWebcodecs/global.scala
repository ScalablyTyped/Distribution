package typings.domWebcodecs

import typings.std.CanvasImageSource
import typings.std.CodecState
import typings.std.EncodedVideoChunkType
import typings.std.ImageBitmap
import typings.std.ImageBitmapOptions
import typings.std.VideoColorPrimaries
import typings.std.VideoMatrixCoefficients
import typings.std.VideoTransferCharacteristics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("AudioData")
  @js.native
  open class AudioData protected ()
    extends StObject
       with typings.domWebcodecs.AudioData {
    def this(init: AudioDataInit) = this()
    
    /* CompleteClass */
    override def allocationSize(options: AudioDataCopyToOptions): Double = js.native
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    override def copyTo(
      destination: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AllowSharedBufferSource */ Any,
      options: AudioDataCopyToOptions
    ): Unit = js.native
    
    /* CompleteClass */
    override val duration: Double = js.native
    
    /* CompleteClass */
    override val format: AudioSampleFormat = js.native
    
    /* CompleteClass */
    override val numberOfChannels: Double = js.native
    
    /* CompleteClass */
    override val numberOfFrames: Double = js.native
    
    /* CompleteClass */
    override val sampleRate: Double = js.native
    
    /* CompleteClass */
    override val timestamp: Double = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("AudioDecoder")
  @js.native
  open class AudioDecoder protected ()
    extends StObject
       with typings.domWebcodecs.AudioDecoder {
    def this(init: AudioDecoderInit) = this()
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    override def configure(config: AudioDecoderConfig): Unit = js.native
    
    /* CompleteClass */
    override def decode(chunk: typings.domWebcodecs.EncodedAudioChunk): Unit = js.native
    
    /* CompleteClass */
    override val decodeQueueSize: Double = js.native
    
    /* CompleteClass */
    override def flush(): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    /* CompleteClass */
    override val state: CodecState = js.native
  }
  object AudioDecoder {
    
    @JSGlobal("AudioDecoder")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isConfigSupported(config: AudioDecoderConfig): js.Promise[AudioDecoderSupport] = ^.asInstanceOf[js.Dynamic].applyDynamic("isConfigSupported")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AudioDecoderSupport]]
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("AudioEncoder")
  @js.native
  open class AudioEncoder protected ()
    extends StObject
       with typings.domWebcodecs.AudioEncoder {
    def this(init: AudioEncoderInit) = this()
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    override def configure(config: AudioEncoderConfig): Unit = js.native
    
    /* CompleteClass */
    override def encode(data: typings.domWebcodecs.AudioData): Unit = js.native
    
    /* CompleteClass */
    override val encodeQueueSize: Double = js.native
    
    /* CompleteClass */
    override def flush(): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    /* CompleteClass */
    override val state: CodecState = js.native
  }
  object AudioEncoder {
    
    @JSGlobal("AudioEncoder")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isConfigSupported(config: AudioEncoderConfig): js.Promise[AudioEncoderSupport] = ^.asInstanceOf[js.Dynamic].applyDynamic("isConfigSupported")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AudioEncoderSupport]]
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("EncodedAudioChunk")
  @js.native
  open class EncodedAudioChunk protected ()
    extends StObject
       with typings.domWebcodecs.EncodedAudioChunk {
    def this(init: EncodedAudioChunkInit) = this()
    
    /* CompleteClass */
    override val byteLength: Double = js.native
    
    /* CompleteClass */
    override def copyTo(
      destination: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AllowSharedBufferSource */ Any
    ): Unit = js.native
    
    /* CompleteClass */
    override val duration: Double | Null = js.native
    
    /* CompleteClass */
    override val timestamp: Double = js.native
    
    /* CompleteClass */
    override val `type`: EncodedAudioChunkType = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("EncodedVideoChunk")
  @js.native
  open class EncodedVideoChunk protected ()
    extends StObject
       with typings.domWebcodecs.EncodedVideoChunk {
    def this(init: EncodedVideoChunkInit) = this()
    
    /* CompleteClass */
    override val byteLength: Double = js.native
    
    /* CompleteClass */
    override def copyTo(
      destination: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AllowSharedBufferSource */ Any
    ): Unit = js.native
    
    /* CompleteClass */
    override val duration: Double | Null = js.native
    
    /* CompleteClass */
    override val timestamp: Double = js.native
    
    /* CompleteClass */
    override val `type`: EncodedVideoChunkType = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ImageDecoder")
  @js.native
  open class ImageDecoder protected ()
    extends StObject
       with typings.domWebcodecs.ImageDecoder {
    def this(init: ImageDecoderInit) = this()
  }
  object ImageDecoder {
    
    @JSGlobal("ImageDecoder")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isTypeSupported(`type`: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeSupported")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ImageTrack")
  @js.native
  open class ImageTrack ()
    extends StObject
       with typings.domWebcodecs.ImageTrack {
    
    /* CompleteClass */
    override val animated: Boolean = js.native
    
    /* CompleteClass */
    override val frameCount: Double = js.native
    
    /* CompleteClass */
    override val repetitionCount: Double = js.native
    
    /* CompleteClass */
    var selected: Boolean = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ImageTrackList")
  @js.native
  open class ImageTrackList ()
    extends StObject
       with typings.domWebcodecs.ImageTrackList {
    
    /* CompleteClass */
    override val length: Double = js.native
    
    /* CompleteClass */
    override val ready: js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override val selectedIndex: Double = js.native
    
    /* CompleteClass */
    override val selectedTrack: typings.domWebcodecs.ImageTrack | Null = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("VideoColorSpace")
  @js.native
  open class VideoColorSpace ()
    extends StObject
       with typings.domWebcodecs.VideoColorSpace {
    def this(init: VideoColorSpaceInit) = this()
    
    /* CompleteClass */
    override val fullRange: Boolean | Null = js.native
    
    /* CompleteClass */
    override val matrix: VideoMatrixCoefficients | Null = js.native
    
    /* CompleteClass */
    override val primaries: VideoColorPrimaries | Null = js.native
    
    /* CompleteClass */
    override def toJSON(): VideoColorSpaceInit = js.native
    
    /* CompleteClass */
    override val transfer: VideoTransferCharacteristics | Null = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("VideoDecoder")
  @js.native
  open class VideoDecoder protected ()
    extends StObject
       with typings.domWebcodecs.VideoDecoder {
    def this(init: VideoDecoderInit) = this()
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    override def configure(config: VideoDecoderConfig): Unit = js.native
    
    /* CompleteClass */
    override def decode(chunk: typings.domWebcodecs.EncodedVideoChunk): Unit = js.native
    
    /* CompleteClass */
    override val decodeQueueSize: Double = js.native
    
    /* CompleteClass */
    override def flush(): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    /* CompleteClass */
    override val state: CodecState = js.native
  }
  object VideoDecoder {
    
    @JSGlobal("VideoDecoder")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isConfigSupported(config: VideoDecoderConfig): js.Promise[VideoDecoderSupport] = ^.asInstanceOf[js.Dynamic].applyDynamic("isConfigSupported")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[VideoDecoderSupport]]
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("VideoEncoder")
  @js.native
  open class VideoEncoder protected ()
    extends StObject
       with typings.domWebcodecs.VideoEncoder {
    def this(init: VideoEncoderInit) = this()
  }
  object VideoEncoder {
    
    @JSGlobal("VideoEncoder")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isConfigSupported(config: VideoEncoderConfig): js.Promise[VideoEncoderSupport] = ^.asInstanceOf[js.Dynamic].applyDynamic("isConfigSupported")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[VideoEncoderSupport]]
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("VideoFrame")
  @js.native
  open class VideoFrame protected ()
    extends StObject
       with typings.domWebcodecs.VideoFrame {
    def this(source: CanvasImageSource) = this()
    def this(
      data: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AllowSharedBufferSource */ Any,
      init: VideoFrameBufferInit
    ) = this()
    def this(source: CanvasImageSource, init: VideoFrameInit) = this()
  }
  
  inline def createImageBitmap(image: ImageBitmapSourceWebCodecs): js.Promise[ImageBitmap] = js.Dynamic.global.applyDynamic("createImageBitmap")(image.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ImageBitmap]]
  inline def createImageBitmap(image: ImageBitmapSourceWebCodecs, options: ImageBitmapOptions): js.Promise[ImageBitmap] = (js.Dynamic.global.applyDynamic("createImageBitmap")(image.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageBitmap]]
  inline def createImageBitmap(image: ImageBitmapSourceWebCodecs, sx: Double, sy: Double, sw: Double, sh: Double): js.Promise[ImageBitmap] = (js.Dynamic.global.applyDynamic("createImageBitmap")(image.asInstanceOf[js.Any], sx.asInstanceOf[js.Any], sy.asInstanceOf[js.Any], sw.asInstanceOf[js.Any], sh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageBitmap]]
  inline def createImageBitmap(
    image: ImageBitmapSourceWebCodecs,
    sx: Double,
    sy: Double,
    sw: Double,
    sh: Double,
    options: ImageBitmapOptions
  ): js.Promise[ImageBitmap] = (js.Dynamic.global.applyDynamic("createImageBitmap")(image.asInstanceOf[js.Any], sx.asInstanceOf[js.Any], sy.asInstanceOf[js.Any], sw.asInstanceOf[js.Any], sh.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageBitmap]]
}
