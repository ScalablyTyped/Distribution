package typings.expoFont

import typings.expoFont.anon.PickFontResourcedisplay
import typings.expoFont.fontTypesMod.FontResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo-font/build/ExpoFontLoader.web", JSImport.Namespace)
@js.native
object expoFontLoaderWebMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def loadAsync(fontFamilyName: String, resource: FontResource): js.Promise[Unit] = js.native
    
    val name: String = js.native
    
    def unloadAllAsync(): js.Promise[Unit] = js.native
    
    def unloadAsync(fontFamilyName: String): js.Promise[Unit] = js.native
    def unloadAsync(fontFamilyName: String, options: PickFontResourcedisplay): js.Promise[Unit] = js.native
  }
}
