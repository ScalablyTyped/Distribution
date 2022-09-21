package typings.emojiMart

import org.scalablytyped.runtime.Shortcut
import typings.emojiMart.sharedPropsMod.EmojiProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emojiMod extends Shortcut {
  
  @JSImport("emoji-mart/dist-es/components/emoji/emoji", JSImport.Default)
  @js.native
  val default: FunctionComponent[EmojiProps] = js.native
  
  type _To = FunctionComponent[EmojiProps]
  
  /* This means you don't have to write `default`, but can instead just say `emojiMod.foo` */
  override def _to: FunctionComponent[EmojiProps] = default
}
