package typings.googleLibphonenumber.libphonenumber

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsYouTypeFormatter extends StObject {
  
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
  implicit class AsYouTypeFormatterMutableBuilder[Self <: AsYouTypeFormatter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInputDigit(value: String => String): Self = StObject.set(x, "inputDigit", js.Any.fromFunction1(value))
  }
}
