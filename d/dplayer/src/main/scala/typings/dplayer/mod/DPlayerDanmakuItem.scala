package typings.dplayer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DPlayerDanmakuItem extends StObject {
  
  var color: String = js.native
  
  var text: String = js.native
  
  var `type`: DirectionType = js.native
}
object DPlayerDanmakuItem {
  
  @scala.inline
  def apply(color: String, text: String, `type`: DirectionType): DPlayerDanmakuItem = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DPlayerDanmakuItem]
  }
  
  @scala.inline
  implicit class DPlayerDanmakuItemMutableBuilder[Self <: DPlayerDanmakuItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: DirectionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
