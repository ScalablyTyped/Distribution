package typings.googleapis.alertcenterV1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccountSuspensionWarning extends StObject {
  
  /**
    * The amount of time remaining to appeal an imminent suspension. After this window has elapsed, the account will be suspended. Only populated if the account suspension is in WARNING state.
    */
  var appealWindow: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Account suspension warning state.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Details about why an account is being suspended.
    */
  var suspensionDetails: js.UndefOr[js.Array[SchemaAccountSuspensionDetails]] = js.undefined
}
object SchemaAccountSuspensionWarning {
  
  inline def apply(): SchemaAccountSuspensionWarning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountSuspensionWarning]
  }
  
  extension [Self <: SchemaAccountSuspensionWarning](x: Self) {
    
    inline def setAppealWindow(value: String): Self = StObject.set(x, "appealWindow", value.asInstanceOf[js.Any])
    
    inline def setAppealWindowNull: Self = StObject.set(x, "appealWindow", null)
    
    inline def setAppealWindowUndefined: Self = StObject.set(x, "appealWindow", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setSuspensionDetails(value: js.Array[SchemaAccountSuspensionDetails]): Self = StObject.set(x, "suspensionDetails", value.asInstanceOf[js.Any])
    
    inline def setSuspensionDetailsUndefined: Self = StObject.set(x, "suspensionDetails", js.undefined)
    
    inline def setSuspensionDetailsVarargs(value: SchemaAccountSuspensionDetails*): Self = StObject.set(x, "suspensionDetails", js.Array(value*))
  }
}
