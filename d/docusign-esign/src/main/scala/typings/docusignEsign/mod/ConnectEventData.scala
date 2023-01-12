package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectEventData extends StObject {
  
  var format: js.UndefOr[String] = js.undefined
  
  var includeData: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The version of the rest API.
    */
  var version: js.UndefOr[String] = js.undefined
}
object ConnectEventData {
  
  inline def apply(): ConnectEventData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectEventData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectEventData] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setIncludeData(value: js.Array[String]): Self = StObject.set(x, "includeData", value.asInstanceOf[js.Any])
    
    inline def setIncludeDataUndefined: Self = StObject.set(x, "includeData", js.undefined)
    
    inline def setIncludeDataVarargs(value: String*): Self = StObject.set(x, "includeData", js.Array(value*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
