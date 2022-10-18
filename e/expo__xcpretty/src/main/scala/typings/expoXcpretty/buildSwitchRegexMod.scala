package typings.expoXcpretty

import typings.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSwitchRegexMod {
  
  @JSImport("@expo/xcpretty/build/switchRegex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def switchRegex(
    text: String,
    cases: js.Array[
      js.Tuple2[js.RegExp | Null, js.Function1[/* matches */ RegExpMatchArray, String | Unit]]
    ]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("switchRegex")(text.asInstanceOf[js.Any], cases.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def switchRegex(
    text: String,
    cases: js.Array[
      js.Tuple2[js.RegExp | Null, js.Function1[/* matches */ RegExpMatchArray, String | Unit]]
    ],
    isAll: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("switchRegex")(text.asInstanceOf[js.Any], cases.asInstanceOf[js.Any], isAll.asInstanceOf[js.Any])).asInstanceOf[String]
}
