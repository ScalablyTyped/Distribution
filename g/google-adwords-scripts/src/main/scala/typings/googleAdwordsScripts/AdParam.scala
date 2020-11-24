package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Ad Param
@js.native
trait AdParam extends AdWordsEntity {
  
  def getAdGroup(): AdGroup = js.native
  
  def getInde(): Double = js.native
  
  def getInsertionText(): String = js.native
  
  def getKeyword(): Keyword = js.native
  
  def remove(): Unit = js.native
  
  def setInsertionText(insertionText: String): Unit = js.native
}
object AdParam {
  
  @scala.inline
  def apply(
    getAdGroup: () => AdGroup,
    getInde: () => Double,
    getInsertionText: () => String,
    getKeyword: () => Keyword,
    remove: () => Unit,
    setInsertionText: String => Unit
  ): AdParam = {
    val __obj = js.Dynamic.literal(getAdGroup = js.Any.fromFunction0(getAdGroup), getInde = js.Any.fromFunction0(getInde), getInsertionText = js.Any.fromFunction0(getInsertionText), getKeyword = js.Any.fromFunction0(getKeyword), remove = js.Any.fromFunction0(remove), setInsertionText = js.Any.fromFunction1(setInsertionText))
    __obj.asInstanceOf[AdParam]
  }
  
  @scala.inline
  implicit class AdParamOps[Self <: AdParam] (val x: Self) extends AnyVal {
    
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
    def setGetAdGroup(value: () => AdGroup): Self = this.set("getAdGroup", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInde(value: () => Double): Self = this.set("getInde", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInsertionText(value: () => String): Self = this.set("getInsertionText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetKeyword(value: () => Keyword): Self = this.set("getKeyword", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemove(value: () => Unit): Self = this.set("remove", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetInsertionText(value: String => Unit): Self = this.set("setInsertionText", js.Any.fromFunction1(value))
  }
}
