package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Response extends StObject {
  
  /**
    * `false` should be passed in if the dialog is canceled. If the `pairingKind` is
    * `confirm` or `confirmPin`, this value should indicate if the pairing is
    * confirmed.  If the `pairingKind` is `providePin` the value should be `true` when
    * a value is provided.
    */
  var confirmed: Boolean
  
  /**
    * When the `pairingKind` is `providePin` this value should be the required pin for
    * the Bluetooth device.
    */
  var pin: js.UndefOr[String | Null] = js.undefined
}
object Response {
  
  inline def apply(confirmed: Boolean): Response = {
    val __obj = js.Dynamic.literal(confirmed = confirmed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
    
    inline def setConfirmed(value: Boolean): Self = StObject.set(x, "confirmed", value.asInstanceOf[js.Any])
    
    inline def setPin(value: String): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
    
    inline def setPinNull: Self = StObject.set(x, "pin", null)
    
    inline def setPinUndefined: Self = StObject.set(x, "pin", js.undefined)
  }
}
