package typings.expoFont

import typings.expoFont.anon.PickFontResourcedisplay
import typings.expoFont.fontTypesMod.FontResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expoFontLoaderWebMod {
  
  object default {
    
    @JSImport("expo-font/build/ExpoFontLoader.web", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def loadAsync(fontFamilyName: String, resource: FontResource): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadAsync")(fontFamilyName.asInstanceOf[js.Any], resource.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    @JSImport("expo-font/build/ExpoFontLoader.web", "default.name")
    @js.native
    val name: String = js.native
    
    @scala.inline
    def unloadAllAsync(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unloadAllAsync")().asInstanceOf[js.Promise[Unit]]
    
    @scala.inline
    def unloadAsync(fontFamilyName: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unloadAsync")(fontFamilyName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    @scala.inline
    def unloadAsync(fontFamilyName: String, options: PickFontResourcedisplay): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("unloadAsync")(fontFamilyName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  }
}
