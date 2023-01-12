package typings.firefoxWebextBrowser.browser.runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** If an update is available, this contains more information about the available update. */
trait RequestUpdateCheckReturnDetails extends StObject {
  
  /** The version of the available update. */
  var version: String
}
object RequestUpdateCheckReturnDetails {
  
  inline def apply(version: String): RequestUpdateCheckReturnDetails = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestUpdateCheckReturnDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestUpdateCheckReturnDetails] (val x: Self) extends AnyVal {
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
