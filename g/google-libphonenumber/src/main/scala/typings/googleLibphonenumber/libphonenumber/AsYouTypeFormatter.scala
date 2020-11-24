package typings.googleLibphonenumber.libphonenumber

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsYouTypeFormatter extends js.Object {
  
  def clear(): Unit = js.native
  
  def inputDigit(digit: String): String = js.native
}
object AsYouTypeFormatter {
  
  @scala.inline
  def apply(clear: () => Unit, inputDigit: String => String): AsYouTypeFormatter = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), inputDigit = js.Any.fromFunction1(inputDigit))
    __obj.asInstanceOf[AsYouTypeFormatter]
  }
  
  @scala.inline
  implicit class AsYouTypeFormatterOps[Self <: AsYouTypeFormatter] (val x: Self) extends AnyVal {
    
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
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInputDigit(value: String => String): Self = this.set("inputDigit", js.Any.fromFunction1(value))
  }
}
