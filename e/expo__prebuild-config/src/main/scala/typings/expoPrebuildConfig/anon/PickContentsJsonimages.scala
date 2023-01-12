package typings.expoPrebuildConfig.anon

import typings.expoPrebuildConfig.buildPluginsIconsAssetContentsMod.ContentsJsonImage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@expo/prebuild-config.@expo/prebuild-config/build/plugins/icons/AssetContents.ContentsJson, 'images'> */
trait PickContentsJsonimages extends StObject {
  
  var images: js.Array[ContentsJsonImage]
}
object PickContentsJsonimages {
  
  inline def apply(images: js.Array[ContentsJsonImage]): PickContentsJsonimages = {
    val __obj = js.Dynamic.literal(images = images.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickContentsJsonimages]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickContentsJsonimages] (val x: Self) extends AnyVal {
    
    inline def setImages(value: js.Array[ContentsJsonImage]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesVarargs(value: ContentsJsonImage*): Self = StObject.set(x, "images", js.Array(value*))
  }
}
