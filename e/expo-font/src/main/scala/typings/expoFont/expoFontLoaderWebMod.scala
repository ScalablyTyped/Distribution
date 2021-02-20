package typings.expoFont

import typings.expoFont.anon.PickFontResourcedisplay
import typings.expoFont.fontTypesMod.FontResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expoFontLoaderWebMod {
  
  object default {
    
    @JSImport("expo-font/build/ExpoFontLoader.web", "default.loadAsync")
    @js.native
    def loadAsync(fontFamilyName: String, resource: FontResource): js.Promise[Unit] = js.native
    
    @JSImport("expo-font/build/ExpoFontLoader.web", "default.name")
    @js.native
    val name: String = js.native
    
    @JSImport("expo-font/build/ExpoFontLoader.web", "default.unloadAllAsync")
    @js.native
    def unloadAllAsync(): js.Promise[Unit] = js.native
    
    @JSImport("expo-font/build/ExpoFontLoader.web", "default.unloadAsync")
    @js.native
    def unloadAsync(fontFamilyName: String): js.Promise[Unit] = js.native
    @JSImport("expo-font/build/ExpoFontLoader.web", "default.unloadAsync")
    @js.native
    def unloadAsync(fontFamilyName: String, options: PickFontResourcedisplay): js.Promise[Unit] = js.native
  }
}
