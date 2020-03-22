package typings.expoFont

import typings.expoFont.fontTypesMod.FontResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-font/build/ExpoFontLoader.web", JSImport.Namespace)
@js.native
object expoFontLoaderWebMod extends js.Object {
  @js.native
  object default extends js.Object {
    val name: String = js.native
    def loadAsync(fontFamilyName: String, resource: FontResource): js.Promise[Unit] = js.native
  }
  
}

