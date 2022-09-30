package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContinueActivityDetails extends StObject {
  
  /**
    * A string identifying the URL of the webpage accessed by the activity on another
    * device, if available.
    */
  var webpageURL: js.UndefOr[String] = js.undefined
}
object ContinueActivityDetails {
  
  inline def apply(): ContinueActivityDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContinueActivityDetails]
  }
  
  extension [Self <: ContinueActivityDetails](x: Self) {
    
    inline def setWebpageURL(value: String): Self = StObject.set(x, "webpageURL", value.asInstanceOf[js.Any])
    
    inline def setWebpageURLUndefined: Self = StObject.set(x, "webpageURL", js.undefined)
  }
}
