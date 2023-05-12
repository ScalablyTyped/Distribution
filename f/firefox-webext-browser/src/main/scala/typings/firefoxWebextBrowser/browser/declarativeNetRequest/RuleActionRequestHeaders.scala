package typings.firefoxWebextBrowser.browser.declarativeNetRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleActionRequestHeaders extends StObject {
  
  /** The name of the request header to be modified. */
  var header: String
  
  /** The operation to be performed on a header. */
  var operation: RuleActionRequestHeadersOperation
  
  /** The new value for the header. Must be specified for the 'append' and 'set' operations. */
  var value: js.UndefOr[String] = js.undefined
}
object RuleActionRequestHeaders {
  
  inline def apply(header: String, operation: RuleActionRequestHeadersOperation): RuleActionRequestHeaders = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleActionRequestHeaders]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuleActionRequestHeaders] (val x: Self) extends AnyVal {
    
    inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setOperation(value: RuleActionRequestHeadersOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
