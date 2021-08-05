package typings.expoAsset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageAssetsMod {
  
  @JSImport("expo-asset/build/ImageAssets", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getImageInfoAsync(url: String): js.Promise[ImageInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getImageInfoAsync")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ImageInfo]]
  
  inline def isImageType(`type`: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImageType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait ImageInfo extends StObject {
    
    var height: Double
    
    var name: String
    
    var width: Double
  }
  object ImageInfo {
    
    inline def apply(height: Double, name: String, width: Double): ImageInfo = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageInfo]
    }
    
    extension [Self <: ImageInfo](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
