package typings.devtoolsProtocol.mod.Protocol.Audits

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckContrastRequest extends StObject {
  
  /**
    * Whether to report WCAG AAA level issues. Default is false.
    */
  var reportAAA: js.UndefOr[Boolean] = js.undefined
}
object CheckContrastRequest {
  
  inline def apply(): CheckContrastRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckContrastRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckContrastRequest] (val x: Self) extends AnyVal {
    
    inline def setReportAAA(value: Boolean): Self = StObject.set(x, "reportAAA", value.asInstanceOf[js.Any])
    
    inline def setReportAAAUndefined: Self = StObject.set(x, "reportAAA", js.undefined)
  }
}
