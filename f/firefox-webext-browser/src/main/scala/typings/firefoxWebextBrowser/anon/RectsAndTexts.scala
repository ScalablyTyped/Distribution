package typings.firefoxWebextBrowser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RectsAndTexts extends StObject {
  
  var rectsAndTexts: RectList
  
  var textList: String
}
object RectsAndTexts {
  
  inline def apply(rectsAndTexts: RectList, textList: String): RectsAndTexts = {
    val __obj = js.Dynamic.literal(rectsAndTexts = rectsAndTexts.asInstanceOf[js.Any], textList = textList.asInstanceOf[js.Any])
    __obj.asInstanceOf[RectsAndTexts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RectsAndTexts] (val x: Self) extends AnyVal {
    
    inline def setRectsAndTexts(value: RectList): Self = StObject.set(x, "rectsAndTexts", value.asInstanceOf[js.Any])
    
    inline def setTextList(value: String): Self = StObject.set(x, "textList", value.asInstanceOf[js.Any])
  }
}
