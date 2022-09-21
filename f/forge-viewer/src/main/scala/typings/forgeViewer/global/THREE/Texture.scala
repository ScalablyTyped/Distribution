package typings.forgeViewer.global.THREE

import typings.forgeViewer.anon.Target
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.Texture")
@js.native
open class Texture protected ()
  extends StObject
     with typings.forgeViewer.THREE.Texture {
  def this(
    image: HTMLImageElement | HTMLCanvasElement | HTMLVideoElement,
    mapping: js.UndefOr[typings.forgeViewer.THREE.Mapping],
    wrapS: js.UndefOr[typings.forgeViewer.THREE.Wrapping],
    wrapT: js.UndefOr[typings.forgeViewer.THREE.Wrapping],
    magFilter: js.UndefOr[typings.forgeViewer.THREE.TextureFilter],
    minFilter: js.UndefOr[typings.forgeViewer.THREE.TextureFilter],
    format: js.UndefOr[typings.forgeViewer.THREE.PixelFormat],
    `type`: js.UndefOr[typings.forgeViewer.THREE.TextureDataType],
    anisotropy: js.UndefOr[Double]
  ) = this()
  
  // EventDispatcher mixins
  /* CompleteClass */
  override def addEventListener(`type`: String, listener: js.Function1[/* event */ Any, Unit]): Unit = js.native
  
  /* CompleteClass */
  var anisotropy: Double = js.native
  
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
object Texture {
  
  @JSGlobal("THREE.Texture")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("THREE.Texture.DEFAULT_IMAGE")
  @js.native
  def DEFAULT_IMAGE: Any = js.native
  inline def DEFAULT_IMAGE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_IMAGE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("THREE.Texture.DEFAULT_MAPPING")
  @js.native
  def DEFAULT_MAPPING: Any = js.native
  inline def DEFAULT_MAPPING_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_MAPPING")(x.asInstanceOf[js.Any])
}
