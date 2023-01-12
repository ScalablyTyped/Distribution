package typings.forgeViewer.THREE

import typings.forgeViewer.anon.Data
import typings.forgeViewer.anon.Target
import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTexture
  extends StObject
     with Texture {
  
  def copy(source: DataTexture): DataTexture
  
  @JSName("image")
  var image_DataTexture: Data
}
object DataTexture {
  
  inline def apply(
    addEventListener: (String, js.Function1[/* event */ Any, Unit]) => Unit,
    anisotropy: Double,
    copy: DataTexture => DataTexture,
    dispatchEvent: Target => Unit,
    dispose: () => Unit,
    flipY: Boolean,
    format: PixelFormat,
    generateMipmaps: Boolean,
    hasEventListener: (String, js.Function1[/* event */ Any, Unit]) => Unit,
    id: Double,
    image: Data,
    magFilter: TextureFilter,
    mapping: Mapping,
    minFilter: TextureFilter,
    mipmaps: js.Array[ImageData],
    name: String,
    needsUpdate: Boolean,
    offset: Vector2,
    onUpdate: () => Unit,
    premultiplyAlpha: Boolean,
    removeEventListener: (String, js.Function1[/* event */ Any, Unit]) => Unit,
    repeat: Vector2,
    sourceFile: String,
    `type`: TextureDataType,
    unpackAlignment: Double,
    update: () => Unit,
    uuid: String,
    wrapS: Wrapping,
    wrapT: Wrapping
  ): DataTexture = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), anisotropy = anisotropy.asInstanceOf[js.Any], copy = js.Any.fromFunction1(copy), dispatchEvent = js.Any.fromFunction1(dispatchEvent), dispose = js.Any.fromFunction0(dispose), flipY = flipY.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], generateMipmaps = generateMipmaps.asInstanceOf[js.Any], hasEventListener = js.Any.fromFunction2(hasEventListener), id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], magFilter = magFilter.asInstanceOf[js.Any], mapping = mapping.asInstanceOf[js.Any], minFilter = minFilter.asInstanceOf[js.Any], mipmaps = mipmaps.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], needsUpdate = needsUpdate.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], onUpdate = js.Any.fromFunction0(onUpdate), premultiplyAlpha = premultiplyAlpha.asInstanceOf[js.Any], removeEventListener = js.Any.fromFunction2(removeEventListener), repeat = repeat.asInstanceOf[js.Any], sourceFile = sourceFile.asInstanceOf[js.Any], unpackAlignment = unpackAlignment.asInstanceOf[js.Any], update = js.Any.fromFunction0(update), uuid = uuid.asInstanceOf[js.Any], wrapS = wrapS.asInstanceOf[js.Any], wrapT = wrapT.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTexture]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTexture] (val x: Self) extends AnyVal {
    
    inline def setCopy(value: DataTexture => DataTexture): Self = StObject.set(x, "copy", js.Any.fromFunction1(value))
    
    inline def setImage(value: Data): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
  }
}
