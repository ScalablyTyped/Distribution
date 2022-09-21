package typings.favicons

import typings.favicons.mod.FileOptions
import typings.favicons.mod.IconOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Record<favicons.favicons.PlatformName, favicons.favicons.FileOptions> */
  trait RecordPlatformNameFileOpt extends StObject {
    
    var android: FileOptions
    
    var appleIcon: FileOptions
    
    var appleStartup: FileOptions
    
    var favicons: FileOptions
    
    var windows: FileOptions
    
    var yandex: FileOptions
  }
  object RecordPlatformNameFileOpt {
    
    inline def apply(
      android: FileOptions,
      appleIcon: FileOptions,
      appleStartup: FileOptions,
      favicons: FileOptions,
      windows: FileOptions,
      yandex: FileOptions
    ): RecordPlatformNameFileOpt = {
      val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], appleIcon = appleIcon.asInstanceOf[js.Any], appleStartup = appleStartup.asInstanceOf[js.Any], favicons = favicons.asInstanceOf[js.Any], windows = windows.asInstanceOf[js.Any], yandex = yandex.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordPlatformNameFileOpt]
    }
    
    extension [Self <: RecordPlatformNameFileOpt](x: Self) {
      
      inline def setAndroid(value: FileOptions): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
      
      inline def setAppleIcon(value: FileOptions): Self = StObject.set(x, "appleIcon", value.asInstanceOf[js.Any])
      
      inline def setAppleStartup(value: FileOptions): Self = StObject.set(x, "appleStartup", value.asInstanceOf[js.Any])
      
      inline def setFavicons(value: FileOptions): Self = StObject.set(x, "favicons", value.asInstanceOf[js.Any])
      
      inline def setWindows(value: FileOptions): Self = StObject.set(x, "windows", value.asInstanceOf[js.Any])
      
      inline def setYandex(value: FileOptions): Self = StObject.set(x, "yandex", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Record<favicons.favicons.PlatformName, favicons.favicons.IconOptions | boolean | std.Array<string>> */
  trait RecordPlatformNameIconOpt extends StObject {
    
    var android: IconOptions | Boolean | js.Array[String]
    
    var appleIcon: IconOptions | Boolean | js.Array[String]
    
    var appleStartup: IconOptions | Boolean | js.Array[String]
    
    var favicons: IconOptions | Boolean | js.Array[String]
    
    var windows: IconOptions | Boolean | js.Array[String]
    
    var yandex: IconOptions | Boolean | js.Array[String]
  }
  object RecordPlatformNameIconOpt {
    
    inline def apply(
      android: IconOptions | Boolean | js.Array[String],
      appleIcon: IconOptions | Boolean | js.Array[String],
      appleStartup: IconOptions | Boolean | js.Array[String],
      favicons: IconOptions | Boolean | js.Array[String],
      windows: IconOptions | Boolean | js.Array[String],
      yandex: IconOptions | Boolean | js.Array[String]
    ): RecordPlatformNameIconOpt = {
      val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], appleIcon = appleIcon.asInstanceOf[js.Any], appleStartup = appleStartup.asInstanceOf[js.Any], favicons = favicons.asInstanceOf[js.Any], windows = windows.asInstanceOf[js.Any], yandex = yandex.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordPlatformNameIconOpt]
    }
    
    extension [Self <: RecordPlatformNameIconOpt](x: Self) {
      
      inline def setAndroid(value: IconOptions | Boolean | js.Array[String]): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
      
      inline def setAndroidVarargs(value: String*): Self = StObject.set(x, "android", js.Array(value*))
      
      inline def setAppleIcon(value: IconOptions | Boolean | js.Array[String]): Self = StObject.set(x, "appleIcon", value.asInstanceOf[js.Any])
      
      inline def setAppleIconVarargs(value: String*): Self = StObject.set(x, "appleIcon", js.Array(value*))
      
      inline def setAppleStartup(value: IconOptions | Boolean | js.Array[String]): Self = StObject.set(x, "appleStartup", value.asInstanceOf[js.Any])
      
      inline def setAppleStartupVarargs(value: String*): Self = StObject.set(x, "appleStartup", js.Array(value*))
      
      inline def setFavicons(value: IconOptions | Boolean | js.Array[String]): Self = StObject.set(x, "favicons", value.asInstanceOf[js.Any])
      
      inline def setFaviconsVarargs(value: String*): Self = StObject.set(x, "favicons", js.Array(value*))
      
      inline def setWindows(value: IconOptions | Boolean | js.Array[String]): Self = StObject.set(x, "windows", value.asInstanceOf[js.Any])
      
      inline def setWindowsVarargs(value: String*): Self = StObject.set(x, "windows", js.Array(value*))
      
      inline def setYandex(value: IconOptions | Boolean | js.Array[String]): Self = StObject.set(x, "yandex", value.asInstanceOf[js.Any])
      
      inline def setYandexVarargs(value: String*): Self = StObject.set(x, "yandex", js.Array(value*))
    }
  }
}
