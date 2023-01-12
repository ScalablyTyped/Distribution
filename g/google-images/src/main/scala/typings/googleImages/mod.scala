package typings.googleImages

import typings.googleImages.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("google-images", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with GoogleImages {
    def this(engineId: String, apiKey: String) = this()
  }
  
  @js.native
  trait GoogleImages extends StObject {
    
    def search(searchTerm: String): js.Promise[js.Array[Image]] = js.native
    def search(searchTerm: String, options: SearchOptions): js.Promise[js.Array[Image]] = js.native
  }
  
  trait Image extends StObject {
    
    var height: Double
    
    var size: Double
    
    var thumbnail: Height
    
    var `type`: String
    
    var url: String
    
    var width: Double
  }
  object Image {
    
    inline def apply(height: Double, size: Double, thumbnail: Height, `type`: String, url: String, width: Double): Image = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Image]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Image] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setThumbnail(value: Height): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.googleImages.googleImagesStrings.color
    - typings.googleImages.googleImagesStrings.gray
    - typings.googleImages.googleImagesStrings.mono
  */
  trait SearchColorType extends StObject
  object SearchColorType {
    
    inline def color: typings.googleImages.googleImagesStrings.color = "color".asInstanceOf[typings.googleImages.googleImagesStrings.color]
    
    inline def gray: typings.googleImages.googleImagesStrings.gray = "gray".asInstanceOf[typings.googleImages.googleImagesStrings.gray]
    
    inline def mono: typings.googleImages.googleImagesStrings.mono = "mono".asInstanceOf[typings.googleImages.googleImagesStrings.mono]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.googleImages.googleImagesStrings.black
    - typings.googleImages.googleImagesStrings.blue
    - typings.googleImages.googleImagesStrings.brown
    - typings.googleImages.googleImagesStrings.gray
    - typings.googleImages.googleImagesStrings.green
    - typings.googleImages.googleImagesStrings.pink
    - typings.googleImages.googleImagesStrings.purple
    - typings.googleImages.googleImagesStrings.teal
    - typings.googleImages.googleImagesStrings.white
    - typings.googleImages.googleImagesStrings.yellow
  */
  trait SearchDominantColor extends StObject
  object SearchDominantColor {
    
    inline def black: typings.googleImages.googleImagesStrings.black = "black".asInstanceOf[typings.googleImages.googleImagesStrings.black]
    
    inline def blue: typings.googleImages.googleImagesStrings.blue = "blue".asInstanceOf[typings.googleImages.googleImagesStrings.blue]
    
    inline def brown: typings.googleImages.googleImagesStrings.brown = "brown".asInstanceOf[typings.googleImages.googleImagesStrings.brown]
    
    inline def gray: typings.googleImages.googleImagesStrings.gray = "gray".asInstanceOf[typings.googleImages.googleImagesStrings.gray]
    
    inline def green: typings.googleImages.googleImagesStrings.green = "green".asInstanceOf[typings.googleImages.googleImagesStrings.green]
    
    inline def pink: typings.googleImages.googleImagesStrings.pink = "pink".asInstanceOf[typings.googleImages.googleImagesStrings.pink]
    
    inline def purple: typings.googleImages.googleImagesStrings.purple = "purple".asInstanceOf[typings.googleImages.googleImagesStrings.purple]
    
    inline def teal: typings.googleImages.googleImagesStrings.teal = "teal".asInstanceOf[typings.googleImages.googleImagesStrings.teal]
    
    inline def white: typings.googleImages.googleImagesStrings.white = "white".asInstanceOf[typings.googleImages.googleImagesStrings.white]
    
    inline def yellow: typings.googleImages.googleImagesStrings.yellow = "yellow".asInstanceOf[typings.googleImages.googleImagesStrings.yellow]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.googleImages.googleImagesStrings.icon
    - typings.googleImages.googleImagesStrings.small
    - typings.googleImages.googleImagesStrings.medium
    - typings.googleImages.googleImagesStrings.large
    - typings.googleImages.googleImagesStrings.xlarge
    - typings.googleImages.googleImagesStrings.xxlarge
    - typings.googleImages.googleImagesStrings.huge
  */
  trait SearchImageSize extends StObject
  object SearchImageSize {
    
    inline def huge: typings.googleImages.googleImagesStrings.huge = "huge".asInstanceOf[typings.googleImages.googleImagesStrings.huge]
    
    inline def icon: typings.googleImages.googleImagesStrings.icon = "icon".asInstanceOf[typings.googleImages.googleImagesStrings.icon]
    
    inline def large: typings.googleImages.googleImagesStrings.large = "large".asInstanceOf[typings.googleImages.googleImagesStrings.large]
    
    inline def medium: typings.googleImages.googleImagesStrings.medium = "medium".asInstanceOf[typings.googleImages.googleImagesStrings.medium]
    
    inline def small: typings.googleImages.googleImagesStrings.small = "small".asInstanceOf[typings.googleImages.googleImagesStrings.small]
    
    inline def xlarge: typings.googleImages.googleImagesStrings.xlarge = "xlarge".asInstanceOf[typings.googleImages.googleImagesStrings.xlarge]
    
    inline def xxlarge: typings.googleImages.googleImagesStrings.xxlarge = "xxlarge".asInstanceOf[typings.googleImages.googleImagesStrings.xxlarge]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.googleImages.googleImagesStrings.clipart
    - typings.googleImages.googleImagesStrings.face
    - typings.googleImages.googleImagesStrings.lineart
    - typings.googleImages.googleImagesStrings.news
    - typings.googleImages.googleImagesStrings.photo
  */
  trait SearchImageType extends StObject
  object SearchImageType {
    
    inline def clipart: typings.googleImages.googleImagesStrings.clipart = "clipart".asInstanceOf[typings.googleImages.googleImagesStrings.clipart]
    
    inline def face: typings.googleImages.googleImagesStrings.face = "face".asInstanceOf[typings.googleImages.googleImagesStrings.face]
    
    inline def lineart: typings.googleImages.googleImagesStrings.lineart = "lineart".asInstanceOf[typings.googleImages.googleImagesStrings.lineart]
    
    inline def news: typings.googleImages.googleImagesStrings.news = "news".asInstanceOf[typings.googleImages.googleImagesStrings.news]
    
    inline def photo: typings.googleImages.googleImagesStrings.photo = "photo".asInstanceOf[typings.googleImages.googleImagesStrings.photo]
  }
  
  trait SearchOptions extends StObject {
    
    var colorType: js.UndefOr[SearchColorType] = js.undefined
    
    var dominantColor: js.UndefOr[SearchDominantColor] = js.undefined
    
    var page: js.UndefOr[Double] = js.undefined
    
    var safe: js.UndefOr[SearchSafe] = js.undefined
    
    var size: js.UndefOr[SearchImageSize] = js.undefined
    
    var `type`: js.UndefOr[SearchImageType] = js.undefined
  }
  object SearchOptions {
    
    inline def apply(): SearchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SearchOptions] (val x: Self) extends AnyVal {
      
      inline def setColorType(value: SearchColorType): Self = StObject.set(x, "colorType", value.asInstanceOf[js.Any])
      
      inline def setColorTypeUndefined: Self = StObject.set(x, "colorType", js.undefined)
      
      inline def setDominantColor(value: SearchDominantColor): Self = StObject.set(x, "dominantColor", value.asInstanceOf[js.Any])
      
      inline def setDominantColorUndefined: Self = StObject.set(x, "dominantColor", js.undefined)
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      inline def setSafe(value: SearchSafe): Self = StObject.set(x, "safe", value.asInstanceOf[js.Any])
      
      inline def setSafeUndefined: Self = StObject.set(x, "safe", js.undefined)
      
      inline def setSize(value: SearchImageSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setType(value: SearchImageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.googleImages.googleImagesStrings.high
    - typings.googleImages.googleImagesStrings.medium
    - typings.googleImages.googleImagesStrings.off
  */
  trait SearchSafe extends StObject
  object SearchSafe {
    
    inline def high: typings.googleImages.googleImagesStrings.high = "high".asInstanceOf[typings.googleImages.googleImagesStrings.high]
    
    inline def medium: typings.googleImages.googleImagesStrings.medium = "medium".asInstanceOf[typings.googleImages.googleImagesStrings.medium]
    
    inline def off: typings.googleImages.googleImagesStrings.off = "off".asInstanceOf[typings.googleImages.googleImagesStrings.off]
  }
}
