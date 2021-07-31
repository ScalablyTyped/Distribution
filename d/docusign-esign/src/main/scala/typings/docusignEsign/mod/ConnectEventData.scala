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
  
  @scala.inline
  def apply(): ConnectEventData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectEventData]
  }
  
  @scala.inline
  implicit class ConnectEventDataMutableBuilder[Self <: ConnectEventData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setIncludeData(value: js.Array[String]): Self = StObject.set(x, "includeData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeDataUndefined: Self = StObject.set(x, "includeData", js.undefined)
    
    @scala.inline
    def setIncludeDataVarargs(value: String*): Self = StObject.set(x, "includeData", js.Array(value :_*))
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
