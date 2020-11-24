package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdCustomizerSource extends AdWordsEntity {
  
  def adCustomizerItemBuilder(): AdCustomizerItemBuilder[AdCustomizerItem] = js.native
  
  def getAttributes(): js.Object = js.native
  
  def getName(): String = js.native
  
  def items(): AdWordsSelector[AdCustomizerItem] = js.native
}
object AdCustomizerSource {
  
  @scala.inline
  def apply(
    adCustomizerItemBuilder: () => AdCustomizerItemBuilder[AdCustomizerItem],
    getAttributes: () => js.Object,
    getName: () => String,
    items: () => AdWordsSelector[AdCustomizerItem]
  ): AdCustomizerSource = {
    val __obj = js.Dynamic.literal(adCustomizerItemBuilder = js.Any.fromFunction0(adCustomizerItemBuilder), getAttributes = js.Any.fromFunction0(getAttributes), getName = js.Any.fromFunction0(getName), items = js.Any.fromFunction0(items))
    __obj.asInstanceOf[AdCustomizerSource]
  }
  
  @scala.inline
  implicit class AdCustomizerSourceOps[Self <: AdCustomizerSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdCustomizerItemBuilder(value: () => AdCustomizerItemBuilder[AdCustomizerItem]): Self = this.set("adCustomizerItemBuilder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAttributes(value: () => js.Object): Self = this.set("getAttributes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setItems(value: () => AdWordsSelector[AdCustomizerItem]): Self = this.set("items", js.Any.fromFunction0(value))
  }
}
