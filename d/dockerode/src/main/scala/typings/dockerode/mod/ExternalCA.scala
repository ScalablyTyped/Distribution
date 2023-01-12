package typings.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalCA extends StObject {
  
  var CACert: String
  
  var Options: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var Protocol: ExternalCAProtocol
  
  var URL: String
}
object ExternalCA {
  
  inline def apply(CACert: String, Protocol: ExternalCAProtocol, URL: String): ExternalCA = {
    val __obj = js.Dynamic.literal(CACert = CACert.asInstanceOf[js.Any], Protocol = Protocol.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalCA]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExternalCA] (val x: Self) extends AnyVal {
    
    inline def setCACert(value: String): Self = StObject.set(x, "CACert", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: StringDictionary[String]): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
    
    inline def setProtocol(value: ExternalCAProtocol): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
  }
}
