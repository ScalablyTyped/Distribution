package typings.expoFont

import org.scalablytyped.runtime.StringDictionary
import typings.expoFont.fontTypesMod.FontSource
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fontHooksMod {
  
  @JSImport("expo-font/build/FontHooks", "useFonts")
  @js.native
  def useFonts(map: String): js.Tuple2[Boolean, Error | Null] = js.native
  @JSImport("expo-font/build/FontHooks", "useFonts")
  @js.native
  def useFonts(map: StringDictionary[FontSource]): js.Tuple2[Boolean, Error | Null] = js.native
}
