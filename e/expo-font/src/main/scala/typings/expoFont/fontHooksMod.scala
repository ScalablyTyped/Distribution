package typings.expoFont

import org.scalablytyped.runtime.StringDictionary
import typings.expoFont.fontTypesMod.FontSource
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-font/build/FontHooks", JSImport.Namespace)
@js.native
object fontHooksMod extends js.Object {
  def useFonts(map: String): js.Tuple2[Boolean, Error | Null] = js.native
  def useFonts(map: StringDictionary[FontSource]): js.Tuple2[Boolean, Error | Null] = js.native
}

