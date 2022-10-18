package typings.emojiMart

import typings.emojiMart.distEsUtilsDataMod.Data
import typings.emojiMart.distEsUtilsEmojiIndexNimbleEmojiIndexMod.BaseEmoji
import typings.emojiMart.distEsUtilsSharedPropsMod.EmojiSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsUtilsMod {
  
  @JSImport("emoji-mart/dist-es/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEmojiDataFromNative(nativeString: String, set: EmojiSet, data: Data): BaseEmoji = (^.asInstanceOf[js.Dynamic].applyDynamic("getEmojiDataFromNative")(nativeString.asInstanceOf[js.Any], set.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[BaseEmoji]
}
