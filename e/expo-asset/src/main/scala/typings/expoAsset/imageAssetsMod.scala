package typings.expoAsset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageAssetsMod {
  
  @JSImport("expo-asset/build/ImageAssets", "getImageInfoAsync")
  @js.native
  def getImageInfoAsync(url: String): js.Promise[ImageInfo] = js.native
  
  @JSImport("expo-asset/build/ImageAssets", "isImageType")
  @js.native
  def isImageType(`type`: String): Boolean = js.native
  
  @js.native
  trait ImageInfo extends StObject {
    
    var height: Double = js.native
    
    var name: String = js.native
    
    var width: Double = js.native
  }
  object ImageInfo {
    
    @scala.inline
    def apply(height: Double, name: String, width: Double): ImageInfo = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageInfo]
    }
    
    @scala.inline
    implicit class ImageInfoMutableBuilder[Self <: ImageInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
