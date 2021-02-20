package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about a report parameter on the client side.
  */
@js.native
trait ASPxClientReportParameterInfo extends StObject {
  
  /**
    * Specifies the parameter path, relative to its parent container (e.g., "subreport1.subreportParameter1" for a subreport's parameter, or "parameter1" for a report's parameter).
    */
  var Path: String = js.native
  
  /**
    * Provides access to a parameter value on the client.
    */
  var Value: js.Any = js.native
}
object ASPxClientReportParameterInfo {
  
  @scala.inline
  def apply(Path: String, Value: js.Any): ASPxClientReportParameterInfo = {
    val __obj = js.Dynamic.literal(Path = Path.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReportParameterInfo]
  }
  
  @scala.inline
  implicit class ASPxClientReportParameterInfoMutableBuilder[Self <: ASPxClientReportParameterInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
