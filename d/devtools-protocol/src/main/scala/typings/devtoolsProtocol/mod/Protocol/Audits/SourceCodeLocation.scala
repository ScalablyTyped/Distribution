package typings.devtoolsProtocol.mod.Protocol.Audits

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceCodeLocation extends StObject {
  
  var columnNumber: integer = js.native
  
  var lineNumber: integer = js.native
  
  var url: String = js.native
}
object SourceCodeLocation {
  
  @scala.inline
  def apply(columnNumber: integer, lineNumber: integer, url: String): SourceCodeLocation = {
    val __obj = js.Dynamic.literal(columnNumber = columnNumber.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceCodeLocation]
  }
  
  @scala.inline
  implicit class SourceCodeLocationMutableBuilder[Self <: SourceCodeLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnNumber(value: integer): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineNumber(value: integer): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
