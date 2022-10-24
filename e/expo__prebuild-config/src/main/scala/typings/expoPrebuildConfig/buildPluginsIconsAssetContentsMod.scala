package typings.expoPrebuildConfig

import typings.expoPrebuildConfig.anon.Author
import typings.expoPrebuildConfig.anon.PickContentsJsonimages
import typings.expoPrebuildConfig.expoPrebuildConfigStrings.dark
import typings.expoPrebuildConfig.expoPrebuildConfigStrings.luminosity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildPluginsIconsAssetContentsMod {
  
  @JSImport("@expo/prebuild-config/build/plugins/icons/AssetContents", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createContentsJsonItem(item: ContentsJsonImage): ContentsJsonImage = ^.asInstanceOf[js.Dynamic].applyDynamic("createContentsJsonItem")(item.asInstanceOf[js.Any]).asInstanceOf[ContentsJsonImage]
  
  inline def writeContentsJsonAsync(directory: String, param1: PickContentsJsonimages): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeContentsJsonAsync")(directory.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait ContentsJson extends StObject {
    
    var images: js.Array[ContentsJsonImage]
    
    var info: Author
  }
  object ContentsJson {
    
    inline def apply(images: js.Array[ContentsJsonImage], info: Author): ContentsJson = {
      val __obj = js.Dynamic.literal(images = images.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentsJson]
    }
    
    extension [Self <: ContentsJson](x: Self) {
      
      inline def setImages(value: js.Array[ContentsJsonImage]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesVarargs(value: ContentsJsonImage*): Self = StObject.set(x, "images", js.Array(value*))
      
      inline def setInfo(value: Author): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContentsJsonImage extends StObject {
    
    var appearances: js.UndefOr[js.Array[ContentsJsonImageAppearance]] = js.undefined
    
    var filename: js.UndefOr[String] = js.undefined
    
    var idiom: ContentsJsonImageIdiom
    
    var scale: ContentsJsonImageScale
    
    var size: js.UndefOr[String] = js.undefined
  }
  object ContentsJsonImage {
    
    inline def apply(idiom: ContentsJsonImageIdiom, scale: ContentsJsonImageScale): ContentsJsonImage = {
      val __obj = js.Dynamic.literal(idiom = idiom.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentsJsonImage]
    }
    
    extension [Self <: ContentsJsonImage](x: Self) {
      
      inline def setAppearances(value: js.Array[ContentsJsonImageAppearance]): Self = StObject.set(x, "appearances", value.asInstanceOf[js.Any])
      
      inline def setAppearancesUndefined: Self = StObject.set(x, "appearances", js.undefined)
      
      inline def setAppearancesVarargs(value: ContentsJsonImageAppearance*): Self = StObject.set(x, "appearances", js.Array(value*))
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setIdiom(value: ContentsJsonImageIdiom): Self = StObject.set(x, "idiom", value.asInstanceOf[js.Any])
      
      inline def setScale(value: ContentsJsonImageScale): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait ContentsJsonImageAppearance extends StObject {
    
    var appearance: luminosity
    
    var value: dark
  }
  object ContentsJsonImageAppearance {
    
    inline def apply(): ContentsJsonImageAppearance = {
      val __obj = js.Dynamic.literal(appearance = "luminosity", value = "dark")
      __obj.asInstanceOf[ContentsJsonImageAppearance]
    }
    
    extension [Self <: ContentsJsonImageAppearance](x: Self) {
      
      inline def setAppearance(value: luminosity): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
      
      inline def setValue(value: dark): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.expoPrebuildConfig.expoPrebuildConfigStrings.iphone
    - typings.expoPrebuildConfig.expoPrebuildConfigStrings.ipad
    - typings.expoPrebuildConfig.expoPrebuildConfigStrings.`ios-marketing`
    - typings.expoPrebuildConfig.expoPrebuildConfigStrings.universal
  */
  trait ContentsJsonImageIdiom extends StObject
  object ContentsJsonImageIdiom {
    
    inline def `ios-marketing`: typings.expoPrebuildConfig.expoPrebuildConfigStrings.`ios-marketing` = "ios-marketing".asInstanceOf[typings.expoPrebuildConfig.expoPrebuildConfigStrings.`ios-marketing`]
    
    inline def ipad: typings.expoPrebuildConfig.expoPrebuildConfigStrings.ipad = "ipad".asInstanceOf[typings.expoPrebuildConfig.expoPrebuildConfigStrings.ipad]
    
    inline def iphone: typings.expoPrebuildConfig.expoPrebuildConfigStrings.iphone = "iphone".asInstanceOf[typings.expoPrebuildConfig.expoPrebuildConfigStrings.iphone]
    
    inline def universal: typings.expoPrebuildConfig.expoPrebuildConfigStrings.universal = "universal".asInstanceOf[typings.expoPrebuildConfig.expoPrebuildConfigStrings.universal]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.expoPrebuildConfig.expoPrebuildConfigStrings.`1x`
    - typings.expoPrebuildConfig.expoPrebuildConfigStrings.`2x`
    - typings.expoPrebuildConfig.expoPrebuildConfigStrings.`3x`
  */
  trait ContentsJsonImageScale extends StObject
  object ContentsJsonImageScale {
    
    inline def `1x`: typings.expoPrebuildConfig.expoPrebuildConfigStrings.`1x` = "1x".asInstanceOf[typings.expoPrebuildConfig.expoPrebuildConfigStrings.`1x`]
    
    inline def `2x`: typings.expoPrebuildConfig.expoPrebuildConfigStrings.`2x` = "2x".asInstanceOf[typings.expoPrebuildConfig.expoPrebuildConfigStrings.`2x`]
    
    inline def `3x`: typings.expoPrebuildConfig.expoPrebuildConfigStrings.`3x` = "3x".asInstanceOf[typings.expoPrebuildConfig.expoPrebuildConfigStrings.`3x`]
  }
}
