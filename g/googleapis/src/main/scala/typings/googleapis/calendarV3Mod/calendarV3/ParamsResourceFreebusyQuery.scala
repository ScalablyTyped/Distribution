package typings.googleapis.calendarV3Mod.calendarV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFreebusyQuery
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaFreeBusyRequest] = js.undefined
}
object ParamsResourceFreebusyQuery {
  
  inline def apply(): ParamsResourceFreebusyQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFreebusyQuery]
  }
  
  extension [Self <: ParamsResourceFreebusyQuery](x: Self) {
    
    inline def setRequestBody(value: SchemaFreeBusyRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
