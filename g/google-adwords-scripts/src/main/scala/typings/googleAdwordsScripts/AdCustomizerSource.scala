package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdCustomizerSource
  extends StObject
     with AdWordsEntity {
  
  def adCustomizerItemBuilder(): AdCustomizerItemBuilder[AdCustomizerItem]
  
  def getAttributes(): js.Object
  
  def getName(): String
  
  def items(): AdWordsSelector[AdCustomizerItem]
}
object AdCustomizerSource {
  
  inline def apply(
    adCustomizerItemBuilder: () => AdCustomizerItemBuilder[AdCustomizerItem],
    getAttributes: () => js.Object,
    getName: () => String,
    items: () => AdWordsSelector[AdCustomizerItem]
  ): AdCustomizerSource = {
    val __obj = js.Dynamic.literal(adCustomizerItemBuilder = js.Any.fromFunction0(adCustomizerItemBuilder), getAttributes = js.Any.fromFunction0(getAttributes), getName = js.Any.fromFunction0(getName), items = js.Any.fromFunction0(items))
    __obj.asInstanceOf[AdCustomizerSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdCustomizerSource] (val x: Self) extends AnyVal {
    
    inline def setAdCustomizerItemBuilder(value: () => AdCustomizerItemBuilder[AdCustomizerItem]): Self = StObject.set(x, "adCustomizerItemBuilder", js.Any.fromFunction0(value))
    
    inline def setGetAttributes(value: () => js.Object): Self = StObject.set(x, "getAttributes", js.Any.fromFunction0(value))
    
    inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    inline def setItems(value: () => AdWordsSelector[AdCustomizerItem]): Self = StObject.set(x, "items", js.Any.fromFunction0(value))
  }
}
