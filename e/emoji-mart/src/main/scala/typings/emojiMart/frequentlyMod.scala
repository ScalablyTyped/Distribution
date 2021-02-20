package typings.emojiMart

import typings.emojiMart.anon.PickEmojiDataid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object frequentlyMod {
  
  object default {
    
    @JSImport("emoji-mart/dist-es/utils/frequently", "default.add")
    @js.native
    def add(emoji: PickEmojiDataid): Unit = js.native
    
    @JSImport("emoji-mart/dist-es/utils/frequently", "default.get")
    @js.native
    def get(perLine: Double): js.Array[String] = js.native
  }
}
