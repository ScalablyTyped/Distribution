package typings.expoPrebuildConfig.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageNameString extends StObject {
  
  var imageName: String
}
object ImageNameString {
  
  inline def apply(imageName: String): ImageNameString = {
    val __obj = js.Dynamic.literal(imageName = imageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageNameString]
  }
  
  extension [Self <: ImageNameString](x: Self) {
    
    inline def setImageName(value: String): Self = StObject.set(x, "imageName", value.asInstanceOf[js.Any])
  }
}
