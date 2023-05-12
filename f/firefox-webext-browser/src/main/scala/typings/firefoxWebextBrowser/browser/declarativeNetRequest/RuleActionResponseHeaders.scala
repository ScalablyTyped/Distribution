package typings.firefoxWebextBrowser.browser.declarativeNetRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleActionResponseHeaders extends StObject {
  
  /** The name of the response header to be modified. */
  var header: String
  
  /** The operation to be performed on a header. */
  var operation: RuleActionResponseHeadersOperation
  
  /** The new value for the header. Must be specified for the 'append' and 'set' operations. */
  var value: js.UndefOr[String] = js.undefined
}
object RuleActionResponseHeaders {
  
  inline def apply(header: String, operation: RuleActionResponseHeadersOperation): RuleActionResponseHeaders = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleActionResponseHeaders]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuleActionResponseHeaders] (val x: Self) extends AnyVal {
    
    inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setOperation(value: RuleActionResponseHeadersOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
