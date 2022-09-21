package typings.forgeViewer.THREE

import typings.forgeViewer.anon.Target
import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Texture extends StObject {
  
  // EventDispatcher mixins
  def addEventListener(`type`: String, listener: js.Function1[/* event */ Any, Unit]): Unit
  
  var anisotropy: Double
  
  def copy(source: Texture): Texture
  
  def dispatchEvent(event: Target): Unit
  
  def dispose(): Unit
  
  var flipY: Boolean
  
  var format: PixelFormat
  
  var generateMipmaps: Boolean
  
  def hasEventListener(`type`: String, listener: js.Function1[/* event */ Any, Unit]): Unit
  
  var id: Double
  
  var image: Any
  
  var magFilter: TextureFilter
  
  var mapping: Mapping
  
  var minFilter: TextureFilter
  
  // HTMLImageElement or ImageData ;
  var mipmaps: js.Array[ImageData]
  
  var name: String
  
  var needsUpdate: Boolean
  
  var offset: Vector2
  
  def onUpdate(): Unit
  
  var premultiplyAlpha: Boolean
  
  def removeEventListener(`type`: String, listener: js.Function1[/* event */ Any, Unit]): Unit
  
  var repeat: Vector2
  
  var sourceFile: String
  
  var `type`: TextureDataType
  
  var unpackAlignment: Double
  
  def update(): Unit
  
  var uuid: String
  
  var wrapS: Wrapping
  
  var wrapT: Wrapping
}
object Texture {
  
  inline def apply(
    addEventListener: (String, js.Function1[/* event */ Any, Unit]) => Unit,
    anisotropy: Double,
    copy: Texture => Texture,
    dispatchEvent: Target => Unit,
    dispose: () => Unit,
    flipY: Boolean,
    format: PixelFormat,
    generateMipmaps: Boolean,
    hasEventListener: (String, js.Function1[/* event */ Any, Unit]) => Unit,
    id: Double,
    image: Any,
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
  ): Texture = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), anisotropy = anisotropy.asInstanceOf[js.Any], copy = js.Any.fromFunction1(copy), dispatchEvent = js.Any.fromFunction1(dispatchEvent), dispose = js.Any.fromFunction0(dispose), flipY = flipY.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], generateMipmaps = generateMipmaps.asInstanceOf[js.Any], hasEventListener = js.Any.fromFunction2(hasEventListener), id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], magFilter = magFilter.asInstanceOf[js.Any], mapping = mapping.asInstanceOf[js.Any], minFilter = minFilter.asInstanceOf[js.Any], mipmaps = mipmaps.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], needsUpdate = needsUpdate.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], onUpdate = js.Any.fromFunction0(onUpdate), premultiplyAlpha = premultiplyAlpha.asInstanceOf[js.Any], removeEventListener = js.Any.fromFunction2(removeEventListener), repeat = repeat.asInstanceOf[js.Any], sourceFile = sourceFile.asInstanceOf[js.Any], unpackAlignment = unpackAlignment.asInstanceOf[js.Any], update = js.Any.fromFunction0(update), uuid = uuid.asInstanceOf[js.Any], wrapS = wrapS.asInstanceOf[js.Any], wrapT = wrapT.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Texture]
  }
  
  extension [Self <: Texture](x: Self) {
    
    inline def setAddEventListener(value: (String, js.Function1[/* event */ Any, Unit]) => Unit): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
    
    inline def setAnisotropy(value: Double): Self = StObject.set(x, "anisotropy", value.asInstanceOf[js.Any])
    
    inline def setCopy(value: Texture => Texture): Self = StObject.set(x, "copy", js.Any.fromFunction1(value))
    
    inline def setDispatchEvent(value: Target => Unit): Self = StObject.set(x, "dispatchEvent", js.Any.fromFunction1(value))
    
    inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    inline def setFlipY(value: Boolean): Self = StObject.set(x, "flipY", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: PixelFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setGenerateMipmaps(value: Boolean): Self = StObject.set(x, "generateMipmaps", value.asInstanceOf[js.Any])
    
    inline def setHasEventListener(value: (String, js.Function1[/* event */ Any, Unit]) => Unit): Self = StObject.set(x, "hasEventListener", js.Any.fromFunction2(value))
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImage(value: Any): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setMagFilter(value: TextureFilter): Self = StObject.set(x, "magFilter", value.asInstanceOf[js.Any])
    
    inline def setMapping(value: Mapping): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
    
    inline def setMinFilter(value: TextureFilter): Self = StObject.set(x, "minFilter", value.asInstanceOf[js.Any])
    
    inline def setMipmaps(value: js.Array[ImageData]): Self = StObject.set(x, "mipmaps", value.asInstanceOf[js.Any])
    
    inline def setMipmapsVarargs(value: ImageData*): Self = StObject.set(x, "mipmaps", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNeedsUpdate(value: Boolean): Self = StObject.set(x, "needsUpdate", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Vector2): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOnUpdate(value: () => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction0(value))
    
    inline def setPremultiplyAlpha(value: Boolean): Self = StObject.set(x, "premultiplyAlpha", value.asInstanceOf[js.Any])
    
    inline def setRemoveEventListener(value: (String, js.Function1[/* event */ Any, Unit]) => Unit): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2(value))
    
    inline def setRepeat(value: Vector2): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setSourceFile(value: String): Self = StObject.set(x, "sourceFile", value.asInstanceOf[js.Any])
    
    inline def setType(value: TextureDataType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUnpackAlignment(value: Double): Self = StObject.set(x, "unpackAlignment", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    inline def setWrapS(value: Wrapping): Self = StObject.set(x, "wrapS", value.asInstanceOf[js.Any])
    
    inline def setWrapT(value: Wrapping): Self = StObject.set(x, "wrapT", value.asInstanceOf[js.Any])
  }
}
