package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectConfigResults extends StObject {
  
  /**
    * An array of DocuSign Connect configurations.
    */
  var configurations: js.UndefOr[js.Array[ConnectCustomConfiguration]] = js.undefined
  
  /**
    * The number of results.
    */
  var totalRecords: js.UndefOr[String] = js.undefined
}
object ConnectConfigResults {
  
  inline def apply(): ConnectConfigResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectConfigResults]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectConfigResults] (val x: Self) extends AnyVal {
    
    inline def setConfigurations(value: js.Array[ConnectCustomConfiguration]): Self = StObject.set(x, "configurations", value.asInstanceOf[js.Any])
    
    inline def setConfigurationsUndefined: Self = StObject.set(x, "configurations", js.undefined)
    
    inline def setConfigurationsVarargs(value: ConnectCustomConfiguration*): Self = StObject.set(x, "configurations", js.Array(value*))
    
    inline def setTotalRecords(value: String): Self = StObject.set(x, "totalRecords", value.asInstanceOf[js.Any])
    
    inline def setTotalRecordsUndefined: Self = StObject.set(x, "totalRecords", js.undefined)
  }
}
