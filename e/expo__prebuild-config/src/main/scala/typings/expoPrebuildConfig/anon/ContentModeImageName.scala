package typings.expoPrebuildConfig.anon

import typings.expoPrebuildConfig.buildPluginsUnversionedExpoSplashScreenInterfaceBuilderMod.ImageContentMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentModeImageName extends StObject {
  
  var contentMode: ImageContentMode
  
  var imageName: String
}
object ContentModeImageName {
  
  inline def apply(contentMode: ImageContentMode, imageName: String): ContentModeImageName = {
    val __obj = js.Dynamic.literal(contentMode = contentMode.asInstanceOf[js.Any], imageName = imageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentModeImageName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentModeImageName] (val x: Self) extends AnyVal {
    
    inline def setContentMode(value: ImageContentMode): Self = StObject.set(x, "contentMode", value.asInstanceOf[js.Any])
    
    inline def setImageName(value: String): Self = StObject.set(x, "imageName", value.asInstanceOf[js.Any])
  }
}
