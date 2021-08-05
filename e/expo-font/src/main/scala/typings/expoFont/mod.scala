package typings.expoFont

import org.scalablytyped.runtime.StringDictionary
import typings.expoFont.fontTypesMod.FontSource
import typings.expoFont.fontTypesMod.UnloadFontOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("expo-font", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("expo-font", "FontDisplay")
  @js.native
  object FontDisplay extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.expoFont.fontTypesMod.FontDisplay & String] = js.native
    
    /* "auto" */ val AUTO: typings.expoFont.fontTypesMod.FontDisplay.AUTO & String = js.native
    
    /* "block" */ val BLOCK: typings.expoFont.fontTypesMod.FontDisplay.BLOCK & String = js.native
    
    /* "fallback" */ val FALLBACK: typings.expoFont.fontTypesMod.FontDisplay.FALLBACK & String = js.native
    
    /* "optional" */ val OPTIONAL: typings.expoFont.fontTypesMod.FontDisplay.OPTIONAL & String = js.native
    
    /* "swap" */ val SWAP: typings.expoFont.fontTypesMod.FontDisplay.SWAP & String = js.native
  }
  
  inline def isLoaded(fontFamily: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLoaded")(fontFamily.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isLoading(fontFamily: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLoading")(fontFamily.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def loadAsync(fontFamilyOrFontMap: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadAsync")(fontFamilyOrFontMap.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def loadAsync(fontFamilyOrFontMap: String, source: FontSource): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadAsync")(fontFamilyOrFontMap.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def loadAsync(fontFamilyOrFontMap: StringDictionary[FontSource]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadAsync")(fontFamilyOrFontMap.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def loadAsync(fontFamilyOrFontMap: StringDictionary[FontSource], source: FontSource): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadAsync")(fontFamilyOrFontMap.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def processFontFamily(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("processFontFamily")().asInstanceOf[String | Null]
  inline def processFontFamily(fontFamily: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("processFontFamily")(fontFamily.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def unloadAllAsync(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unloadAllAsync")().asInstanceOf[js.Promise[Unit]]
  
  inline def unloadAsync(fontFamilyOrFontMap: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unloadAsync")(fontFamilyOrFontMap.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def unloadAsync(fontFamilyOrFontMap: String, options: UnloadFontOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("unloadAsync")(fontFamilyOrFontMap.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def unloadAsync(fontFamilyOrFontMap: StringDictionary[UnloadFontOptions]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unloadAsync")(fontFamilyOrFontMap.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def unloadAsync(fontFamilyOrFontMap: StringDictionary[UnloadFontOptions], options: UnloadFontOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("unloadAsync")(fontFamilyOrFontMap.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def useFonts(map: String): js.Tuple2[Boolean, Error | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFonts")(map.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Boolean, Error | Null]]
  inline def useFonts(map: StringDictionary[FontSource]): js.Tuple2[Boolean, Error | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFonts")(map.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Boolean, Error | Null]]
}
