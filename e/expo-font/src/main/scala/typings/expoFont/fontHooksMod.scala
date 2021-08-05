package typings.expoFont

import org.scalablytyped.runtime.StringDictionary
import typings.expoFont.fontTypesMod.FontSource
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fontHooksMod {
  
  @JSImport("expo-font/build/FontHooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useFonts(map: String): js.Tuple2[Boolean, Error | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFonts")(map.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Boolean, Error | Null]]
  inline def useFonts(map: StringDictionary[FontSource]): js.Tuple2[Boolean, Error | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFonts")(map.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Boolean, Error | Null]]
}
