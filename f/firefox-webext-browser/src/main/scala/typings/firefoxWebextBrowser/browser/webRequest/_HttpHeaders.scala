package typings.firefoxWebextBrowser.browser.webRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _HttpHeaders extends StObject {
  
  /**
    * Value of the HTTP header if it cannot be represented by UTF-8, stored as individual byte values (0..255).
    */
  var binaryValue: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** Name of the HTTP header. */
  var name: String
  
  /** Value of the HTTP header if it can be represented by UTF-8. */
  var value: js.UndefOr[String] = js.undefined
}
object _HttpHeaders {
  
  @scala.inline
  def apply(name: String): _HttpHeaders = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[_HttpHeaders]
  }
  
  @scala.inline
  implicit class _HttpHeadersMutableBuilder[Self <: _HttpHeaders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinaryValue(value: js.Array[Double]): Self = StObject.set(x, "binaryValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryValueUndefined: Self = StObject.set(x, "binaryValue", js.undefined)
    
    @scala.inline
    def setBinaryValueVarargs(value: Double*): Self = StObject.set(x, "binaryValue", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
