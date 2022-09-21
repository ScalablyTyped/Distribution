package typings.flutterwaveNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvailableBalance extends StObject {
  
  var AvailableBalance: Double
  
  var Id: Double
  
  var LedgerBalance: Double
  
  var ShortName: String
  
  var WalletNumber: String
}
object AvailableBalance {
  
  inline def apply(
    AvailableBalance: Double,
    Id: Double,
    LedgerBalance: Double,
    ShortName: String,
    WalletNumber: String
  ): AvailableBalance = {
    val __obj = js.Dynamic.literal(AvailableBalance = AvailableBalance.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], LedgerBalance = LedgerBalance.asInstanceOf[js.Any], ShortName = ShortName.asInstanceOf[js.Any], WalletNumber = WalletNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvailableBalance]
  }
  
  extension [Self <: AvailableBalance](x: Self) {
    
    inline def setAvailableBalance(value: Double): Self = StObject.set(x, "AvailableBalance", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setLedgerBalance(value: Double): Self = StObject.set(x, "LedgerBalance", value.asInstanceOf[js.Any])
    
    inline def setShortName(value: String): Self = StObject.set(x, "ShortName", value.asInstanceOf[js.Any])
    
    inline def setWalletNumber(value: String): Self = StObject.set(x, "WalletNumber", value.asInstanceOf[js.Any])
  }
}
