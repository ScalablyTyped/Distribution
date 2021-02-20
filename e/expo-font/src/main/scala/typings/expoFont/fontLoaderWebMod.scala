package typings.expoFont

import typings.expoAsset.mod.Asset
import typings.expoFont.fontTypesMod.FontResource
import typings.expoFont.fontTypesMod.FontSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fontLoaderWebMod {
  
  @JSImport("expo-font/build/FontLoader.web", "fontFamilyNeedsScoping")
  @js.native
  def fontFamilyNeedsScoping(name: String): Boolean = js.native
  
  @JSImport("expo-font/build/FontLoader.web", "getAssetForSource")
  @js.native
  def getAssetForSource(source: FontSource): Asset | FontResource = js.native
  
  @JSImport("expo-font/build/FontLoader.web", "getNativeFontName")
  @js.native
  def getNativeFontName(name: String): String = js.native
  
  @JSImport("expo-font/build/FontLoader.web", "loadSingleFontAsync")
  @js.native
  def loadSingleFontAsync(name: String, input: Asset): js.Promise[Unit] = js.native
  @JSImport("expo-font/build/FontLoader.web", "loadSingleFontAsync")
  @js.native
  def loadSingleFontAsync(name: String, input: FontResource): js.Promise[Unit] = js.native
}
