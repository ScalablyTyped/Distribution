package typings.duckduckgoImagesApi

import typings.duckduckgoImagesApi.anon.Iterations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("duckduckgo-images-api", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def imageSearch(params: Iterations): js.Promise[js.Array[DuckDuckGoImage]] = ^.asInstanceOf[js.Dynamic].applyDynamic("image_search")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[DuckDuckGoImage]]]
  
  inline def imageSearchGenerator(params: Iterations): js.Promise[js.Array[DuckDuckGoImage]] = ^.asInstanceOf[js.Dynamic].applyDynamic("image_search_generator")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[DuckDuckGoImage]]]
  
  trait DuckDuckGoImage extends StObject {
    
    var height: Double
    
    var image: String
    
    var source: String
    
    var thumbnail: String
    
    var title: String
    
    var url: String
    
    var width: Double
  }
  object DuckDuckGoImage {
    
    inline def apply(
      height: Double,
      image: String,
      source: String,
      thumbnail: String,
      title: String,
      url: String,
      width: Double
    ): DuckDuckGoImage = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[DuckDuckGoImage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DuckDuckGoImage] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
