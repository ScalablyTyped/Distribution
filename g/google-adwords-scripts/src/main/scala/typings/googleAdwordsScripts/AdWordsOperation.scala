package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdWordsOperation[E] extends js.Object {
  
  def getErrors(): js.Array[String] = js.native
  
  def getResult(): E = js.native
  
  def isSuccessful(): Boolean = js.native
}
object AdWordsOperation {
  
  @scala.inline
  def apply[E](getErrors: () => js.Array[String], getResult: () => E, isSuccessful: () => Boolean): AdWordsOperation[E] = {
    val __obj = js.Dynamic.literal(getErrors = js.Any.fromFunction0(getErrors), getResult = js.Any.fromFunction0(getResult), isSuccessful = js.Any.fromFunction0(isSuccessful))
    __obj.asInstanceOf[AdWordsOperation[E]]
  }
  
  @scala.inline
  implicit class AdWordsOperationOps[Self <: AdWordsOperation[_], E] (val x: Self with AdWordsOperation[E]) extends AnyVal {
    
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
    def setGetErrors(value: () => js.Array[String]): Self = this.set("getErrors", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetResult(value: () => E): Self = this.set("getResult", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsSuccessful(value: () => Boolean): Self = this.set("isSuccessful", js.Any.fromFunction0(value))
  }
}
