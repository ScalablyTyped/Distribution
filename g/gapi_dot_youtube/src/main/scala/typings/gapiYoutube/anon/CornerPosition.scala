package typings.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CornerPosition extends StObject {
  
  /**
    * The corner of the player where the promoted item will appear.
    */
  var cornerPosition: String
  
  /**
    * The manner in which the promoted item is positioned in the video player.
    */
  var `type`: String
}
object CornerPosition {
  
  inline def apply(cornerPosition: String, `type`: String): CornerPosition = {
    val __obj = js.Dynamic.literal(cornerPosition = cornerPosition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CornerPosition]
  }
  
  extension [Self <: CornerPosition](x: Self) {
    
    inline def setCornerPosition(value: String): Self = StObject.set(x, "cornerPosition", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
