package typings.emojiMart

import typings.emojiMart.nimbleEmojiIndexMod.EmojiData
import typings.emojiMart.sharedPropsMod.CategoryName
import typings.emojiMart.sharedPropsMod.EmojiProps
import typings.emojiMart.sharedPropsMod.I18n
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object categoryMod {
  
  @JSImport("emoji-mart/dist-es/components/category", JSImport.Default)
  @js.native
  open class default ()
    extends Component[Props, js.Object, Any]
  
  type Category = Component[Props, js.Object, Any]
  
  trait Props extends StObject {
    
    var emojiProps: EmojiProps
    
    var emojis: js.UndefOr[js.Array[String | EmojiData]] = js.undefined
    
    var hasStickyPosition: js.UndefOr[Boolean] = js.undefined
    
    var i18n: I18n
    
    var id: CategoryName
    
    var name: String
    
    var native: Boolean
    
    var perLine: Double
    
    var recent: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Props {
    
    inline def apply(
      emojiProps: EmojiProps,
      i18n: I18n,
      id: CategoryName,
      name: String,
      native: Boolean,
      perLine: Double
    ): Props = {
      val __obj = js.Dynamic.literal(emojiProps = emojiProps.asInstanceOf[js.Any], i18n = i18n.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], perLine = perLine.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setEmojiProps(value: EmojiProps): Self = StObject.set(x, "emojiProps", value.asInstanceOf[js.Any])
      
      inline def setEmojis(value: js.Array[String | EmojiData]): Self = StObject.set(x, "emojis", value.asInstanceOf[js.Any])
      
      inline def setEmojisUndefined: Self = StObject.set(x, "emojis", js.undefined)
      
      inline def setEmojisVarargs(value: (String | EmojiData)*): Self = StObject.set(x, "emojis", js.Array(value*))
      
      inline def setHasStickyPosition(value: Boolean): Self = StObject.set(x, "hasStickyPosition", value.asInstanceOf[js.Any])
      
      inline def setHasStickyPositionUndefined: Self = StObject.set(x, "hasStickyPosition", js.undefined)
      
      inline def setI18n(value: I18n): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
      
      inline def setId(value: CategoryName): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNative(value: Boolean): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
      
      inline def setPerLine(value: Double): Self = StObject.set(x, "perLine", value.asInstanceOf[js.Any])
      
      inline def setRecent(value: js.Array[String]): Self = StObject.set(x, "recent", value.asInstanceOf[js.Any])
      
      inline def setRecentUndefined: Self = StObject.set(x, "recent", js.undefined)
      
      inline def setRecentVarargs(value: String*): Self = StObject.set(x, "recent", js.Array(value*))
    }
  }
}
