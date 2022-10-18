package typings.expoFont

import typings.expoFont.buildFontDottypesMod.FontSource
import typings.expoFont.buildFontDottypesMod.UnloadFontOptions
import typings.std.Record
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
    def apply(value: String): js.UndefOr[typings.expoFont.buildFontDottypesMod.FontDisplay & String] = js.native
    
    /* "auto" */ val AUTO: typings.expoFont.buildFontDottypesMod.FontDisplay.AUTO & String = js.native
    
    /* "block" */ val BLOCK: typings.expoFont.buildFontDottypesMod.FontDisplay.BLOCK & String = js.native
    
    /* "fallback" */ val FALLBACK: typings.expoFont.buildFontDottypesMod.FontDisplay.FALLBACK & String = js.native
    
    /* "optional" */ val OPTIONAL: typings.expoFont.buildFontDottypesMod.FontDisplay.OPTIONAL & String = js.native
    
    /* "swap" */ val SWAP: typings.expoFont.buildFontDottypesMod.FontDisplay.SWAP & String = js.native
  }
  
  inline def isLoaded(fontFamily: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLoaded")(fontFamily.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isLoading(fontFamily: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLoading")(fontFamily.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def loadAsync(fontFamilyOrFontMap: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadAsync")(fontFamilyOrFontMap.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def loadAsync(fontFamilyOrFontMap: String, source: FontSource): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadAsync")(fontFamilyOrFontMap.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def loadAsync(fontFamilyOrFontMap: Record[String, FontSource]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadAsync")(fontFamilyOrFontMap.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def loadAsync(fontFamilyOrFontMap: Record[String, FontSource], source: FontSource): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadAsync")(fontFamilyOrFontMap.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def processFontFamily(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("processFontFamily")().asInstanceOf[String | Null]
  inline def processFontFamily(fontFamily: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("processFontFamily")(fontFamily.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def unloadAllAsync(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unloadAllAsync")().asInstanceOf[js.Promise[Unit]]
  
  inline def unloadAsync(fontFamilyOrFontMap: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unloadAsync")(fontFamilyOrFontMap.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def unloadAsync(fontFamilyOrFontMap: String, options: UnloadFontOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("unloadAsync")(fontFamilyOrFontMap.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def unloadAsync(fontFamilyOrFontMap: Record[String, UnloadFontOptions]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unloadAsync")(fontFamilyOrFontMap.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def unloadAsync(fontFamilyOrFontMap: Record[String, UnloadFontOptions], options: UnloadFontOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("unloadAsync")(fontFamilyOrFontMap.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def useFonts(map: String): js.Tuple2[Boolean, js.Error | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFonts")(map.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Boolean, js.Error | Null]]
  inline def useFonts(map: Record[String, FontSource]): js.Tuple2[Boolean, js.Error | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFonts")(map.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Boolean, js.Error | Null]]
}
