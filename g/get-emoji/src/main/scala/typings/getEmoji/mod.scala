package typings.getEmoji

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("get-emoji", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(emojiName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(emojiName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("get-emoji", "emojiList")
  @js.native
  val emojiList: js.Array[String] = js.native
}
