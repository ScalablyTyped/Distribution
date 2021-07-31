package typings.firefoxWebextBrowser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RectList extends StObject {
  
  var rectList: js.Array[Bottom]
  
  var textList: js.Array[String]
}
object RectList {
  
  @scala.inline
  def apply(rectList: js.Array[Bottom], textList: js.Array[String]): RectList = {
    val __obj = js.Dynamic.literal(rectList = rectList.asInstanceOf[js.Any], textList = textList.asInstanceOf[js.Any])
    __obj.asInstanceOf[RectList]
  }
  
  @scala.inline
  implicit class RectListMutableBuilder[Self <: RectList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRectList(value: js.Array[Bottom]): Self = StObject.set(x, "rectList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRectListVarargs(value: Bottom*): Self = StObject.set(x, "rectList", js.Array(value :_*))
    
    @scala.inline
    def setTextList(value: js.Array[String]): Self = StObject.set(x, "textList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextListVarargs(value: String*): Self = StObject.set(x, "textList", js.Array(value :_*))
  }
}
