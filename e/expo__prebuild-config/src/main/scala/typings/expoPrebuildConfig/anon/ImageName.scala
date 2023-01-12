package typings.expoPrebuildConfig.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageName extends StObject {
  
  var imageName: String
}
object ImageName {
  
  inline def apply(imageName: String): ImageName = {
    val __obj = js.Dynamic.literal(imageName = imageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageName] (val x: Self) extends AnyVal {
    
    inline def setImageName(value: String): Self = StObject.set(x, "imageName", value.asInstanceOf[js.Any])
  }
}
