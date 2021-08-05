package typings.emojiMart

import typings.emojiMart.anon.PickEmojiDataid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object frequentlyMod {
  
  object default {
    
    @JSImport("emoji-mart/dist-es/utils/frequently", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def add(emoji: PickEmojiDataid): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(emoji.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def get(perLine: Double): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(perLine.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  }
}
