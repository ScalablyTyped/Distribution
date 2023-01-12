package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOuterHTMLResponse extends StObject {
  
  /**
    * Outer HTML markup.
    */
  var outerHTML: String
}
object GetOuterHTMLResponse {
  
  inline def apply(outerHTML: String): GetOuterHTMLResponse = {
    val __obj = js.Dynamic.literal(outerHTML = outerHTML.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOuterHTMLResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetOuterHTMLResponse] (val x: Self) extends AnyVal {
    
    inline def setOuterHTML(value: String): Self = StObject.set(x, "outerHTML", value.asInstanceOf[js.Any])
  }
}
