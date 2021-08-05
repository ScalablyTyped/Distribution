package typings.expoFont

import typings.expoAsset.mod.Asset
import typings.expoFont.fontTypesMod.FontResource
import typings.expoFont.fontTypesMod.FontSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fontLoaderWebMod {
  
  @JSImport("expo-font/build/FontLoader.web", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fontFamilyNeedsScoping(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("fontFamilyNeedsScoping")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def getAssetForSource(source: FontSource): Asset | FontResource = ^.asInstanceOf[js.Dynamic].applyDynamic("getAssetForSource")(source.asInstanceOf[js.Any]).asInstanceOf[Asset | FontResource]
  
  inline def getNativeFontName(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getNativeFontName")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def loadSingleFontAsync(name: String, input: Asset): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadSingleFontAsync")(name.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def loadSingleFontAsync(name: String, input: FontResource): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadSingleFontAsync")(name.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
