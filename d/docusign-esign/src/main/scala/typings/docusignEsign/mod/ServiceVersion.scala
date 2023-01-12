package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceVersion extends StObject {
  
  /**
    * The version of the rest API.
    */
  var version: js.UndefOr[String] = js.undefined
  
  var versionUrl: js.UndefOr[String] = js.undefined
}
object ServiceVersion {
  
  inline def apply(): ServiceVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceVersion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceVersion] (val x: Self) extends AnyVal {
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setVersionUrl(value: String): Self = StObject.set(x, "versionUrl", value.asInstanceOf[js.Any])
    
    inline def setVersionUrlUndefined: Self = StObject.set(x, "versionUrl", js.undefined)
  }
}
