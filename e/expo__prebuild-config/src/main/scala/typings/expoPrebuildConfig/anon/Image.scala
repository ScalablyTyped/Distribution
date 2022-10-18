package typings.expoPrebuildConfig.anon

import typings.expoPrebuildConfig.buildPluginsUnversionedExpoSplashScreenInterfaceBuilderMod.IBResourceImage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Image extends StObject {
  
  var image: js.Array[IBResourceImage]
}
object Image {
  
  inline def apply(image: js.Array[IBResourceImage]): Image = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
  
  extension [Self <: Image](x: Self) {
    
    inline def setImage(value: js.Array[IBResourceImage]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageVarargs(value: IBResourceImage*): Self = StObject.set(x, "image", js.Array(value*))
  }
}
