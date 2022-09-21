package typings.firefoxWebextBrowser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RectList extends StObject {
  
  var rectList: js.Array[Bottom]
  
  var textList: js.Array[String]
}
object RectList {
  
  inline def apply(rectList: js.Array[Bottom], textList: js.Array[String]): RectList = {
    val __obj = js.Dynamic.literal(rectList = rectList.asInstanceOf[js.Any], textList = textList.asInstanceOf[js.Any])
    __obj.asInstanceOf[RectList]
  }
  
  extension [Self <: RectList](x: Self) {
    
    inline def setRectList(value: js.Array[Bottom]): Self = StObject.set(x, "rectList", value.asInstanceOf[js.Any])
    
    inline def setRectListVarargs(value: Bottom*): Self = StObject.set(x, "rectList", js.Array(value*))
    
    inline def setTextList(value: js.Array[String]): Self = StObject.set(x, "textList", value.asInstanceOf[js.Any])
    
    inline def setTextListVarargs(value: String*): Self = StObject.set(x, "textList", js.Array(value*))
  }
}
