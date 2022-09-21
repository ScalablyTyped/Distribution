package typings.forgeViewer.global.THREE

import typings.forgeViewer.anon.Data
import typings.forgeViewer.anon.Target
import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.DataTexture")
@js.native
open class DataTexture protected ()
  extends StObject
     with typings.forgeViewer.THREE.DataTexture {
  def this(
    data: js.typedarray.ArrayBuffer | js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Float32Array | js.typedarray.Float64Array,
    width: Double,
    height: Double,
    format: typings.forgeViewer.THREE.PixelFormat,
    `type`: js.UndefOr[typings.forgeViewer.THREE.TextureDataType],
    mapping: js.UndefOr[typings.forgeViewer.THREE.Mapping],
    wrapS: js.UndefOr[typings.forgeViewer.THREE.Wrapping],
    wrapT: js.UndefOr[typings.forgeViewer.THREE.Wrapping],
    magFilter: js.UndefOr[typings.forgeViewer.THREE.TextureFilter],
    minFilter: js.UndefOr[typings.forgeViewer.THREE.TextureFilter],
    anisotropy: js.UndefOr[Double],
    encoding: js.UndefOr[typings.forgeViewer.THREE.TextureEncoding]
  ) = this()
  
  // EventDispatcher mixins
  /* CompleteClass */
  override def addEventListener(`type`: String, listener: js.Function1[/* event */ Any, Unit]): Unit = js.native
  
  /* CompleteClass */
  var anisotropy: Double = js.native
  
  /* CompleteClass */
  override def copy(source: typings.forgeViewer.THREE.DataTexture): typings.forgeViewer.THREE.DataTexture = js.native
  /* CompleteClass */
  override def copy(source: typings.forgeViewer.THREE.Texture): typings.forgeViewer.THREE.Texture = js.native
  
  /* CompleteClass */
  override def dispatchEvent(event: Target): Unit = js.native
  
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /* CompleteClass */
  var flipY: Boolean = js.native
  
  /* CompleteClass */
  var format: typings.forgeViewer.THREE.PixelFormat = js.native
  
  /* CompleteClass */
  var generateMipmaps: Boolean = js.native
  
  /* CompleteClass */
  override def hasEventListener(`type`: String, listener: js.Function1[/* event */ Any, Unit]): Unit = js.native
  
  /* CompleteClass */
  var id: Double = js.native
  
  /* CompleteClass */
  var image: Any = js.native
  /* CompleteClass */
  @JSName("image")
  var image_DataTexture: Data = js.native
  
  /* CompleteClass */
  var magFilter: typings.forgeViewer.THREE.TextureFilter = js.native
  
  /* CompleteClass */
  var mapping: typings.forgeViewer.THREE.Mapping = js.native
  
  /* CompleteClass */
  var minFilter: typings.forgeViewer.THREE.TextureFilter = js.native
  
  // HTMLImageElement or ImageData ;
  /* CompleteClass */
  var mipmaps: js.Array[ImageData] = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /* CompleteClass */
  var needsUpdate: Boolean = js.native
  
  /* CompleteClass */
  var offset: typings.forgeViewer.THREE.Vector2 = js.native
  
  /* CompleteClass */
  override def onUpdate(): Unit = js.native
  
  /* CompleteClass */
  var premultiplyAlpha: Boolean = js.native
  
  /* CompleteClass */
  override def removeEventListener(`type`: String, listener: js.Function1[/* event */ Any, Unit]): Unit = js.native
  
  /* CompleteClass */
  var repeat: typings.forgeViewer.THREE.Vector2 = js.native
  
  /* CompleteClass */
  var sourceFile: String = js.native
  
  /* CompleteClass */
  var `type`: typings.forgeViewer.THREE.TextureDataType = js.native
  
  /* CompleteClass */
  var unpackAlignment: Double = js.native
  
  /* CompleteClass */
  override def update(): Unit = js.native
  
  /* CompleteClass */
  var uuid: String = js.native
  
  /* CompleteClass */
  var wrapS: typings.forgeViewer.THREE.Wrapping = js.native
  
  /* CompleteClass */
  var wrapT: typings.forgeViewer.THREE.Wrapping = js.native
}
