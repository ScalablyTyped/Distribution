package typings.expoFont

import typings.expoAsset.mod.Asset
import typings.expoFont.fontTypesMod.FontResource
import typings.expoFont.fontTypesMod.FontSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo-font/build/FontLoader", JSImport.Namespace)
@js.native
object fontLoaderMod extends js.Object {
  def fontFamilyNeedsScoping(name: String): Boolean = js.native
  def getAssetForSource(source: FontSource): Asset | FontResource = js.native
  def getNativeFontName(name: String): String = js.native
  def loadSingleFontAsync(name: String, input: typings.expoAsset.assetMod.Asset): js.Promise[Unit] = js.native
  def loadSingleFontAsync(name: String, input: FontResource): js.Promise[Unit] = js.native
}

