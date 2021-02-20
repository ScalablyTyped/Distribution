package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOuterHTMLResponse extends StObject {
  
  /**
    * Outer HTML markup.
    */
  var outerHTML: String = js.native
}
object GetOuterHTMLResponse {
  
  @scala.inline
  def apply(outerHTML: String): GetOuterHTMLResponse = {
    val __obj = js.Dynamic.literal(outerHTML = outerHTML.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOuterHTMLResponse]
  }
  
  @scala.inline
  implicit class GetOuterHTMLResponseMutableBuilder[Self <: GetOuterHTMLResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOuterHTML(value: String): Self = StObject.set(x, "outerHTML", value.asInstanceOf[js.Any])
  }
}
